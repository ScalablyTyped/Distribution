package typings.nodeForge.mod

import typings.nodeForge.anon.AuthenticatedAttributes
import typings.nodeForge.anon.Detached
import typings.nodeForge.anon.Value
import typings.nodeForge.mod.asn1.Asn1
import typings.nodeForge.mod.pki.Certificate
import typings.nodeForge.mod.util.ByteBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pkcs7 {
  
  @JSImport("node-forge", "pkcs7.createEnvelopedData")
  @js.native
  def createEnvelopedData(): PkcsEnvelopedData = js.native
  
  @JSImport("node-forge", "pkcs7.createSignedData")
  @js.native
  def createSignedData(): PkcsSignedData = js.native
  
  @js.native
  trait PkcsEnvelopedData extends StObject {
    
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
    implicit class PkcsEnvelopedDataMutableBuilder[Self <: PkcsEnvelopedData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddRecipient(value: Certificate => Unit): Self = StObject.set(x, "addRecipient", js.Any.fromFunction1(value))
      
      @scala.inline
      def setContent(value: String | ByteBuffer): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setEncrypt(value: () => Unit): Self = StObject.set(x, "encrypt", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToAsn1(value: () => Asn1): Self = StObject.set(x, "toAsn1", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait PkcsSignedData extends StObject {
    
    def addCertificate(certificate: String): Unit = js.native
    def addCertificate(certificate: Certificate): Unit = js.native
    
    def addSigner(options: AuthenticatedAttributes): Unit = js.native
    
    var content: js.UndefOr[String | ByteBuffer] = js.native
    
    var contentInfo: js.UndefOr[Value] = js.native
    
    def sign(): Unit = js.native
    def sign(options: Detached): Unit = js.native
    
    def toAsn1(): Asn1 = js.native
  }
}
