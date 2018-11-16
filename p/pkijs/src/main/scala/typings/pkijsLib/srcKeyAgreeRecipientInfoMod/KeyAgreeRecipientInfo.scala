package typings
package pkijsLib.srcKeyAgreeRecipientInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait KeyAgreeRecipientInfo extends js.Object {
  var keyEncryptionAlgorithm: pkijsLib.srcAlgorithmIdentifierMod.default
  var originator: pkijsLib.srcOriginatorIdentifierOrKeyMod.default
  var recipientCertificate: pkijsLib.srcCertificateMod.default
  var recipientEncryptedKeys: pkijsLib.srcRecipientEncryptedKeysMod.default
  var ukm: js.UndefOr[asn1jsLib.asn1jsMod.OctetString] = js.undefined
  var version: scala.Double
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

