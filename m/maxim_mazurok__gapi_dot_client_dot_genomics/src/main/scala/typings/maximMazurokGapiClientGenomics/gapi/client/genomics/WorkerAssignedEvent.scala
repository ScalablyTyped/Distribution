package typings.maximMazurokGapiClientGenomics.gapi.client.genomics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkerAssignedEvent extends StObject {
  
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
  implicit class WorkerAssignedEventMutableBuilder[Self <: WorkerAssignedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    @scala.inline
    def setMachineType(value: String): Self = StObject.set(x, "machineType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMachineTypeUndefined: Self = StObject.set(x, "machineType", js.undefined)
    
    @scala.inline
    def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
