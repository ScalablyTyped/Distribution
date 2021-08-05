package typings.ngCordova.ngCordova

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatePickerOptions extends StObject {
  
  var allowFutureDates: js.UndefOr[Boolean] = js.undefined
  
  var allowOldDates: js.UndefOr[Boolean] = js.undefined
  
  var androidTheme: js.UndefOr[AndroidTheme] = js.undefined
  
  var cancelButtonColor: js.UndefOr[String] = js.undefined
  
  var cancelButtonLabel: js.UndefOr[String] = js.undefined
  
  var cancelText: js.UndefOr[String] = js.undefined
  
  var date: js.UndefOr[Date | String | Double] = js.undefined
  
  var doneButtonColor: js.UndefOr[String] = js.undefined
  
  var doneButtonLabel: js.UndefOr[String] = js.undefined
  
  var is24Hour: js.UndefOr[Boolean] = js.undefined
  
  var locale: js.UndefOr[String] = js.undefined
  
  var maxDate: js.UndefOr[Date | String | Double] = js.undefined
  
  var minDate: js.UndefOr[Date | String | Double] = js.undefined
  
  var minuteInterval: js.UndefOr[Double] = js.undefined
  
  var mode: js.UndefOr[String] = js.undefined
  
  var nowText: js.UndefOr[String] = js.undefined
  
  var okText: js.UndefOr[String] = js.undefined
  
  var popoverArrowDirection: js.UndefOr[String] = js.undefined
  
  var titleText: js.UndefOr[String] = js.undefined
  
  var todayText: js.UndefOr[String] = js.undefined
  
  var x: js.UndefOr[Double] = js.undefined
  
  var y: js.UndefOr[Double] = js.undefined
}
object DatePickerOptions {
  
  inline def apply(): DatePickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatePickerOptions]
  }
  
  extension [Self <: DatePickerOptions](x: Self) {
    
    inline def setAllowFutureDates(value: Boolean): Self = StObject.set(x, "allowFutureDates", value.asInstanceOf[js.Any])
    
    inline def setAllowFutureDatesUndefined: Self = StObject.set(x, "allowFutureDates", js.undefined)
    
    inline def setAllowOldDates(value: Boolean): Self = StObject.set(x, "allowOldDates", value.asInstanceOf[js.Any])
    
    inline def setAllowOldDatesUndefined: Self = StObject.set(x, "allowOldDates", js.undefined)
    
    inline def setAndroidTheme(value: AndroidTheme): Self = StObject.set(x, "androidTheme", value.asInstanceOf[js.Any])
    
    inline def setAndroidThemeUndefined: Self = StObject.set(x, "androidTheme", js.undefined)
    
    inline def setCancelButtonColor(value: String): Self = StObject.set(x, "cancelButtonColor", value.asInstanceOf[js.Any])
    
    inline def setCancelButtonColorUndefined: Self = StObject.set(x, "cancelButtonColor", js.undefined)
    
    inline def setCancelButtonLabel(value: String): Self = StObject.set(x, "cancelButtonLabel", value.asInstanceOf[js.Any])
    
    inline def setCancelButtonLabelUndefined: Self = StObject.set(x, "cancelButtonLabel", js.undefined)
    
    inline def setCancelText(value: String): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
    
    inline def setCancelTextUndefined: Self = StObject.set(x, "cancelText", js.undefined)
    
    inline def setDate(value: Date | String | Double): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDoneButtonColor(value: String): Self = StObject.set(x, "doneButtonColor", value.asInstanceOf[js.Any])
    
    inline def setDoneButtonColorUndefined: Self = StObject.set(x, "doneButtonColor", js.undefined)
    
    inline def setDoneButtonLabel(value: String): Self = StObject.set(x, "doneButtonLabel", value.asInstanceOf[js.Any])
    
    inline def setDoneButtonLabelUndefined: Self = StObject.set(x, "doneButtonLabel", js.undefined)
    
    inline def setIs24Hour(value: Boolean): Self = StObject.set(x, "is24Hour", value.asInstanceOf[js.Any])
    
    inline def setIs24HourUndefined: Self = StObject.set(x, "is24Hour", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setMaxDate(value: Date | String | Double): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
    
    inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
    
    inline def setMinDate(value: Date | String | Double): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
    
    inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
    
    inline def setMinuteInterval(value: Double): Self = StObject.set(x, "minuteInterval", value.asInstanceOf[js.Any])
    
    inline def setMinuteIntervalUndefined: Self = StObject.set(x, "minuteInterval", js.undefined)
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setNowText(value: String): Self = StObject.set(x, "nowText", value.asInstanceOf[js.Any])
    
    inline def setNowTextUndefined: Self = StObject.set(x, "nowText", js.undefined)
    
    inline def setOkText(value: String): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
    
    inline def setOkTextUndefined: Self = StObject.set(x, "okText", js.undefined)
    
    inline def setPopoverArrowDirection(value: String): Self = StObject.set(x, "popoverArrowDirection", value.asInstanceOf[js.Any])
    
    inline def setPopoverArrowDirectionUndefined: Self = StObject.set(x, "popoverArrowDirection", js.undefined)
    
    inline def setTitleText(value: String): Self = StObject.set(x, "titleText", value.asInstanceOf[js.Any])
    
    inline def setTitleTextUndefined: Self = StObject.set(x, "titleText", js.undefined)
    
    inline def setTodayText(value: String): Self = StObject.set(x, "todayText", value.asInstanceOf[js.Any])
    
    inline def setTodayTextUndefined: Self = StObject.set(x, "todayText", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
