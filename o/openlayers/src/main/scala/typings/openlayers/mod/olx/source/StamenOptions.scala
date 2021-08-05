package typings.openlayers.mod.olx.source

import typings.openlayers.mod.Tile
import typings.openlayers.mod.TileLoadFunctionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StamenOptions extends StObject {
  
  var cacheSize: js.UndefOr[Double] = js.undefined
  
  var layer: String
  
  var maxZoom: js.UndefOr[Double] = js.undefined
  
  var minZoom: js.UndefOr[Double] = js.undefined
  
  var opaque: js.UndefOr[Boolean] = js.undefined
  
  var reprojectionErrorThreshold: js.UndefOr[Double] = js.undefined
  
  var tileLoadFunction: js.UndefOr[TileLoadFunctionType] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object StamenOptions {
  
  inline def apply(layer: String): StamenOptions = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any])
    __obj.asInstanceOf[StamenOptions]
  }
  
  extension [Self <: StamenOptions](x: Self) {
    
    inline def setCacheSize(value: Double): Self = StObject.set(x, "cacheSize", value.asInstanceOf[js.Any])
    
    inline def setCacheSizeUndefined: Self = StObject.set(x, "cacheSize", js.undefined)
    
    inline def setLayer(value: String): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
    
    inline def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
    
    inline def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
    
    inline def setOpaque(value: Boolean): Self = StObject.set(x, "opaque", value.asInstanceOf[js.Any])
    
    inline def setOpaqueUndefined: Self = StObject.set(x, "opaque", js.undefined)
    
    inline def setReprojectionErrorThreshold(value: Double): Self = StObject.set(x, "reprojectionErrorThreshold", value.asInstanceOf[js.Any])
    
    inline def setReprojectionErrorThresholdUndefined: Self = StObject.set(x, "reprojectionErrorThreshold", js.undefined)
    
    inline def setTileLoadFunction(value: (/* tile */ Tile, /* url */ String) => Unit): Self = StObject.set(x, "tileLoadFunction", js.Any.fromFunction2(value))
    
    inline def setTileLoadFunctionUndefined: Self = StObject.set(x, "tileLoadFunction", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
