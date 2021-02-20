package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeployedClusterState extends StObject {
  
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
  implicit class DeployedClusterStateMutableBuilder[Self <: DeployedClusterState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCluster(value: String): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
    
    @scala.inline
    def setFleetDetails(value: js.Array[DeployedFleetDetails]): Self = StObject.set(x, "fleetDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFleetDetailsUndefined: Self = StObject.set(x, "fleetDetails", js.undefined)
    
    @scala.inline
    def setFleetDetailsVarargs(value: DeployedFleetDetails*): Self = StObject.set(x, "fleetDetails", js.Array(value :_*))
  }
}
