package typings.photoswipe.mod

import typings.photoswipe.anon.Top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Item extends js.Object {
  
  /**
    * Internal property added by PhotoSwipe.
    */
  var bounds: js.UndefOr[js.Any] = js.native
  
  /**
    * Internal property added by PhotoSwipe.
    * This number is computed to be this item's smaller dimension divided by the larger dimension.
    */
  var fitRatio: js.UndefOr[Double] = js.native
  
  /**
    * The height of this image.
    */
  var h: js.UndefOr[Double] = js.native
  
  /**
    * HTML content instead of image.
    */
  var html: js.UndefOr[String] = js.native
  
  /**
    * Internal property added by PhotoSwipe.
    */
  var initialPosition: js.UndefOr[js.Any] = js.native
  
  /**
    * Internal property added by PhotoSwipe.
    */
  var initialZoomLevel: js.UndefOr[Double] = js.native
  
  /**
    * Internal property added by PhotoSwipe.
    */
  var loadError: js.UndefOr[Boolean] = js.native
  
  /**
    * The url to small image placeholder, large image will be loaded on top
    */
  var msrc: js.UndefOr[String] = js.native
  
  /**
    * The url of this image.
    */
  var src: js.UndefOr[String] = js.native
  
  /**
    * Internal property added by PhotoSwipe.
    */
  var vGap: js.UndefOr[Top] = js.native
  
  /**
    * The width of this image.
    */
  var w: js.UndefOr[Double] = js.native
}
object Item {
  
  @scala.inline
  def apply(): Item = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Item]
  }
  
  @scala.inline
  implicit class ItemOps[Self <: Item] (val x: Self) extends AnyVal {
    
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
    def setBounds(value: js.Any): Self = this.set("bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBounds: Self = this.set("bounds", js.undefined)
    
    @scala.inline
    def setFitRatio(value: Double): Self = this.set("fitRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFitRatio: Self = this.set("fitRatio", js.undefined)
    
    @scala.inline
    def setH(value: Double): Self = this.set("h", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteH: Self = this.set("h", js.undefined)
    
    @scala.inline
    def setHtml(value: String): Self = this.set("html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    
    @scala.inline
    def setInitialPosition(value: js.Any): Self = this.set("initialPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialPosition: Self = this.set("initialPosition", js.undefined)
    
    @scala.inline
    def setInitialZoomLevel(value: Double): Self = this.set("initialZoomLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialZoomLevel: Self = this.set("initialZoomLevel", js.undefined)
    
    @scala.inline
    def setLoadError(value: Boolean): Self = this.set("loadError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadError: Self = this.set("loadError", js.undefined)
    
    @scala.inline
    def setMsrc(value: String): Self = this.set("msrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsrc: Self = this.set("msrc", js.undefined)
    
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
    
    @scala.inline
    def setVGap(value: Top): Self = this.set("vGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVGap: Self = this.set("vGap", js.undefined)
    
    @scala.inline
    def setW(value: Double): Self = this.set("w", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteW: Self = this.set("w", js.undefined)
  }
}
