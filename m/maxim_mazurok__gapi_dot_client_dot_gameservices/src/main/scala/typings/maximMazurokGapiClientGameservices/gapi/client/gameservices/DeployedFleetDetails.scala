package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeployedFleetDetails extends js.Object {
  
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
  implicit class DeployedFleetDetailsOps[Self <: DeployedFleetDetails] (val x: Self) extends AnyVal {
    
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
    def setDeployedAutoscaler(value: DeployedFleetAutoscaler): Self = this.set("deployedAutoscaler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeployedAutoscaler: Self = this.set("deployedAutoscaler", js.undefined)
    
    @scala.inline
    def setDeployedFleet(value: DeployedFleet): Self = this.set("deployedFleet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeployedFleet: Self = this.set("deployedFleet", js.undefined)
  }
}
