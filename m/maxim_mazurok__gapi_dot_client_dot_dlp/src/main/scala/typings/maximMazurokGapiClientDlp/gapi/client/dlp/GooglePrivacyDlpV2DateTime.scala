package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2DateTime extends js.Object {
  
  /** One or more of the following must be set. Must be a valid date or time value. */
  var date: js.UndefOr[GoogleTypeDate] = js.native
  
  /** Day of week */
  var dayOfWeek: js.UndefOr[String] = js.native
  
  /** Time of day */
  var time: js.UndefOr[GoogleTypeTimeOfDay] = js.native
  
  /** Time zone */
  var timeZone: js.UndefOr[GooglePrivacyDlpV2TimeZone] = js.native
}
object GooglePrivacyDlpV2DateTime {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2DateTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2DateTime]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2DateTimeOps[Self <: GooglePrivacyDlpV2DateTime] (val x: Self) extends AnyVal {
    
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
    def setDate(value: GoogleTypeDate): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setDayOfWeek(value: String): Self = this.set("dayOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayOfWeek: Self = this.set("dayOfWeek", js.undefined)
    
    @scala.inline
    def setTime(value: GoogleTypeTimeOfDay): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
    
    @scala.inline
    def setTimeZone(value: GooglePrivacyDlpV2TimeZone): Self = this.set("timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeZone: Self = this.set("timeZone", js.undefined)
  }
}
