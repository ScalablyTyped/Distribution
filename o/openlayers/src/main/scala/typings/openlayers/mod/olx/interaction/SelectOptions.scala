package typings.openlayers.mod.olx.interaction

import typings.openlayers.mod.Collection
import typings.openlayers.mod.EventsConditionType
import typings.openlayers.mod.Feature
import typings.openlayers.mod.MapBrowserEvent
import typings.openlayers.mod.SelectFilterFunction
import typings.openlayers.mod.StyleFunction
import typings.openlayers.mod.layer.Layer
import typings.openlayers.mod.style.Style
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectOptions extends StObject {
  
  var addCondition: js.UndefOr[EventsConditionType] = js.undefined
  
  var condition: js.UndefOr[EventsConditionType] = js.undefined
  
  var features: js.UndefOr[Collection[Feature]] = js.undefined
  
  var filter: js.UndefOr[SelectFilterFunction] = js.undefined
  
  var hitTolerance: js.UndefOr[Double] = js.undefined
  
  var layers: js.UndefOr[js.Array[Layer] | (js.Function1[/* layer */ Layer, Boolean])] = js.undefined
  
  var multi: js.UndefOr[Boolean] = js.undefined
  
  var removeCondition: js.UndefOr[EventsConditionType] = js.undefined
  
  var style: js.UndefOr[Style | js.Array[Style] | StyleFunction] = js.undefined
  
  var toggleCondition: js.UndefOr[EventsConditionType] = js.undefined
  
  var wrapX: js.UndefOr[Boolean] = js.undefined
}
object SelectOptions {
  
  inline def apply(): SelectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectOptions]
  }
  
  extension [Self <: SelectOptions](x: Self) {
    
    inline def setAddCondition(value: /* event */ MapBrowserEvent => Boolean): Self = StObject.set(x, "addCondition", js.Any.fromFunction1(value))
    
    inline def setAddConditionUndefined: Self = StObject.set(x, "addCondition", js.undefined)
    
    inline def setCondition(value: /* event */ MapBrowserEvent => Boolean): Self = StObject.set(x, "condition", js.Any.fromFunction1(value))
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setFeatures(value: Collection[Feature]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    inline def setFilter(
      value: (/* feature */ Feature | typings.openlayers.mod.render.Feature, /* layer */ Layer) => Boolean
    ): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setHitTolerance(value: Double): Self = StObject.set(x, "hitTolerance", value.asInstanceOf[js.Any])
    
    inline def setHitToleranceUndefined: Self = StObject.set(x, "hitTolerance", js.undefined)
    
    inline def setLayers(value: js.Array[Layer] | (js.Function1[/* layer */ Layer, Boolean])): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    inline def setLayersFunction1(value: /* layer */ Layer => Boolean): Self = StObject.set(x, "layers", js.Any.fromFunction1(value))
    
    inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    inline def setLayersVarargs(value: Layer*): Self = StObject.set(x, "layers", js.Array(value*))
    
    inline def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
    
    inline def setMultiUndefined: Self = StObject.set(x, "multi", js.undefined)
    
    inline def setRemoveCondition(value: /* event */ MapBrowserEvent => Boolean): Self = StObject.set(x, "removeCondition", js.Any.fromFunction1(value))
    
    inline def setRemoveConditionUndefined: Self = StObject.set(x, "removeCondition", js.undefined)
    
    inline def setStyle(value: Style | js.Array[Style] | StyleFunction): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleFunction2(
      value: (/* feature */ Feature | typings.openlayers.mod.render.Feature, /* resolution */ Double) => Style | js.Array[Style] | Null
    ): Self = StObject.set(x, "style", js.Any.fromFunction2(value))
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setStyleVarargs(value: Style*): Self = StObject.set(x, "style", js.Array(value*))
    
    inline def setToggleCondition(value: /* event */ MapBrowserEvent => Boolean): Self = StObject.set(x, "toggleCondition", js.Any.fromFunction1(value))
    
    inline def setToggleConditionUndefined: Self = StObject.set(x, "toggleCondition", js.undefined)
    
    inline def setWrapX(value: Boolean): Self = StObject.set(x, "wrapX", value.asInstanceOf[js.Any])
    
    inline def setWrapXUndefined: Self = StObject.set(x, "wrapX", js.undefined)
  }
}
