package typings.pkijs.srcRSAPublicKeyMod

import typings.asn1js.asn1jsMod.Integer
import typings.std.JsonWebKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RSAPublicKey extends js.Object {
  var modulus: Integer
  var publicExponent: Integer
  /**
    * Convert JSON value into current object
    * @param {JsonWebKey} json
    */
  def fromJSON(json: JsonWebKey): Unit
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object RSAPublicKey {
  @scala.inline
  def apply(
    fromJSON: JsonWebKey => Unit,
    fromSchema: js.Any => Unit,
    modulus: Integer,
    publicExponent: Integer,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): RSAPublicKey = {
    val __obj = js.Dynamic.literal(fromJSON = js.Any.fromFunction1(fromJSON), fromSchema = js.Any.fromFunction1(fromSchema), modulus = modulus, publicExponent = publicExponent, toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
  
    __obj.asInstanceOf[RSAPublicKey]
  }
}

