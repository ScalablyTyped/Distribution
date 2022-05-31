package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrentText extends StObject {
  
  var currentText: js.UndefOr[String] = js.undefined
  
  var dateRestriction: js.UndefOr[Hint] = js.undefined
  
  var dateTimeRange: js.UndefOr[MessageDetail] = js.undefined
  
  var nextText: js.UndefOr[String] = js.undefined
  
  var prevText: js.UndefOr[String] = js.undefined
  
  var regexp: js.UndefOr[MessageSummary] = js.undefined
  
  var required: js.UndefOr[Hint] = js.undefined
  
  var tooltipCalendar: js.UndefOr[String] = js.undefined
  
  var tooltipCalendarDisabled: js.UndefOr[String] = js.undefined
  
  var tooltipCalendarTime: js.UndefOr[String] = js.undefined
  
  var tooltipCalendarTimeDisabled: js.UndefOr[String] = js.undefined
  
  var weekHeader: js.UndefOr[String] = js.undefined
}
object CurrentText {
  
  inline def apply(): CurrentText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CurrentText]
  }
  
  extension [Self <: CurrentText](x: Self) {
    
    inline def setCurrentText(value: String): Self = StObject.set(x, "currentText", value.asInstanceOf[js.Any])
    
    inline def setCurrentTextUndefined: Self = StObject.set(x, "currentText", js.undefined)
    
    inline def setDateRestriction(value: Hint): Self = StObject.set(x, "dateRestriction", value.asInstanceOf[js.Any])
    
    inline def setDateRestrictionUndefined: Self = StObject.set(x, "dateRestriction", js.undefined)
    
    inline def setDateTimeRange(value: MessageDetail): Self = StObject.set(x, "dateTimeRange", value.asInstanceOf[js.Any])
    
    inline def setDateTimeRangeUndefined: Self = StObject.set(x, "dateTimeRange", js.undefined)
    
    inline def setNextText(value: String): Self = StObject.set(x, "nextText", value.asInstanceOf[js.Any])
    
    inline def setNextTextUndefined: Self = StObject.set(x, "nextText", js.undefined)
    
    inline def setPrevText(value: String): Self = StObject.set(x, "prevText", value.asInstanceOf[js.Any])
    
    inline def setPrevTextUndefined: Self = StObject.set(x, "prevText", js.undefined)
    
    inline def setRegexp(value: MessageSummary): Self = StObject.set(x, "regexp", value.asInstanceOf[js.Any])
    
    inline def setRegexpUndefined: Self = StObject.set(x, "regexp", js.undefined)
    
    inline def setRequired(value: Hint): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setTooltipCalendar(value: String): Self = StObject.set(x, "tooltipCalendar", value.asInstanceOf[js.Any])
    
    inline def setTooltipCalendarDisabled(value: String): Self = StObject.set(x, "tooltipCalendarDisabled", value.asInstanceOf[js.Any])
    
    inline def setTooltipCalendarDisabledUndefined: Self = StObject.set(x, "tooltipCalendarDisabled", js.undefined)
    
    inline def setTooltipCalendarTime(value: String): Self = StObject.set(x, "tooltipCalendarTime", value.asInstanceOf[js.Any])
    
    inline def setTooltipCalendarTimeDisabled(value: String): Self = StObject.set(x, "tooltipCalendarTimeDisabled", value.asInstanceOf[js.Any])
    
    inline def setTooltipCalendarTimeDisabledUndefined: Self = StObject.set(x, "tooltipCalendarTimeDisabled", js.undefined)
    
    inline def setTooltipCalendarTimeUndefined: Self = StObject.set(x, "tooltipCalendarTime", js.undefined)
    
    inline def setTooltipCalendarUndefined: Self = StObject.set(x, "tooltipCalendar", js.undefined)
    
    inline def setWeekHeader(value: String): Self = StObject.set(x, "weekHeader", value.asInstanceOf[js.Any])
    
    inline def setWeekHeaderUndefined: Self = StObject.set(x, "weekHeader", js.undefined)
  }
}
