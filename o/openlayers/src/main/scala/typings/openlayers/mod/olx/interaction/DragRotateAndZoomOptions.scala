package typings.openlayers.mod.olx.interaction

import typings.openlayers.mod.EventsConditionType
import typings.openlayers.mod.MapBrowserEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragRotateAndZoomOptions extends StObject {
  
  var condition: js.UndefOr[EventsConditionType] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
}
object DragRotateAndZoomOptions {
  
  inline def apply(): DragRotateAndZoomOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DragRotateAndZoomOptions]
  }
  
  extension [Self <: DragRotateAndZoomOptions](x: Self) {
    
    inline def setCondition(value: /* event */ MapBrowserEvent => Boolean): Self = StObject.set(x, "condition", js.Any.fromFunction1(value))
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
  }
}
