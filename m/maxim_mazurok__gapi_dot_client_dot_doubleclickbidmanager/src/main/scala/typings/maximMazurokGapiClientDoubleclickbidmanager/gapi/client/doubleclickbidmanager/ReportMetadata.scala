package typings.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportMetadata extends StObject {
  
  /** The path to the location in Google Cloud Storage where the report is stored. */
  var googleCloudStoragePath: js.UndefOr[String] = js.undefined
  
  /** The ending time for the data that is shown in the report. */
  var reportDataEndTimeMs: js.UndefOr[String] = js.undefined
  
  /** The starting time for the data that is shown in the report. */
  var reportDataStartTimeMs: js.UndefOr[String] = js.undefined
  
  /** Report status. */
  var status: js.UndefOr[ReportStatus] = js.undefined
}
object ReportMetadata {
  
  inline def apply(): ReportMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportMetadata]
  }
  
  extension [Self <: ReportMetadata](x: Self) {
    
    inline def setGoogleCloudStoragePath(value: String): Self = StObject.set(x, "googleCloudStoragePath", value.asInstanceOf[js.Any])
    
    inline def setGoogleCloudStoragePathUndefined: Self = StObject.set(x, "googleCloudStoragePath", js.undefined)
    
    inline def setReportDataEndTimeMs(value: String): Self = StObject.set(x, "reportDataEndTimeMs", value.asInstanceOf[js.Any])
    
    inline def setReportDataEndTimeMsUndefined: Self = StObject.set(x, "reportDataEndTimeMs", js.undefined)
    
    inline def setReportDataStartTimeMs(value: String): Self = StObject.set(x, "reportDataStartTimeMs", value.asInstanceOf[js.Any])
    
    inline def setReportDataStartTimeMsUndefined: Self = StObject.set(x, "reportDataStartTimeMs", js.undefined)
    
    inline def setStatus(value: ReportStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
