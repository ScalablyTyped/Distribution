package typings
package momentDashTimezoneLib.momentDashTimezoneMod.momentMod

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
    abbr: js.Function1[scala.Double, java.lang.String],
    abbrs: js.Array[java.lang.String],
    name: java.lang.String,
    offset: js.Function1[scala.Double, scala.Double],
    offsets: js.Array[scala.Double],
    parse: js.Function1[scala.Double, scala.Double],
    population: scala.Double,
    untils: js.Array[scala.Double],
    utcOffset: js.Function1[scala.Double, scala.Double]
  ): MomentZone = {
    val __obj = js.Dynamic.literal(abbr = abbr, abbrs = abbrs, name = name, offset = offset, offsets = offsets, parse = parse, population = population, untils = untils, utcOffset = utcOffset)
  
    __obj.asInstanceOf[MomentZone]
  }
}

