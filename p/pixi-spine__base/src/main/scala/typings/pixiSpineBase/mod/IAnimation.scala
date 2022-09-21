package typings.pixiSpineBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAnimation[Timeline /* <: ITimeline */] extends StObject {
  
  var duration: Double
  
  var name: String
  
  var timelines: js.Array[Timeline]
}
object IAnimation {
  
  inline def apply[Timeline /* <: ITimeline */](duration: Double, name: String, timelines: js.Array[Timeline]): IAnimation[Timeline] = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], timelines = timelines.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAnimation[Timeline]]
  }
  
  extension [Self <: IAnimation[?], Timeline /* <: ITimeline */](x: Self & IAnimation[Timeline]) {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTimelines(value: js.Array[Timeline]): Self = StObject.set(x, "timelines", value.asInstanceOf[js.Any])
    
    inline def setTimelinesVarargs(value: Timeline*): Self = StObject.set(x, "timelines", js.Array(value*))
  }
}
