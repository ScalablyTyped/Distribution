package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FetchDeploymentStateResponse extends js.Object {
  
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
  implicit class FetchDeploymentStateResponseOps[Self <: FetchDeploymentStateResponse] (val x: Self) extends AnyVal {
    
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
    def setClusterStateVarargs(value: DeployedClusterState*): Self = this.set("clusterState", js.Array(value :_*))
    
    @scala.inline
    def setClusterState(value: js.Array[DeployedClusterState]): Self = this.set("clusterState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterState: Self = this.set("clusterState", js.undefined)
    
    @scala.inline
    def setUnavailableVarargs(value: String*): Self = this.set("unavailable", js.Array(value :_*))
    
    @scala.inline
    def setUnavailable(value: js.Array[String]): Self = this.set("unavailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnavailable: Self = this.set("unavailable", js.undefined)
  }
}
