package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FetchDeploymentStateResponse extends StObject {
  
  /** The state of the game server deployment in each game server cluster. */
  var clusterState: js.UndefOr[js.Array[DeployedClusterState]] = js.undefined
  
  /** List of locations that could not be reached. */
  var unavailable: js.UndefOr[js.Array[String]] = js.undefined
}
object FetchDeploymentStateResponse {
  
  inline def apply(): FetchDeploymentStateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchDeploymentStateResponse]
  }
  
  extension [Self <: FetchDeploymentStateResponse](x: Self) {
    
    inline def setClusterState(value: js.Array[DeployedClusterState]): Self = StObject.set(x, "clusterState", value.asInstanceOf[js.Any])
    
    inline def setClusterStateUndefined: Self = StObject.set(x, "clusterState", js.undefined)
    
    inline def setClusterStateVarargs(value: DeployedClusterState*): Self = StObject.set(x, "clusterState", js.Array(value :_*))
    
    inline def setUnavailable(value: js.Array[String]): Self = StObject.set(x, "unavailable", value.asInstanceOf[js.Any])
    
    inline def setUnavailableUndefined: Self = StObject.set(x, "unavailable", js.undefined)
    
    inline def setUnavailableVarargs(value: String*): Self = StObject.set(x, "unavailable", js.Array(value :_*))
  }
}
