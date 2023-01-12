package typings.navermaps.naver.maps

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * InfoWindowOptions
  */
trait InfoWindowOptions extends StObject {
  
  var anchorColor: js.UndefOr[String] = js.undefined
  
  var anchorSize: js.UndefOr[Size | SizeLiteral] = js.undefined
  
  var anchorSkew: js.UndefOr[Boolean] = js.undefined
  
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  var borderColor: js.UndefOr[String] = js.undefined
  
  var borderWidth: js.UndefOr[Double] = js.undefined
  
  var content: String | HTMLElement
  
  var disableAnchor: js.UndefOr[Boolean] = js.undefined
  
  var disableAutoPan: js.UndefOr[Boolean] = js.undefined
  
  var maxWidth: js.UndefOr[Double] = js.undefined
  
  var pixelOffset: js.UndefOr[Point | PointLiteral] = js.undefined
  
  var position: js.UndefOr[Coord | CoordLiteral] = js.undefined
  
  var zIndex: js.UndefOr[Double] = js.undefined
}
object InfoWindowOptions {
  
  inline def apply(content: String | HTMLElement): InfoWindowOptions = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfoWindowOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InfoWindowOptions] (val x: Self) extends AnyVal {
    
    inline def setAnchorColor(value: String): Self = StObject.set(x, "anchorColor", value.asInstanceOf[js.Any])
    
    inline def setAnchorColorUndefined: Self = StObject.set(x, "anchorColor", js.undefined)
    
    inline def setAnchorSize(value: Size | SizeLiteral): Self = StObject.set(x, "anchorSize", value.asInstanceOf[js.Any])
    
    inline def setAnchorSizeUndefined: Self = StObject.set(x, "anchorSize", js.undefined)
    
    inline def setAnchorSkew(value: Boolean): Self = StObject.set(x, "anchorSkew", value.asInstanceOf[js.Any])
    
    inline def setAnchorSkewUndefined: Self = StObject.set(x, "anchorSkew", js.undefined)
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    inline def setContent(value: String | HTMLElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setDisableAnchor(value: Boolean): Self = StObject.set(x, "disableAnchor", value.asInstanceOf[js.Any])
    
    inline def setDisableAnchorUndefined: Self = StObject.set(x, "disableAnchor", js.undefined)
    
    inline def setDisableAutoPan(value: Boolean): Self = StObject.set(x, "disableAutoPan", value.asInstanceOf[js.Any])
    
    inline def setDisableAutoPanUndefined: Self = StObject.set(x, "disableAutoPan", js.undefined)
    
    inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setPixelOffset(value: Point | PointLiteral): Self = StObject.set(x, "pixelOffset", value.asInstanceOf[js.Any])
    
    inline def setPixelOffsetUndefined: Self = StObject.set(x, "pixelOffset", js.undefined)
    
    inline def setPosition(value: Coord | CoordLiteral): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
