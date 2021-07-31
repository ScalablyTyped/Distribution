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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AjaxHeaders extends StObject {
  
  var ajaxHeaders: js.UndefOr[js.Object] = js.undefined
  
  var ajaxWithCredentials: js.UndefOr[Boolean] = js.undefined
  
  var alwaysBlend: js.UndefOr[Boolean] = js.undefined
  
  var animationTime: js.UndefOr[Boolean] = js.undefined
  
  var blendTime: js.UndefOr[Double] = js.undefined
  
  var clip: js.UndefOr[Rect] = js.undefined
  
  var compositeOperation: js.UndefOr[String] = js.undefined
  
  var crossOriginPolicy: js.UndefOr[String | Boolean] = js.undefined
  
  var debugMode: js.UndefOr[Boolean] = js.undefined
  
  var drawer: Drawer
  
  var fitBounds: js.UndefOr[Rect] = js.undefined
  
  var fitBoundsPlacement: js.UndefOr[Placement] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var iOSDevice: js.UndefOr[Boolean] = js.undefined
  
  var imageLoader: ImageLoader
  
  var immediateRender: js.UndefOr[Boolean] = js.undefined
  
  var loadTilesWithAjax: js.UndefOr[Boolean] = js.undefined
  
  var minPixelRatio: js.UndefOr[Double] = js.undefined
  
  var minZoomImageRatio: js.UndefOr[Double] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var placeholderFillStyle: js.UndefOr[String | CanvasGradient | CanvasPattern] = js.undefined
  
  var preload: js.UndefOr[Boolean] = js.undefined
  
  var smoothTileEdgesMinZoom: js.UndefOr[Double] = js.undefined
  
  var source: TileSource
  
  var springStiffness: js.UndefOr[Double] = js.undefined
  
  var tileCache: TileCache
  
  var viewer: Viewer
  
  var width: js.UndefOr[Double] = js.undefined
  
  var wrapHorizontal: js.UndefOr[Boolean] = js.undefined
  
  var wrapVertical: js.UndefOr[Boolean] = js.undefined
  
  var x: js.UndefOr[Double] = js.undefined
  
  var y: js.UndefOr[Double] = js.undefined
}
object AjaxHeaders {
  
  @scala.inline
  def apply(drawer: Drawer, imageLoader: ImageLoader, source: TileSource, tileCache: TileCache, viewer: Viewer): AjaxHeaders = {
    val __obj = js.Dynamic.literal(drawer = drawer.asInstanceOf[js.Any], imageLoader = imageLoader.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], tileCache = tileCache.asInstanceOf[js.Any], viewer = viewer.asInstanceOf[js.Any])
    __obj.asInstanceOf[AjaxHeaders]
  }
  
  @scala.inline
  implicit class AjaxHeadersMutableBuilder[Self <: AjaxHeaders] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAjaxHeaders(value: js.Object): Self = StObject.set(x, "ajaxHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAjaxHeadersUndefined: Self = StObject.set(x, "ajaxHeaders", js.undefined)
    
    @scala.inline
    def setAjaxWithCredentials(value: Boolean): Self = StObject.set(x, "ajaxWithCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAjaxWithCredentialsUndefined: Self = StObject.set(x, "ajaxWithCredentials", js.undefined)
    
    @scala.inline
    def setAlwaysBlend(value: Boolean): Self = StObject.set(x, "alwaysBlend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlwaysBlendUndefined: Self = StObject.set(x, "alwaysBlend", js.undefined)
    
    @scala.inline
    def setAnimationTime(value: Boolean): Self = StObject.set(x, "animationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationTimeUndefined: Self = StObject.set(x, "animationTime", js.undefined)
    
    @scala.inline
    def setBlendTime(value: Double): Self = StObject.set(x, "blendTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlendTimeUndefined: Self = StObject.set(x, "blendTime", js.undefined)
    
    @scala.inline
    def setClip(value: Rect): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
    
    @scala.inline
    def setCompositeOperation(value: String): Self = StObject.set(x, "compositeOperation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompositeOperationUndefined: Self = StObject.set(x, "compositeOperation", js.undefined)
    
    @scala.inline
    def setCrossOriginPolicy(value: String | Boolean): Self = StObject.set(x, "crossOriginPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossOriginPolicyUndefined: Self = StObject.set(x, "crossOriginPolicy", js.undefined)
    
    @scala.inline
    def setDebugMode(value: Boolean): Self = StObject.set(x, "debugMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugModeUndefined: Self = StObject.set(x, "debugMode", js.undefined)
    
    @scala.inline
    def setDrawer(value: Drawer): Self = StObject.set(x, "drawer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFitBounds(value: Rect): Self = StObject.set(x, "fitBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFitBoundsPlacement(value: Placement): Self = StObject.set(x, "fitBoundsPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFitBoundsPlacementUndefined: Self = StObject.set(x, "fitBoundsPlacement", js.undefined)
    
    @scala.inline
    def setFitBoundsUndefined: Self = StObject.set(x, "fitBounds", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setIOSDevice(value: Boolean): Self = StObject.set(x, "iOSDevice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIOSDeviceUndefined: Self = StObject.set(x, "iOSDevice", js.undefined)
    
    @scala.inline
    def setImageLoader(value: ImageLoader): Self = StObject.set(x, "imageLoader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImmediateRender(value: Boolean): Self = StObject.set(x, "immediateRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImmediateRenderUndefined: Self = StObject.set(x, "immediateRender", js.undefined)
    
    @scala.inline
    def setLoadTilesWithAjax(value: Boolean): Self = StObject.set(x, "loadTilesWithAjax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadTilesWithAjaxUndefined: Self = StObject.set(x, "loadTilesWithAjax", js.undefined)
    
    @scala.inline
    def setMinPixelRatio(value: Double): Self = StObject.set(x, "minPixelRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinPixelRatioUndefined: Self = StObject.set(x, "minPixelRatio", js.undefined)
    
    @scala.inline
    def setMinZoomImageRatio(value: Double): Self = StObject.set(x, "minZoomImageRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinZoomImageRatioUndefined: Self = StObject.set(x, "minZoomImageRatio", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setPlaceholderFillStyle(value: String | CanvasGradient | CanvasPattern): Self = StObject.set(x, "placeholderFillStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderFillStyleUndefined: Self = StObject.set(x, "placeholderFillStyle", js.undefined)
    
    @scala.inline
    def setPreload(value: Boolean): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
    
    @scala.inline
    def setSmoothTileEdgesMinZoom(value: Double): Self = StObject.set(x, "smoothTileEdgesMinZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmoothTileEdgesMinZoomUndefined: Self = StObject.set(x, "smoothTileEdgesMinZoom", js.undefined)
    
    @scala.inline
    def setSource(value: TileSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpringStiffness(value: Double): Self = StObject.set(x, "springStiffness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpringStiffnessUndefined: Self = StObject.set(x, "springStiffness", js.undefined)
    
    @scala.inline
    def setTileCache(value: TileCache): Self = StObject.set(x, "tileCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewer(value: Viewer): Self = StObject.set(x, "viewer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setWrapHorizontal(value: Boolean): Self = StObject.set(x, "wrapHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapHorizontalUndefined: Self = StObject.set(x, "wrapHorizontal", js.undefined)
    
    @scala.inline
    def setWrapVertical(value: Boolean): Self = StObject.set(x, "wrapVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapVerticalUndefined: Self = StObject.set(x, "wrapVertical", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
