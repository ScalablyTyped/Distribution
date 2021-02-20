package typings.maximMazurokGapiClientLifesciences.gapi.client.lifesciences

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Event extends StObject {
  
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
  implicit class EventMutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerKilled(value: ContainerKilledEvent): Self = StObject.set(x, "containerKilled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerKilledUndefined: Self = StObject.set(x, "containerKilled", js.undefined)
    
    @scala.inline
    def setContainerStarted(value: ContainerStartedEvent): Self = StObject.set(x, "containerStarted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerStartedUndefined: Self = StObject.set(x, "containerStarted", js.undefined)
    
    @scala.inline
    def setContainerStopped(value: ContainerStoppedEvent): Self = StObject.set(x, "containerStopped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerStoppedUndefined: Self = StObject.set(x, "containerStopped", js.undefined)
    
    @scala.inline
    def setDelayed(value: DelayedEvent): Self = StObject.set(x, "delayed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayedUndefined: Self = StObject.set(x, "delayed", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setFailed(value: FailedEvent): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedUndefined: Self = StObject.set(x, "failed", js.undefined)
    
    @scala.inline
    def setPullStarted(value: PullStartedEvent): Self = StObject.set(x, "pullStarted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPullStartedUndefined: Self = StObject.set(x, "pullStarted", js.undefined)
    
    @scala.inline
    def setPullStopped(value: PullStoppedEvent): Self = StObject.set(x, "pullStopped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPullStoppedUndefined: Self = StObject.set(x, "pullStopped", js.undefined)
    
    @scala.inline
    def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    @scala.inline
    def setUnexpectedExitStatus(value: UnexpectedExitStatusEvent): Self = StObject.set(x, "unexpectedExitStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnexpectedExitStatusUndefined: Self = StObject.set(x, "unexpectedExitStatus", js.undefined)
    
    @scala.inline
    def setWorkerAssigned(value: WorkerAssignedEvent): Self = StObject.set(x, "workerAssigned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerAssignedUndefined: Self = StObject.set(x, "workerAssigned", js.undefined)
    
    @scala.inline
    def setWorkerReleased(value: WorkerReleasedEvent): Self = StObject.set(x, "workerReleased", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerReleasedUndefined: Self = StObject.set(x, "workerReleased", js.undefined)
  }
}
