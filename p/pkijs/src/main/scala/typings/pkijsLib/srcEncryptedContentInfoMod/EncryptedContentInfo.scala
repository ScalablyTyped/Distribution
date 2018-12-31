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

