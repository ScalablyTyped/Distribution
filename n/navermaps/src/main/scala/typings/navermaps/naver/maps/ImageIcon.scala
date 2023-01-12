package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ImageIcon
  */
trait ImageIcon extends StObject {
  
  var anchor: js.UndefOr[Point | PointLiteral | Position] = js.undefined
  
  var origin: js.UndefOr[Point | PointLiteral] = js.undefined
  
  var scaledSize: js.UndefOr[Size | SizeLiteral] = js.undefined
  
  var size: js.UndefOr[Size | SizeLiteral] = js.undefined
  
  var url: String
}
object ImageIcon {
  
  inline def apply(url: String): ImageIcon = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageIcon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageIcon] (val x: Self) extends AnyVal {
    
    inline def setAnchor(value: Point | PointLiteral | Position): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    inline def setOrigin(value: Point | PointLiteral): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setScaledSize(value: Size | SizeLiteral): Self = StObject.set(x, "scaledSize", value.asInstanceOf[js.Any])
    
    inline def setScaledSizeUndefined: Self = StObject.set(x, "scaledSize", js.undefined)
    
    inline def setSize(value: Size | SizeLiteral): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
