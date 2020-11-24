package typings.openseadragon.anon

import typings.openseadragon.mod.Drawer
import typings.openseadragon.mod.ImageLoader
import typings.openseadragon.mod.Placement
import typings.openseadragon.mod.Rect
import typings.openseadragon.mod.TileCache
import typings.openseadragon.mod.TileSource
import typings.openseadragon.mod.Viewer
import typings.std.CanvasGradient
import typings.std.CanvasPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AjaxHeaders extends js.Object {
  
  var ajaxHeaders: js.UndefOr[js.Object] = js.native
  
  var ajaxWithCredentials: js.UndefOr[Boolean] = js.native
  
  var alwaysBlend: js.UndefOr[Boolean] = js.native
  
  var animationTime: js.UndefOr[Boolean] = js.native
  
  var blendTime: js.UndefOr[Double] = js.native
  
  var clip: js.UndefOr[Rect] = js.native
  
  var compositeOperation: js.UndefOr[String] = js.native
  
  var crossOriginPolicy: js.UndefOr[String | Boolean] = js.native
  
  var debugMode: js.UndefOr[Boolean] = js.native
  
  var drawer: Drawer = js.native
  
  var fitBounds: js.UndefOr[Rect] = js.native
  
  var fitBoundsPlacement: js.UndefOr[Placement] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var iOSDevice: js.UndefOr[Boolean] = js.native
  
  var imageLoader: ImageLoader = js.native
  
  var immediateRender: js.UndefOr[Boolean] = js.native
  
  var loadTilesWithAjax: js.UndefOr[Boolean] = js.native
  
  var minPixelRatio: js.UndefOr[Double] = js.native
  
  var minZoomImageRatio: js.UndefOr[Double] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var placeholderFillStyle: js.UndefOr[String | CanvasGradient | CanvasPattern] = js.native
  
  var preload: js.UndefOr[Boolean] = js.native
  
  var smoothTileEdgesMinZoom: js.UndefOr[Double] = js.native
  
  var source: TileSource = js.native
  
  var springStiffness: js.UndefOr[Double] = js.native
  
  var tileCache: TileCache = js.native
  
  var viewer: Viewer = js.native
  
  var width: js.UndefOr[Double] = js.native
  
  var wrapHorizontal: js.UndefOr[Boolean] = js.native
  
  var wrapVertical: js.UndefOr[Boolean] = js.native
  
  var x: js.UndefOr[Double] = js.native
  
  var y: js.UndefOr[Double] = js.native
}
object AjaxHeaders {
  
  @scala.inline
  def apply(drawer: Drawer, imageLoader: ImageLoader, source: TileSource, tileCache: TileCache, viewer: Viewer): AjaxHeaders = {
    val __obj = js.Dynamic.literal(drawer = drawer.asInstanceOf[js.Any], imageLoader = imageLoader.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], tileCache = tileCache.asInstanceOf[js.Any], viewer = viewer.asInstanceOf[js.Any])
    __obj.asInstanceOf[AjaxHeaders]
  }
  
  @scala.inline
  implicit class AjaxHeadersOps[Self <: AjaxHeaders] (val x: Self) extends AnyVal {
    
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
    def setDrawer(value: Drawer): Self = this.set("drawer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageLoader(value: ImageLoader): Self = this.set("imageLoader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: TileSource): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileCache(value: TileCache): Self = this.set("tileCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewer(value: Viewer): Self = this.set("viewer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAjaxHeaders(value: js.Object): Self = this.set("ajaxHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAjaxHeaders: Self = this.set("ajaxHeaders", js.undefined)
    
    @scala.inline
    def setAjaxWithCredentials(value: Boolean): Self = this.set("ajaxWithCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAjaxWithCredentials: Self = this.set("ajaxWithCredentials", js.undefined)
    
    @scala.inline
    def setAlwaysBlend(value: Boolean): Self = this.set("alwaysBlend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlwaysBlend: Self = this.set("alwaysBlend", js.undefined)
    
    @scala.inline
    def setAnimationTime(value: Boolean): Self = this.set("animationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationTime: Self = this.set("animationTime", js.undefined)
    
    @scala.inline
    def setBlendTime(value: Double): Self = this.set("blendTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlendTime: Self = this.set("blendTime", js.undefined)
    
    @scala.inline
    def setClip(value: Rect): Self = this.set("clip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClip: Self = this.set("clip", js.undefined)
    
    @scala.inline
    def setCompositeOperation(value: String): Self = this.set("compositeOperation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompositeOperation: Self = this.set("compositeOperation", js.undefined)
    
    @scala.inline
    def setCrossOriginPolicy(value: String | Boolean): Self = this.set("crossOriginPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrossOriginPolicy: Self = this.set("crossOriginPolicy", js.undefined)
    
    @scala.inline
    def setDebugMode(value: Boolean): Self = this.set("debugMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebugMode: Self = this.set("debugMode", js.undefined)
    
    @scala.inline
    def setFitBounds(value: Rect): Self = this.set("fitBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFitBounds: Self = this.set("fitBounds", js.undefined)
    
    @scala.inline
    def setFitBoundsPlacement(value: Placement): Self = this.set("fitBoundsPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFitBoundsPlacement: Self = this.set("fitBoundsPlacement", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setIOSDevice(value: Boolean): Self = this.set("iOSDevice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIOSDevice: Self = this.set("iOSDevice", js.undefined)
    
    @scala.inline
    def setImmediateRender(value: Boolean): Self = this.set("immediateRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImmediateRender: Self = this.set("immediateRender", js.undefined)
    
    @scala.inline
    def setLoadTilesWithAjax(value: Boolean): Self = this.set("loadTilesWithAjax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadTilesWithAjax: Self = this.set("loadTilesWithAjax", js.undefined)
    
    @scala.inline
    def setMinPixelRatio(value: Double): Self = this.set("minPixelRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinPixelRatio: Self = this.set("minPixelRatio", js.undefined)
    
    @scala.inline
    def setMinZoomImageRatio(value: Double): Self = this.set("minZoomImageRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinZoomImageRatio: Self = this.set("minZoomImageRatio", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setPlaceholderFillStyle(value: String | CanvasGradient | CanvasPattern): Self = this.set("placeholderFillStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholderFillStyle: Self = this.set("placeholderFillStyle", js.undefined)
    
    @scala.inline
    def setPreload(value: Boolean): Self = this.set("preload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreload: Self = this.set("preload", js.undefined)
    
    @scala.inline
    def setSmoothTileEdgesMinZoom(value: Double): Self = this.set("smoothTileEdgesMinZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmoothTileEdgesMinZoom: Self = this.set("smoothTileEdgesMinZoom", js.undefined)
    
    @scala.inline
    def setSpringStiffness(value: Double): Self = this.set("springStiffness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpringStiffness: Self = this.set("springStiffness", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setWrapHorizontal(value: Boolean): Self = this.set("wrapHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapHorizontal: Self = this.set("wrapHorizontal", js.undefined)
    
    @scala.inline
    def setWrapVertical(value: Boolean): Self = this.set("wrapVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapVertical: Self = this.set("wrapVertical", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
}
