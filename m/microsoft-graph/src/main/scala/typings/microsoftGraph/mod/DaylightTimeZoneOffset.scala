package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DaylightTimeZoneOffset extends StandardTimeZoneOffset {
  // The time offset from Coordinated Universal Time (UTC) for daylight saving time. This value is in minutes.
  var daylightBias: js.UndefOr[Double] = js.native
}

object DaylightTimeZoneOffset {
  @scala.inline
  def apply(): DaylightTimeZoneOffset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DaylightTimeZoneOffset]
  }
  @scala.inline
  implicit class DaylightTimeZoneOffsetOps[Self <: DaylightTimeZoneOffset] (val x: Self) extends AnyVal {
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
    def setDaylightBias(value: Double): Self = this.set("daylightBias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDaylightBias: Self = this.set("daylightBias", js.undefined)
  }
  
}

