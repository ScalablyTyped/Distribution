package typings.pkijs.srcOtherPrimeInfoMod

import typings.asn1js.asn1jsMod.Integer
import typings.pkijs.JsonOtherPrimeInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OtherPrimeInfo extends js.Object {
  var coefficient: Integer
  var exponent: Integer
  var prime: Integer
  /**
    * Convert JSON value into current object
    * @param {JsonOtherPrimeInfo} json
    */
  def fromJSON(json: JsonOtherPrimeInfo): Unit
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object OtherPrimeInfo {
  @scala.inline
  def apply(
    coefficient: Integer,
    exponent: Integer,
    fromJSON: JsonOtherPrimeInfo => Unit,
    fromSchema: js.Any => Unit,
    prime: Integer,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): OtherPrimeInfo = {
    val __obj = js.Dynamic.literal(coefficient = coefficient, exponent = exponent, fromJSON = js.Any.fromFunction1(fromJSON), fromSchema = js.Any.fromFunction1(fromSchema), prime = prime, toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
  
    __obj.asInstanceOf[OtherPrimeInfo]
  }
}

