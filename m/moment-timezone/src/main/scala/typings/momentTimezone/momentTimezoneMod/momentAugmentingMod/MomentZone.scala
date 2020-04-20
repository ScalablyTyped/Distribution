package typings.momentTimezone.momentTimezoneMod.momentAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MomentZone extends js.Object {
  var abbrs: js.Array[String]
  var name: String
  var offsets: js.Array[Double]
  var population: Double
  var untils: js.Array[Double]
  def abbr(timestamp: Double): String
  def offset(timestamp: Double): Double
  def parse(timestamp: Double): Double
  def utcOffset(timestamp: Double): Double
}

object MomentZone {
  @scala.inline
  def apply(
    abbr: Double => String,
    abbrs: js.Array[String],
    name: String,
    offset: Double => Double,
    offsets: js.Array[Double],
    parse: Double => Double,
    population: Double,
    untils: js.Array[Double],
    utcOffset: Double => Double
  ): MomentZone = {
    val __obj = js.Dynamic.literal(abbr = js.Any.fromFunction1(abbr), abbrs = abbrs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offset = js.Any.fromFunction1(offset), offsets = offsets.asInstanceOf[js.Any], parse = js.Any.fromFunction1(parse), population = population.asInstanceOf[js.Any], untils = untils.asInstanceOf[js.Any], utcOffset = js.Any.fromFunction1(utcOffset))
    __obj.asInstanceOf[MomentZone]
  }
}

