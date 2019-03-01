package typings
package pickadateLib.PickadateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateKlassOptions extends KlassOptions {
   // default 'picker__footer'
  // Today & close buttons
  var buttonClose: js.UndefOr[java.lang.String] = js.undefined
   // default 'picker__button--close'
  var buttonToday: js.UndefOr[java.lang.String] = js.undefined
   // default 'picker__weekday'
  // Day states
  var day: js.UndefOr[java.lang.String] = js.undefined
   // default 'picker__day--outfocus'
  // The picker footer
  var footer: js.UndefOr[java.lang.String] = js.undefined
  // The picker header
  var header: js.UndefOr[java.lang.String] = js.undefined
   // default 'picker__day'
  var infocus: js.UndefOr[java.lang.String] = js.undefined
   // default 'picker__nav--disabled'
  // Month & year labels
  var month: js.UndefOr[java.lang.String] = js.undefined
   // default 'picker__nav--next'
  var navDisabled: js.UndefOr[java.lang.String] = js.undefined
   // default 'picker__nav--prev'
  var navNext: js.UndefOr[java.lang.String] = js.undefined
   // default 'picker__header'
  // Month navigation
  var navPrev: js.UndefOr[java.lang.String] = js.undefined
   // default 'picker__day--infocus'
  var outfocus: js.UndefOr[java.lang.String] = js.undefined
   // default 'picker__year'
  // Month & year dropdowns
  var selectMonth: js.UndefOr[java.lang.String] = js.undefined
   // default 'picker__select--month'
  var selectYear: js.UndefOr[java.lang.String] = js.undefined
   // default 'picker__select--year'
  // Table of dates
  var table: js.UndefOr[java.lang.String] = js.undefined
   // default 'picker__table'
  // Weekday labels
  var weekdays: js.UndefOr[java.lang.String] = js.undefined
   // default 'picker__month'
  var year: js.UndefOr[java.lang.String] = js.undefined
}

object DateKlassOptions {
  @scala.inline
  def apply(
    active: java.lang.String = null,
    box: java.lang.String = null,
    buttonClear: java.lang.String = null,
    buttonClose: java.lang.String = null,
    buttonToday: java.lang.String = null,
    day: java.lang.String = null,
    disabled: java.lang.String = null,
    focused: java.lang.String = null,
    footer: java.lang.String = null,
    frame: java.lang.String = null,
    header: java.lang.String = null,
    highlighted: java.lang.String = null,
    holder: java.lang.String = null,
    infocus: java.lang.String = null,
    input: java.lang.String = null,
    month: java.lang.String = null,
    navDisabled: java.lang.String = null,
    navNext: java.lang.String = null,
    navPrev: java.lang.String = null,
    now: java.lang.String = null,
    opened: java.lang.String = null,
    outfocus: java.lang.String = null,
    picker: java.lang.String = null,
    selectMonth: java.lang.String = null,
    selectYear: java.lang.String = null,
    selected: java.lang.String = null,
    table: java.lang.String = null,
    weekdays: java.lang.String = null,
    wrap: java.lang.String = null,
    year: java.lang.String = null
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

