package typings.officeUiFabricReact.calendarButtonExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICalendarButtonExampleProps extends js.Object {
  var buttonString: js.UndefOr[String] = js.native
  var highlightCurrentMonth: js.UndefOr[Boolean] = js.native
  var highlightSelectedMonth: js.UndefOr[Boolean] = js.native
  var isDayPickerVisible: js.UndefOr[Boolean] = js.native
  var isMonthPickerVisible: js.UndefOr[Boolean] = js.native
  var showGoToToday: js.UndefOr[Boolean] = js.native
  var showMonthPickerAsOverlay: js.UndefOr[Boolean] = js.native
}

object ICalendarButtonExampleProps {
  @scala.inline
  def apply(): ICalendarButtonExampleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICalendarButtonExampleProps]
  }
  @scala.inline
  implicit class ICalendarButtonExamplePropsOps[Self <: ICalendarButtonExampleProps] (val x: Self) extends AnyVal {
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
    def setButtonString(value: String): Self = this.set("buttonString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonString: Self = this.set("buttonString", js.undefined)
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
    def setShowGoToToday(value: Boolean): Self = this.set("showGoToToday", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowGoToToday: Self = this.set("showGoToToday", js.undefined)
    @scala.inline
    def setShowMonthPickerAsOverlay(value: Boolean): Self = this.set("showMonthPickerAsOverlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowMonthPickerAsOverlay: Self = this.set("showMonthPickerAsOverlay", js.undefined)
  }
  
}

