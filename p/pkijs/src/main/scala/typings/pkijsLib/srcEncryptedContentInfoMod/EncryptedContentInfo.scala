package typings
package pkijsLib.srcEncryptedContentInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptedContentInfo extends js.Object {
  var contentEncryptionAlgorithm: pkijsLib.srcAlgorithmIdentifierMod.default
  var eContentType: java.lang.String
  var encryptedContent: asn1jsLib.asn1jsMod.OctetString
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object EncryptedContentInfo {
  @scala.inline
  def apply(
    contentEncryptionAlgorithm: pkijsLib.srcAlgorithmIdentifierMod.default,
    eContentType: java.lang.String,
    encryptedContent: asn1jsLib.asn1jsMod.OctetString,
    fromSchema: js.Any => scala.Unit,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): EncryptedContentInfo = {
    val __obj = js.Dynamic.literal(contentEncryptionAlgorithm = contentEncryptionAlgorithm, eContentType = eContentType, encryptedContent = encryptedContent, fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
  
    __obj.asInstanceOf[EncryptedContentInfo]
  }
}

