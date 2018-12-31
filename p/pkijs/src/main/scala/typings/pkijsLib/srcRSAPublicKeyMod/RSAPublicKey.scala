package typings
package pkijsLib.srcRSAPublicKeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RSAPublicKey extends js.Object {
  var modulus: asn1jsLib.asn1jsMod.Integer
  var publicExponent: asn1jsLib.asn1jsMod.Integer
  /**
    * Convert JSON value into current object
    * @param {JsonWebKey} json
    */
  def fromJSON(json: stdLib.JsonWebKey): scala.Unit
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

