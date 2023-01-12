package typings.maximMazurokGapiClientLifesciences.gapi.client.lifesciences

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Event extends StObject {
  
  /** See google.cloud.lifesciences.v2beta.ContainerKilledEvent. */
  var containerKilled: js.UndefOr[ContainerKilledEvent] = js.undefined
  
  /** See google.cloud.lifesciences.v2beta.ContainerStartedEvent. */
  var containerStarted: js.UndefOr[ContainerStartedEvent] = js.undefined
  
  /** See google.cloud.lifesciences.v2beta.ContainerStoppedEvent. */
  var containerStopped: js.UndefOr[ContainerStoppedEvent] = js.undefined
  
  /** See google.cloud.lifesciences.v2beta.DelayedEvent. */
  var delayed: js.UndefOr[DelayedEvent] = js.undefined
  
  /** A human-readable description of the event. Note that these strings can change at any time without notice. Any application logic must use the information in the `details` field. */
  var description: js.UndefOr[String] = js.undefined
  
  /** See google.cloud.lifesciences.v2beta.FailedEvent. */
  var failed: js.UndefOr[FailedEvent] = js.undefined
  
  /** See google.cloud.lifesciences.v2beta.PullStartedEvent. */
  var pullStarted: js.UndefOr[PullStartedEvent] = js.undefined
  
  /** See google.cloud.lifesciences.v2beta.PullStoppedEvent. */
  var pullStopped: js.UndefOr[PullStoppedEvent] = js.undefined
  
  /** The time at which the event occurred. */
  var timestamp: js.UndefOr[String] = js.undefined
  
  /** See google.cloud.lifesciences.v2beta.UnexpectedExitStatusEvent. */
  var unexpectedExitStatus: js.UndefOr[UnexpectedExitStatusEvent] = js.undefined
  
  /** See google.cloud.lifesciences.v2beta.WorkerAssignedEvent. */
  var workerAssigned: js.UndefOr[WorkerAssignedEvent] = js.undefined
  
  /** See google.cloud.lifesciences.v2beta.WorkerReleasedEvent. */
  var workerReleased: js.UndefOr[WorkerReleasedEvent] = js.undefined
}
object Event {
  
  inline def apply(): Event = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
    
    inline def setContainerKilled(value: ContainerKilledEvent): Self = StObject.set(x, "containerKilled", value.asInstanceOf[js.Any])
    
    inline def setContainerKilledUndefined: Self = StObject.set(x, "containerKilled", js.undefined)
    
    inline def setContainerStarted(value: ContainerStartedEvent): Self = StObject.set(x, "containerStarted", value.asInstanceOf[js.Any])
    
    inline def setContainerStartedUndefined: Self = StObject.set(x, "containerStarted", js.undefined)
    
    inline def setContainerStopped(value: ContainerStoppedEvent): Self = StObject.set(x, "containerStopped", value.asInstanceOf[js.Any])
    
    inline def setContainerStoppedUndefined: Self = StObject.set(x, "containerStopped", js.undefined)
    
    inline def setDelayed(value: DelayedEvent): Self = StObject.set(x, "delayed", value.asInstanceOf[js.Any])
    
    inline def setDelayedUndefined: Self = StObject.set(x, "delayed", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFailed(value: FailedEvent): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
    
    inline def setFailedUndefined: Self = StObject.set(x, "failed", js.undefined)
    
    inline def setPullStarted(value: PullStartedEvent): Self = StObject.set(x, "pullStarted", value.asInstanceOf[js.Any])
    
    inline def setPullStartedUndefined: Self = StObject.set(x, "pullStarted", js.undefined)
    
    inline def setPullStopped(value: PullStoppedEvent): Self = StObject.set(x, "pullStopped", value.asInstanceOf[js.Any])
    
    inline def setPullStoppedUndefined: Self = StObject.set(x, "pullStopped", js.undefined)
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    inline def setUnexpectedExitStatus(value: UnexpectedExitStatusEvent): Self = StObject.set(x, "unexpectedExitStatus", value.asInstanceOf[js.Any])
    
    inline def setUnexpectedExitStatusUndefined: Self = StObject.set(x, "unexpectedExitStatus", js.undefined)
    
    inline def setWorkerAssigned(value: WorkerAssignedEvent): Self = StObject.set(x, "workerAssigned", value.asInstanceOf[js.Any])
    
    inline def setWorkerAssignedUndefined: Self = StObject.set(x, "workerAssigned", js.undefined)
    
    inline def setWorkerReleased(value: WorkerReleasedEvent): Self = StObject.set(x, "workerReleased", value.asInstanceOf[js.Any])
    
    inline def setWorkerReleasedUndefined: Self = StObject.set(x, "workerReleased", js.undefined)
  }
}
