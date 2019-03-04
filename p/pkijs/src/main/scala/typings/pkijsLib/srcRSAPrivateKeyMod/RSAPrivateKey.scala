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

object RSAPrivateKey {
  @scala.inline
  def apply(
    coefficient: asn1jsLib.asn1jsMod.Integer,
    exponent1: asn1jsLib.asn1jsMod.Integer,
    exponent2: asn1jsLib.asn1jsMod.Integer,
    fromJSON: js.Function1[stdLib.JsonWebKey, scala.Unit],
    fromSchema: js.Function1[js.Any, scala.Unit],
    modulus: asn1jsLib.asn1jsMod.Integer,
    prime1: asn1jsLib.asn1jsMod.Integer,
    prime2: asn1jsLib.asn1jsMod.Integer,
    privateExponent: asn1jsLib.asn1jsMod.Integer,
    publicExponent: asn1jsLib.asn1jsMod.Integer,
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any],
    version: scala.Double,
    otherPrimeInfos: js.Array[pkijsLib.srcOtherPrimeInfoMod.default] = null
  ): RSAPrivateKey = {
    val __obj = js.Dynamic.literal(coefficient = coefficient, exponent1 = exponent1, exponent2 = exponent2, fromJSON = fromJSON, fromSchema = fromSchema, modulus = modulus, prime1 = prime1, prime2 = prime2, privateExponent = privateExponent, publicExponent = publicExponent, toJSON = toJSON, toSchema = toSchema, version = version)
    if (otherPrimeInfos != null) __obj.updateDynamic("otherPrimeInfos")(otherPrimeInfos)
    __obj.asInstanceOf[RSAPrivateKey]
  }
}

