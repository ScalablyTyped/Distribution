package typings
package momentDashTimezoneLib.momentDashTimezoneMomentDashTimezoneMod.momentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MomentZone extends js.Object {
  var abbrs: js.Array[java.lang.String]
  var name: java.lang.String
  var offsets: js.Array[scala.Double]
  var population: scala.Double
  var untils: js.Array[scala.Double]
  def abbr(timestamp: scala.Double): java.lang.String
  def offset(timestamp: scala.Double): scala.Double
  def parse(timestamp: scala.Double): scala.Double
  def utcOffset(timestamp: scala.Double): scala.Double
}

object MomentZone {
  @scala.inline
  def apply(
    abbr: scala.Double => java.lang.String,
    abbrs: js.Array[java.lang.String],
    name: java.lang.String,
    offset: scala.Double => scala.Double,
    offsets: js.Array[scala.Double],
    parse: scala.Double => scala.Double,
    population: scala.Double,
    untils: js.Array[scala.Double],
    utcOffset: scala.Double => scala.Double
  ): MomentZone = {
    val __obj = js.Dynamic.literal(abbr = js.Any.fromFunction1(abbr), abbrs = abbrs, name = name, offset = js.Any.fromFunction1(offset), offsets = offsets, parse = js.Any.fromFunction1(parse), population = population, untils = untils, utcOffset = js.Any.fromFunction1(utcOffset))
  
    __obj.asInstanceOf[MomentZone]
  }
}

