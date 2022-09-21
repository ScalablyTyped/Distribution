package typings.openseadragon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OSDEvent[T] extends StObject {
  
  var eventSource: T
  
  var userData: Any
}
object OSDEvent {
  
  inline def apply[T](eventSource: T, userData: Any): OSDEvent[T] = {
    val __obj = js.Dynamic.literal(eventSource = eventSource.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[OSDEvent[T]]
  }
  
  extension [Self <: OSDEvent[?], T](x: Self & OSDEvent[T]) {
    
    inline def setEventSource(value: T): Self = StObject.set(x, "eventSource", value.asInstanceOf[js.Any])
    
    inline def setUserData(value: Any): Self = StObject.set(x, "userData", value.asInstanceOf[js.Any])
  }
}
