package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageIcon extends StObject {
  
  var anchor: js.UndefOr[Point | PointLiteral | Position] = js.native
  
  var origin: js.UndefOr[Point | PointLiteral] = js.native
  
  var scaledSize: js.UndefOr[Size | SizeLiteral] = js.native
  
  var size: js.UndefOr[Size | SizeLiteral] = js.native
  
  var url: String = js.native
}
object ImageIcon {
  
  @scala.inline
  def apply(url: String): ImageIcon = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageIcon]
  }
  
  @scala.inline
  implicit class ImageIconMutableBuilder[Self <: ImageIcon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchor(value: Point | PointLiteral | Position): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    @scala.inline
    def setOrigin(value: Point | PointLiteral): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    @scala.inline
    def setScaledSize(value: Size | SizeLiteral): Self = StObject.set(x, "scaledSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaledSizeUndefined: Self = StObject.set(x, "scaledSize", js.undefined)
    
    @scala.inline
    def setSize(value: Size | SizeLiteral): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
