package typings.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "doubleclickbidmanager#query". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Query metadata. */
  var metadata: js.UndefOr[QueryMetadata] = js.undefined
  
  /** Query parameters. */
  var params: js.UndefOr[Parameters] = js.undefined
  
  /** Query ID. */
  var queryId: js.UndefOr[String] = js.undefined
  
  /** The ending time for the data that is shown in the report. Note, reportDataEndTimeMs is required if metadata.dataRange is CUSTOM_DATES and ignored otherwise. */
  var reportDataEndTimeMs: js.UndefOr[String] = js.undefined
  
  /** The starting time for the data that is shown in the report. Note, reportDataStartTimeMs is required if metadata.dataRange is CUSTOM_DATES and ignored otherwise. */
  var reportDataStartTimeMs: js.UndefOr[String] = js.undefined
  
  /** Information on how often and when to run a query. */
  var schedule: js.UndefOr[QuerySchedule] = js.undefined
  
  /** Canonical timezone code for report data time. Defaults to America/New_York. */
  var timezoneCode: js.UndefOr[String] = js.undefined
}
object Query {
  
  inline def apply(): Query = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Query]
  }
  
  extension [Self <: Query](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMetadata(value: QueryMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setParams(value: Parameters): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setQueryId(value: String): Self = StObject.set(x, "queryId", value.asInstanceOf[js.Any])
    
    inline def setQueryIdUndefined: Self = StObject.set(x, "queryId", js.undefined)
    
    inline def setReportDataEndTimeMs(value: String): Self = StObject.set(x, "reportDataEndTimeMs", value.asInstanceOf[js.Any])
    
    inline def setReportDataEndTimeMsUndefined: Self = StObject.set(x, "reportDataEndTimeMs", js.undefined)
    
    inline def setReportDataStartTimeMs(value: String): Self = StObject.set(x, "reportDataStartTimeMs", value.asInstanceOf[js.Any])
    
    inline def setReportDataStartTimeMsUndefined: Self = StObject.set(x, "reportDataStartTimeMs", js.undefined)
    
    inline def setSchedule(value: QuerySchedule): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
    
    inline def setTimezoneCode(value: String): Self = StObject.set(x, "timezoneCode", value.asInstanceOf[js.Any])
    
    inline def setTimezoneCodeUndefined: Self = StObject.set(x, "timezoneCode", js.undefined)
  }
}
