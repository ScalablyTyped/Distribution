package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroundOverlayOptions extends StObject {
  
  var clickable: js.UndefOr[Boolean] = js.undefined
  
  var map: js.UndefOr[Map | Null] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
}
object GroundOverlayOptions {
  
  @scala.inline
  def apply(): GroundOverlayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroundOverlayOptions]
  }
  
  @scala.inline
  implicit class GroundOverlayOptionsMutableBuilder[Self <: GroundOverlayOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickableUndefined: Self = StObject.set(x, "clickable", js.undefined)
    
    @scala.inline
    def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapNull: Self = StObject.set(x, "map", null)
    
    @scala.inline
    def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
  }
}
