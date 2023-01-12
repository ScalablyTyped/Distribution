package typings.maximMazurokGapiClientDriveactivity.gapi.client.driveactivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SystemEvent extends StObject {
  
  /** The type of the system event that may triggered activity. */
  var `type`: js.UndefOr[String] = js.undefined
}
object SystemEvent {
  
  inline def apply(): SystemEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SystemEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SystemEvent] (val x: Self) extends AnyVal {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
