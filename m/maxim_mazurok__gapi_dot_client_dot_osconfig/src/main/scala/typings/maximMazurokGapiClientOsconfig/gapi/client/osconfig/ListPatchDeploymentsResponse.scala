package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPatchDeploymentsResponse extends StObject {
  
  /** A pagination token that can be used to get the next page of patch deployments. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The list of patch deployments. */
  var patchDeployments: js.UndefOr[js.Array[PatchDeployment]] = js.native
}
object ListPatchDeploymentsResponse {
  
  @scala.inline
  def apply(): ListPatchDeploymentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPatchDeploymentsResponse]
  }
  
  @scala.inline
  implicit class ListPatchDeploymentsResponseMutableBuilder[Self <: ListPatchDeploymentsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setPatchDeployments(value: js.Array[PatchDeployment]): Self = StObject.set(x, "patchDeployments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatchDeploymentsUndefined: Self = StObject.set(x, "patchDeployments", js.undefined)
    
    @scala.inline
    def setPatchDeploymentsVarargs(value: PatchDeployment*): Self = StObject.set(x, "patchDeployments", js.Array(value :_*))
  }
}
