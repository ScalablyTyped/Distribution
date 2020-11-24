package typings.preact.jsxCsstypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewportFallback[TLength] extends js.Object {
  
  var OOrientation: js.UndefOr[ViewportOrientationProperty | js.Array[ViewportOrientationProperty]] = js.native
  
  var height: js.UndefOr[ViewportHeightProperty[TLength] | js.Array[ViewportHeightProperty[TLength]]] = js.native
  
  var maxHeight: js.UndefOr[
    ViewportMaxHeightProperty[TLength] | js.Array[ViewportMaxHeightProperty[TLength]]
  ] = js.native
  
  var maxWidth: js.UndefOr[ViewportMaxWidthProperty[TLength] | js.Array[ViewportMaxWidthProperty[TLength]]] = js.native
  
  var maxZoom: js.UndefOr[ViewportMaxZoomProperty | js.Array[ViewportMaxZoomProperty]] = js.native
  
  var minHeight: js.UndefOr[
    ViewportMinHeightProperty[TLength] | js.Array[ViewportMinHeightProperty[TLength]]
  ] = js.native
  
  var minWidth: js.UndefOr[ViewportMinWidthProperty[TLength] | js.Array[ViewportMinWidthProperty[TLength]]] = js.native
  
  var minZoom: js.UndefOr[ViewportMinZoomProperty | js.Array[ViewportMinZoomProperty]] = js.native
  
  var msHeight: js.UndefOr[ViewportHeightProperty[TLength] | js.Array[ViewportHeightProperty[TLength]]] = js.native
  
  var msMaxHeight: js.UndefOr[
    ViewportMaxHeightProperty[TLength] | js.Array[ViewportMaxHeightProperty[TLength]]
  ] = js.native
  
  var msMaxWidth: js.UndefOr[ViewportMaxWidthProperty[TLength] | js.Array[ViewportMaxWidthProperty[TLength]]] = js.native
  
  var msMaxZoom: js.UndefOr[ViewportMaxZoomProperty | js.Array[ViewportMaxZoomProperty]] = js.native
  
  var msMinHeight: js.UndefOr[
    ViewportMinHeightProperty[TLength] | js.Array[ViewportMinHeightProperty[TLength]]
  ] = js.native
  
  var msMinWidth: js.UndefOr[ViewportMinWidthProperty[TLength] | js.Array[ViewportMinWidthProperty[TLength]]] = js.native
  
  var msMinZoom: js.UndefOr[ViewportMinZoomProperty | js.Array[ViewportMinZoomProperty]] = js.native
  
  var msOrientation: js.UndefOr[ViewportOrientationProperty | js.Array[ViewportOrientationProperty]] = js.native
  
  var msUserZoom: js.UndefOr[ViewportUserZoomProperty | js.Array[ViewportUserZoomProperty]] = js.native
  
  var msWidth: js.UndefOr[ViewportWidthProperty[TLength] | js.Array[ViewportWidthProperty[TLength]]] = js.native
  
  var msZoom: js.UndefOr[ViewportZoomProperty | js.Array[ViewportZoomProperty]] = js.native
  
  var orientation: js.UndefOr[ViewportOrientationProperty | js.Array[ViewportOrientationProperty]] = js.native
  
  var userZoom: js.UndefOr[ViewportUserZoomProperty | js.Array[ViewportUserZoomProperty]] = js.native
  
  var width: js.UndefOr[ViewportWidthProperty[TLength] | js.Array[ViewportWidthProperty[TLength]]] = js.native
  
  var zoom: js.UndefOr[ViewportZoomProperty | js.Array[ViewportZoomProperty]] = js.native
}
object ViewportFallback {
  
