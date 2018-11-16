package typings
package pkijsLib.srcOriginatorPublicKeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OriginatorPublicKey extends js.Object {
  var algorithm: pkijsLib.srcAlgorithmIdentifierMod.default
  var publicKey: asn1jsLib.asn1jsMod.BitString
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

