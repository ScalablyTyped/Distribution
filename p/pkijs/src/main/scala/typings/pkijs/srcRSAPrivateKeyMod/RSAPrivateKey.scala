package typings.pkijs.srcRSAPrivateKeyMod

import typings.asn1js.asn1jsMod.Integer
import typings.std.JsonWebKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RSAPrivateKey extends js.Object {
  var coefficient: Integer
  var exponent1: Integer
  var exponent2: Integer
  var modulus: Integer
  var otherPrimeInfos: js.UndefOr[js.Array[typings.pkijs.srcOtherPrimeInfoMod.default]] = js.undefined
  var prime1: Integer
  var prime2: Integer
  var privateExponent: Integer
  var publicExponent: Integer
  var version: Double
  /**
    * Convert JSON value into current object
    * @param {JsonWebKey} json
    */
  def fromJSON(json: JsonWebKey): Unit
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object RSAPrivateKey {
  @scala.inline
  def apply(
    coefficient: Integer,
    exponent1: Integer,
    exponent2: Integer,
    fromJSON: JsonWebKey => Unit,
    fromSchema: js.Any => Unit,
    modulus: Integer,
    prime1: Integer,
    prime2: Integer,
    privateExponent: Integer,
    publicExponent: Integer,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    version: Double,
    otherPrimeInfos: js.Array[typings.pkijs.srcOtherPrimeInfoMod.default] = null
  ): RSAPrivateKey = {
    val __obj = js.Dynamic.literal(coefficient = coefficient.asInstanceOf[js.Any], exponent1 = exponent1.asInstanceOf[js.Any], exponent2 = exponent2.asInstanceOf[js.Any], fromJSON = js.Any.fromFunction1(fromJSON), fromSchema = js.Any.fromFunction1(fromSchema), modulus = modulus.asInstanceOf[js.Any], prime1 = prime1.asInstanceOf[js.Any], prime2 = prime2.asInstanceOf[js.Any], privateExponent = privateExponent.asInstanceOf[js.Any], publicExponent = publicExponent.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), version = version.asInstanceOf[js.Any])
    if (otherPrimeInfos != null) __obj.updateDynamic("otherPrimeInfos")(otherPrimeInfos.asInstanceOf[js.Any])
    __obj.asInstanceOf[RSAPrivateKey]
  }
}

