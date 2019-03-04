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

object RSAPublicKey {
  @scala.inline
  def apply(
    fromJSON: js.Function1[stdLib.JsonWebKey, scala.Unit],
    fromSchema: js.Function1[js.Any, scala.Unit],
    modulus: asn1jsLib.asn1jsMod.Integer,
    publicExponent: asn1jsLib.asn1jsMod.Integer,
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any]
  ): RSAPublicKey = {
    val __obj = js.Dynamic.literal(fromJSON = fromJSON, fromSchema = fromSchema, modulus = modulus, publicExponent = publicExponent, toJSON = toJSON, toSchema = toSchema)
  
    __obj.asInstanceOf[RSAPublicKey]
  }
}

