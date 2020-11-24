package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2Value extends js.Object {
  
  /** boolean */
  var booleanValue: js.UndefOr[Boolean] = js.native
  
  /** date */
  var dateValue: js.UndefOr[GoogleTypeDate] = js.native
  
  /** day of week */
  var dayOfWeekValue: js.UndefOr[String] = js.native
  
  /** float */
  var floatValue: js.UndefOr[Double] = js.native
  
  /** integer */
  var integerValue: js.UndefOr[String] = js.native
  
  /** string */
  var stringValue: js.UndefOr[String] = js.native
  
  /** time of day */
  var timeValue: js.UndefOr[GoogleTypeTimeOfDay] = js.native
  
  /** timestamp */
  var timestampValue: js.UndefOr[String] = js.native
}
object GooglePrivacyDlpV2Value {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2Value = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2Value]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2ValueOps[Self <: GooglePrivacyDlpV2Value] (val x: Self) extends AnyVal {
    
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
    def setBooleanValue(value: Boolean): Self = this.set("booleanValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBooleanValue: Self = this.set("booleanValue", js.undefined)
    
    @scala.inline
    def setDateValue(value: GoogleTypeDate): Self = this.set("dateValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateValue: Self = this.set("dateValue", js.undefined)
    
    @scala.inline
    def setDayOfWeekValue(value: String): Self = this.set("dayOfWeekValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayOfWeekValue: Self = this.set("dayOfWeekValue", js.undefined)
    
    @scala.inline
    def setFloatValue(value: Double): Self = this.set("floatValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloatValue: Self = this.set("floatValue", js.undefined)
    
    @scala.inline
    def setIntegerValue(value: String): Self = this.set("integerValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntegerValue: Self = this.set("integerValue", js.undefined)
    
    @scala.inline
    def setStringValue(value: String): Self = this.set("stringValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStringValue: Self = this.set("stringValue", js.undefined)
    
    @scala.inline
    def setTimeValue(value: GoogleTypeTimeOfDay): Self = this.set("timeValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeValue: Self = this.set("timeValue", js.undefined)
    
    @scala.inline
    def setTimestampValue(value: String): Self = this.set("timestampValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestampValue: Self = this.set("timestampValue", js.undefined)
  }
}
