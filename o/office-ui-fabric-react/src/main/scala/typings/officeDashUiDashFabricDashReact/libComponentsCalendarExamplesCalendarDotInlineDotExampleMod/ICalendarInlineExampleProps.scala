package typings.officeDashUiDashFabricDashReact.libComponentsCalendarExamplesCalendarDotInlineDotExampleMod

import typings.officeDashUiDashFabricDashReact.libUtilitiesDateValuesDateValuesMod.DateRangeType
import typings.officeDashUiDashFabricDashReact.libUtilitiesDateValuesDateValuesMod.DayOfWeek
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICalendarInlineExampleProps extends js.Object {
  var autoNavigateOnSelection: Boolean
  var dateRangeType: DateRangeType
  var firstDayOfWeek: js.UndefOr[DayOfWeek] = js.undefined
  var highlightCurrentMonth: js.UndefOr[Boolean] = js.undefined
  var highlightSelectedMonth: js.UndefOr[Boolean] = js.undefined
  var isDayPickerVisible: js.UndefOr[Boolean] = js.undefined
  var isMonthPickerVisible: js.UndefOr[Boolean] = js.undefined
  var maxDate: js.UndefOr[Date] = js.undefined
  var minDate: js.UndefOr[Date] = js.undefined
  var restrictedDates: js.UndefOr[js.Array[Date]] = js.undefined
  var showGoToToday: Boolean
  var showMonthPickerAsOverlay: js.UndefOr[Boolean] = js.undefined
  var showNavigateButtons: js.UndefOr[Boolean] = js.undefined
  var showSixWeeksByDefault: js.UndefOr[Boolean] = js.undefined
  var showWeekNumbers: js.UndefOr[Boolean] = js.undefined
  var workWeekDays: js.UndefOr[js.Array[DayOfWeek]] = js.undefined
}

object ICalendarInlineExampleProps {
  @scala.inline
  def apply(
    autoNavigateOnSelection: Boolean,
    dateRangeType: DateRangeType,
    showGoToToday: Boolean,
    firstDayOfWeek: DayOfWeek = null,
    highlightCurrentMonth: js.UndefOr[Boolean] = js.undefined,
    highlightSelectedMonth: js.UndefOr[Boolean] = js.undefined,
    isDayPickerVisible: js.UndefOr[Boolean] = js.undefined,
    isMonthPickerVisible: js.UndefOr[Boolean] = js.undefined,
    maxDate: Date = null,
    minDate: Date = null,
    restrictedDates: js.Array[Date] = null,
    showMonthPickerAsOverlay: js.UndefOr[Boolean] = js.undefined,
    showNavigateButtons: js.UndefOr[Boolean] = js.undefined,
    showSixWeeksByDefault: js.UndefOr[Boolean] = js.undefined,
    showWeekNumbers: js.UndefOr[Boolean] = js.undefined,
    workWeekDays: js.Array[DayOfWeek] = null
  ): ICalendarInlineExampleProps = {
    val __obj = js.Dynamic.literal(autoNavigateOnSelection = autoNavigateOnSelection.asInstanceOf[js.Any], dateRangeType = dateRangeType.asInstanceOf[js.Any], showGoToToday = showGoToToday.asInstanceOf[js.Any])
    if (firstDayOfWeek != null) __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightCurrentMonth)) __obj.updateDynamic("highlightCurrentMonth")(highlightCurrentMonth.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightSelectedMonth)) __obj.updateDynamic("highlightSelectedMonth")(highlightSelectedMonth.asInstanceOf[js.Any])
    if (!js.isUndefined(isDayPickerVisible)) __obj.updateDynamic("isDayPickerVisible")(isDayPickerVisible.asInstanceOf[js.Any])
    if (!js.isUndefined(isMonthPickerVisible)) __obj.updateDynamic("isMonthPickerVisible")(isMonthPickerVisible.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (restrictedDates != null) __obj.updateDynamic("restrictedDates")(restrictedDates.asInstanceOf[js.Any])
    if (!js.isUndefined(showMonthPickerAsOverlay)) __obj.updateDynamic("showMonthPickerAsOverlay")(showMonthPickerAsOverlay.asInstanceOf[js.Any])
    if (!js.isUndefined(showNavigateButtons)) __obj.updateDynamic("showNavigateButtons")(showNavigateButtons.asInstanceOf[js.Any])
    if (!js.isUndefined(showSixWeeksByDefault)) __obj.updateDynamic("showSixWeeksByDefault")(showSixWeeksByDefault.asInstanceOf[js.Any])
    if (!js.isUndefined(showWeekNumbers)) __obj.updateDynamic("showWeekNumbers")(showWeekNumbers.asInstanceOf[js.Any])
    if (workWeekDays != null) __obj.updateDynamic("workWeekDays")(workWeekDays.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICalendarInlineExampleProps]
  }
}

