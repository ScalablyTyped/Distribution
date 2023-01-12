package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ImageMapTypeOptions
  */
trait ImageMapTypeOptions extends StObject {
  
  var darktheme: js.UndefOr[Boolean] = js.undefined
  
  var getTileUrl: js.UndefOr[js.Function3[/* x */ Double, /* y */ Double, /* z */ Double, js.Array[String]]] = js.undefined
  
  var maxZoom: js.UndefOr[Double] = js.undefined
  
  var minZoom: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var projection: js.UndefOr[Projection] = js.undefined
  
  var provider: js.UndefOr[js.Array[MapDataProvider]] = js.undefined
  
  var repeatX: js.UndefOr[Boolean] = js.undefined
  
  var tileSet: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var tileSize: js.UndefOr[Size | SizeLiteral] = js.undefined
  
  var uid: js.UndefOr[String] = js.undefined
  
  var vendor: js.UndefOr[String] = js.undefined
}
object ImageMapTypeOptions {
  
  inline def apply(): ImageMapTypeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageMapTypeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageMapTypeOptions] (val x: Self) extends AnyVal {
    
    inline def setDarktheme(value: Boolean): Self = StObject.set(x, "darktheme", value.asInstanceOf[js.Any])
    
    inline def setDarkthemeUndefined: Self = StObject.set(x, "darktheme", js.undefined)
    
    inline def setGetTileUrl(value: (/* x */ Double, /* y */ Double, /* z */ Double) => js.Array[String]): Self = StObject.set(x, "getTileUrl", js.Any.fromFunction3(value))
    
    inline def setGetTileUrlUndefined: Self = StObject.set(x, "getTileUrl", js.undefined)
    
    inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
    
    inline def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
    
    inline def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProjection(value: Projection): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    inline def setProvider(value: js.Array[MapDataProvider]): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    
    inline def setProviderVarargs(value: MapDataProvider*): Self = StObject.set(x, "provider", js.Array(value*))
    
    inline def setRepeatX(value: Boolean): Self = StObject.set(x, "repeatX", value.asInstanceOf[js.Any])
    
    inline def setRepeatXUndefined: Self = StObject.set(x, "repeatX", js.undefined)
    
    inline def setTileSet(value: String | js.Array[String]): Self = StObject.set(x, "tileSet", value.asInstanceOf[js.Any])
    
    inline def setTileSetUndefined: Self = StObject.set(x, "tileSet", js.undefined)
    
    inline def setTileSetVarargs(value: String*): Self = StObject.set(x, "tileSet", js.Array(value*))
    
    inline def setTileSize(value: Size | SizeLiteral): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
    
    inline def setTileSizeUndefined: Self = StObject.set(x, "tileSize", js.undefined)
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    
    inline def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
    
    inline def setVendorUndefined: Self = StObject.set(x, "vendor", js.undefined)
  }
}
