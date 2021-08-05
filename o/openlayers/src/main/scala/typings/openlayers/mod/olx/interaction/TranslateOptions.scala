package typings.openlayers.mod.olx.interaction

import typings.openlayers.mod.Collection
import typings.openlayers.mod.Feature
import typings.openlayers.mod.layer.Layer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TranslateOptions extends StObject {
  
  var features: js.UndefOr[Collection[Feature]] = js.undefined
  
  var layers: js.UndefOr[js.Array[Layer] | (js.Function1[/* layer */ Layer, Boolean])] = js.undefined
}
object TranslateOptions {
  
  inline def apply(): TranslateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TranslateOptions]
  }
  
  extension [Self <: TranslateOptions](x: Self) {
    
    inline def setFeatures(value: Collection[Feature]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    inline def setLayers(value: js.Array[Layer] | (js.Function1[/* layer */ Layer, Boolean])): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    inline def setLayersFunction1(value: /* layer */ Layer => Boolean): Self = StObject.set(x, "layers", js.Any.fromFunction1(value))
    
    inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    inline def setLayersVarargs(value: Layer*): Self = StObject.set(x, "layers", js.Array(value :_*))
  }
}
