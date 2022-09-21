package typings.openseadragon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RotateEvent
  extends StObject
     with OSDEvent[Viewer] {
  
  var degrees: Double
}
object RotateEvent {
  
  inline def apply(degrees: Double, eventSource: Viewer, userData: Any): RotateEvent = {
    val __obj = js.Dynamic.literal(degrees = degrees.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[RotateEvent]
  }
  
  extension [Self <: RotateEvent](x: Self) {
    
    inline def setDegrees(value: Double): Self = StObject.set(x, "degrees", value.asInstanceOf[js.Any])
  }
}
