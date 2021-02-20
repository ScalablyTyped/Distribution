package typings.maximMazurokGapiClientServicemanagement.gapi.client.servicemanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenerateConfigReportResponse extends StObject {
  
  /** list of ChangeReport, each corresponding to comparison between two service configurations. */
  var changeReports: js.UndefOr[js.Array[ChangeReport]] = js.native
  
  /** Errors / Linter warnings associated with the service definition this report belongs to. */
  var diagnostics: js.UndefOr[js.Array[Diagnostic]] = js.native
  
  /** ID of the service configuration this report belongs to. */
  var id: js.UndefOr[String] = js.native
  
  /** Name of the service this report belongs to. */
  var serviceName: js.UndefOr[String] = js.native
}
object GenerateConfigReportResponse {
  
  @scala.inline
  def apply(): GenerateConfigReportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateConfigReportResponse]
  }
  
  @scala.inline
  implicit class GenerateConfigReportResponseMutableBuilder[Self <: GenerateConfigReportResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeReports(value: js.Array[ChangeReport]): Self = StObject.set(x, "changeReports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeReportsUndefined: Self = StObject.set(x, "changeReports", js.undefined)
    
    @scala.inline
    def setChangeReportsVarargs(value: ChangeReport*): Self = StObject.set(x, "changeReports", js.Array(value :_*))
    
    @scala.inline
    def setDiagnostics(value: js.Array[Diagnostic]): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiagnosticsUndefined: Self = StObject.set(x, "diagnostics", js.undefined)
    
    @scala.inline
    def setDiagnosticsVarargs(value: Diagnostic*): Self = StObject.set(x, "diagnostics", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
  }
}
