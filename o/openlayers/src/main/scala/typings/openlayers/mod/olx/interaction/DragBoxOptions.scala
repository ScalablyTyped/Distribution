package typings.openlayers.mod.olx.interaction

import typings.openlayers.mod.DragBoxEndConditionType
import typings.openlayers.mod.EventsConditionType
import typings.openlayers.mod.MapBrowserEvent
import typings.openlayers.mod.Pixel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DragBoxOptions extends js.Object {
  
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
  implicit class DragBoxOptionsOps[Self <: DragBoxOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBoxEndCondition(value: (/* event */ MapBrowserEvent, /* pixel1 */ Pixel, /* pixel2 */ Pixel) => Boolean): Self = this.set("boxEndCondition", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteBoxEndCondition: Self = this.set("boxEndCondition", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setCondition(value: /* event */ MapBrowserEvent => Boolean): Self = this.set("condition", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCondition: Self = this.set("condition", js.undefined)
    
    @scala.inline
    def setMinArea(value: Double): Self = this.set("minArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinArea: Self = this.set("minArea", js.undefined)
  }
}
