package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreetLayerOptions extends StObject {
  
  var overlayMap: js.UndefOr[Boolean] = js.native
  
  var zIndex: js.UndefOr[Double] = js.native
}
object StreetLayerOptions {
  
  @scala.inline
  def apply(): StreetLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreetLayerOptions]
  }
  
  @scala.inline
  implicit class StreetLayerOptionsMutableBuilder[Self <: StreetLayerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOverlayMap(value: Boolean): Self = StObject.set(x, "overlayMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayMapUndefined: Self = StObject.set(x, "overlayMap", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