  @scala.inline
  def apply[TLength](): ViewportFallback[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewportFallback[TLength]]
  }
  
  @scala.inline
  implicit class ViewportFallbackOps[Self <: ViewportFallback[_], TLength] (val x: Self with ViewportFallback[TLength]) extends AnyVal {
    
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
    def setOOrientationVarargs(value: ViewportOrientationProperty*): Self = this.set("OOrientation", js.Array(value :_*))
    
    @scala.inline
    def setOOrientation(value: ViewportOrientationProperty | js.Array[ViewportOrientationProperty]): Self = this.set("OOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOOrientation: Self = this.set("OOrientation", js.undefined)
    
    @scala.inline
    def setHeightVarargs(value: ViewportHeightProperty[TLength]*): Self = this.set("height", js.Array(value :_*))
    
    @scala.inline
    def setHeight(value: ViewportHeightProperty[TLength] | js.Array[ViewportHeightProperty[TLength]]): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setMaxHeightVarargs(value: ViewportMaxHeightProperty[TLength]*): Self = this.set("maxHeight", js.Array(value :_*))
    
    @scala.inline
    def setMaxHeight(value: ViewportMaxHeightProperty[TLength] | js.Array[ViewportMaxHeightProperty[TLength]]): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    
    @scala.inline
    def setMaxWidthVarargs(value: ViewportMaxWidthProperty[TLength]*): Self = this.set("maxWidth", js.Array(value :_*))
    
    @scala.inline
    def setMaxWidth(value: ViewportMaxWidthProperty[TLength] | js.Array[ViewportMaxWidthProperty[TLength]]): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    
    @scala.inline
    def setMaxZoomVarargs(value: ViewportMaxZoomProperty*): Self = this.set("maxZoom", js.Array(value :_*))
    
    @scala.inline
    def setMaxZoom(value: ViewportMaxZoomProperty | js.Array[ViewportMaxZoomProperty]): Self = this.set("maxZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxZoom: Self = this.set("maxZoom", js.undefined)
    
    @scala.inline
    def setMinHeightVarargs(value: ViewportMinHeightProperty[TLength]*): Self = this.set("minHeight", js.Array(value :_*))
    
    @scala.inline
    def setMinHeight(value: ViewportMinHeightProperty[TLength] | js.Array[ViewportMinHeightProperty[TLength]]): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    
    @scala.inline
    def setMinWidthVarargs(value: ViewportMinWidthProperty[TLength]*): Self = this.set("minWidth", js.Array(value :_*))
    
    @scala.inline
    def setMinWidth(value: ViewportMinWidthProperty[TLength] | js.Array[ViewportMinWidthProperty[TLength]]): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    
    @scala.inline
    def setMinZoomVarargs(value: ViewportMinZoomProperty*): Self = this.set("minZoom", js.Array(value :_*))
    
    @scala.inline
    def setMinZoom(value: ViewportMinZoomProperty | js.Array[ViewportMinZoomProperty]): Self = this.set("minZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinZoom: Self = this.set("minZoom", js.undefined)
    
    @scala.inline
    def setMsHeightVarargs(value: ViewportHeightProperty[TLength]*): Self = this.set("msHeight", js.Array(value :_*))
    
    @scala.inline
    def setMsHeight(value: ViewportHeightProperty[TLength] | js.Array[ViewportHeightProperty[TLength]]): Self = this.set("msHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsHeight: Self = this.set("msHeight", js.undefined)
    
    @scala.inline
    def setMsMaxHeightVarargs(value: ViewportMaxHeightProperty[TLength]*): Self = this.set("msMaxHeight", js.Array(value :_*))
    
    @scala.inline
    def setMsMaxHeight(value: ViewportMaxHeightProperty[TLength] | js.Array[ViewportMaxHeightProperty[TLength]]): Self = this.set("msMaxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsMaxHeight: Self = this.set("msMaxHeight", js.undefined)
    
    @scala.inline
    def setMsMaxWidthVarargs(value: ViewportMaxWidthProperty[TLength]*): Self = this.set("msMaxWidth", js.Array(value :_*))
    
    @scala.inline
    def setMsMaxWidth(value: ViewportMaxWidthProperty[TLength] | js.Array[ViewportMaxWidthProperty[TLength]]): Self = this.set("msMaxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsMaxWidth: Self = this.set("msMaxWidth", js.undefined)
    
    @scala.inline
    def setMsMaxZoomVarargs(value: ViewportMaxZoomProperty*): Self = this.set("msMaxZoom", js.Array(value :_*))
    
    @scala.inline
    def setMsMaxZoom(value: ViewportMaxZoomProperty | js.Array[ViewportMaxZoomProperty]): Self = this.set("msMaxZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsMaxZoom: Self = this.set("msMaxZoom", js.undefined)
    
    @scala.inline
    def setMsMinHeightVarargs(value: ViewportMinHeightProperty[TLength]*): Self = this.set("msMinHeight", js.Array(value :_*))
    
    @scala.inline
    def setMsMinHeight(value: ViewportMinHeightProperty[TLength] | js.Array[ViewportMinHeightProperty[TLength]]): Self = this.set("msMinHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsMinHeight: Self = this.set("msMinHeight", js.undefined)
    
    @scala.inline
    def setMsMinWidthVarargs(value: ViewportMinWidthProperty[TLength]*): Self = this.set("msMinWidth", js.Array(value :_*))
    
    @scala.inline
    def setMsMinWidth(value: ViewportMinWidthProperty[TLength] | js.Array[ViewportMinWidthProperty[TLength]]): Self = this.set("msMinWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsMinWidth: Self = this.set("msMinWidth", js.undefined)
    
    @scala.inline
    def setMsMinZoomVarargs(value: ViewportMinZoomProperty*): Self = this.set("msMinZoom", js.Array(value :_*))
    
    @scala.inline
    def setMsMinZoom(value: ViewportMinZoomProperty | js.Array[ViewportMinZoomProperty]): Self = this.set("msMinZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsMinZoom: Self = this.set("msMinZoom", js.undefined)
    
    @scala.inline
    def setMsOrientationVarargs(value: ViewportOrientationProperty*): Self = this.set("msOrientation", js.Array(value :_*))
    
    @scala.inline
    def setMsOrientation(value: ViewportOrientationProperty | js.Array[ViewportOrientationProperty]): Self = this.set("msOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsOrientation: Self = this.set("msOrientation", js.undefined)
    
    @scala.inline
    def setMsUserZoomVarargs(value: ViewportUserZoomProperty*): Self = this.set("msUserZoom", js.Array(value :_*))
    
    @scala.inline
    def setMsUserZoom(value: ViewportUserZoomProperty | js.Array[ViewportUserZoomProperty]): Self = this.set("msUserZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsUserZoom: Self = this.set("msUserZoom", js.undefined)
    
    @scala.inline
    def setMsWidthVarargs(value: ViewportWidthProperty[TLength]*): Self = this.set("msWidth", js.Array(value :_*))
    
    @scala.inline
    def setMsWidth(value: ViewportWidthProperty[TLength] | js.Array[ViewportWidthProperty[TLength]]): Self = this.set("msWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsWidth: Self = this.set("msWidth", js.undefined)
    
    @scala.inline
    def setMsZoomVarargs(value: ViewportZoomProperty*): Self = this.set("msZoom", js.Array(value :_*))
    
    @scala.inline
    def setMsZoom(value: ViewportZoomProperty | js.Array[ViewportZoomProperty]): Self = this.set("msZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsZoom: Self = this.set("msZoom", js.undefined)
    
    @scala.inline
    def setOrientationVarargs(value: ViewportOrientationProperty*): Self = this.set("orientation", js.Array(value :_*))
    
    @scala.inline
    def setOrientation(value: ViewportOrientationProperty | js.Array[ViewportOrientationProperty]): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    
    @scala.inline
    def setUserZoomVarargs(value: ViewportUserZoomProperty*): Self = this.set("userZoom", js.Array(value :_*))
    
    @scala.inline
    def setUserZoom(value: ViewportUserZoomProperty | js.Array[ViewportUserZoomProperty]): Self = this.set("userZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserZoom: Self = this.set("userZoom", js.undefined)
    
    @scala.inline
    def setWidthVarargs(value: ViewportWidthProperty[TLength]*): Self = this.set("width", js.Array(value :_*))
    
    @scala.inline
    def setWidth(value: ViewportWidthProperty[TLength] | js.Array[ViewportWidthProperty[TLength]]): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setZoomVarargs(value: ViewportZoomProperty*): Self = this.set("zoom", js.Array(value :_*))
    
    @scala.inline
    def setZoom(value: ViewportZoomProperty | js.Array[ViewportZoomProperty]): Self = this.set("zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
  }
}
