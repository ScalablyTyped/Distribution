package typings.officeUiFabricReact.calendarYearMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICalendarYearStrings extends js.Object {
  
  var headerAriaLabelFormatString: js.UndefOr[String] = js.native
  
  var nextRangeAriaLabel: js.UndefOr[String | ICalendarYearRangeToString] = js.native
  
  var prevRangeAriaLabel: js.UndefOr[String | ICalendarYearRangeToString] = js.native
  
  var rangeAriaLabel: js.UndefOr[String | ICalendarYearRangeToString] = js.native
}
object ICalendarYearStrings {
  
  @scala.inline
  def apply(): ICalendarYearStrings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICalendarYearStrings]
  }
  
  @scala.inline
  implicit class ICalendarYearStringsOps[Self <: ICalendarYearStrings] (val x: Self) extends AnyVal {
    
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
    def setHeaderAriaLabelFormatString(value: String): Self = this.set("headerAriaLabelFormatString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderAriaLabelFormatString: Self = this.set("headerAriaLabelFormatString", js.undefined)
    
    @scala.inline
    def setNextRangeAriaLabelFunction1(value: /* range */ ICalendarYearRange => String): Self = this.set("nextRangeAriaLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNextRangeAriaLabel(value: String | ICalendarYearRangeToString): Self = this.set("nextRangeAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextRangeAriaLabel: Self = this.set("nextRangeAriaLabel", js.undefined)
    
    @scala.inline
    def setPrevRangeAriaLabelFunction1(value: /* range */ ICalendarYearRange => String): Self = this.set("prevRangeAriaLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPrevRangeAriaLabel(value: String | ICalendarYearRangeToString): Self = this.set("prevRangeAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevRangeAriaLabel: Self = this.set("prevRangeAriaLabel", js.undefined)
    
    @scala.inline
    def setRangeAriaLabelFunction1(value: /* range */ ICalendarYearRange => String): Self = this.set("rangeAriaLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRangeAriaLabel(value: String | ICalendarYearRangeToString): Self = this.set("rangeAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeAriaLabel: Self = this.set("rangeAriaLabel", js.undefined)
  }
}
