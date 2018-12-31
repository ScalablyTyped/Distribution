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

