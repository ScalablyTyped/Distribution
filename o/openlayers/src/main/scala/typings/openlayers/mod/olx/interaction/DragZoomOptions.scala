package typings.openlayers.mod.olx.interaction

import typings.openlayers.mod.EventsConditionType
import typings.openlayers.mod.MapBrowserEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragZoomOptions extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var condition: js.UndefOr[EventsConditionType] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var out: js.UndefOr[Boolean] = js.undefined
}
object DragZoomOptions {
  
  inline def apply(): DragZoomOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DragZoomOptions]
  }
  
  extension [Self <: DragZoomOptions](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setCondition(value: /* event */ MapBrowserEvent => Boolean): Self = StObject.set(x, "condition", js.Any.fromFunction1(value))
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setOut(value: Boolean): Self = StObject.set(x, "out", value.asInstanceOf[js.Any])
    
    inline def setOutUndefined: Self = StObject.set(x, "out", js.undefined)
  }
}
