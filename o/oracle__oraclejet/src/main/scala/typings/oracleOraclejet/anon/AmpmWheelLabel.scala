package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AmpmWheelLabel extends StObject {
  
  var ampmWheelLabel: js.UndefOr[String] = js.undefined
  
  var cancelText: js.UndefOr[String] = js.undefined
  
  var currentTimeText: js.UndefOr[String] = js.undefined
  
  var dateTimeRange: js.UndefOr[MessageDetail] = js.undefined
  
  var hourWheelLabel: js.UndefOr[String] = js.undefined
  
  var minuteWheelLabel: js.UndefOr[String] = js.undefined
  
  var okText: js.UndefOr[String] = js.undefined
  
  var regexp: js.UndefOr[MessageSummary] = js.undefined
  
  var required: js.UndefOr[Hint] = js.undefined
  
  var tooltipTime: js.UndefOr[String] = js.undefined
  
  var tooltipTimeDisabled: js.UndefOr[String] = js.undefined
}
object AmpmWheelLabel {
  
  inline def apply(): AmpmWheelLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AmpmWheelLabel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AmpmWheelLabel] (val x: Self) extends AnyVal {
    
    inline def setAmpmWheelLabel(value: String): Self = StObject.set(x, "ampmWheelLabel", value.asInstanceOf[js.Any])
    
    inline def setAmpmWheelLabelUndefined: Self = StObject.set(x, "ampmWheelLabel", js.undefined)
    
    inline def setCancelText(value: String): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
    
    inline def setCancelTextUndefined: Self = StObject.set(x, "cancelText", js.undefined)
    
    inline def setCurrentTimeText(value: String): Self = StObject.set(x, "currentTimeText", value.asInstanceOf[js.Any])
    
    inline def setCurrentTimeTextUndefined: Self = StObject.set(x, "currentTimeText", js.undefined)
    
    inline def setDateTimeRange(value: MessageDetail): Self = StObject.set(x, "dateTimeRange", value.asInstanceOf[js.Any])
    
    inline def setDateTimeRangeUndefined: Self = StObject.set(x, "dateTimeRange", js.undefined)
    
    inline def setHourWheelLabel(value: String): Self = StObject.set(x, "hourWheelLabel", value.asInstanceOf[js.Any])
    
    inline def setHourWheelLabelUndefined: Self = StObject.set(x, "hourWheelLabel", js.undefined)
    
    inline def setMinuteWheelLabel(value: String): Self = StObject.set(x, "minuteWheelLabel", value.asInstanceOf[js.Any])
    
    inline def setMinuteWheelLabelUndefined: Self = StObject.set(x, "minuteWheelLabel", js.undefined)
    
    inline def setOkText(value: String): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
    
    inline def setOkTextUndefined: Self = StObject.set(x, "okText", js.undefined)
    
    inline def setRegexp(value: MessageSummary): Self = StObject.set(x, "regexp", value.asInstanceOf[js.Any])
    
    inline def setRegexpUndefined: Self = StObject.set(x, "regexp", js.undefined)
    
    inline def setRequired(value: Hint): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setTooltipTime(value: String): Self = StObject.set(x, "tooltipTime", value.asInstanceOf[js.Any])
    
    inline def setTooltipTimeDisabled(value: String): Self = StObject.set(x, "tooltipTimeDisabled", value.asInstanceOf[js.Any])
    
    inline def setTooltipTimeDisabledUndefined: Self = StObject.set(x, "tooltipTimeDisabled", js.undefined)
    
    inline def setTooltipTimeUndefined: Self = StObject.set(x, "tooltipTime", js.undefined)
  }
}
