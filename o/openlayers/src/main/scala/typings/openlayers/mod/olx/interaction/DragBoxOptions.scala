package typings.openlayers.mod.olx.interaction

import typings.openlayers.mod.DragBoxEndConditionType
import typings.openlayers.mod.EventsConditionType
import typings.openlayers.mod.MapBrowserEvent
import typings.openlayers.mod.Pixel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DragBoxOptions extends StObject {
  
  var boxEndCondition: js.UndefOr[DragBoxEndConditionType] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var condition: js.UndefOr[EventsConditionType] = js.native
  
  var minArea: js.UndefOr[Double] = js.native
}
object DragBoxOptions {
  
  @scala.inline
  def apply(): DragBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DragBoxOptions]
  }
  
  @scala.inline
  implicit class DragBoxOptionsMutableBuilder[Self <: DragBoxOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoxEndCondition(value: (/* event */ MapBrowserEvent, /* pixel1 */ Pixel, /* pixel2 */ Pixel) => Boolean): Self = StObject.set(x, "boxEndCondition", js.Any.fromFunction3(value))
    
    @scala.inline
    def setBoxEndConditionUndefined: Self = StObject.set(x, "boxEndCondition", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setCondition(value: /* event */ MapBrowserEvent => Boolean): Self = StObject.set(x, "condition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    @scala.inline
    def setMinArea(value: Double): Self = StObject.set(x, "minArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinAreaUndefined: Self = StObject.set(x, "minArea", js.undefined)
  }
}
