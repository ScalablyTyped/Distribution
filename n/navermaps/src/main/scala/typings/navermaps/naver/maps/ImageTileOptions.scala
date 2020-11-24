package typings.navermaps.naver.maps

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageTileOptions extends js.Object {
  
  var imgonerror: js.UndefOr[js.Function0[_]] = js.native
  
  var imgonload: js.UndefOr[js.Function0[_]] = js.native
  
  var offset: js.UndefOr[Point] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var pane: js.UndefOr[HTMLElement] = js.native
  
  var size: js.UndefOr[Size] = js.native
  
  var transition: js.UndefOr[Boolean] = js.native
  
  var urls: js.Array[String] = js.native
  
  var zIndex: js.UndefOr[Double] = js.native
}
object ImageTileOptions {
  
  @scala.inline
  def apply(urls: js.Array[String]): ImageTileOptions = {
    val __obj = js.Dynamic.literal(urls = urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageTileOptions]
  }
  
  @scala.inline
  implicit class ImageTileOptionsOps[Self <: ImageTileOptions] (val x: Self) extends AnyVal {
    
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
    def setUrlsVarargs(value: String*): Self = this.set("urls", js.Array(value :_*))
    
    @scala.inline
    def setUrls(value: js.Array[String]): Self = this.set("urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImgonerror(value: () => _): Self = this.set("imgonerror", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteImgonerror: Self = this.set("imgonerror", js.undefined)
    
    @scala.inline
    def setImgonload(value: () => _): Self = this.set("imgonload", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteImgonload: Self = this.set("imgonload", js.undefined)
    
    @scala.inline
    def setOffset(value: Point): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setPane(value: HTMLElement): Self = this.set("pane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePane: Self = this.set("pane", js.undefined)
    
    @scala.inline
    def setSize(value: Size): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setTransition(value: Boolean): Self = this.set("transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransition: Self = this.set("transition", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
}
