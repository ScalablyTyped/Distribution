package typings.navermaps.naver.maps

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DOMEventListener extends StObject {
  
  var eventName: String
  
  def listener(): Any
  
  var target: HTMLElement
}
object DOMEventListener {
  
  inline def apply(eventName: String, listener: () => Any, target: HTMLElement): DOMEventListener = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], listener = js.Any.fromFunction0(listener), target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMEventListener]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DOMEventListener] (val x: Self) extends AnyVal {
    
    inline def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
    
    inline def setListener(value: () => Any): Self = StObject.set(x, "listener", js.Any.fromFunction0(value))
    
    inline def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
