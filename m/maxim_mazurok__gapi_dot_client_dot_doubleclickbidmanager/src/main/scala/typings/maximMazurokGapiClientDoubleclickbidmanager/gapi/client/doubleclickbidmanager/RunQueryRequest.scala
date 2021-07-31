package typings.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunQueryRequest extends StObject {
  
  /** Report data range used to generate the report. */
  var dataRange: js.UndefOr[String] = js.undefined
  
  /** The ending time for the data that is shown in the report. Note, reportDataEndTimeMs is required if dataRange is CUSTOM_DATES and ignored otherwise. */
  var reportDataEndTimeMs: js.UndefOr[String] = js.undefined
  
  /** The starting time for the data that is shown in the report. Note, reportDataStartTimeMs is required if dataRange is CUSTOM_DATES and ignored otherwise. */
  var reportDataStartTimeMs: js.UndefOr[String] = js.undefined
  
  /** Canonical timezone code for report data time. Defaults to America/New_York. */
  var timezoneCode: js.UndefOr[String] = js.undefined
}
object RunQueryRequest {
  
  @scala.inline
  def apply(): RunQueryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunQueryRequest]
  }
  
  @scala.inline
  implicit class RunQueryRequestMutableBuilder[Self <: RunQueryRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataRange(value: String): Self = StObject.set(x, "dataRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataRangeUndefined: Self = StObject.set(x, "dataRange", js.undefined)
    
    @scala.inline
    def setReportDataEndTimeMs(value: String): Self = StObject.set(x, "reportDataEndTimeMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportDataEndTimeMsUndefined: Self = StObject.set(x, "reportDataEndTimeMs", js.undefined)
    
    @scala.inline
    def setReportDataStartTimeMs(value: String): Self = StObject.set(x, "reportDataStartTimeMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportDataStartTimeMsUndefined: Self = StObject.set(x, "reportDataStartTimeMs", js.undefined)
    
    @scala.inline
    def setTimezoneCode(value: String): Self = StObject.set(x, "timezoneCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezoneCodeUndefined: Self = StObject.set(x, "timezoneCode", js.undefined)
  }
}
