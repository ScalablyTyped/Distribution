package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeployedClusterState extends js.Object {
  
  /** The name of the cluster. */
  var cluster: js.UndefOr[String] = js.native
  
  /** The details about the Agones fleets and autoscalers created in the game server cluster. */
  var fleetDetails: js.UndefOr[js.Array[DeployedFleetDetails]] = js.native
}
object DeployedClusterState {
  
  @scala.inline
  def apply(): DeployedClusterState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeployedClusterState]
  }
  
  @scala.inline
  implicit class DeployedClusterStateOps[Self <: DeployedClusterState] (val x: Self) extends AnyVal {
    
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
    def setCluster(value: String): Self = this.set("cluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCluster: Self = this.set("cluster", js.undefined)
    
    @scala.inline
    def setFleetDetailsVarargs(value: DeployedFleetDetails*): Self = this.set("fleetDetails", js.Array(value :_*))
    
    @scala.inline
    def setFleetDetails(value: js.Array[DeployedFleetDetails]): Self = this.set("fleetDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFleetDetails: Self = this.set("fleetDetails", js.undefined)
  }
}
