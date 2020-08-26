package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateField extends js.Object {
  var dateField: js.UndefOr[String] = js.native
  var dateOnly: js.UndefOr[Boolean] = js.native
  var formatUsing: js.UndefOr[String] = js.native
  var relativeTime: js.UndefOr[String] = js.native
  var timeZone: js.UndefOr[String] = js.native
}

object DateField {
  @scala.inline
  def apply(): DateField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateField]
  }
  @scala.inline
  implicit class DateFieldOps[Self <: DateField] (val x: Self) extends AnyVal {
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
    def setDateField(value: String): Self = this.set("dateField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateField: Self = this.set("dateField", js.undefined)
    @scala.inline
    def setDateOnly(value: Boolean): Self = this.set("dateOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateOnly: Self = this.set("dateOnly", js.undefined)
    @scala.inline
    def setFormatUsing(value: String): Self = this.set("formatUsing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatUsing: Self = this.set("formatUsing", js.undefined)
    @scala.inline
    def setRelativeTime(value: String): Self = this.set("relativeTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelativeTime: Self = this.set("relativeTime", js.undefined)
    @scala.inline
    def setTimeZone(value: String): Self = this.set("timeZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeZone: Self = this.set("timeZone", js.undefined)
  }
  
}

