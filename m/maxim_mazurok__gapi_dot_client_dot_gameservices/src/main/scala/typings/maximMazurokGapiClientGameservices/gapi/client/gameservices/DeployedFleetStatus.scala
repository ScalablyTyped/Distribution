package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeployedFleetStatus extends js.Object {
  
  /** The number of GameServer replicas in the ALLOCATED state in this fleet. */
  var allocatedReplicas: js.UndefOr[String] = js.native
  
  /** The number of GameServer replicas in the READY state in this fleet. */
  var readyReplicas: js.UndefOr[String] = js.native
  
  /** The total number of current GameServer replicas in this fleet. */
  var replicas: js.UndefOr[String] = js.native
  
  /** The number of GameServer replicas in the RESERVED state in this fleet. Reserved instances won't be deleted on scale down, but won't cause an autoscaler to scale up. */
  var reservedReplicas: js.UndefOr[String] = js.native
}
object DeployedFleetStatus {
  
  @scala.inline
  def apply(): DeployedFleetStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeployedFleetStatus]
  }
  
  @scala.inline
  implicit class DeployedFleetStatusOps[Self <: DeployedFleetStatus] (val x: Self) extends AnyVal {
    
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
    def setAllocatedReplicas(value: String): Self = this.set("allocatedReplicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllocatedReplicas: Self = this.set("allocatedReplicas", js.undefined)
    
    @scala.inline
    def setReadyReplicas(value: String): Self = this.set("readyReplicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadyReplicas: Self = this.set("readyReplicas", js.undefined)
    
    @scala.inline
    def setReplicas(value: String): Self = this.set("replicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicas: Self = this.set("replicas", js.undefined)
    
    @scala.inline
    def setReservedReplicas(value: String): Self = this.set("reservedReplicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservedReplicas: Self = this.set("reservedReplicas", js.undefined)
  }
}
