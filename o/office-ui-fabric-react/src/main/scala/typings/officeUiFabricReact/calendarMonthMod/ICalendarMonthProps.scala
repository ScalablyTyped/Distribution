package typings.officeUiFabricReact.calendarMonthMod

import typings.officeUiFabricReact.calendarTypesMod.ICalendarFormatDateCallbacks
import typings.officeUiFabricReact.calendarTypesMod.ICalendarIconStrings
import typings.officeUiFabricReact.calendarTypesMod.ICalendarStrings
import typings.react.mod.ClassAttributes
import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.std.Date
import typings.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICalendarMonthProps extends ClassAttributes[CalendarMonth] {
  var componentRef: js.UndefOr[IRefObject[ICalendarMonth]] = js.undefined
  var dateTimeFormatter: ICalendarFormatDateCallbacks
  var highlightCurrentMonth: Boolean
  var highlightSelectedMonth: Boolean
  var maxDate: js.UndefOr[Date] = js.undefined
  var minDate: js.UndefOr[Date] = js.undefined
  var navigatedDate: Date
  var navigationIcons: ICalendarIconStrings
  var onHeaderSelect: js.UndefOr[js.Function1[/* focus */ Boolean, Unit]] = js.undefined
  var selectedDate: Date
  var strings: ICalendarStrings
  var today: js.UndefOr[Date] = js.undefined
  var yearPickerHidden: js.UndefOr[Boolean] = js.undefined
  def onNavigateDate(date: Date, focusOnNavigatedDay: Boolean): Unit
}

object ICalendarMonthProps {
  @scala.inline
  def apply(
    dateTimeFormatter: ICalendarFormatDateCallbacks,
    highlightCurrentMonth: Boolean,
    highlightSelectedMonth: Boolean,
    navigatedDate: Date,
    navigationIcons: ICalendarIconStrings,
    onNavigateDate: (Date, Boolean) => Unit,
    selectedDate: Date,
    strings: ICalendarStrings,
    componentRef: IRefObject[ICalendarMonth] = null,
    key: Key = null,
    maxDate: Date = null,
    minDate: Date = null,
    onHeaderSelect: /* focus */ Boolean => Unit = null,
    ref: LegacyRef[CalendarMonth] = null,
    today: Date = null,
    yearPickerHidden: js.UndefOr[Boolean] = js.undefined
  ): ICalendarMonthProps = {
    val __obj = js.Dynamic.literal(dateTimeFormatter = dateTimeFormatter.asInstanceOf[js.Any], highlightCurrentMonth = highlightCurrentMonth.asInstanceOf[js.Any], highlightSelectedMonth = highlightSelectedMonth.asInstanceOf[js.Any], navigatedDate = navigatedDate.asInstanceOf[js.Any], navigationIcons = navigationIcons.asInstanceOf[js.Any], onNavigateDate = js.Any.fromFunction2(onNavigateDate), selectedDate = selectedDate.asInstanceOf[js.Any], strings = strings.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (onHeaderSelect != null) __obj.updateDynamic("onHeaderSelect")(js.Any.fromFunction1(onHeaderSelect))
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (today != null) __obj.updateDynamic("today")(today.asInstanceOf[js.Any])
    if (!js.isUndefined(yearPickerHidden)) __obj.updateDynamic("yearPickerHidden")(yearPickerHidden.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICalendarMonthProps]
  }
}

