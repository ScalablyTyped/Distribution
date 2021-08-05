package typings.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportKey extends StObject {
  
  /** Query ID. */
  var queryId: js.UndefOr[String] = js.undefined
  
  /** Report ID. */
  var reportId: js.UndefOr[String] = js.undefined
}
object ReportKey {
  
  inline def apply(): ReportKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportKey]
  }
  
  extension [Self <: ReportKey](x: Self) {
    
    inline def setQueryId(value: String): Self = StObject.set(x, "queryId", value.asInstanceOf[js.Any])
    
    inline def setQueryIdUndefined: Self = StObject.set(x, "queryId", js.undefined)
    
    inline def setReportId(value: String): Self = StObject.set(x, "reportId", value.asInstanceOf[js.Any])
    
    inline def setReportIdUndefined: Self = StObject.set(x, "reportId", js.undefined)
  }
}
