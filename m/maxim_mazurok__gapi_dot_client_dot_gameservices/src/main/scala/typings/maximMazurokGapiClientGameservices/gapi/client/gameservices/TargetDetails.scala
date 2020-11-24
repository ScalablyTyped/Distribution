package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetDetails extends js.Object {
  
  /** Agones fleet details for game server clusters and game server deployments. */
  var fleetDetails: js.UndefOr[js.Array[TargetFleetDetails]] = js.native
  
  /** The game server cluster name. Uses the form: `projects/{project}/locations/{location}/realms/{realm}/gameServerClusters/{cluster}`. */
  var gameServerClusterName: js.UndefOr[String] = js.native
  
  /** The game server deployment name. Uses the form: `projects/{project}/locations/{location}/gameServerDeployments/{deployment_id}`. */
  var gameServerDeploymentName: js.UndefOr[String] = js.native
}
object TargetDetails {
  
  @scala.inline
  def apply(): TargetDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetDetails]
  }
  
  @scala.inline
  implicit class TargetDetailsOps[Self <: TargetDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFleetDetailsVarargs(value: TargetFleetDetails*): Self = this.set("fleetDetails", js.Array(value :_*))
    
    @scala.inline
    def setFleetDetails(value: js.Array[TargetFleetDetails]): Self = this.set("fleetDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFleetDetails: Self = this.set("fleetDetails", js.undefined)
    
    @scala.inline
    def setGameServerClusterName(value: String): Self = this.set("gameServerClusterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGameServerClusterName: Self = this.set("gameServerClusterName", js.undefined)
    
    @scala.inline
    def setGameServerDeploymentName(value: String): Self = this.set("gameServerDeploymentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGameServerDeploymentName: Self = this.set("gameServerDeploymentName", js.undefined)
  }
}
