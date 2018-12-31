package typings
package pkijsLib.srcKeyTransRecipientInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyTransRecipientInfo extends js.Object {
  var encryptedKey: asn1jsLib.asn1jsMod.OctetString
  var keyEncryptionAlgorithm: pkijsLib.srcAlgorithmIdentifierMod.default
  /**
    * For some reasons we need to store recipient's certificate here
    * 
    * @type {Certificate}
    * @memberOf KeyTransRecipientInfo
    */
  var recipientCertificate: pkijsLib.srcCertificateMod.default
  var rid: pkijsLib.srcRecipientIdentifierMod.default
  var version: scala.Double
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

