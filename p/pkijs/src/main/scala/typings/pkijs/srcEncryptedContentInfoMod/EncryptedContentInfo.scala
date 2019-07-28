package typings.pkijs.srcEncryptedContentInfoMod

import typings.asn1js.asn1jsMod.OctetString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptedContentInfo extends js.Object {
  var contentEncryptionAlgorithm: typings.pkijs.srcAlgorithmIdentifierMod.default
  var eContentType: String
  var encryptedContent: OctetString
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object EncryptedContentInfo {
  @scala.inline
  def apply(
    contentEncryptionAlgorithm: typings.pkijs.srcAlgorithmIdentifierMod.default,
    eContentType: String,
    encryptedContent: OctetString,
    fromSchema: js.Any => Unit,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): EncryptedContentInfo = {
    val __obj = js.Dynamic.literal(contentEncryptionAlgorithm = contentEncryptionAlgorithm, eContentType = eContentType, encryptedContent = encryptedContent, fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
  
    __obj.asInstanceOf[EncryptedContentInfo]
  }
}

