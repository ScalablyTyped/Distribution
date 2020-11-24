package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CurrentText extends js.Object {
  
  var currentText: js.UndefOr[String] = js.native
  
  var dateRestriction: js.UndefOr[Hint] = js.native
  
  var dateTimeRange: js.UndefOr[MessageDetail] = js.native
  
  var nextText: js.UndefOr[String] = js.native
  
  var prevText: js.UndefOr[String] = js.native
  
  var regexp: js.UndefOr[MessageSummary] = js.native
  
  var required: js.UndefOr[Hint] = js.native
  
  var tooltipCalendar: js.UndefOr[String] = js.native
  
  var tooltipCalendarDisabled: js.UndefOr[String] = js.native
  
  var tooltipCalendarTime: js.UndefOr[String] = js.native
  
  var tooltipCalendarTimeDisabled: js.UndefOr[String] = js.native
  
  var weekHeader: js.UndefOr[String] = js.native
}
object CurrentText {
  
  @scala.inline
  def apply(): CurrentText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CurrentText]
  }
  
  @scala.inline
  implicit class CurrentTextOps[Self <: CurrentText] (val x: Self) extends AnyVal {
    
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
    def setCurrentText(value: String): Self = this.set("currentText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentText: Self = this.set("currentText", js.undefined)
    
    @scala.inline
    def setDateRestriction(value: Hint): Self = this.set("dateRestriction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateRestriction: Self = this.set("dateRestriction", js.undefined)
    
    @scala.inline
    def setDateTimeRange(value: MessageDetail): Self = this.set("dateTimeRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateTimeRange: Self = this.set("dateTimeRange", js.undefined)
    
    @scala.inline
    def setNextText(value: String): Self = this.set("nextText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextText: Self = this.set("nextText", js.undefined)
    
    @scala.inline
    def setPrevText(value: String): Self = this.set("prevText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevText: Self = this.set("prevText", js.undefined)
    
    @scala.inline
    def setRegexp(value: MessageSummary): Self = this.set("regexp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegexp: Self = this.set("regexp", js.undefined)
    
    @scala.inline
    def setRequired(value: Hint): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    
    @scala.inline
    def setTooltipCalendar(value: String): Self = this.set("tooltipCalendar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipCalendar: Self = this.set("tooltipCalendar", js.undefined)
    
    @scala.inline
    def setTooltipCalendarDisabled(value: String): Self = this.set("tooltipCalendarDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipCalendarDisabled: Self = this.set("tooltipCalendarDisabled", js.undefined)
    
    @scala.inline
    def setTooltipCalendarTime(value: String): Self = this.set("tooltipCalendarTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipCalendarTime: Self = this.set("tooltipCalendarTime", js.undefined)
    
    @scala.inline
    def setTooltipCalendarTimeDisabled(value: String): Self = this.set("tooltipCalendarTimeDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipCalendarTimeDisabled: Self = this.set("tooltipCalendarTimeDisabled", js.undefined)
    
    @scala.inline
    def setWeekHeader(value: String): Self = this.set("weekHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekHeader: Self = this.set("weekHeader", js.undefined)
  }
}
