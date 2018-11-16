package typings
package pkijsLib.srcKEKRecipientInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait KEKRecipientInfo extends js.Object {
  var encryptedKey: asn1jsLib.asn1jsMod.OctetString
  var kekid: pkijsLib.srcKEKIdentifierMod.default
  var keyEncryptionAlgorithm: pkijsLib.srcAlgorithmIdentifierMod.default
  var preDefinedKEK: stdLib.ArrayBuffer
  var version: scala.Double
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

