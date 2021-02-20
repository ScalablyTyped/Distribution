package typings.popperjsCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventListeners extends StObject {
  
  var resize: Boolean = js.native
  
  var scroll: Boolean = js.native
}
object EventListeners {
  
  @scala.inline
  def apply(resize: Boolean, scroll: Boolean): EventListeners = {
    val __obj = js.Dynamic.literal(resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventListeners]
  }
  
  @scala.inline
  implicit class EventListenersMutableBuilder[Self <: EventListeners] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResize(value: Boolean): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScroll(value: Boolean): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
  }
}
