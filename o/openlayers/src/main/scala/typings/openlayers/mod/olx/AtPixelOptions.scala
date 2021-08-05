package typings.openlayers.mod.olx

import typings.openlayers.mod.layer.Layer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object literal with options for the {@link ol.Map#forEachFeatureAtPixel} and
  * {@link ol.Map#hasFeatureAtPixel} methods.
  */
trait AtPixelOptions extends StObject {
  
  var hitTolerance: js.UndefOr[Double] = js.undefined
  
  var layerFilter: js.UndefOr[js.Function1[/* layer */ Layer, Boolean]] = js.undefined
}
object AtPixelOptions {
  
  inline def apply(): AtPixelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AtPixelOptions]
  }
  
  extension [Self <: AtPixelOptions](x: Self) {
    
    inline def setHitTolerance(value: Double): Self = StObject.set(x, "hitTolerance", value.asInstanceOf[js.Any])
    
    inline def setHitToleranceUndefined: Self = StObject.set(x, "hitTolerance", js.undefined)
    
    inline def setLayerFilter(value: /* layer */ Layer => Boolean): Self = StObject.set(x, "layerFilter", js.Any.fromFunction1(value))
    
    inline def setLayerFilterUndefined: Self = StObject.set(x, "layerFilter", js.undefined)
  }
}
