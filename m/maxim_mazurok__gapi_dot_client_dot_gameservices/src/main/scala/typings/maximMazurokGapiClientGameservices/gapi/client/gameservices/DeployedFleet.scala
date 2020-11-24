package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeployedFleet extends js.Object {
  
  /** The name of the Agones fleet. */
  var fleet: js.UndefOr[String] = js.native
  
  /** The fleet spec retrieved from the Agones fleet. */
  var fleetSpec: js.UndefOr[String] = js.native
  
  /** The source spec that is used to create the Agones fleet. The GameServerConfig resource may no longer exist in the system. */
  var specSource: js.UndefOr[SpecSource] = js.native
  
  /** The current status of the Agones fleet. Includes count of game servers in various states. */
  var status: js.UndefOr[DeployedFleetStatus] = js.native
}
object DeployedFleet {
  
  @scala.inline
  def apply(): DeployedFleet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeployedFleet]
  }
  
  @scala.inline
  implicit class DeployedFleetOps[Self <: DeployedFleet] (val x: Self) extends AnyVal {
    
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
    def setFleet(value: String): Self = this.set("fleet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFleet: Self = this.set("fleet", js.undefined)
    
    @scala.inline
    def setFleetSpec(value: String): Self = this.set("fleetSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFleetSpec: Self = this.set("fleetSpec", js.undefined)
    
    @scala.inline
    def setSpecSource(value: SpecSource): Self = this.set("specSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpecSource: Self = this.set("specSource", js.undefined)
    
    @scala.inline
    def setStatus(value: DeployedFleetStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
