package typings.officeUiFabricReact.calendarInlineExampleMod

import typings.fluentuiDateTimeUtilities.dateValuesMod.DateRangeType
import typings.fluentuiDateTimeUtilities.dateValuesMod.DayOfWeek
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICalendarInlineExampleProps extends js.Object {
  var autoNavigateOnSelection: Boolean = js.native
  var dateRangeType: DateRangeType = js.native
  var firstDayOfWeek: js.UndefOr[DayOfWeek] = js.native
  var highlightCurrentMonth: js.UndefOr[Boolean] = js.native
  var highlightSelectedMonth: js.UndefOr[Boolean] = js.native
  var isDayPickerVisible: js.UndefOr[Boolean] = js.native
  var isMonthPickerVisible: js.UndefOr[Boolean] = js.native
  var maxDate: js.UndefOr[Date] = js.native
  var minDate: js.UndefOr[Date] = js.native
  var restrictedDates: js.UndefOr[js.Array[Date]] = js.native
  var showGoToToday: Boolean = js.native
  var showMonthPickerAsOverlay: js.UndefOr[Boolean] = js.native
  var showNavigateButtons: js.UndefOr[Boolean] = js.native
  var showSixWeeksByDefault: js.UndefOr[Boolean] = js.native
  var showWeekNumbers: js.UndefOr[Boolean] = js.native
  var workWeekDays: js.UndefOr[js.Array[DayOfWeek]] = js.native
}

object ICalendarInlineExampleProps {
  @scala.inline
  def apply(autoNavigateOnSelection: Boolean, dateRangeType: DateRangeType, showGoToToday: Boolean): ICalendarInlineExampleProps = {
    val __obj = js.Dynamic.literal(autoNavigateOnSelection = autoNavigateOnSelection.asInstanceOf[js.Any], dateRangeType = dateRangeType.asInstanceOf[js.Any], showGoToToday = showGoToToday.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICalendarInlineExampleProps]
  }
  @scala.inline
  implicit class ICalendarInlineExamplePropsOps[Self <: ICalendarInlineExampleProps] (val x: Self) extends AnyVal {
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
    def setAutoNavigateOnSelection(value: Boolean): Self = this.set("autoNavigateOnSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def setDateRangeType(value: DateRangeType): Self = this.set("dateRangeType", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowGoToToday(value: Boolean): Self = this.set("showGoToToday", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirstDayOfWeek(value: DayOfWeek): Self = this.set("firstDayOfWeek", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstDayOfWeek: Self = this.set("firstDayOfWeek", js.undefined)
    @scala.inline
    def setHighlightCurrentMonth(value: Boolean): Self = this.set("highlightCurrentMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightCurrentMonth: Self = this.set("highlightCurrentMonth", js.undefined)
    @scala.inline
    def setHighlightSelectedMonth(value: Boolean): Self = this.set("highlightSelectedMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightSelectedMonth: Self = this.set("highlightSelectedMonth", js.undefined)
    @scala.inline
    def setIsDayPickerVisible(value: Boolean): Self = this.set("isDayPickerVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDayPickerVisible: Self = this.set("isDayPickerVisible", js.undefined)
    @scala.inline
    def setIsMonthPickerVisible(value: Boolean): Self = this.set("isMonthPickerVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsMonthPickerVisible: Self = this.set("isMonthPickerVisible", js.undefined)
    @scala.inline
    def setMaxDate(value: Date): Self = this.set("maxDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDate: Self = this.set("maxDate", js.undefined)
    @scala.inline
    def setMinDate(value: Date): Self = this.set("minDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinDate: Self = this.set("minDate", js.undefined)
    @scala.inline
    def setRestrictedDatesVarargs(value: Date*): Self = this.set("restrictedDates", js.Array(value :_*))
    @scala.inline
    def setRestrictedDates(value: js.Array[Date]): Self = this.set("restrictedDates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestrictedDates: Self = this.set("restrictedDates", js.undefined)
    @scala.inline
    def setShowMonthPickerAsOverlay(value: Boolean): Self = this.set("showMonthPickerAsOverlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowMonthPickerAsOverlay: Self = this.set("showMonthPickerAsOverlay", js.undefined)
    @scala.inline
    def setShowNavigateButtons(value: Boolean): Self = this.set("showNavigateButtons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowNavigateButtons: Self = this.set("showNavigateButtons", js.undefined)
    @scala.inline
    def setShowSixWeeksByDefault(value: Boolean): Self = this.set("showSixWeeksByDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowSixWeeksByDefault: Self = this.set("showSixWeeksByDefault", js.undefined)
    @scala.inline
    def setShowWeekNumbers(value: Boolean): Self = this.set("showWeekNumbers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowWeekNumbers: Self = this.set("showWeekNumbers", js.undefined)
    @scala.inline
    def setWorkWeekDaysVarargs(value: DayOfWeek*): Self = this.set("workWeekDays", js.Array(value :_*))
    @scala.inline
    def setWorkWeekDays(value: js.Array[DayOfWeek]): Self = this.set("workWeekDays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkWeekDays: Self = this.set("workWeekDays", js.undefined)
  }
  
}

