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
  
  @scala.inline
  def apply(): ReportKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportKey]
  }
  
  @scala.inline
  implicit class ReportKeyMutableBuilder[Self <: ReportKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQueryId(value: String): Self = StObject.set(x, "queryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryIdUndefined: Self = StObject.set(x, "queryId", js.undefined)
    
    @scala.inline
    def setReportId(value: String): Self = StObject.set(x, "reportId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportIdUndefined: Self = StObject.set(x, "reportId", js.undefined)
  }
}
