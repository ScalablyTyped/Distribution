package typings.openseadragon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FullPageEvent
  extends StObject
     with OSDEvent[Viewer] {
  
  var fullPage: Boolean
}
object FullPageEvent {
  
  inline def apply(eventSource: Viewer, fullPage: Boolean, userData: Any): FullPageEvent = {
    val __obj = js.Dynamic.literal(eventSource = eventSource.asInstanceOf[js.Any], fullPage = fullPage.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullPageEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FullPageEvent] (val x: Self) extends AnyVal {
    
    inline def setFullPage(value: Boolean): Self = StObject.set(x, "fullPage", value.asInstanceOf[js.Any])
  }
}
