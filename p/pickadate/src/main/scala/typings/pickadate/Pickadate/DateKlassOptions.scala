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
    if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (box != null) __obj.updateDynamic("box")(box.asInstanceOf[js.Any])
    if (buttonClear != null) __obj.updateDynamic("buttonClear")(buttonClear.asInstanceOf[js.Any])
    if (buttonClose != null) __obj.updateDynamic("buttonClose")(buttonClose.asInstanceOf[js.Any])
    if (buttonToday != null) __obj.updateDynamic("buttonToday")(buttonToday.asInstanceOf[js.Any])
    if (day != null) __obj.updateDynamic("day")(day.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (focused != null) __obj.updateDynamic("focused")(focused.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (frame != null) __obj.updateDynamic("frame")(frame.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (highlighted != null) __obj.updateDynamic("highlighted")(highlighted.asInstanceOf[js.Any])
    if (holder != null) __obj.updateDynamic("holder")(holder.asInstanceOf[js.Any])
    if (infocus != null) __obj.updateDynamic("infocus")(infocus.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    if (navDisabled != null) __obj.updateDynamic("navDisabled")(navDisabled.asInstanceOf[js.Any])
    if (navNext != null) __obj.updateDynamic("navNext")(navNext.asInstanceOf[js.Any])
    if (navPrev != null) __obj.updateDynamic("navPrev")(navPrev.asInstanceOf[js.Any])
    if (now != null) __obj.updateDynamic("now")(now.asInstanceOf[js.Any])
    if (opened != null) __obj.updateDynamic("opened")(opened.asInstanceOf[js.Any])
    if (outfocus != null) __obj.updateDynamic("outfocus")(outfocus.asInstanceOf[js.Any])
    if (picker != null) __obj.updateDynamic("picker")(picker.asInstanceOf[js.Any])
    if (selectMonth != null) __obj.updateDynamic("selectMonth")(selectMonth.asInstanceOf[js.Any])
    if (selectYear != null) __obj.updateDynamic("selectYear")(selectYear.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    if (weekdays != null) __obj.updateDynamic("weekdays")(weekdays.asInstanceOf[js.Any])
    if (wrap != null) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    if (year != null) __obj.updateDynamic("year")(year.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateKlassOptions]
  }
}

