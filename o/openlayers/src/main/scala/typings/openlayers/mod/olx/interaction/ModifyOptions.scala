package typings.openlayers.mod.olx.interaction

import typings.openlayers.mod.Collection
import typings.openlayers.mod.EventsConditionType
import typings.openlayers.mod.Feature
import typings.openlayers.mod.MapBrowserEvent
import typings.openlayers.mod.StyleFunction
import typings.openlayers.mod.source.Vector
import typings.openlayers.mod.style.Style
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyOptions extends StObject {
  
  var condition: js.UndefOr[EventsConditionType] = js.undefined
  
  var deleteCondition: js.UndefOr[EventsConditionType] = js.undefined
  
  var features: js.UndefOr[Collection[Feature]] = js.undefined
  
  var insertVertexCondition: js.UndefOr[EventsConditionType] = js.undefined
  
  var pixelTolerance: js.UndefOr[Double] = js.undefined
  
  var source: js.UndefOr[Vector] = js.undefined
  
  var style: js.UndefOr[Style | js.Array[Style] | StyleFunction] = js.undefined
  
  var wrapX: js.UndefOr[Boolean] = js.undefined
}
object ModifyOptions {
  
  inline def apply(): ModifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyOptions]
  }
  
  extension [Self <: ModifyOptions](x: Self) {
    
    inline def setCondition(value: /* event */ MapBrowserEvent => Boolean): Self = StObject.set(x, "condition", js.Any.fromFunction1(value))
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setDeleteCondition(value: /* event */ MapBrowserEvent => Boolean): Self = StObject.set(x, "deleteCondition", js.Any.fromFunction1(value))
    
    inline def setDeleteConditionUndefined: Self = StObject.set(x, "deleteCondition", js.undefined)
    
    inline def setFeatures(value: Collection[Feature]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    inline def setInsertVertexCondition(value: /* event */ MapBrowserEvent => Boolean): Self = StObject.set(x, "insertVertexCondition", js.Any.fromFunction1(value))
    
    inline def setInsertVertexConditionUndefined: Self = StObject.set(x, "insertVertexCondition", js.undefined)
    
    inline def setPixelTolerance(value: Double): Self = StObject.set(x, "pixelTolerance", value.asInstanceOf[js.Any])
    
    inline def setPixelToleranceUndefined: Self = StObject.set(x, "pixelTolerance", js.undefined)
    
    inline def setSource(value: Vector): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setStyle(value: Style | js.Array[Style] | StyleFunction): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleFunction2(
      value: (/* feature */ Feature | typings.openlayers.mod.render.Feature, /* resolution */ Double) => Style | js.Array[Style] | Null
    ): Self = StObject.set(x, "style", js.Any.fromFunction2(value))
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setStyleVarargs(value: Style*): Self = StObject.set(x, "style", js.Array(value*))
    
    inline def setWrapX(value: Boolean): Self = StObject.set(x, "wrapX", value.asInstanceOf[js.Any])
    
    inline def setWrapXUndefined: Self = StObject.set(x, "wrapX", js.undefined)
  }
}
