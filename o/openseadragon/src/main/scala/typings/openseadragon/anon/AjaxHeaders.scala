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
  
  inline def apply(drawer: Drawer, imageLoader: ImageLoader, source: TileSource, tileCache: TileCache, viewer: Viewer): AjaxHeaders = {
    val __obj = js.Dynamic.literal(drawer = drawer.asInstanceOf[js.Any], imageLoader = imageLoader.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], tileCache = tileCache.asInstanceOf[js.Any], viewer = viewer.asInstanceOf[js.Any])
    __obj.asInstanceOf[AjaxHeaders]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AjaxHeaders] (val x: Self) extends AnyVal {
    
    inline def setAjaxHeaders(value: js.Object): Self = StObject.set(x, "ajaxHeaders", value.asInstanceOf[js.Any])
    
    inline def setAjaxHeadersUndefined: Self = StObject.set(x, "ajaxHeaders", js.undefined)
    
    inline def setAjaxWithCredentials(value: Boolean): Self = StObject.set(x, "ajaxWithCredentials", value.asInstanceOf[js.Any])
    
    inline def setAjaxWithCredentialsUndefined: Self = StObject.set(x, "ajaxWithCredentials", js.undefined)
    
    inline def setAlwaysBlend(value: Boolean): Self = StObject.set(x, "alwaysBlend", value.asInstanceOf[js.Any])
    
    inline def setAlwaysBlendUndefined: Self = StObject.set(x, "alwaysBlend", js.undefined)
    
    inline def setAnimationTime(value: Boolean): Self = StObject.set(x, "animationTime", value.asInstanceOf[js.Any])
    
    inline def setAnimationTimeUndefined: Self = StObject.set(x, "animationTime", js.undefined)
    
    inline def setBlendTime(value: Double): Self = StObject.set(x, "blendTime", value.asInstanceOf[js.Any])
    
    inline def setBlendTimeUndefined: Self = StObject.set(x, "blendTime", js.undefined)
    
    inline def setClip(value: Rect): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
    
    inline def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
    
    inline def setCompositeOperation(value: String): Self = StObject.set(x, "compositeOperation", value.asInstanceOf[js.Any])
    
    inline def setCompositeOperationUndefined: Self = StObject.set(x, "compositeOperation", js.undefined)
    
    inline def setCrossOriginPolicy(value: String | Boolean): Self = StObject.set(x, "crossOriginPolicy", value.asInstanceOf[js.Any])
    
    inline def setCrossOriginPolicyUndefined: Self = StObject.set(x, "crossOriginPolicy", js.undefined)
    
    inline def setDebugMode(value: Boolean): Self = StObject.set(x, "debugMode", value.asInstanceOf[js.Any])
    
    inline def setDebugModeUndefined: Self = StObject.set(x, "debugMode", js.undefined)
    
    inline def setDrawer(value: Drawer): Self = StObject.set(x, "drawer", value.asInstanceOf[js.Any])
    
    inline def setFitBounds(value: Rect): Self = StObject.set(x, "fitBounds", value.asInstanceOf[js.Any])
    
    inline def setFitBoundsPlacement(value: Placement): Self = StObject.set(x, "fitBoundsPlacement", value.asInstanceOf[js.Any])
    
    inline def setFitBoundsPlacementUndefined: Self = StObject.set(x, "fitBoundsPlacement", js.undefined)
    
    inline def setFitBoundsUndefined: Self = StObject.set(x, "fitBounds", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setIOSDevice(value: Boolean): Self = StObject.set(x, "iOSDevice", value.asInstanceOf[js.Any])
    
    inline def setIOSDeviceUndefined: Self = StObject.set(x, "iOSDevice", js.undefined)
    
    inline def setImageLoader(value: ImageLoader): Self = StObject.set(x, "imageLoader", value.asInstanceOf[js.Any])
    
    inline def setImmediateRender(value: Boolean): Self = StObject.set(x, "immediateRender", value.asInstanceOf[js.Any])
    
    inline def setImmediateRenderUndefined: Self = StObject.set(x, "immediateRender", js.undefined)
    
    inline def setLoadTilesWithAjax(value: Boolean): Self = StObject.set(x, "loadTilesWithAjax", value.asInstanceOf[js.Any])
    
    inline def setLoadTilesWithAjaxUndefined: Self = StObject.set(x, "loadTilesWithAjax", js.undefined)
    
    inline def setMinPixelRatio(value: Double): Self = StObject.set(x, "minPixelRatio", value.asInstanceOf[js.Any])
    
    inline def setMinPixelRatioUndefined: Self = StObject.set(x, "minPixelRatio", js.undefined)
    
    inline def setMinZoomImageRatio(value: Double): Self = StObject.set(x, "minZoomImageRatio", value.asInstanceOf[js.Any])
    
    inline def setMinZoomImageRatioUndefined: Self = StObject.set(x, "minZoomImageRatio", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setPlaceholderFillStyle(value: String | CanvasGradient | CanvasPattern): Self = StObject.set(x, "placeholderFillStyle", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderFillStyleUndefined: Self = StObject.set(x, "placeholderFillStyle", js.undefined)
    
    inline def setPreload(value: Boolean): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
    
    inline def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
    
    inline def setSmoothTileEdgesMinZoom(value: Double): Self = StObject.set(x, "smoothTileEdgesMinZoom", value.asInstanceOf[js.Any])
    
    inline def setSmoothTileEdgesMinZoomUndefined: Self = StObject.set(x, "smoothTileEdgesMinZoom", js.undefined)
    
    inline def setSource(value: TileSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSpringStiffness(value: Double): Self = StObject.set(x, "springStiffness", value.asInstanceOf[js.Any])
    
    inline def setSpringStiffnessUndefined: Self = StObject.set(x, "springStiffness", js.undefined)
    
    inline def setTileCache(value: TileCache): Self = StObject.set(x, "tileCache", value.asInstanceOf[js.Any])
    
    inline def setViewer(value: Viewer): Self = StObject.set(x, "viewer", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setWrapHorizontal(value: Boolean): Self = StObject.set(x, "wrapHorizontal", value.asInstanceOf[js.Any])
    
    inline def setWrapHorizontalUndefined: Self = StObject.set(x, "wrapHorizontal", js.undefined)
    
    inline def setWrapVertical(value: Boolean): Self = StObject.set(x, "wrapVertical", value.asInstanceOf[js.Any])
    
    inline def setWrapVerticalUndefined: Self = StObject.set(x, "wrapVertical", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
