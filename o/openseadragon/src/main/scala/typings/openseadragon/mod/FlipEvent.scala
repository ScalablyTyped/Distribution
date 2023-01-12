package typings.openseadragon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlipEvent
  extends StObject
     with OSDEvent[Viewer] {
  
  var flipped: Double
}
object FlipEvent {
  
  inline def apply(eventSource: Viewer, flipped: Double, userData: Any): FlipEvent = {
    val __obj = js.Dynamic.literal(eventSource = eventSource.asInstanceOf[js.Any], flipped = flipped.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlipEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FlipEvent] (val x: Self) extends AnyVal {
    
    inline def setFlipped(value: Double): Self = StObject.set(x, "flipped", value.asInstanceOf[js.Any])
  }
}
