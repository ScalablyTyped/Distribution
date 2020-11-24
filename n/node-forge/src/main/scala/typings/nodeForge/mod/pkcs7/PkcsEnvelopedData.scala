package typings.nodeForge.mod.pkcs7

import typings.nodeForge.mod.asn1.Asn1
import typings.nodeForge.mod.pki.Certificate
import typings.nodeForge.mod.util.ByteBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PkcsEnvelopedData extends js.Object {
  
  def addRecipient(certificate: Certificate): Unit = js.native
  
  var content: js.UndefOr[String | ByteBuffer] = js.native
  
  def encrypt(): Unit = js.native
  
  def toAsn1(): Asn1 = js.native
}
object PkcsEnvelopedData {
  
  @scala.inline
  def apply(addRecipient: Certificate => Unit, encrypt: () => Unit, toAsn1: () => Asn1): PkcsEnvelopedData = {
    val __obj = js.Dynamic.literal(addRecipient = js.Any.fromFunction1(addRecipient), encrypt = js.Any.fromFunction0(encrypt), toAsn1 = js.Any.fromFunction0(toAsn1))
    __obj.asInstanceOf[PkcsEnvelopedData]
  }
  
  @scala.inline
  implicit class PkcsEnvelopedDataOps[Self <: PkcsEnvelopedData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddRecipient(value: Certificate => Unit): Self = this.set("addRecipient", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEncrypt(value: () => Unit): Self = this.set("encrypt", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToAsn1(value: () => Asn1): Self = this.set("toAsn1", js.Any.fromFunction0(value))
    
    @scala.inline
    def setContent(value: String | ByteBuffer): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
  }
}
