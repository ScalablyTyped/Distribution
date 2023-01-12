package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait From extends StObject {
  
  var from: typings.playcanvas.mod.Color
  
  var lerpColor: typings.playcanvas.mod.Color
  
  var startTime: Any
  
  var to: Any
}
object From {
  
  inline def apply(
    from: typings.playcanvas.mod.Color,
    lerpColor: typings.playcanvas.mod.Color,
    startTime: Any,
    to: Any
  ): From = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], lerpColor = lerpColor.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[From]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: From] (val x: Self) extends AnyVal {
    
    inline def setFrom(value: typings.playcanvas.mod.Color): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setLerpColor(value: typings.playcanvas.mod.Color): Self = StObject.set(x, "lerpColor", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: Any): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setTo(value: Any): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
