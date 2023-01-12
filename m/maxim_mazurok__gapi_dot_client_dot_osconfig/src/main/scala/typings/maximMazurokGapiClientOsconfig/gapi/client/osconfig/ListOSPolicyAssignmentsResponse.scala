package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListOSPolicyAssignmentsResponse extends StObject {
  
  /** The pagination token to retrieve the next page of OS policy assignments. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The list of assignments */
  var osPolicyAssignments: js.UndefOr[js.Array[OSPolicyAssignment]] = js.undefined
}
object ListOSPolicyAssignmentsResponse {
  
  inline def apply(): ListOSPolicyAssignmentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOSPolicyAssignmentsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListOSPolicyAssignmentsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setOsPolicyAssignments(value: js.Array[OSPolicyAssignment]): Self = StObject.set(x, "osPolicyAssignments", value.asInstanceOf[js.Any])
    
    inline def setOsPolicyAssignmentsUndefined: Self = StObject.set(x, "osPolicyAssignments", js.undefined)
    
    inline def setOsPolicyAssignmentsVarargs(value: OSPolicyAssignment*): Self = StObject.set(x, "osPolicyAssignments", js.Array(value*))
  }
}
