package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NaverImageMapTypeOptions extends StObject {
  
  var hd: js.UndefOr[String] = js.undefined
  
  var maxZoom: js.UndefOr[Double] = js.undefined
  
  var minZoom: js.UndefOr[Double] = js.undefined
  
  var projection: js.UndefOr[Projection] = js.undefined
  
  var tileSize: js.UndefOr[Size] = js.undefined
}
object NaverImageMapTypeOptions {
  
  @scala.inline
  def apply(): NaverImageMapTypeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NaverImageMapTypeOptions]
  }
  
  @scala.inline
  implicit class NaverImageMapTypeOptionsMutableBuilder[Self <: NaverImageMapTypeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHd(value: String): Self = StObject.set(x, "hd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHdUndefined: Self = StObject.set(x, "hd", js.undefined)
    
    @scala.inline
    def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
    
    @scala.inline
    def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
    
    @scala.inline
    def setProjection(value: Projection): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    @scala.inline
    def setTileSize(value: Size): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileSizeUndefined: Self = StObject.set(x, "tileSize", js.undefined)
  }
}
