package typings.momentTimezone.mod.momentAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MomentZone extends js.Object {
  var abbrs: js.Array[String] = js.native
  var name: String = js.native
  var offsets: js.Array[Double] = js.native
  var population: Double = js.native
  var untils: js.Array[Double] = js.native
  def abbr(timestamp: Double): String = js.native
  def offset(timestamp: Double): Double = js.native
  def parse(timestamp: Double): Double = js.native
  def utcOffset(timestamp: Double): Double = js.native
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
  @scala.inline
  implicit class MomentZoneOps[Self <: MomentZone] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAbbr(value: Double => String): Self = this.set("abbr", js.Any.fromFunction1(value))
    @scala.inline
    def setAbbrsVarargs(value: String*): Self = this.set("abbrs", js.Array(value :_*))
    @scala.inline
    def setAbbrs(value: js.Array[String]): Self = this.set("abbrs", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffset(value: Double => Double): Self = this.set("offset", js.Any.fromFunction1(value))
    @scala.inline
    def setOffsetsVarargs(value: Double*): Self = this.set("offsets", js.Array(value :_*))
    @scala.inline
    def setOffsets(value: js.Array[Double]): Self = this.set("offsets", value.asInstanceOf[js.Any])
    @scala.inline
    def setParse(value: Double => Double): Self = this.set("parse", js.Any.fromFunction1(value))
    @scala.inline
    def setPopulation(value: Double): Self = this.set("population", value.asInstanceOf[js.Any])
    @scala.inline
    def setUntilsVarargs(value: Double*): Self = this.set("untils", js.Array(value :_*))
    @scala.inline
    def setUntils(value: js.Array[Double]): Self = this.set("untils", value.asInstanceOf[js.Any])
    @scala.inline
    def setUtcOffset(value: Double => Double): Self = this.set("utcOffset", js.Any.fromFunction1(value))
  }
  
}

