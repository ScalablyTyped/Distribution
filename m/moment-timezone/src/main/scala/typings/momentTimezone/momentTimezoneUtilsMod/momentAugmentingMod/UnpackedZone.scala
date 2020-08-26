package typings.momentTimezone.momentTimezoneUtilsMod.momentAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parsed / unpacked zone data. */
@js.native
trait UnpackedZone extends js.Object {
  /** zone abbreviations */
  var abbrs: js.Array[String] = js.native
  /** The uniquely identifying name of the time zone. */
  var name: String = js.native
  /** (measured in minutes) */
  var offsets: js.Array[Double] = js.native
  /** (measured in milliseconds) */
  var untils: js.Array[Double | Null] = js.native
}

object UnpackedZone {
  @scala.inline
  def apply(abbrs: js.Array[String], name: String, offsets: js.Array[Double], untils: js.Array[Double | Null]): UnpackedZone = {
    val __obj = js.Dynamic.literal(abbrs = abbrs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offsets = offsets.asInstanceOf[js.Any], untils = untils.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnpackedZone]
  }
  @scala.inline
  implicit class UnpackedZoneOps[Self <: UnpackedZone] (val x: Self) extends AnyVal {
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
    def setAbbrsVarargs(value: String*): Self = this.set("abbrs", js.Array(value :_*))
    @scala.inline
    def setAbbrs(value: js.Array[String]): Self = this.set("abbrs", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffsetsVarargs(value: Double*): Self = this.set("offsets", js.Array(value :_*))
    @scala.inline
    def setOffsets(value: js.Array[Double]): Self = this.set("offsets", value.asInstanceOf[js.Any])
    @scala.inline
    def setUntilsVarargs(value: (Double | Null)*): Self = this.set("untils", js.Array(value :_*))
    @scala.inline
    def setUntils(value: js.Array[Double | Null]): Self = this.set("untils", value.asInstanceOf[js.Any])
  }
  
}

