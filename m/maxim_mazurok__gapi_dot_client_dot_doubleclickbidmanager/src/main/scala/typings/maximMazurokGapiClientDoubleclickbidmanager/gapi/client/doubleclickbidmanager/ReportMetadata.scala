package typings.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportMetadata extends StObject {
  
  /** Output only. The path to the location in Google Cloud Storage where the report is stored. */
  var googleCloudStoragePath: js.UndefOr[String] = js.undefined
  
  /** The ending time for the data that is shown in the report. */
  var reportDataEndDate: js.UndefOr[Date] = js.undefined
  
  /** The starting time for the data that is shown in the report. */
  var reportDataStartDate: js.UndefOr[Date] = js.undefined
  
  /** Report status. */
  var status: js.UndefOr[ReportStatus] = js.undefined
}
object ReportMetadata {
  
  inline def apply(): ReportMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReportMetadata] (val x: Self) extends AnyVal {
    
    inline def setGoogleCloudStoragePath(value: String): Self = StObject.set(x, "googleCloudStoragePath", value.asInstanceOf[js.Any])
    
    inline def setGoogleCloudStoragePathUndefined: Self = StObject.set(x, "googleCloudStoragePath", js.undefined)
    
    inline def setReportDataEndDate(value: Date): Self = StObject.set(x, "reportDataEndDate", value.asInstanceOf[js.Any])
    
    inline def setReportDataEndDateUndefined: Self = StObject.set(x, "reportDataEndDate", js.undefined)
    
    inline def setReportDataStartDate(value: Date): Self = StObject.set(x, "reportDataStartDate", value.asInstanceOf[js.Any])
    
    inline def setReportDataStartDateUndefined: Self = StObject.set(x, "reportDataStartDate", js.undefined)
    
    inline def setStatus(value: ReportStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
