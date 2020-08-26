package typings.pickadate.Pickadate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateOptions extends Options {
   // default 'Today'
  var close: js.UndefOr[String] = js.native
  /**
    * Disable a specific or arbitrary set of dates selectable on the
    * picker. Accepts an array of Date objects, arrays formatted as
    * [YEAR, MONTH, DATE], integers representing days of the week
    * (from 1 to 7), or objects with a range of dates. Switch to a
    * whitelist by setting `true` as the first item in the collection.
    * Enable dates that fall within a range of disabled dates by
    * adding an `inverted` parameter to the item within the collection.
    */
  var disable: js.UndefOr[js.Array[_]] = js.native
  /**
    * The first day of the week can be set to either Sunday or Monday.
    * True or 1 sets it as Monday and false or 0 as Sunday.
    */
  var firstDay: js.UndefOr[Boolean | Double] = js.native
  // Classes
  var klass: js.UndefOr[DateKlassOptions] = js.native
   // default 'Close'
  // Accessibility labels
  var labelMonthNext: js.UndefOr[String] = js.native
   // default 'Next month'
  var labelMonthPrev: js.UndefOr[String] = js.native
   // default 'Previous month'
  var labelMonthSelect: js.UndefOr[String] = js.native
   // default 'Select a month'
  var labelYearSelect: js.UndefOr[String] = js.native
  /**
    * Set the maximum selectable date on the picker.
    * Accepts the same values as the `min` property.
    */
  var max: js.UndefOr[MinOrMaxDateOption] = js.native
  /**
    * Set the minimum selectable date on the picker. Accepts a Date object,
    * array formatted as [YEAR, MONTH, DATE], a positive or negative integer
    * for a date relative to today, or a boolean (`true` sets it to today,
    * `false` removes any limit).
    */
  var min: js.UndefOr[MinOrMaxDateOption] = js.native
  // Strings and translations
  var monthsFull: js.UndefOr[js.Array[String]] = js.native
   // default 'January' through 'December'
  var monthsShort: js.UndefOr[js.Array[String]] = js.native
  /**
    * True enables the dropdown selector and false replaces it with text
    */
  var selectMonths: js.UndefOr[Boolean] = js.native
   //default 'Select a year'
  /**
    * True enables the dropdown selector and false replaces it with text.
    * You can also specify the number of years to show in the dropdown
    * using an even integer - half before and half after the year in focus.
    * If true the value will default to 10.
    */
  var selectYears: js.UndefOr[Boolean | Double] = js.native
   // default 'Sun' through 'Sat'
  var showMonthsShort: js.UndefOr[Boolean] = js.native
  var showWeekdaysFull: js.UndefOr[Boolean] = js.native
  // Buttons
  var today: js.UndefOr[String] = js.native
   // default 'Jan' through 'Dec'
  var weekdaysFull: js.UndefOr[js.Array[String]] = js.native
   // default 'Sunday' through 'Saturday'
  var weekdaysShort: js.UndefOr[js.Array[String]] = js.native
}

object DateOptions {
  @scala.inline
  def apply(): DateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateOptions]
  }
  @scala.inline
  implicit class DateOptionsOps[Self <: DateOptions] (val x: Self) extends AnyVal {
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
    def setClose(value: String): Self = this.set("close", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    @scala.inline
    def setDisableVarargs(value: js.Any*): Self = this.set("disable", js.Array(value :_*))
    @scala.inline
    def setDisable(value: js.Array[_]): Self = this.set("disable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisable: Self = this.set("disable", js.undefined)
    @scala.inline
    def setFirstDay(value: Boolean | Double): Self = this.set("firstDay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstDay: Self = this.set("firstDay", js.undefined)
    @scala.inline
    def setKlass(value: DateKlassOptions): Self = this.set("klass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKlass: Self = this.set("klass", js.undefined)
    @scala.inline
    def setLabelMonthNext(value: String): Self = this.set("labelMonthNext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelMonthNext: Self = this.set("labelMonthNext", js.undefined)
    @scala.inline
    def setLabelMonthPrev(value: String): Self = this.set("labelMonthPrev", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelMonthPrev: Self = this.set("labelMonthPrev", js.undefined)
    @scala.inline
    def setLabelMonthSelect(value: String): Self = this.set("labelMonthSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelMonthSelect: Self = this.set("labelMonthSelect", js.undefined)
    @scala.inline
    def setLabelYearSelect(value: String): Self = this.set("labelYearSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelYearSelect: Self = this.set("labelYearSelect", js.undefined)
    @scala.inline
    def setMax(value: MinOrMaxDateOption): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: MinOrMaxDateOption): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setMonthsFullVarargs(value: String*): Self = this.set("monthsFull", js.Array(value :_*))
    @scala.inline
    def setMonthsFull(value: js.Array[String]): Self = this.set("monthsFull", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonthsFull: Self = this.set("monthsFull", js.undefined)
    @scala.inline
    def setMonthsShortVarargs(value: String*): Self = this.set("monthsShort", js.Array(value :_*))
    @scala.inline
    def setMonthsShort(value: js.Array[String]): Self = this.set("monthsShort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonthsShort: Self = this.set("monthsShort", js.undefined)
    @scala.inline
    def setSelectMonths(value: Boolean): Self = this.set("selectMonths", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectMonths: Self = this.set("selectMonths", js.undefined)
    @scala.inline
    def setSelectYears(value: Boolean | Double): Self = this.set("selectYears", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectYears: Self = this.set("selectYears", js.undefined)
    @scala.inline
    def setShowMonthsShort(value: Boolean): Self = this.set("showMonthsShort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowMonthsShort: Self = this.set("showMonthsShort", js.undefined)
    @scala.inline
    def setShowWeekdaysFull(value: Boolean): Self = this.set("showWeekdaysFull", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowWeekdaysFull: Self = this.set("showWeekdaysFull", js.undefined)
    @scala.inline
    def setToday(value: String): Self = this.set("today", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToday: Self = this.set("today", js.undefined)
    @scala.inline
    def setWeekdaysFullVarargs(value: String*): Self = this.set("weekdaysFull", js.Array(value :_*))
    @scala.inline
    def setWeekdaysFull(value: js.Array[String]): Self = this.set("weekdaysFull", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeekdaysFull: Self = this.set("weekdaysFull", js.undefined)
    @scala.inline
    def setWeekdaysShortVarargs(value: String*): Self = this.set("weekdaysShort", js.Array(value :_*))
    @scala.inline
    def setWeekdaysShort(value: js.Array[String]): Self = this.set("weekdaysShort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeekdaysShort: Self = this.set("weekdaysShort", js.undefined)
  }
  
}

