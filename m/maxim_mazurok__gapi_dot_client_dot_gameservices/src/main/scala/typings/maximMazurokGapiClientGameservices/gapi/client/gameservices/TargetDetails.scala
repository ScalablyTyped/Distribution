package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetDetails extends StObject {
  
  /** Agones fleet details for game server clusters and game server deployments. */
  var fleetDetails: js.UndefOr[js.Array[TargetFleetDetails]] = js.undefined
  
  /** The game server cluster name. Uses the form: `projects/{project}/locations/{location}/realms/{realm}/gameServerClusters/{cluster}`. */
  var gameServerClusterName: js.UndefOr[String] = js.undefined
  
  /** The game server deployment name. Uses the form: `projects/{project}/locations/{location}/gameServerDeployments/{deployment_id}`. */
  var gameServerDeploymentName: js.UndefOr[String] = js.undefined
}
object TargetDetails {
  
  inline def apply(): TargetDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetDetails]
  }
  
  extension [Self <: TargetDetails](x: Self) {
    
    inline def setFleetDetails(value: js.Array[TargetFleetDetails]): Self = StObject.set(x, "fleetDetails", value.asInstanceOf[js.Any])
    
    inline def setFleetDetailsUndefined: Self = StObject.set(x, "fleetDetails", js.undefined)
    
    inline def setFleetDetailsVarargs(value: TargetFleetDetails*): Self = StObject.set(x, "fleetDetails", js.Array(value :_*))
    
    inline def setGameServerClusterName(value: String): Self = StObject.set(x, "gameServerClusterName", value.asInstanceOf[js.Any])
    
    inline def setGameServerClusterNameUndefined: Self = StObject.set(x, "gameServerClusterName", js.undefined)
    
    inline def setGameServerDeploymentName(value: String): Self = StObject.set(x, "gameServerDeploymentName", value.asInstanceOf[js.Any])
    
    inline def setGameServerDeploymentNameUndefined: Self = StObject.set(x, "gameServerDeploymentName", js.undefined)
  }
}
