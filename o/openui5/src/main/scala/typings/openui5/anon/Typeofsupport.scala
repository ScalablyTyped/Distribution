package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofsupport extends StObject {
  
  val matchmedia: Boolean
  
  val matchmedialistener: Boolean
  
  val orientation: Boolean
  
  val pointer: Boolean
  
  val retina: Boolean
  
  val touch: Boolean
  
  val websocket: Boolean
}
object Typeofsupport {
  
  inline def apply(
    matchmedia: Boolean,
    matchmedialistener: Boolean,
    orientation: Boolean,
    pointer: Boolean,
    retina: Boolean,
    touch: Boolean,
    websocket: Boolean
  ): Typeofsupport = {
    val __obj = js.Dynamic.literal(matchmedia = matchmedia.asInstanceOf[js.Any], matchmedialistener = matchmedialistener.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], pointer = pointer.asInstanceOf[js.Any], retina = retina.asInstanceOf[js.Any], touch = touch.asInstanceOf[js.Any], websocket = websocket.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofsupport]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Typeofsupport] (val x: Self) extends AnyVal {
    
    inline def setMatchmedia(value: Boolean): Self = StObject.set(x, "matchmedia", value.asInstanceOf[js.Any])
    
    inline def setMatchmedialistener(value: Boolean): Self = StObject.set(x, "matchmedialistener", value.asInstanceOf[js.Any])
    
    inline def setOrientation(value: Boolean): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setPointer(value: Boolean): Self = StObject.set(x, "pointer", value.asInstanceOf[js.Any])
    
    inline def setRetina(value: Boolean): Self = StObject.set(x, "retina", value.asInstanceOf[js.Any])
    
    inline def setTouch(value: Boolean): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
    
    inline def setWebsocket(value: Boolean): Self = StObject.set(x, "websocket", value.asInstanceOf[js.Any])
  }
}
