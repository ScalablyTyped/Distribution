package typings.nivoScales.mod

import typings.nivoScales.nivoScalesStrings.auto
import typings.nivoScales.nivoScalesStrings.day
import typings.nivoScales.nivoScalesStrings.hour
import typings.nivoScales.nivoScalesStrings.millisecond
import typings.nivoScales.nivoScalesStrings.minute
import typings.nivoScales.nivoScalesStrings.month
import typings.nivoScales.nivoScalesStrings.second
import typings.nivoScales.nivoScalesStrings.time
import typings.nivoScales.nivoScalesStrings.year
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeScaleFormatted extends Scale {
  var format: String = js.native
  var max: js.UndefOr[auto | String] = js.native
  var min: js.UndefOr[auto | String] = js.native
  var precision: js.UndefOr[millisecond | second | minute | hour | month | year | day] = js.native
  var `type`: time = js.native
  var useUTC: js.UndefOr[Boolean] = js.native
}

object TimeScaleFormatted {
  @scala.inline
  def apply(format: String, `type`: time): TimeScaleFormatted = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeScaleFormatted]
  }
  @scala.inline
  implicit class TimeScaleFormattedOps[Self <: TimeScaleFormatted] (val x: Self) extends AnyVal {
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
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: time): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setMax(value: auto | String): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: auto | String): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setPrecision(value: millisecond | second | minute | hour | month | year | day): Self = this.set("precision", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
    @scala.inline
    def setUseUTC(value: Boolean): Self = this.set("useUTC", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseUTC: Self = this.set("useUTC", js.undefined)
  }
  
}

