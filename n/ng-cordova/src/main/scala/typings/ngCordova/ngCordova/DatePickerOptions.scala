package typings.ngCordova.ngCordova

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatePickerOptions extends StObject {
  
  var allowFutureDates: js.UndefOr[Boolean] = js.native
  
  var allowOldDates: js.UndefOr[Boolean] = js.native
  
  var androidTheme: js.UndefOr[AndroidTheme] = js.native
  
  var cancelButtonColor: js.UndefOr[String] = js.native
  
  var cancelButtonLabel: js.UndefOr[String] = js.native
  
  var cancelText: js.UndefOr[String] = js.native
  
  var date: js.UndefOr[Date | String | Double] = js.native
  
  var doneButtonColor: js.UndefOr[String] = js.native
  
  var doneButtonLabel: js.UndefOr[String] = js.native
  
  var is24Hour: js.UndefOr[Boolean] = js.native
  
  var locale: js.UndefOr[String] = js.native
  
  var maxDate: js.UndefOr[Date | String | Double] = js.native
  
  var minDate: js.UndefOr[Date | String | Double] = js.native
  
  var minuteInterval: js.UndefOr[Double] = js.native
  
  var mode: js.UndefOr[String] = js.native
  
  var nowText: js.UndefOr[String] = js.native
  
  var okText: js.UndefOr[String] = js.native
  
  var popoverArrowDirection: js.UndefOr[String] = js.native
  
  var titleText: js.UndefOr[String] = js.native
  
  var todayText: js.UndefOr[String] = js.native
  
  var x: js.UndefOr[Double] = js.native
  
  var y: js.UndefOr[Double] = js.native
}
object DatePickerOptions {
  
  @scala.inline
  def apply(): DatePickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatePickerOptions]
  }
  
  @scala.inline
  implicit class DatePickerOptionsMutableBuilder[Self <: DatePickerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowFutureDates(value: Boolean): Self = StObject.set(x, "allowFutureDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowFutureDatesUndefined: Self = StObject.set(x, "allowFutureDates", js.undefined)
    
    @scala.inline
    def setAllowOldDates(value: Boolean): Self = StObject.set(x, "allowOldDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowOldDatesUndefined: Self = StObject.set(x, "allowOldDates", js.undefined)
    
    @scala.inline
    def setAndroidTheme(value: AndroidTheme): Self = StObject.set(x, "androidTheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidThemeUndefined: Self = StObject.set(x, "androidTheme", js.undefined)
    
    @scala.inline
    def setCancelButtonColor(value: String): Self = StObject.set(x, "cancelButtonColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelButtonColorUndefined: Self = StObject.set(x, "cancelButtonColor", js.undefined)
    
    @scala.inline
    def setCancelButtonLabel(value: String): Self = StObject.set(x, "cancelButtonLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelButtonLabelUndefined: Self = StObject.set(x, "cancelButtonLabel", js.undefined)
    
    @scala.inline
    def setCancelText(value: String): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelTextUndefined: Self = StObject.set(x, "cancelText", js.undefined)
    
    @scala.inline
    def setDate(value: Date | String | Double): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setDoneButtonColor(value: String): Self = StObject.set(x, "doneButtonColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoneButtonColorUndefined: Self = StObject.set(x, "doneButtonColor", js.undefined)
    
    @scala.inline
    def setDoneButtonLabel(value: String): Self = StObject.set(x, "doneButtonLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoneButtonLabelUndefined: Self = StObject.set(x, "doneButtonLabel", js.undefined)
    
    @scala.inline
    def setIs24Hour(value: Boolean): Self = StObject.set(x, "is24Hour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs24HourUndefined: Self = StObject.set(x, "is24Hour", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setMaxDate(value: Date | String | Double): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
    
    @scala.inline
    def setMinDate(value: Date | String | Double): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
    
    @scala.inline
    def setMinuteInterval(value: Double): Self = StObject.set(x, "minuteInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinuteIntervalUndefined: Self = StObject.set(x, "minuteInterval", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setNowText(value: String): Self = StObject.set(x, "nowText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNowTextUndefined: Self = StObject.set(x, "nowText", js.undefined)
    
    @scala.inline
    def setOkText(value: String): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOkTextUndefined: Self = StObject.set(x, "okText", js.undefined)
    
    @scala.inline
    def setPopoverArrowDirection(value: String): Self = StObject.set(x, "popoverArrowDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopoverArrowDirectionUndefined: Self = StObject.set(x, "popoverArrowDirection", js.undefined)
    
    @scala.inline
    def setTitleText(value: String): Self = StObject.set(x, "titleText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleTextUndefined: Self = StObject.set(x, "titleText", js.undefined)
    
    @scala.inline
    def setTodayText(value: String): Self = StObject.set(x, "todayText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTodayTextUndefined: Self = StObject.set(x, "todayText", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
