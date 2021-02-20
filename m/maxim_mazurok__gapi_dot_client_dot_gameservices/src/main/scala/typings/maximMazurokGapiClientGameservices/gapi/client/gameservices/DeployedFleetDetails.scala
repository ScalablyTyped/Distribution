package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeployedFleetDetails extends StObject {
  
  /** Information about the Agones autoscaler for that fleet. */
  var deployedAutoscaler: js.UndefOr[DeployedFleetAutoscaler] = js.native
  
  /** Information about the Agones fleet. */
  var deployedFleet: js.UndefOr[DeployedFleet] = js.native
}
object DeployedFleetDetails {
  
  @scala.inline
  def apply(): DeployedFleetDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeployedFleetDetails]
  }
  
  @scala.inline
  implicit class DeployedFleetDetailsMutableBuilder[Self <: DeployedFleetDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeployedAutoscaler(value: DeployedFleetAutoscaler): Self = StObject.set(x, "deployedAutoscaler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeployedAutoscalerUndefined: Self = StObject.set(x, "deployedAutoscaler", js.undefined)
    
    @scala.inline
    def setDeployedFleet(value: DeployedFleet): Self = StObject.set(x, "deployedFleet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeployedFleetUndefined: Self = StObject.set(x, "deployedFleet", js.undefined)
  }
}
