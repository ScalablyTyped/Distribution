package typings.openlayers.mod.olx.interaction

import typings.openlayers.mod.Collection
import typings.openlayers.mod.EventsConditionType
import typings.openlayers.mod.Feature
import typings.openlayers.mod.MapBrowserEvent
import typings.openlayers.mod.StyleFunction
import typings.openlayers.mod.source.Vector
import typings.openlayers.mod.style.Style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyOptions extends js.Object {
  
  var condition: js.UndefOr[EventsConditionType] = js.native
  
  var deleteCondition: js.UndefOr[EventsConditionType] = js.native
  
  var features: js.UndefOr[Collection[Feature]] = js.native
  
  var insertVertexCondition: js.UndefOr[EventsConditionType] = js.native
  
  var pixelTolerance: js.UndefOr[Double] = js.native
  
  var source: js.UndefOr[Vector] = js.native
  
  var style: js.UndefOr[Style | js.Array[Style] | StyleFunction] = js.native
  
  var wrapX: js.UndefOr[Boolean] = js.native
}
object ModifyOptions {
  
  @scala.inline
  def apply(): ModifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyOptions]
  }
  
  @scala.inline
  implicit class ModifyOptionsOps[Self <: ModifyOptions] (val x: Self) extends AnyVal {
    
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
    def setCondition(value: /* event */ MapBrowserEvent => Boolean): Self = this.set("condition", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCondition: Self = this.set("condition", js.undefined)
    
    @scala.inline
    def setDeleteCondition(value: /* event */ MapBrowserEvent => Boolean): Self = this.set("deleteCondition", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDeleteCondition: Self = this.set("deleteCondition", js.undefined)
    
    @scala.inline
    def setFeatures(value: Collection[Feature]): Self = this.set("features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeatures: Self = this.set("features", js.undefined)
    
    @scala.inline
    def setInsertVertexCondition(value: /* event */ MapBrowserEvent => Boolean): Self = this.set("insertVertexCondition", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteInsertVertexCondition: Self = this.set("insertVertexCondition", js.undefined)
    
    @scala.inline
    def setPixelTolerance(value: Double): Self = this.set("pixelTolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePixelTolerance: Self = this.set("pixelTolerance", js.undefined)
    
    @scala.inline
    def setSource(value: Vector): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setStyleFunction2(
      value: (/* feature */ Feature | typings.openlayers.mod.render.Feature, /* resolution */ Double) => Style | js.Array[Style] | Null
    ): Self = this.set("style", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStyleVarargs(value: Style*): Self = this.set("style", js.Array(value :_*))
    
    @scala.inline
    def setStyle(value: Style | js.Array[Style] | StyleFunction): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setWrapX(value: Boolean): Self = this.set("wrapX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapX: Self = this.set("wrapX", js.undefined)
  }
}
