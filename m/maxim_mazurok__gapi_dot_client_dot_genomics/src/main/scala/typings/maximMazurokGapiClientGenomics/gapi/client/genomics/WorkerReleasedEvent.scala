package typings.maximMazurokGapiClientGenomics.gapi.client.genomics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkerReleasedEvent extends StObject {
  
  /** The worker's instance name. */
  var instance: js.UndefOr[String] = js.undefined
  
  /** The zone the worker was running in. */
  var zone: js.UndefOr[String] = js.undefined
}
object WorkerReleasedEvent {
  
  inline def apply(): WorkerReleasedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkerReleasedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkerReleasedEvent] (val x: Self) extends AnyVal {
    
    inline def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
