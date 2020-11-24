package typings.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageIcon extends js.Object {
  
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
  implicit class ImageIconOps[Self <: ImageIcon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchor(value: Point | PointLiteral | Position): Self = this.set("anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchor: Self = this.set("anchor", js.undefined)
    
    @scala.inline
    def setOrigin(value: Point | PointLiteral): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    
    @scala.inline
    def setScaledSize(value: Size | SizeLiteral): Self = this.set("scaledSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaledSize: Self = this.set("scaledSize", js.undefined)
    
    @scala.inline
    def setSize(value: Size | SizeLiteral): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
