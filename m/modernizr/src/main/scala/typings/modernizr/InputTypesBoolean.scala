package typings.modernizr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputTypesBoolean extends js.Object {
  var color: Boolean = js.native
  var date: Boolean = js.native
  var datetime: Boolean = js.native
  var `datetime-local`: Boolean = js.native
  var email: Boolean = js.native
  var month: Boolean = js.native
  var number: Boolean = js.native
  var range: Boolean = js.native
  var search: Boolean = js.native
  var tel: Boolean = js.native
  var time: Boolean = js.native
  var url: Boolean = js.native
  var week: Boolean = js.native
}

object InputTypesBoolean {
  @scala.inline
  def apply(
    color: Boolean,
    date: Boolean,
    datetime: Boolean,
    `datetime-local`: Boolean,
    email: Boolean,
    month: Boolean,
    number: Boolean,
    range: Boolean,
    search: Boolean,
    tel: Boolean,
    time: Boolean,
    url: Boolean,
    week: Boolean
  ): InputTypesBoolean = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], datetime = datetime.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], tel = tel.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], week = week.asInstanceOf[js.Any])
    __obj.updateDynamic("datetime-local")(`datetime-local`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputTypesBoolean]
  }
  @scala.inline
  implicit class InputTypesBooleanOps[Self <: InputTypesBoolean] (val x: Self) extends AnyVal {
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
    def setColor(value: Boolean): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setDate(value: Boolean): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def setDatetime(value: Boolean): Self = this.set("datetime", value.asInstanceOf[js.Any])
    @scala.inline
    def `setDatetime-local`(value: Boolean): Self = this.set("datetime-local", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmail(value: Boolean): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonth(value: Boolean): Self = this.set("month", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumber(value: Boolean): Self = this.set("number", value.asInstanceOf[js.Any])
    @scala.inline
    def setRange(value: Boolean): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearch(value: Boolean): Self = this.set("search", value.asInstanceOf[js.Any])
    @scala.inline
    def setTel(value: Boolean): Self = this.set("tel", value.asInstanceOf[js.Any])
    @scala.inline
    def setTime(value: Boolean): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: Boolean): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeek(value: Boolean): Self = this.set("week", value.asInstanceOf[js.Any])
  }
  
}

