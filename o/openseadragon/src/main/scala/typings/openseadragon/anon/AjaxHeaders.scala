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
import scala.scalajs.js.annotation._

trait AjaxHeaders extends js.Object {
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
  def apply(
    drawer: Drawer,
    imageLoader: ImageLoader,
    source: TileSource,
    tileCache: TileCache,
    viewer: Viewer,
    ajaxHeaders: js.Object = null,
    ajaxWithCredentials: js.UndefOr[Boolean] = js.undefined,
    alwaysBlend: js.UndefOr[Boolean] = js.undefined,
    animationTime: js.UndefOr[Boolean] = js.undefined,
    blendTime: js.UndefOr[Double] = js.undefined,
    clip: Rect = null,
    compositeOperation: String = null,
    crossOriginPolicy: String | Boolean = null,
    debugMode: js.UndefOr[Boolean] = js.undefined,
    fitBounds: Rect = null,
    fitBoundsPlacement: Placement = null,
    height: js.UndefOr[Double] = js.undefined,
    iOSDevice: js.UndefOr[Boolean] = js.undefined,
    immediateRender: js.UndefOr[Boolean] = js.undefined,
    loadTilesWithAjax: js.UndefOr[Boolean] = js.undefined,
    minPixelRatio: js.UndefOr[Double] = js.undefined,
    minZoomImageRatio: js.UndefOr[Double] = js.undefined,
    opacity: js.UndefOr[Double] = js.undefined,
    placeholderFillStyle: String | CanvasGradient | CanvasPattern = null,
    preload: js.UndefOr[Boolean] = js.undefined,
    smoothTileEdgesMinZoom: js.UndefOr[Double] = js.undefined,
    springStiffness: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined,
    wrapHorizontal: js.UndefOr[Boolean] = js.undefined,
    wrapVertical: js.UndefOr[Boolean] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): AjaxHeaders = {
    val __obj = js.Dynamic.literal(drawer = drawer.asInstanceOf[js.Any], imageLoader = imageLoader.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], tileCache = tileCache.asInstanceOf[js.Any], viewer = viewer.asInstanceOf[js.Any])
    if (ajaxHeaders != null) __obj.updateDynamic("ajaxHeaders")(ajaxHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(ajaxWithCredentials)) __obj.updateDynamic("ajaxWithCredentials")(ajaxWithCredentials.get.asInstanceOf[js.Any])
    if (!js.isUndefined(alwaysBlend)) __obj.updateDynamic("alwaysBlend")(alwaysBlend.get.asInstanceOf[js.Any])
    if (!js.isUndefined(animationTime)) __obj.updateDynamic("animationTime")(animationTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(blendTime)) __obj.updateDynamic("blendTime")(blendTime.get.asInstanceOf[js.Any])
    if (clip != null) __obj.updateDynamic("clip")(clip.asInstanceOf[js.Any])
    if (compositeOperation != null) __obj.updateDynamic("compositeOperation")(compositeOperation.asInstanceOf[js.Any])
    if (crossOriginPolicy != null) __obj.updateDynamic("crossOriginPolicy")(crossOriginPolicy.asInstanceOf[js.Any])
    if (!js.isUndefined(debugMode)) __obj.updateDynamic("debugMode")(debugMode.get.asInstanceOf[js.Any])
    if (fitBounds != null) __obj.updateDynamic("fitBounds")(fitBounds.asInstanceOf[js.Any])
    if (fitBoundsPlacement != null) __obj.updateDynamic("fitBoundsPlacement")(fitBoundsPlacement.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(iOSDevice)) __obj.updateDynamic("iOSDevice")(iOSDevice.get.asInstanceOf[js.Any])
    if (!js.isUndefined(immediateRender)) __obj.updateDynamic("immediateRender")(immediateRender.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loadTilesWithAjax)) __obj.updateDynamic("loadTilesWithAjax")(loadTilesWithAjax.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minPixelRatio)) __obj.updateDynamic("minPixelRatio")(minPixelRatio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minZoomImageRatio)) __obj.updateDynamic("minZoomImageRatio")(minZoomImageRatio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (placeholderFillStyle != null) __obj.updateDynamic("placeholderFillStyle")(placeholderFillStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(preload)) __obj.updateDynamic("preload")(preload.get.asInstanceOf[js.Any])
    if (!js.isUndefined(smoothTileEdgesMinZoom)) __obj.updateDynamic("smoothTileEdgesMinZoom")(smoothTileEdgesMinZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(springStiffness)) __obj.updateDynamic("springStiffness")(springStiffness.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapHorizontal)) __obj.updateDynamic("wrapHorizontal")(wrapHorizontal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapVertical)) __obj.updateDynamic("wrapVertical")(wrapVertical.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AjaxHeaders]
  }
}

