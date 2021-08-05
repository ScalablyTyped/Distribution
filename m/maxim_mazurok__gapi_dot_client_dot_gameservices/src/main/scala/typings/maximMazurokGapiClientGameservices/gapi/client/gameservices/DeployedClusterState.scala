package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeployedClusterState extends StObject {
  
  /** The name of the cluster. */
  var cluster: js.UndefOr[String] = js.undefined
  
  /** The details about the Agones fleets and autoscalers created in the game server cluster. */
  var fleetDetails: js.UndefOr[js.Array[DeployedFleetDetails]] = js.undefined
}
object DeployedClusterState {
  
  inline def apply(): DeployedClusterState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeployedClusterState]
  }
  
  extension [Self <: DeployedClusterState](x: Self) {
    
    inline def setCluster(value: String): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
    
    inline def setFleetDetails(value: js.Array[DeployedFleetDetails]): Self = StObject.set(x, "fleetDetails", value.asInstanceOf[js.Any])
    
    inline def setFleetDetailsUndefined: Self = StObject.set(x, "fleetDetails", js.undefined)
    
    inline def setFleetDetailsVarargs(value: DeployedFleetDetails*): Self = StObject.set(x, "fleetDetails", js.Array(value :_*))
  }
}
