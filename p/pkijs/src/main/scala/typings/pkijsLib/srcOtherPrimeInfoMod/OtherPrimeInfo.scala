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
    fromJSON: pkijsLib.JsonOtherPrimeInfo => scala.Unit,
    fromSchema: js.Any => scala.Unit,
    prime: asn1jsLib.asn1jsMod.Integer,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): OtherPrimeInfo = {
    val __obj = js.Dynamic.literal(coefficient = coefficient, exponent = exponent, fromJSON = js.Any.fromFunction1(fromJSON), fromSchema = js.Any.fromFunction1(fromSchema), prime = prime, toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
  
    __obj.asInstanceOf[OtherPrimeInfo]
  }
}

