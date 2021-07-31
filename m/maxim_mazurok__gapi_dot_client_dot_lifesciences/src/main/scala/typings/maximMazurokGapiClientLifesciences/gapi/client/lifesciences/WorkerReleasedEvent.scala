package typings.maximMazurokGapiClientLifesciences.gapi.client.lifesciences

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
  
  @scala.inline
  def apply(): WorkerReleasedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkerReleasedEvent]
  }
  
  @scala.inline
  implicit class WorkerReleasedEventMutableBuilder[Self <: WorkerReleasedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    @scala.inline
    def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
