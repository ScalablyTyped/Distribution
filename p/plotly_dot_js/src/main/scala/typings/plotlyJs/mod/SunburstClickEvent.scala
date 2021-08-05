package typings.plotlyJs.mod

import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SunburstClickEvent extends StObject {
  
  var event: MouseEvent
  
  var nextLevel: String
  
  var points: js.Array[SunburstPlotDatum]
}
object SunburstClickEvent {
  
  inline def apply(event: MouseEvent, nextLevel: String, points: js.Array[SunburstPlotDatum]): SunburstClickEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], nextLevel = nextLevel.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[SunburstClickEvent]
  }
  
  extension [Self <: SunburstClickEvent](x: Self) {
    
    inline def setEvent(value: MouseEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setNextLevel(value: String): Self = StObject.set(x, "nextLevel", value.asInstanceOf[js.Any])
    
    inline def setPoints(value: js.Array[SunburstPlotDatum]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsVarargs(value: SunburstPlotDatum*): Self = StObject.set(x, "points", js.Array(value :_*))
  }
}
