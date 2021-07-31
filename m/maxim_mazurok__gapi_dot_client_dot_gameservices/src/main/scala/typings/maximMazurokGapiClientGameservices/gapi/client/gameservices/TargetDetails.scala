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
  
  @scala.inline
  def apply(): TargetDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetDetails]
  }
  
  @scala.inline
  implicit class TargetDetailsMutableBuilder[Self <: TargetDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFleetDetails(value: js.Array[TargetFleetDetails]): Self = StObject.set(x, "fleetDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFleetDetailsUndefined: Self = StObject.set(x, "fleetDetails", js.undefined)
    
    @scala.inline
    def setFleetDetailsVarargs(value: TargetFleetDetails*): Self = StObject.set(x, "fleetDetails", js.Array(value :_*))
    
    @scala.inline
    def setGameServerClusterName(value: String): Self = StObject.set(x, "gameServerClusterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGameServerClusterNameUndefined: Self = StObject.set(x, "gameServerClusterName", js.undefined)
    
    @scala.inline
    def setGameServerDeploymentName(value: String): Self = StObject.set(x, "gameServerDeploymentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGameServerDeploymentNameUndefined: Self = StObject.set(x, "gameServerDeploymentName", js.undefined)
  }
}
