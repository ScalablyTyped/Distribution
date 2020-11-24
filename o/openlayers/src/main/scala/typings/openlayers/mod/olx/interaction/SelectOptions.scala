package typings.openlayers.mod.olx.interaction

import typings.openlayers.mod.Collection
import typings.openlayers.mod.EventsConditionType
import typings.openlayers.mod.Feature
import typings.openlayers.mod.MapBrowserEvent
import typings.openlayers.mod.SelectFilterFunction
import typings.openlayers.mod.StyleFunction
import typings.openlayers.mod.layer.Layer
import typings.openlayers.mod.style.Style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectOptions extends js.Object {
  
  var addCondition: js.UndefOr[EventsConditionType] = js.native
  
  var condition: js.UndefOr[EventsConditionType] = js.native
  
  var features: js.UndefOr[Collection[Feature]] = js.native
  
  var filter: js.UndefOr[SelectFilterFunction] = js.native
  
  var hitTolerance: js.UndefOr[Double] = js.native
  
  var layers: js.UndefOr[js.Array[Layer] | (js.Function1[/* layer */ Layer, Boolean])] = js.native
  
  var multi: js.UndefOr[Boolean] = js.native
  
  var removeCondition: js.UndefOr[EventsConditionType] = js.native
  
  var style: js.UndefOr[Style | js.Array[Style] | StyleFunction] = js.native
  
  var toggleCondition: js.UndefOr[EventsConditionType] = js.native
  
  var wrapX: js.UndefOr[Boolean] = js.native
}
object SelectOptions {
  
  @scala.inline
  def apply(): SelectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectOptions]
  }
  
  @scala.inline
  implicit class SelectOptionsOps[Self <: SelectOptions] (val x: Self) extends AnyVal {
    
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
    def setAddCondition(value: /* event */ MapBrowserEvent => Boolean): Self = this.set("addCondition", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAddCondition: Self = this.set("addCondition", js.undefined)
    
    @scala.inline
    def setCondition(value: /* event */ MapBrowserEvent => Boolean): Self = this.set("condition", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCondition: Self = this.set("condition", js.undefined)
    
    @scala.inline
    def setFeatures(value: Collection[Feature]): Self = this.set("features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeatures: Self = this.set("features", js.undefined)
    
    @scala.inline
    def setFilter(
      value: (/* feature */ Feature | typings.openlayers.mod.render.Feature, /* layer */ Layer) => Boolean
    ): Self = this.set("filter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setHitTolerance(value: Double): Self = this.set("hitTolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHitTolerance: Self = this.set("hitTolerance", js.undefined)
    
    @scala.inline
    def setLayersVarargs(value: Layer*): Self = this.set("layers", js.Array(value :_*))
    
    @scala.inline
    def setLayersFunction1(value: /* layer */ Layer => Boolean): Self = this.set("layers", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLayers(value: js.Array[Layer] | (js.Function1[/* layer */ Layer, Boolean])): Self = this.set("layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayers: Self = this.set("layers", js.undefined)
    
    @scala.inline
    def setMulti(value: Boolean): Self = this.set("multi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMulti: Self = this.set("multi", js.undefined)
    
    @scala.inline
    def setRemoveCondition(value: /* event */ MapBrowserEvent => Boolean): Self = this.set("removeCondition", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRemoveCondition: Self = this.set("removeCondition", js.undefined)
    
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
    def setToggleCondition(value: /* event */ MapBrowserEvent => Boolean): Self = this.set("toggleCondition", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteToggleCondition: Self = this.set("toggleCondition", js.undefined)
    
    @scala.inline
    def setWrapX(value: Boolean): Self = this.set("wrapX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapX: Self = this.set("wrapX", js.undefined)
  }
}
