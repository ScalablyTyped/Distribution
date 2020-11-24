package typings.ol.dragBoxMod

import typings.ol.conditionMod.Condition
import typings.std.UIEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var boxEndCondition: js.UndefOr[EndCondition] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var condition: js.UndefOr[Condition] = js.native
  
  var minArea: js.UndefOr[Double] = js.native
  
  var onBoxEnd: js.UndefOr[
    js.ThisFunction1[/* this */ DragBox, /* p0 */ typings.ol.mapBrowserEventMod.default[UIEvent], Unit]
  ] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setBoxEndCondition(value: EndCondition): Self = this.set("boxEndCondition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoxEndCondition: Self = this.set("boxEndCondition", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setCondition(value: Condition): Self = this.set("condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCondition: Self = this.set("condition", js.undefined)
    
    @scala.inline
    def setMinArea(value: Double): Self = this.set("minArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinArea: Self = this.set("minArea", js.undefined)
    
    @scala.inline
    def setOnBoxEnd(
      value: js.ThisFunction1[/* this */ DragBox, /* p0 */ typings.ol.mapBrowserEventMod.default[UIEvent], Unit]
    ): Self = this.set("onBoxEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnBoxEnd: Self = this.set("onBoxEnd", js.undefined)
  }
}
