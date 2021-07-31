package typings.maximMazurokGapiClientScript.gapi.client.script

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDeploymentsResponse extends StObject {
  
  /** The list of deployments. */
  var deployments: js.UndefOr[js.Array[Deployment]] = js.undefined
  
  /** The token that can be used in the next call to get the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListDeploymentsResponse {
  
  @scala.inline
  def apply(): ListDeploymentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDeploymentsResponse]
  }
  
  @scala.inline
  implicit class ListDeploymentsResponseMutableBuilder[Self <: ListDeploymentsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeployments(value: js.Array[Deployment]): Self = StObject.set(x, "deployments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentsUndefined: Self = StObject.set(x, "deployments", js.undefined)
    
    @scala.inline
    def setDeploymentsVarargs(value: Deployment*): Self = StObject.set(x, "deployments", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
