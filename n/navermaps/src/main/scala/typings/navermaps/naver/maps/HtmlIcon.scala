package typings.navermaps.naver.maps

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HtmlIcon extends StObject {
  
  var anchor: js.UndefOr[Point | PointLiteral | Position] = js.native
  
  var content: String | HTMLElement = js.native
  
  var size: js.UndefOr[Size | SizeLiteral] = js.native
}
object HtmlIcon {
  
  @scala.inline
  def apply(content: String | HTMLElement): HtmlIcon = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlIcon]
  }
  
  @scala.inline
  implicit class HtmlIconMutableBuilder[Self <: HtmlIcon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchor(value: Point | PointLiteral | Position): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    @scala.inline
    def setContent(value: String | HTMLElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Size | SizeLiteral): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
