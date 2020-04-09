package typings.nodeForge.mod.pkcs7

import typings.nodeForge.mod.asn1.Asn1
import typings.nodeForge.mod.pki.Certificate
import typings.nodeForge.mod.util.ByteBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PkcsEnvelopedData extends js.Object {
  var content: js.UndefOr[String | ByteBuffer] = js.undefined
  def addRecipient(certificate: Certificate): Unit
  def encrypt(): Unit
  def toAsn1(): Asn1
}

object PkcsEnvelopedData {
  @scala.inline
  def apply(
    addRecipient: Certificate => Unit,
    encrypt: () => Unit,
    toAsn1: () => Asn1,
    content: String | ByteBuffer = null
  ): PkcsEnvelopedData = {
    val __obj = js.Dynamic.literal(addRecipient = js.Any.fromFunction1(addRecipient), encrypt = js.Any.fromFunction0(encrypt), toAsn1 = js.Any.fromFunction0(toAsn1))
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    __obj.asInstanceOf[PkcsEnvelopedData]
  }
}

