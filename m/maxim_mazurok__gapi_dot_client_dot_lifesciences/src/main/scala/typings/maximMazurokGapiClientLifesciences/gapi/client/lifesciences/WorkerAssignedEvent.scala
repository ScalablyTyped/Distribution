package typings.maximMazurokGapiClientLifesciences.gapi.client.lifesciences

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkerAssignedEvent extends StObject {
  
  /** The worker's instance name. */
  var instance: js.UndefOr[String] = js.undefined
  
  /** The machine type that was assigned for the worker. */
  var machineType: js.UndefOr[String] = js.undefined
  
  /** The zone the worker is running in. */
  var zone: js.UndefOr[String] = js.undefined
}
object WorkerAssignedEvent {
  
  inline def apply(): WorkerAssignedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkerAssignedEvent]
  }
  
  extension [Self <: WorkerAssignedEvent](x: Self) {
    
    inline def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    inline def setMachineType(value: String): Self = StObject.set(x, "machineType", value.asInstanceOf[js.Any])
    
    inline def setMachineTypeUndefined: Self = StObject.set(x, "machineType", js.undefined)
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
