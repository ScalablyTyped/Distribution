package typings
package pkijsLib.srcOtherPrimeInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OtherPrimeInfo extends js.Object {
  var coefficient: asn1jsLib.asn1jsMod.Integer
  var exponent: asn1jsLib.asn1jsMod.Integer
  var prime: asn1jsLib.asn1jsMod.Integer
  /**
    * Convert JSON value into current object
    * @param {JsonOtherPrimeInfo} json
    */
  def fromJSON(json: pkijsLib.JsonOtherPrimeInfo): scala.Unit
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object OtherPrimeInfo {
  @scala.inline
  def apply(
    coefficient: asn1jsLib.asn1jsMod.Integer,
    exponent: asn1jsLib.asn1jsMod.Integer,
    fromJSON: js.Function1[pkijsLib.JsonOtherPrimeInfo, scala.Unit],
    fromSchema: js.Function1[js.Any, scala.Unit],
    prime: asn1jsLib.asn1jsMod.Integer,
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any]
  ): OtherPrimeInfo = {
    val __obj = js.Dynamic.literal(coefficient = coefficient, exponent = exponent, fromJSON = fromJSON, fromSchema = fromSchema, prime = prime, toJSON = toJSON, toSchema = toSchema)
  
    __obj.asInstanceOf[OtherPrimeInfo]
  }
}

