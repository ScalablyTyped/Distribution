package typings.openseadragon.anon

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined openseadragon.openseadragon.TileSourceOptions & {  tileFormat :string | undefined} */
trait TileSourceOptionstileForm extends StObject {
  
  var ajaxHeaders: js.UndefOr[js.Object] = js.undefined
  
  var ajaxWithCredentials: js.UndefOr[Boolean] = js.undefined
  
  var getTileUrl: js.UndefOr[js.Function3[/* l */ Double, /* x */ Double, /* y */ Double, String]] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var maxLevel: js.UndefOr[Double] = js.undefined
  
  var minLevel: js.UndefOr[Double] = js.undefined
  
  var referenceStripThumbnailUrl: js.UndefOr[String] = js.undefined
  
  var success: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  
  var tileFormat: js.UndefOr[String] = js.undefined
  
  var tileHeight: js.UndefOr[Double] = js.undefined
  
  var tileOverlap: js.UndefOr[Double] = js.undefined
  
  var tileSize: js.UndefOr[Double] = js.undefined
  
  var tileWidth: js.UndefOr[Double] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object TileSourceOptionstileForm {
  
  @scala.inline
  def apply(): TileSourceOptionstileForm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileSourceOptionstileForm]
  }
  
  @scala.inline
  implicit class TileSourceOptionstileFormMutableBuilder[Self <: TileSourceOptionstileForm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAjaxHeaders(value: js.Object): Self = StObject.set(x, "ajaxHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAjaxHeadersUndefined: Self = StObject.set(x, "ajaxHeaders", js.undefined)
    
    @scala.inline
    def setAjaxWithCredentials(value: Boolean): Self = StObject.set(x, "ajaxWithCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAjaxWithCredentialsUndefined: Self = StObject.set(x, "ajaxWithCredentials", js.undefined)
    
    @scala.inline
    def setGetTileUrl(value: (/* l */ Double, /* x */ Double, /* y */ Double) => String): Self = StObject.set(x, "getTileUrl", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetTileUrlUndefined: Self = StObject.set(x, "getTileUrl", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setMaxLevel(value: Double): Self = StObject.set(x, "maxLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLevelUndefined: Self = StObject.set(x, "maxLevel", js.undefined)
    
    @scala.inline
    def setMinLevel(value: Double): Self = StObject.set(x, "minLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinLevelUndefined: Self = StObject.set(x, "minLevel", js.undefined)
    
    @scala.inline
    def setReferenceStripThumbnailUrl(value: String): Self = StObject.set(x, "referenceStripThumbnailUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceStripThumbnailUrlUndefined: Self = StObject.set(x, "referenceStripThumbnailUrl", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* event */ Event => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setTileFormat(value: String): Self = StObject.set(x, "tileFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileFormatUndefined: Self = StObject.set(x, "tileFormat", js.undefined)
    
    @scala.inline
    def setTileHeight(value: Double): Self = StObject.set(x, "tileHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileHeightUndefined: Self = StObject.set(x, "tileHeight", js.undefined)
    
    @scala.inline
    def setTileOverlap(value: Double): Self = StObject.set(x, "tileOverlap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileOverlapUndefined: Self = StObject.set(x, "tileOverlap", js.undefined)
    
    @scala.inline
    def setTileSize(value: Double): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileSizeUndefined: Self = StObject.set(x, "tileSize", js.undefined)
    
    @scala.inline
    def setTileWidth(value: Double): Self = StObject.set(x, "tileWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileWidthUndefined: Self = StObject.set(x, "tileWidth", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
