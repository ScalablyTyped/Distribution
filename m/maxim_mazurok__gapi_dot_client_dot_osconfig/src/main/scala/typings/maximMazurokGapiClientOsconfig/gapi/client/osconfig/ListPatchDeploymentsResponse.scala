package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPatchDeploymentsResponse extends StObject {
  
  /** A pagination token that can be used to get the next page of patch deployments. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The list of patch deployments. */
  var patchDeployments: js.UndefOr[js.Array[PatchDeployment]] = js.undefined
}
object ListPatchDeploymentsResponse {
  
  inline def apply(): ListPatchDeploymentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPatchDeploymentsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListPatchDeploymentsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPatchDeployments(value: js.Array[PatchDeployment]): Self = StObject.set(x, "patchDeployments", value.asInstanceOf[js.Any])
    
    inline def setPatchDeploymentsUndefined: Self = StObject.set(x, "patchDeployments", js.undefined)
    
    inline def setPatchDeploymentsVarargs(value: PatchDeployment*): Self = StObject.set(x, "patchDeployments", js.Array(value*))
  }
}
