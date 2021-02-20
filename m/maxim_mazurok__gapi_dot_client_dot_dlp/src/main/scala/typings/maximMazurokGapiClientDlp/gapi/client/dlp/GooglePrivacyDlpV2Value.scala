package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2Value extends StObject {
  
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
  implicit class GooglePrivacyDlpV2ValueMutableBuilder[Self <: GooglePrivacyDlpV2Value] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBooleanValue(value: Boolean): Self = StObject.set(x, "booleanValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBooleanValueUndefined: Self = StObject.set(x, "booleanValue", js.undefined)
    
    @scala.inline
    def setDateValue(value: GoogleTypeDate): Self = StObject.set(x, "dateValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateValueUndefined: Self = StObject.set(x, "dateValue", js.undefined)
    
    @scala.inline
    def setDayOfWeekValue(value: String): Self = StObject.set(x, "dayOfWeekValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayOfWeekValueUndefined: Self = StObject.set(x, "dayOfWeekValue", js.undefined)
    
    @scala.inline
    def setFloatValue(value: Double): Self = StObject.set(x, "floatValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatValueUndefined: Self = StObject.set(x, "floatValue", js.undefined)
    
    @scala.inline
    def setIntegerValue(value: String): Self = StObject.set(x, "integerValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntegerValueUndefined: Self = StObject.set(x, "integerValue", js.undefined)
    
    @scala.inline
    def setStringValue(value: String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
    
    @scala.inline
    def setTimeValue(value: GoogleTypeTimeOfDay): Self = StObject.set(x, "timeValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeValueUndefined: Self = StObject.set(x, "timeValue", js.undefined)
    
    @scala.inline
    def setTimestampValue(value: String): Self = StObject.set(x, "timestampValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampValueUndefined: Self = StObject.set(x, "timestampValue", js.undefined)
  }
}
