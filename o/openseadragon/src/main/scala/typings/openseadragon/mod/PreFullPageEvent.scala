package typings.openseadragon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreFullPageEvent
  extends StObject
     with OSDEvent[Viewer] {
  
  var fullPage: Boolean
  
  var preventDefaultAction: Boolean
}
object PreFullPageEvent {
  
  inline def apply(eventSource: Viewer, fullPage: Boolean, preventDefaultAction: Boolean, userData: Any): PreFullPageEvent = {
    val __obj = js.Dynamic.literal(eventSource = eventSource.asInstanceOf[js.Any], fullPage = fullPage.asInstanceOf[js.Any], preventDefaultAction = preventDefaultAction.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreFullPageEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PreFullPageEvent] (val x: Self) extends AnyVal {
    
    inline def setFullPage(value: Boolean): Self = StObject.set(x, "fullPage", value.asInstanceOf[js.Any])
    
    inline def setPreventDefaultAction(value: Boolean): Self = StObject.set(x, "preventDefaultAction", value.asInstanceOf[js.Any])
  }
}
