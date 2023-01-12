package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListOSPolicyAssignmentReportsResponse extends StObject {
  
  /** The pagination token to retrieve the next page of OS policy assignment report objects. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** List of OS policy assignment reports. */
  var osPolicyAssignmentReports: js.UndefOr[js.Array[OSPolicyAssignmentReport]] = js.undefined
}
object ListOSPolicyAssignmentReportsResponse {
  
  inline def apply(): ListOSPolicyAssignmentReportsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOSPolicyAssignmentReportsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListOSPolicyAssignmentReportsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setOsPolicyAssignmentReports(value: js.Array[OSPolicyAssignmentReport]): Self = StObject.set(x, "osPolicyAssignmentReports", value.asInstanceOf[js.Any])
    
    inline def setOsPolicyAssignmentReportsUndefined: Self = StObject.set(x, "osPolicyAssignmentReports", js.undefined)
    
    inline def setOsPolicyAssignmentReportsVarargs(value: OSPolicyAssignmentReport*): Self = StObject.set(x, "osPolicyAssignmentReports", js.Array(value*))
  }
}
