package typings.openseadragon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageEvent
  extends StObject
     with OSDEvent[Viewer] {
  
  var page: Double
}
object PageEvent {
  
  inline def apply(eventSource: Viewer, page: Double, userData: Any): PageEvent = {
    val __obj = js.Dynamic.literal(eventSource = eventSource.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PageEvent] (val x: Self) extends AnyVal {
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
  }
}
