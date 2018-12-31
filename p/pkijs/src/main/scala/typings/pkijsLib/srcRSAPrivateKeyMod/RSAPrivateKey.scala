package typings
package pkijsLib.srcRSAPrivateKeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RSAPrivateKey extends js.Object {
  var coefficient: asn1jsLib.asn1jsMod.Integer
  var exponent1: asn1jsLib.asn1jsMod.Integer
  var exponent2: asn1jsLib.asn1jsMod.Integer
  var modulus: asn1jsLib.asn1jsMod.Integer
  var otherPrimeInfos: js.UndefOr[js.Array[pkijsLib.srcOtherPrimeInfoMod.default]] = js.undefined
  var prime1: asn1jsLib.asn1jsMod.Integer
  var prime2: asn1jsLib.asn1jsMod.Integer
  var privateExponent: asn1jsLib.asn1jsMod.Integer
  var publicExponent: asn1jsLib.asn1jsMod.Integer
  var version: scala.Double
  /**
    * Convert JSON value into current object
    * @param {JsonWebKey} json
    */
  def fromJSON(json: stdLib.JsonWebKey): scala.Unit
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

