package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OSPolicyAssignmentReportOSPolicyComplianceOSPolicyResourceComplianceExecResourceOutput extends StObject {
  
  /** Output from enforcement phase output file (if run). Output size is limited to 100K bytes. */
  var enforcementOutput: js.UndefOr[String] = js.undefined
}
object OSPolicyAssignmentReportOSPolicyComplianceOSPolicyResourceComplianceExecResourceOutput {
  
  inline def apply(): OSPolicyAssignmentReportOSPolicyComplianceOSPolicyResourceComplianceExecResourceOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OSPolicyAssignmentReportOSPolicyComplianceOSPolicyResourceComplianceExecResourceOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OSPolicyAssignmentReportOSPolicyComplianceOSPolicyResourceComplianceExecResourceOutput] (val x: Self) extends AnyVal {
    
    inline def setEnforcementOutput(value: String): Self = StObject.set(x, "enforcementOutput", value.asInstanceOf[js.Any])
    
    inline def setEnforcementOutputUndefined: Self = StObject.set(x, "enforcementOutput", js.undefined)
  }
}
