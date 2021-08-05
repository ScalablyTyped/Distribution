package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageMapTypeOptions extends StObject {
  
  var darktheme: js.UndefOr[Boolean] = js.undefined
  
  var getTileUrl: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  var maxZoom: Double
  
  var minZoom: Double
  
  var name: String
  
  var projection: Projection
  
  var provider: js.UndefOr[js.Array[MapDataProvider]] = js.undefined
  
  var repeatX: js.UndefOr[Boolean] = js.undefined
  
  var tileSet: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var tileSize: js.UndefOr[Size | SizeLiteral] = js.undefined
  
  var uid: js.UndefOr[String] = js.undefined
  
  var vendor: js.UndefOr[String] = js.undefined
}
object ImageMapTypeOptions {
  
  inline def apply(maxZoom: Double, minZoom: Double, name: String, projection: Projection): ImageMapTypeOptions = {
    val __obj = js.Dynamic.literal(maxZoom = maxZoom.asInstanceOf[js.Any], minZoom = minZoom.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageMapTypeOptions]
  }
  
  extension [Self <: ImageMapTypeOptions](x: Self) {
    
    inline def setDarktheme(value: Boolean): Self = StObject.set(x, "darktheme", value.asInstanceOf[js.Any])
    
    inline def setDarkthemeUndefined: Self = StObject.set(x, "darktheme", js.undefined)
    
    inline def setGetTileUrl(value: () => js.Any): Self = StObject.set(x, "getTileUrl", js.Any.fromFunction0(value))
    
    inline def setGetTileUrlUndefined: Self = StObject.set(x, "getTileUrl", js.undefined)
    
    inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    inline def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProjection(value: Projection): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    inline def setProvider(value: js.Array[MapDataProvider]): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    
    inline def setProviderVarargs(value: MapDataProvider*): Self = StObject.set(x, "provider", js.Array(value :_*))
    
    inline def setRepeatX(value: Boolean): Self = StObject.set(x, "repeatX", value.asInstanceOf[js.Any])
    
    inline def setRepeatXUndefined: Self = StObject.set(x, "repeatX", js.undefined)
    
    inline def setTileSet(value: String | js.Array[String]): Self = StObject.set(x, "tileSet", value.asInstanceOf[js.Any])
    
    inline def setTileSetUndefined: Self = StObject.set(x, "tileSet", js.undefined)
    
    inline def setTileSetVarargs(value: String*): Self = StObject.set(x, "tileSet", js.Array(value :_*))
    
    inline def setTileSize(value: Size | SizeLiteral): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
    
    inline def setTileSizeUndefined: Self = StObject.set(x, "tileSize", js.undefined)
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    
    inline def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
    
    inline def setVendorUndefined: Self = StObject.set(x, "vendor", js.undefined)
  }
}
