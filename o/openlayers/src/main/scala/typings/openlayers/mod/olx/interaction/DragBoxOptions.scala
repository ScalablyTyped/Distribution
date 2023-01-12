package typings.openlayers.mod.olx.interaction

import typings.openlayers.mod.DragBoxEndConditionType
import typings.openlayers.mod.EventsConditionType
import typings.openlayers.mod.MapBrowserEvent
import typings.openlayers.mod.Pixel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragBoxOptions extends StObject {
  
  var boxEndCondition: js.UndefOr[DragBoxEndConditionType] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var condition: js.UndefOr[EventsConditionType] = js.undefined
  
  var minArea: js.UndefOr[Double] = js.undefined
}
object DragBoxOptions {
  
  inline def apply(): DragBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DragBoxOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DragBoxOptions] (val x: Self) extends AnyVal {
    
    inline def setBoxEndCondition(value: (/* event */ MapBrowserEvent, /* pixel1 */ Pixel, /* pixel2 */ Pixel) => Boolean): Self = StObject.set(x, "boxEndCondition", js.Any.fromFunction3(value))
    
    inline def setBoxEndConditionUndefined: Self = StObject.set(x, "boxEndCondition", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setCondition(value: /* event */ MapBrowserEvent => Boolean): Self = StObject.set(x, "condition", js.Any.fromFunction1(value))
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setMinArea(value: Double): Self = StObject.set(x, "minArea", value.asInstanceOf[js.Any])
    
    inline def setMinAreaUndefined: Self = StObject.set(x, "minArea", js.undefined)
  }
}
