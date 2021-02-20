package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FetchDeploymentStateResponse extends StObject {
  
  /** The state of the game server deployment in each game server cluster. */
  var clusterState: js.UndefOr[js.Array[DeployedClusterState]] = js.native
  
  /** List of locations that could not be reached. */
  var unavailable: js.UndefOr[js.Array[String]] = js.native
}
object FetchDeploymentStateResponse {
  
  @scala.inline
  def apply(): FetchDeploymentStateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchDeploymentStateResponse]
  }
  
  @scala.inline
  implicit class FetchDeploymentStateResponseMutableBuilder[Self <: FetchDeploymentStateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterState(value: js.Array[DeployedClusterState]): Self = StObject.set(x, "clusterState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterStateUndefined: Self = StObject.set(x, "clusterState", js.undefined)
    
    @scala.inline
    def setClusterStateVarargs(value: DeployedClusterState*): Self = StObject.set(x, "clusterState", js.Array(value :_*))
    
    @scala.inline
    def setUnavailable(value: js.Array[String]): Self = StObject.set(x, "unavailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnavailableUndefined: Self = StObject.set(x, "unavailable", js.undefined)
    
    @scala.inline
    def setUnavailableVarargs(value: String*): Self = StObject.set(x, "unavailable", js.Array(value :_*))
  }
}
