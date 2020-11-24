package typings.ngCordova.ngCordova

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatePickerOptions extends js.Object {
  
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
  implicit class DatePickerOptionsOps[Self <: DatePickerOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowFutureDates(value: Boolean): Self = this.set("allowFutureDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowFutureDates: Self = this.set("allowFutureDates", js.undefined)
    
    @scala.inline
    def setAllowOldDates(value: Boolean): Self = this.set("allowOldDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowOldDates: Self = this.set("allowOldDates", js.undefined)
    
    @scala.inline
    def setAndroidTheme(value: AndroidTheme): Self = this.set("androidTheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAndroidTheme: Self = this.set("androidTheme", js.undefined)
    
    @scala.inline
    def setCancelButtonColor(value: String): Self = this.set("cancelButtonColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelButtonColor: Self = this.set("cancelButtonColor", js.undefined)
    
    @scala.inline
    def setCancelButtonLabel(value: String): Self = this.set("cancelButtonLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelButtonLabel: Self = this.set("cancelButtonLabel", js.undefined)
    
    @scala.inline
    def setCancelText(value: String): Self = this.set("cancelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelText: Self = this.set("cancelText", js.undefined)
    
    @scala.inline
    def setDate(value: Date | String | Double): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setDoneButtonColor(value: String): Self = this.set("doneButtonColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoneButtonColor: Self = this.set("doneButtonColor", js.undefined)
    
    @scala.inline
    def setDoneButtonLabel(value: String): Self = this.set("doneButtonLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoneButtonLabel: Self = this.set("doneButtonLabel", js.undefined)
    
    @scala.inline
    def setIs24Hour(value: Boolean): Self = this.set("is24Hour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs24Hour: Self = this.set("is24Hour", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setMaxDate(value: Date | String | Double): Self = this.set("maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDate: Self = this.set("maxDate", js.undefined)
    
    @scala.inline
    def setMinDate(value: Date | String | Double): Self = this.set("minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinDate: Self = this.set("minDate", js.undefined)
    
    @scala.inline
    def setMinuteInterval(value: Double): Self = this.set("minuteInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinuteInterval: Self = this.set("minuteInterval", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setNowText(value: String): Self = this.set("nowText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNowText: Self = this.set("nowText", js.undefined)
    
    @scala.inline
    def setOkText(value: String): Self = this.set("okText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOkText: Self = this.set("okText", js.undefined)
    
    @scala.inline
    def setPopoverArrowDirection(value: String): Self = this.set("popoverArrowDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopoverArrowDirection: Self = this.set("popoverArrowDirection", js.undefined)
    
    @scala.inline
    def setTitleText(value: String): Self = this.set("titleText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleText: Self = this.set("titleText", js.undefined)
    
    @scala.inline
    def setTodayText(value: String): Self = this.set("todayText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTodayText: Self = this.set("todayText", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
}
