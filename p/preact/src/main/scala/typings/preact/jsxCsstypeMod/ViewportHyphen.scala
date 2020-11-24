package typings.preact.jsxCsstypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewportHyphen[TLength] extends js.Object {
  
  var `-ms-height`: js.UndefOr[ViewportHeightProperty[TLength]] = js.native
  
  var `-ms-max-height`: js.UndefOr[ViewportMaxHeightProperty[TLength]] = js.native
  
  var `-ms-max-width`: js.UndefOr[ViewportMaxWidthProperty[TLength]] = js.native
  
  var `-ms-max-zoom`: js.UndefOr[ViewportMaxZoomProperty] = js.native
  
  var `-ms-min-height`: js.UndefOr[ViewportMinHeightProperty[TLength]] = js.native
  
  var `-ms-min-width`: js.UndefOr[ViewportMinWidthProperty[TLength]] = js.native
  
  var `-ms-min-zoom`: js.UndefOr[ViewportMinZoomProperty] = js.native
  
  var `-ms-orientation`: js.UndefOr[ViewportOrientationProperty] = js.native
  
  var `-ms-user-zoom`: js.UndefOr[ViewportUserZoomProperty] = js.native
  
  var `-ms-width`: js.UndefOr[ViewportWidthProperty[TLength]] = js.native
  
  var `-ms-zoom`: js.UndefOr[ViewportZoomProperty] = js.native
  
  var `-o-orientation`: js.UndefOr[ViewportOrientationProperty] = js.native
  
  var height: js.UndefOr[ViewportHeightProperty[TLength]] = js.native
  
  var `max-height`: js.UndefOr[ViewportMaxHeightProperty[TLength]] = js.native
  
  var `max-width`: js.UndefOr[ViewportMaxWidthProperty[TLength]] = js.native
  
  var `max-zoom`: js.UndefOr[ViewportMaxZoomProperty] = js.native
  
  var `min-height`: js.UndefOr[ViewportMinHeightProperty[TLength]] = js.native
  
  var `min-width`: js.UndefOr[ViewportMinWidthProperty[TLength]] = js.native
  
  var `min-zoom`: js.UndefOr[ViewportMinZoomProperty] = js.native
  
  var orientation: js.UndefOr[ViewportOrientationProperty] = js.native
  
  var `user-zoom`: js.UndefOr[ViewportUserZoomProperty] = js.native
  
  var width: js.UndefOr[ViewportWidthProperty[TLength]] = js.native
  
  var zoom: js.UndefOr[ViewportZoomProperty] = js.native
}
object ViewportHyphen {
  
  @scala.inline
  def apply[TLength](): ViewportHyphen[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewportHyphen[TLength]]
  }
  
  @scala.inline
  implicit class ViewportHyphenOps[Self <: ViewportHyphen[_], TLength] (val x: Self with ViewportHyphen[TLength]) extends AnyVal {
    
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
    def `set-ms-height`(value: ViewportHeightProperty[TLength]): Self = this.set("-ms-height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-ms-height`: Self = this.set("-ms-height", js.undefined)
    
    @scala.inline
    def `set-ms-max-height`(value: ViewportMaxHeightProperty[TLength]): Self = this.set("-ms-max-height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-ms-max-height`: Self = this.set("-ms-max-height", js.undefined)
    
    @scala.inline
    def `set-ms-max-width`(value: ViewportMaxWidthProperty[TLength]): Self = this.set("-ms-max-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-ms-max-width`: Self = this.set("-ms-max-width", js.undefined)
    
    @scala.inline
    def `set-ms-max-zoom`(value: ViewportMaxZoomProperty): Self = this.set("-ms-max-zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-ms-max-zoom`: Self = this.set("-ms-max-zoom", js.undefined)
    
    @scala.inline
    def `set-ms-min-height`(value: ViewportMinHeightProperty[TLength]): Self = this.set("-ms-min-height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-ms-min-height`: Self = this.set("-ms-min-height", js.undefined)
    
    @scala.inline
    def `set-ms-min-width`(value: ViewportMinWidthProperty[TLength]): Self = this.set("-ms-min-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-ms-min-width`: Self = this.set("-ms-min-width", js.undefined)
    
    @scala.inline
    def `set-ms-min-zoom`(value: ViewportMinZoomProperty): Self = this.set("-ms-min-zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-ms-min-zoom`: Self = this.set("-ms-min-zoom", js.undefined)
    
    @scala.inline
    def `set-ms-orientation`(value: ViewportOrientationProperty): Self = this.set("-ms-orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-ms-orientation`: Self = this.set("-ms-orientation", js.undefined)
    
    @scala.inline
    def `set-ms-user-zoom`(value: ViewportUserZoomProperty): Self = this.set("-ms-user-zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-ms-user-zoom`: Self = this.set("-ms-user-zoom", js.undefined)
    
    @scala.inline
    def `set-ms-width`(value: ViewportWidthProperty[TLength]): Self = this.set("-ms-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-ms-width`: Self = this.set("-ms-width", js.undefined)
    
    @scala.inline
    def `set-ms-zoom`(value: ViewportZoomProperty): Self = this.set("-ms-zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-ms-zoom`: Self = this.set("-ms-zoom", js.undefined)
    
    @scala.inline
    def `set-o-orientation`(value: ViewportOrientationProperty): Self = this.set("-o-orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete-o-orientation`: Self = this.set("-o-orientation", js.undefined)
    
    @scala.inline
    def setHeight(value: ViewportHeightProperty[TLength]): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def `setMax-height`(value: ViewportMaxHeightProperty[TLength]): Self = this.set("max-height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMax-height`: Self = this.set("max-height", js.undefined)
    
    @scala.inline
    def `setMax-width`(value: ViewportMaxWidthProperty[TLength]): Self = this.set("max-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMax-width`: Self = this.set("max-width", js.undefined)
    
    @scala.inline
    def `setMax-zoom`(value: ViewportMaxZoomProperty): Self = this.set("max-zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMax-zoom`: Self = this.set("max-zoom", js.undefined)
    
    @scala.inline
    def `setMin-height`(value: ViewportMinHeightProperty[TLength]): Self = this.set("min-height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMin-height`: Self = this.set("min-height", js.undefined)
    
    @scala.inline
    def `setMin-width`(value: ViewportMinWidthProperty[TLength]): Self = this.set("min-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMin-width`: Self = this.set("min-width", js.undefined)
    
    @scala.inline
    def `setMin-zoom`(value: ViewportMinZoomProperty): Self = this.set("min-zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMin-zoom`: Self = this.set("min-zoom", js.undefined)
    
    @scala.inline
    def setOrientation(value: ViewportOrientationProperty): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    
    @scala.inline
    def `setUser-zoom`(value: ViewportUserZoomProperty): Self = this.set("user-zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteUser-zoom`: Self = this.set("user-zoom", js.undefined)
    
    @scala.inline
    def setWidth(value: ViewportWidthProperty[TLength]): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setZoom(value: ViewportZoomProperty): Self = this.set("zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
  }
}
