package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interfaces
  */
trait MapEventListener extends StObject {
  
  var eventName: String
  
  def listener(event: js.Any): js.Any
  
  var listenerId: String
  
  var target: js.Any
}
object MapEventListener {
  
  inline def apply(eventName: String, listener: js.Any => js.Any, listenerId: String, target: js.Any): MapEventListener = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], listener = js.Any.fromFunction1(listener), listenerId = listenerId.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapEventListener]
  }
  
  extension [Self <: MapEventListener](x: Self) {
    
    inline def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
    
    inline def setListener(value: js.Any => js.Any): Self = StObject.set(x, "listener", js.Any.fromFunction1(value))
    
    inline def setListenerId(value: String): Self = StObject.set(x, "listenerId", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
