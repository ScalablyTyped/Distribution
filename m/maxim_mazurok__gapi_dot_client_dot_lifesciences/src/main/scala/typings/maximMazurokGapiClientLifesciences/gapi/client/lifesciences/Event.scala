package typings.maximMazurokGapiClientLifesciences.gapi.client.lifesciences

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Event extends js.Object {
  
  /** See google.cloud.lifesciences.v2beta.ContainerKilledEvent. */
  var containerKilled: js.UndefOr[ContainerKilledEvent] = js.native
  
  /** See google.cloud.lifesciences.v2beta.ContainerStartedEvent. */
  var containerStarted: js.UndefOr[ContainerStartedEvent] = js.native
  
  /** See google.cloud.lifesciences.v2beta.ContainerStoppedEvent. */
  var containerStopped: js.UndefOr[ContainerStoppedEvent] = js.native
  
  /** See google.cloud.lifesciences.v2beta.DelayedEvent. */
  var delayed: js.UndefOr[DelayedEvent] = js.native
  
  /** A human-readable description of the event. Note that these strings can change at any time without notice. Any application logic must use the information in the `details` field. */
  var description: js.UndefOr[String] = js.native
  
  /** See google.cloud.lifesciences.v2beta.FailedEvent. */
  var failed: js.UndefOr[FailedEvent] = js.native
  
  /** See google.cloud.lifesciences.v2beta.PullStartedEvent. */
  var pullStarted: js.UndefOr[PullStartedEvent] = js.native
  
  /** See google.cloud.lifesciences.v2beta.PullStoppedEvent. */
  var pullStopped: js.UndefOr[PullStoppedEvent] = js.native
  
  /** The time at which the event occurred. */
  var timestamp: js.UndefOr[String] = js.native
  
  /** See google.cloud.lifesciences.v2beta.UnexpectedExitStatusEvent. */
  var unexpectedExitStatus: js.UndefOr[UnexpectedExitStatusEvent] = js.native
  
  /** See google.cloud.lifesciences.v2beta.WorkerAssignedEvent. */
  var workerAssigned: js.UndefOr[WorkerAssignedEvent] = js.native
  
  /** See google.cloud.lifesciences.v2beta.WorkerReleasedEvent. */
  var workerReleased: js.UndefOr[WorkerReleasedEvent] = js.native
}
object Event {
  
  @scala.inline
  def apply(): Event = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  implicit class EventOps[Self <: Event] (val x: Self) extends AnyVal {
    
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
    def setContainerKilled(value: ContainerKilledEvent): Self = this.set("containerKilled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerKilled: Self = this.set("containerKilled", js.undefined)
    
    @scala.inline
    def setContainerStarted(value: ContainerStartedEvent): Self = this.set("containerStarted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerStarted: Self = this.set("containerStarted", js.undefined)
    
    @scala.inline
    def setContainerStopped(value: ContainerStoppedEvent): Self = this.set("containerStopped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerStopped: Self = this.set("containerStopped", js.undefined)
    
    @scala.inline
    def setDelayed(value: DelayedEvent): Self = this.set("delayed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelayed: Self = this.set("delayed", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setFailed(value: FailedEvent): Self = this.set("failed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailed: Self = this.set("failed", js.undefined)
    
    @scala.inline
    def setPullStarted(value: PullStartedEvent): Self = this.set("pullStarted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePullStarted: Self = this.set("pullStarted", js.undefined)
    
    @scala.inline
    def setPullStopped(value: PullStoppedEvent): Self = this.set("pullStopped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePullStopped: Self = this.set("pullStopped", js.undefined)
    
    @scala.inline
    def setTimestamp(value: String): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
    
    @scala.inline
    def setUnexpectedExitStatus(value: UnexpectedExitStatusEvent): Self = this.set("unexpectedExitStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnexpectedExitStatus: Self = this.set("unexpectedExitStatus", js.undefined)
    
    @scala.inline
    def setWorkerAssigned(value: WorkerAssignedEvent): Self = this.set("workerAssigned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkerAssigned: Self = this.set("workerAssigned", js.undefined)
    
    @scala.inline
    def setWorkerReleased(value: WorkerReleasedEvent): Self = this.set("workerReleased", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkerReleased: Self = this.set("workerReleased", js.undefined)
  }
}
