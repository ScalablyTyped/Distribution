package typings.navermaps.naver.maps

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * HtmlIcon
  */
trait HtmlIcon extends StObject {
  
  var anchor: js.UndefOr[Point | PointLiteral | Position] = js.undefined
  
  var content: String | HTMLElement
  
  var size: js.UndefOr[Size | SizeLiteral] = js.undefined
}
object HtmlIcon {
  
  inline def apply(content: String | HTMLElement): HtmlIcon = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlIcon]
  }
  
  extension [Self <: HtmlIcon](x: Self) {
    
    inline def setAnchor(value: Point | PointLiteral | Position): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    inline def setContent(value: String | HTMLElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Size | SizeLiteral): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
