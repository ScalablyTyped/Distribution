package typings.navermaps.naver.maps

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InfoWindowOptions extends StObject {
  
  var anchorColor: js.UndefOr[String] = js.native
  
  var anchorSize: js.UndefOr[Size | SizeLiteral] = js.native
  
  var anchorSkew: js.UndefOr[Boolean] = js.native
  
  var backgroundColor: js.UndefOr[String] = js.native
  
  var borderColor: js.UndefOr[String] = js.native
  
  var borderWidth: js.UndefOr[Double] = js.native
  
  var content: String | HTMLElement = js.native
  
  var disableAnchor: js.UndefOr[Boolean] = js.native
  
  var disableAutoPan: js.UndefOr[Boolean] = js.native
  
  var maxWidth: js.UndefOr[Double] = js.native
  
  var pixelOffset: js.UndefOr[Point | PointLiteral] = js.native
  
  var position: js.UndefOr[Coord | CoordLiteral] = js.native
  
  var zIndex: js.UndefOr[Double] = js.native
}
object InfoWindowOptions {
  
  @scala.inline
  def apply(content: String | HTMLElement): InfoWindowOptions = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfoWindowOptions]
  }
  
  @scala.inline
  implicit class InfoWindowOptionsMutableBuilder[Self <: InfoWindowOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchorColor(value: String): Self = StObject.set(x, "anchorColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorColorUndefined: Self = StObject.set(x, "anchorColor", js.undefined)
    
    @scala.inline
    def setAnchorSize(value: Size | SizeLiteral): Self = StObject.set(x, "anchorSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorSizeUndefined: Self = StObject.set(x, "anchorSize", js.undefined)
    
    @scala.inline
    def setAnchorSkew(value: Boolean): Self = StObject.set(x, "anchorSkew", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorSkewUndefined: Self = StObject.set(x, "anchorSkew", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    @scala.inline
    def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    @scala.inline
    def setContent(value: String | HTMLElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableAnchor(value: Boolean): Self = StObject.set(x, "disableAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableAnchorUndefined: Self = StObject.set(x, "disableAnchor", js.undefined)
    
    @scala.inline
    def setDisableAutoPan(value: Boolean): Self = StObject.set(x, "disableAutoPan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableAutoPanUndefined: Self = StObject.set(x, "disableAutoPan", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    @scala.inline
    def setPixelOffset(value: Point | PointLiteral): Self = StObject.set(x, "pixelOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelOffsetUndefined: Self = StObject.set(x, "pixelOffset", js.undefined)
    
    @scala.inline
    def setPosition(value: Coord | CoordLiteral): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
