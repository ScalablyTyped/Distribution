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
  
  @scala.inline
  def apply(maxZoom: Double, minZoom: Double, name: String, projection: Projection): ImageMapTypeOptions = {
    val __obj = js.Dynamic.literal(maxZoom = maxZoom.asInstanceOf[js.Any], minZoom = minZoom.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageMapTypeOptions]
  }
  
  @scala.inline
  implicit class ImageMapTypeOptionsMutableBuilder[Self <: ImageMapTypeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDarktheme(value: Boolean): Self = StObject.set(x, "darktheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDarkthemeUndefined: Self = StObject.set(x, "darktheme", js.undefined)
    
    @scala.inline
    def setGetTileUrl(value: () => js.Any): Self = StObject.set(x, "getTileUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTileUrlUndefined: Self = StObject.set(x, "getTileUrl", js.undefined)
    
    @scala.inline
    def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjection(value: Projection): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvider(value: js.Array[MapDataProvider]): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    
    @scala.inline
    def setProviderVarargs(value: MapDataProvider*): Self = StObject.set(x, "provider", js.Array(value :_*))
    
    @scala.inline
    def setRepeatX(value: Boolean): Self = StObject.set(x, "repeatX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatXUndefined: Self = StObject.set(x, "repeatX", js.undefined)
    
    @scala.inline
    def setTileSet(value: String | js.Array[String]): Self = StObject.set(x, "tileSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileSetUndefined: Self = StObject.set(x, "tileSet", js.undefined)
    
    @scala.inline
    def setTileSetVarargs(value: String*): Self = StObject.set(x, "tileSet", js.Array(value :_*))
    
    @scala.inline
    def setTileSize(value: Size | SizeLiteral): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileSizeUndefined: Self = StObject.set(x, "tileSize", js.undefined)
    
    @scala.inline
    def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    
    @scala.inline
    def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVendorUndefined: Self = StObject.set(x, "vendor", js.undefined)
  }
}
