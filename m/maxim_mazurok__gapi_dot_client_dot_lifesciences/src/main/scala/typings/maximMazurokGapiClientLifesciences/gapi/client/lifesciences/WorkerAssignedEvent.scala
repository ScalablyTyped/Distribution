package typings.maximMazurokGapiClientLifesciences.gapi.client.lifesciences

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkerAssignedEvent extends js.Object {
  
  /** The worker's instance name. */
  var instance: js.UndefOr[String] = js.native
  
  /** The machine type that was assigned for the worker. */
  var machineType: js.UndefOr[String] = js.native
  
  /** The zone the worker is running in. */
  var zone: js.UndefOr[String] = js.native
}
object WorkerAssignedEvent {
  
  @scala.inline
  def apply(): WorkerAssignedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkerAssignedEvent]
  }
  
  @scala.inline
  implicit class WorkerAssignedEventOps[Self <: WorkerAssignedEvent] (val x: Self) extends AnyVal {
    
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
    def setInstance(value: String): Self = this.set("instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstance: Self = this.set("instance", js.undefined)
    
    @scala.inline
    def setMachineType(value: String): Self = this.set("machineType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMachineType: Self = this.set("machineType", js.undefined)
    
    @scala.inline
    def setZone(value: String): Self = this.set("zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZone: Self = this.set("zone", js.undefined)
  }
}
