package typings.pickadate.Pickadate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateKlassOptions extends KlassOptions {
   // default 'picker__footer'
  // Today & close buttons
  var buttonClose: js.UndefOr[String] = js.undefined
   // default 'picker__button--close'
  var buttonToday: js.UndefOr[String] = js.undefined
   // default 'picker__weekday'
  // Day states
  var day: js.UndefOr[String] = js.undefined
   // default 'picker__day--outfocus'
  // The picker footer
  var footer: js.UndefOr[String] = js.undefined
  // The picker header
  var header: js.UndefOr[String] = js.undefined
   // default 'picker__day'
  var infocus: js.UndefOr[String] = js.undefined
   // default 'picker__nav--disabled'
  // Month & year labels
  var month: js.UndefOr[String] = js.undefined
   // default 'picker__nav--next'
  var navDisabled: js.UndefOr[String] = js.undefined
   // default 'picker__nav--prev'
  var navNext: js.UndefOr[String] = js.undefined
   // default 'picker__header'
  // Month navigation
  var navPrev: js.UndefOr[String] = js.undefined
   // default 'picker__day--infocus'
  var outfocus: js.UndefOr[String] = js.undefined
   // default 'picker__year'
  // Month & year dropdowns
  var selectMonth: js.UndefOr[String] = js.undefined
   // default 'picker__select--month'
  var selectYear: js.UndefOr[String] = js.undefined
   // default 'picker__select--year'
  // Table of dates
  var table: js.UndefOr[String] = js.undefined
   // default 'picker__table'
  // Weekday labels
  var weekdays: js.UndefOr[String] = js.undefined
   // default 'picker__month'
  var year: js.UndefOr[String] = js.undefined
}

object DateKlassOptions {
  @scala.inline
  def apply(
    active: String = null,
    box: String = null,
    buttonClear: String = null,
    buttonClose: String = null,
    buttonToday: String = null,
    day: String = null,
    disabled: String = null,
    focused: String = null,
    footer: String = null,
    frame: String = null,
    header: String = null,
    highlighted: String = null,
    holder: String = null,
    infocus: String = null,
    input: String = null,
    month: String = null,
    navDisabled: String = null,
    navNext: String = null,
    navPrev: String = null,
    now: String = null,
    opened: String = null,
    outfocus: String = null,
    picker: String = null,
    selectMonth: String = null,
    selectYear: String = null,
    selected: String = null,
    table: String = null,
    weekdays: String = null,
    wrap: String = null,
    year: String = null
  ): DateKlassOptions = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active)
    if (box != null) __obj.updateDynamic("box")(box)
    if (buttonClear != null) __obj.updateDynamic("buttonClear")(buttonClear)
    if (buttonClose != null) __obj.updateDynamic("buttonClose")(buttonClose)
    if (buttonToday != null) __obj.updateDynamic("buttonToday")(buttonToday)
    if (day != null) __obj.updateDynamic("day")(day)
    if (disabled != null) __obj.updateDynamic("disabled")(disabled)
    if (focused != null) __obj.updateDynamic("focused")(focused)
    if (footer != null) __obj.updateDynamic("footer")(footer)
    if (frame != null) __obj.updateDynamic("frame")(frame)
    if (header != null) __obj.updateDynamic("header")(header)
    if (highlighted != null) __obj.updateDynamic("highlighted")(highlighted)
    if (holder != null) __obj.updateDynamic("holder")(holder)
    if (infocus != null) __obj.updateDynamic("infocus")(infocus)
    if (input != null) __obj.updateDynamic("input")(input)
    if (month != null) __obj.updateDynamic("month")(month)
    if (navDisabled != null) __obj.updateDynamic("navDisabled")(navDisabled)
    if (navNext != null) __obj.updateDynamic("navNext")(navNext)
    if (navPrev != null) __obj.updateDynamic("navPrev")(navPrev)
    if (now != null) __obj.updateDynamic("now")(now)
    if (opened != null) __obj.updateDynamic("opened")(opened)
    if (outfocus != null) __obj.updateDynamic("outfocus")(outfocus)
    if (picker != null) __obj.updateDynamic("picker")(picker)
    if (selectMonth != null) __obj.updateDynamic("selectMonth")(selectMonth)
    if (selectYear != null) __obj.updateDynamic("selectYear")(selectYear)
    if (selected != null) __obj.updateDynamic("selected")(selected)
    if (table != null) __obj.updateDynamic("table")(table)
    if (weekdays != null) __obj.updateDynamic("weekdays")(weekdays)
    if (wrap != null) __obj.updateDynamic("wrap")(wrap)
    if (year != null) __obj.updateDynamic("year")(year)
    __obj.asInstanceOf[DateKlassOptions]
  }
}

