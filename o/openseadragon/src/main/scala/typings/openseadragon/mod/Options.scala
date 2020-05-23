package typings.openseadragon.mod

import typings.openseadragon.anon.Image
import typings.openseadragon.anon.Levels
import typings.openseadragon.openseadragonBooleans.`false`
import typings.openseadragon.openseadragonStrings.ABSOLUTE
import typings.openseadragon.openseadragonStrings.Anonymous
import typings.openseadragon.openseadragonStrings.BOTTOM_LEFT
import typings.openseadragon.openseadragonStrings.BOTTOM_RIGHT
import typings.openseadragon.openseadragonStrings.TOP_LEFT
import typings.openseadragon.openseadragonStrings.TOP_RIGHT
import typings.openseadragon.openseadragonStrings.`destination-atop`
import typings.openseadragon.openseadragonStrings.`destination-in`
import typings.openseadragon.openseadragonStrings.`destination-out`
import typings.openseadragon.openseadragonStrings.`destination-over`
import typings.openseadragon.openseadragonStrings.`source-atop`
import typings.openseadragon.openseadragonStrings.`source-in`
import typings.openseadragon.openseadragonStrings.`source-out`
import typings.openseadragon.openseadragonStrings.`source-over`
import typings.openseadragon.openseadragonStrings.`use-credentials`
import typings.openseadragon.openseadragonStrings.copy
import typings.openseadragon.openseadragonStrings.horizontal
import typings.openseadragon.openseadragonStrings.lighter
import typings.openseadragon.openseadragonStrings.vertical
import typings.openseadragon.openseadragonStrings.xor
import typings.std.CanvasGradient
import typings.std.CanvasPattern
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var ajaxHeaders: js.UndefOr[js.Object] = js.undefined
  var ajaxWithCredentials: js.UndefOr[Boolean] = js.undefined
  var alwaysBlend: js.UndefOr[Boolean] = js.undefined
  var animationTime: js.UndefOr[Double] = js.undefined
  var autoHideControls: js.UndefOr[Boolean] = js.undefined
  var autoResize: js.UndefOr[Boolean] = js.undefined
  var blendTime: js.UndefOr[Double] = js.undefined
  var clickDistThreshold: js.UndefOr[Double] = js.undefined
  var clickTimeThreshold: js.UndefOr[Double] = js.undefined
  var collectionColumns: js.UndefOr[Double] = js.undefined
  var collectionLayout: js.UndefOr[horizontal | vertical] = js.undefined
  var collectionMode: js.UndefOr[Boolean] = js.undefined
  var collectionRows: js.UndefOr[Double] = js.undefined
  var collectionTileMargin: js.UndefOr[Double] = js.undefined
  var collectionTileSize: js.UndefOr[Double] = js.undefined
  var compositeOperation: js.UndefOr[
    `source-over` | `source-atop` | `source-in` | `source-out` | `destination-over` | `destination-atop` | `destination-in` | `destination-out` | lighter | copy | xor
  ] = js.undefined
  var constrainDuringPan: js.UndefOr[Boolean] = js.undefined
  var controlsFadeDelay: js.UndefOr[Double] = js.undefined
  var controlsFadeLength: js.UndefOr[Double] = js.undefined
  var crossOriginPolicy: js.UndefOr[Anonymous | `use-credentials` | `false`] = js.undefined
  var dblClickDistThreshold: js.UndefOr[Double] = js.undefined
  var dblClickTimeThreshold: js.UndefOr[Double] = js.undefined
  var debugGridColor: js.UndefOr[js.Array[String]] = js.undefined
  var debugMode: js.UndefOr[Boolean] = js.undefined
  var defaultZoomLevel: js.UndefOr[Double] = js.undefined
  var degrees: js.UndefOr[Double] = js.undefined
  var element: js.UndefOr[HTMLElement] = js.undefined
  var flipped: js.UndefOr[Boolean] = js.undefined
  var fullPageButton: js.UndefOr[String] = js.undefined
  var gestureSettingsMouse: js.UndefOr[GestureSettings] = js.undefined
  var gestureSettingsPen: js.UndefOr[GestureSettings] = js.undefined
  var gestureSettingsTouch: js.UndefOr[GestureSettings] = js.undefined
  var gestureSettingsUnknown: js.UndefOr[GestureSettings] = js.undefined
  var homeButton: js.UndefOr[String] = js.undefined
  var homeFillsViewer: js.UndefOr[Boolean] = js.undefined
  var iOSDevice: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var imageLoaderLimit: js.UndefOr[Double] = js.undefined
  var imageSmoothingEnabled: js.UndefOr[Boolean] = js.undefined
  var initialPage: js.UndefOr[Boolean] = js.undefined
  var inmediateRender: js.UndefOr[Boolean] = js.undefined
  var loadTilesWithAjax: js.UndefOr[Boolean] = js.undefined
  var maxImageCacheCount: js.UndefOr[Double] = js.undefined
  var maxZoomLevel: js.UndefOr[Double] = js.undefined
  var maxZoomPixelRatio: js.UndefOr[Double] = js.undefined
  var minPixelRatio: js.UndefOr[Double] = js.undefined
  var minScrollDeltaTime: js.UndefOr[Double] = js.undefined
  var minZoomImageRatio: js.UndefOr[Double] = js.undefined
  var minZoomLevel: js.UndefOr[Double] = js.undefined
  var mouseNavEnabled: js.UndefOr[Double] = js.undefined
  var navImages: js.UndefOr[NavImages] = js.undefined
  var navPrevNextWrap: js.UndefOr[Boolean] = js.undefined
  var navigationControlAnchor: js.UndefOr[ControlAnchor] = js.undefined
  var navigatorAutoFade: js.UndefOr[Boolean] = js.undefined
  var navigatorAutoResize: js.UndefOr[Boolean] = js.undefined
  var navigatorBackground: js.UndefOr[String] = js.undefined
  var navigatorBorderColor: js.UndefOr[String] = js.undefined
  var navigatorDisplayRegionColor: js.UndefOr[String] = js.undefined
  var navigatorHeight: js.UndefOr[Double | String] = js.undefined
  var navigatorId: js.UndefOr[String] = js.undefined
  var navigatorLeft: js.UndefOr[Double | String] = js.undefined
  var navigatorMaintainSizeRatio: js.UndefOr[Boolean] = js.undefined
  var navigatorOpacity: js.UndefOr[Double] = js.undefined
  var navigatorPosition: js.UndefOr[TOP_LEFT | TOP_RIGHT | BOTTOM_LEFT | BOTTOM_RIGHT | ABSOLUTE] = js.undefined
  var navigatorRotate: js.UndefOr[Boolean] = js.undefined
  var navigatorSizeRatio: js.UndefOr[Double] = js.undefined
  var navigatorTop: js.UndefOr[Double | String] = js.undefined
  var navigatorWidth: js.UndefOr[Double | String] = js.undefined
  var nextButton: js.UndefOr[String] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var overlays: js.UndefOr[js.Array[_]] = js.undefined
  var panHorizontal: js.UndefOr[Boolean] = js.undefined
  var panVertical: js.UndefOr[Boolean] = js.undefined
  var pixelsPerArrowPress: js.UndefOr[Double] = js.undefined
  var pixelsPerWheelLine: js.UndefOr[Double] = js.undefined
  var placeholderFillStyle: js.UndefOr[String | CanvasGradient | CanvasPattern] = js.undefined
  var prefixUrl: js.UndefOr[String] = js.undefined
  var preload: js.UndefOr[Boolean] = js.undefined
  var preserveImageSizeOnResize: js.UndefOr[Boolean] = js.undefined
  var preserveOverlays: js.UndefOr[Boolean] = js.undefined
  var preserveViewport: js.UndefOr[Boolean] = js.undefined
  var previousButton: js.UndefOr[String] = js.undefined
  var referenceStripElement: js.UndefOr[HTMLElement] = js.undefined
  var referenceStripHeight: js.UndefOr[Double] = js.undefined
  var referenceStripPosition: js.UndefOr[String] = js.undefined
  var referenceStripScroll: js.UndefOr[String] = js.undefined
  var referenceStripSizeRatio: js.UndefOr[Double] = js.undefined
  var referenceStripWidth: js.UndefOr[Double] = js.undefined
  var rotateLeftButton: js.UndefOr[String] = js.undefined
  var rotateRightButton: js.UndefOr[String] = js.undefined
  var sequenceControlAnchor: js.UndefOr[ControlAnchor] = js.undefined
  var sequenceMode: js.UndefOr[Boolean] = js.undefined
  var showFlipControl: js.UndefOr[Boolean] = js.undefined
  var showFullPageControl: js.UndefOr[Boolean] = js.undefined
  var showHomeControl: js.UndefOr[Boolean] = js.undefined
  var showNavigationControl: js.UndefOr[Boolean] = js.undefined
  var showNavigator: js.UndefOr[Boolean] = js.undefined
  var showReferenceStrip: js.UndefOr[Boolean] = js.undefined
  var showRotationControl: js.UndefOr[Boolean] = js.undefined
  var showSequenceControl: js.UndefOr[Boolean] = js.undefined
  var showZoomControl: js.UndefOr[Boolean] = js.undefined
  var smoothTileEdgesMinZoom: js.UndefOr[Double] = js.undefined
  var springStiffness: js.UndefOr[Double] = js.undefined
  var tabIndex: js.UndefOr[Double] = js.undefined
  var tileSources: js.UndefOr[String | (js.Array[String | TileSource]) | TileSourceOptions | Levels | Image] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var useCanvas: js.UndefOr[Boolean] = js.undefined
  var viewportMargins: js.UndefOr[js.Object] = js.undefined
  var visibilityRatio: js.UndefOr[Double] = js.undefined
  var wrapHorizontal: js.UndefOr[Boolean] = js.undefined
  var wrapVertical: js.UndefOr[Boolean] = js.undefined
  var zoomInButton: js.UndefOr[String] = js.undefined
  var zoomOutButton: js.UndefOr[String] = js.undefined
  var zoomPerClick: js.UndefOr[Double] = js.undefined
  var zoomPerScroll: js.UndefOr[Double] = js.undefined
  var zoomPerSecond: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    ajaxHeaders: js.Object = null,
    ajaxWithCredentials: js.UndefOr[Boolean] = js.undefined,
    alwaysBlend: js.UndefOr[Boolean] = js.undefined,
    animationTime: js.UndefOr[Double] = js.undefined,
    autoHideControls: js.UndefOr[Boolean] = js.undefined,
    autoResize: js.UndefOr[Boolean] = js.undefined,
    blendTime: js.UndefOr[Double] = js.undefined,
    clickDistThreshold: js.UndefOr[Double] = js.undefined,
    clickTimeThreshold: js.UndefOr[Double] = js.undefined,
    collectionColumns: js.UndefOr[Double] = js.undefined,
    collectionLayout: horizontal | vertical = null,
    collectionMode: js.UndefOr[Boolean] = js.undefined,
    collectionRows: js.UndefOr[Double] = js.undefined,
    collectionTileMargin: js.UndefOr[Double] = js.undefined,
    collectionTileSize: js.UndefOr[Double] = js.undefined,
    compositeOperation: `source-over` | `source-atop` | `source-in` | `source-out` | `destination-over` | `destination-atop` | `destination-in` | `destination-out` | lighter | copy | xor = null,
    constrainDuringPan: js.UndefOr[Boolean] = js.undefined,
    controlsFadeDelay: js.UndefOr[Double] = js.undefined,
    controlsFadeLength: js.UndefOr[Double] = js.undefined,
    crossOriginPolicy: Anonymous | `use-credentials` | `false` = null,
    dblClickDistThreshold: js.UndefOr[Double] = js.undefined,
    dblClickTimeThreshold: js.UndefOr[Double] = js.undefined,
    debugGridColor: js.Array[String] = null,
    debugMode: js.UndefOr[Boolean] = js.undefined,
    defaultZoomLevel: js.UndefOr[Double] = js.undefined,
    degrees: js.UndefOr[Double] = js.undefined,
    element: HTMLElement = null,
    flipped: js.UndefOr[Boolean] = js.undefined,
    fullPageButton: String = null,
    gestureSettingsMouse: GestureSettings = null,
    gestureSettingsPen: GestureSettings = null,
    gestureSettingsTouch: GestureSettings = null,
    gestureSettingsUnknown: GestureSettings = null,
    homeButton: String = null,
    homeFillsViewer: js.UndefOr[Boolean] = js.undefined,
    iOSDevice: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    imageLoaderLimit: js.UndefOr[Double] = js.undefined,
    imageSmoothingEnabled: js.UndefOr[Boolean] = js.undefined,
    initialPage: js.UndefOr[Boolean] = js.undefined,
    inmediateRender: js.UndefOr[Boolean] = js.undefined,
    loadTilesWithAjax: js.UndefOr[Boolean] = js.undefined,
    maxImageCacheCount: js.UndefOr[Double] = js.undefined,
    maxZoomLevel: js.UndefOr[Double] = js.undefined,
    maxZoomPixelRatio: js.UndefOr[Double] = js.undefined,
    minPixelRatio: js.UndefOr[Double] = js.undefined,
    minScrollDeltaTime: js.UndefOr[Double] = js.undefined,
    minZoomImageRatio: js.UndefOr[Double] = js.undefined,
    minZoomLevel: js.UndefOr[Double] = js.undefined,
    mouseNavEnabled: js.UndefOr[Double] = js.undefined,
    navImages: NavImages = null,
    navPrevNextWrap: js.UndefOr[Boolean] = js.undefined,
    navigationControlAnchor: ControlAnchor = null,
    navigatorAutoFade: js.UndefOr[Boolean] = js.undefined,
    navigatorAutoResize: js.UndefOr[Boolean] = js.undefined,
    navigatorBackground: String = null,
    navigatorBorderColor: String = null,
    navigatorDisplayRegionColor: String = null,
    navigatorHeight: Double | String = null,
    navigatorId: String = null,
    navigatorLeft: Double | String = null,
    navigatorMaintainSizeRatio: js.UndefOr[Boolean] = js.undefined,
    navigatorOpacity: js.UndefOr[Double] = js.undefined,
    navigatorPosition: TOP_LEFT | TOP_RIGHT | BOTTOM_LEFT | BOTTOM_RIGHT | ABSOLUTE = null,
    navigatorRotate: js.UndefOr[Boolean] = js.undefined,
    navigatorSizeRatio: js.UndefOr[Double] = js.undefined,
    navigatorTop: Double | String = null,
    navigatorWidth: Double | String = null,
    nextButton: String = null,
    opacity: js.UndefOr[Double] = js.undefined,
    overlays: js.Array[_] = null,
    panHorizontal: js.UndefOr[Boolean] = js.undefined,
    panVertical: js.UndefOr[Boolean] = js.undefined,
    pixelsPerArrowPress: js.UndefOr[Double] = js.undefined,
    pixelsPerWheelLine: js.UndefOr[Double] = js.undefined,
    placeholderFillStyle: String | CanvasGradient | CanvasPattern = null,
    prefixUrl: String = null,
    preload: js.UndefOr[Boolean] = js.undefined,
    preserveImageSizeOnResize: js.UndefOr[Boolean] = js.undefined,
    preserveOverlays: js.UndefOr[Boolean] = js.undefined,
    preserveViewport: js.UndefOr[Boolean] = js.undefined,
    previousButton: String = null,
    referenceStripElement: HTMLElement = null,
    referenceStripHeight: js.UndefOr[Double] = js.undefined,
    referenceStripPosition: String = null,
    referenceStripScroll: String = null,
    referenceStripSizeRatio: js.UndefOr[Double] = js.undefined,
    referenceStripWidth: js.UndefOr[Double] = js.undefined,
    rotateLeftButton: String = null,
    rotateRightButton: String = null,
    sequenceControlAnchor: ControlAnchor = null,
    sequenceMode: js.UndefOr[Boolean] = js.undefined,
    showFlipControl: js.UndefOr[Boolean] = js.undefined,
    showFullPageControl: js.UndefOr[Boolean] = js.undefined,
    showHomeControl: js.UndefOr[Boolean] = js.undefined,
    showNavigationControl: js.UndefOr[Boolean] = js.undefined,
    showNavigator: js.UndefOr[Boolean] = js.undefined,
    showReferenceStrip: js.UndefOr[Boolean] = js.undefined,
    showRotationControl: js.UndefOr[Boolean] = js.undefined,
    showSequenceControl: js.UndefOr[Boolean] = js.undefined,
    showZoomControl: js.UndefOr[Boolean] = js.undefined,
    smoothTileEdgesMinZoom: js.UndefOr[Double] = js.undefined,
    springStiffness: js.UndefOr[Double] = js.undefined,
    tabIndex: js.UndefOr[Double] = js.undefined,
    tileSources: String | (js.Array[String | TileSource]) | TileSourceOptions | Levels | Image = null,
    timeout: js.UndefOr[Double] = js.undefined,
    useCanvas: js.UndefOr[Boolean] = js.undefined,
    viewportMargins: js.Object = null,
    visibilityRatio: js.UndefOr[Double] = js.undefined,
    wrapHorizontal: js.UndefOr[Boolean] = js.undefined,
    wrapVertical: js.UndefOr[Boolean] = js.undefined,
    zoomInButton: String = null,
    zoomOutButton: String = null,
    zoomPerClick: js.UndefOr[Double] = js.undefined,
    zoomPerScroll: js.UndefOr[Double] = js.undefined,
    zoomPerSecond: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (ajaxHeaders != null) __obj.updateDynamic("ajaxHeaders")(ajaxHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(ajaxWithCredentials)) __obj.updateDynamic("ajaxWithCredentials")(ajaxWithCredentials.get.asInstanceOf[js.Any])
    if (!js.isUndefined(alwaysBlend)) __obj.updateDynamic("alwaysBlend")(alwaysBlend.get.asInstanceOf[js.Any])
    if (!js.isUndefined(animationTime)) __obj.updateDynamic("animationTime")(animationTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoHideControls)) __obj.updateDynamic("autoHideControls")(autoHideControls.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoResize)) __obj.updateDynamic("autoResize")(autoResize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(blendTime)) __obj.updateDynamic("blendTime")(blendTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(clickDistThreshold)) __obj.updateDynamic("clickDistThreshold")(clickDistThreshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(clickTimeThreshold)) __obj.updateDynamic("clickTimeThreshold")(clickTimeThreshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(collectionColumns)) __obj.updateDynamic("collectionColumns")(collectionColumns.get.asInstanceOf[js.Any])
    if (collectionLayout != null) __obj.updateDynamic("collectionLayout")(collectionLayout.asInstanceOf[js.Any])
    if (!js.isUndefined(collectionMode)) __obj.updateDynamic("collectionMode")(collectionMode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(collectionRows)) __obj.updateDynamic("collectionRows")(collectionRows.get.asInstanceOf[js.Any])
    if (!js.isUndefined(collectionTileMargin)) __obj.updateDynamic("collectionTileMargin")(collectionTileMargin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(collectionTileSize)) __obj.updateDynamic("collectionTileSize")(collectionTileSize.get.asInstanceOf[js.Any])
    if (compositeOperation != null) __obj.updateDynamic("compositeOperation")(compositeOperation.asInstanceOf[js.Any])
    if (!js.isUndefined(constrainDuringPan)) __obj.updateDynamic("constrainDuringPan")(constrainDuringPan.get.asInstanceOf[js.Any])
    if (!js.isUndefined(controlsFadeDelay)) __obj.updateDynamic("controlsFadeDelay")(controlsFadeDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(controlsFadeLength)) __obj.updateDynamic("controlsFadeLength")(controlsFadeLength.get.asInstanceOf[js.Any])
    if (crossOriginPolicy != null) __obj.updateDynamic("crossOriginPolicy")(crossOriginPolicy.asInstanceOf[js.Any])
    if (!js.isUndefined(dblClickDistThreshold)) __obj.updateDynamic("dblClickDistThreshold")(dblClickDistThreshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dblClickTimeThreshold)) __obj.updateDynamic("dblClickTimeThreshold")(dblClickTimeThreshold.get.asInstanceOf[js.Any])
    if (debugGridColor != null) __obj.updateDynamic("debugGridColor")(debugGridColor.asInstanceOf[js.Any])
    if (!js.isUndefined(debugMode)) __obj.updateDynamic("debugMode")(debugMode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultZoomLevel)) __obj.updateDynamic("defaultZoomLevel")(defaultZoomLevel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(degrees)) __obj.updateDynamic("degrees")(degrees.get.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (!js.isUndefined(flipped)) __obj.updateDynamic("flipped")(flipped.get.asInstanceOf[js.Any])
    if (fullPageButton != null) __obj.updateDynamic("fullPageButton")(fullPageButton.asInstanceOf[js.Any])
    if (gestureSettingsMouse != null) __obj.updateDynamic("gestureSettingsMouse")(gestureSettingsMouse.asInstanceOf[js.Any])
    if (gestureSettingsPen != null) __obj.updateDynamic("gestureSettingsPen")(gestureSettingsPen.asInstanceOf[js.Any])
    if (gestureSettingsTouch != null) __obj.updateDynamic("gestureSettingsTouch")(gestureSettingsTouch.asInstanceOf[js.Any])
    if (gestureSettingsUnknown != null) __obj.updateDynamic("gestureSettingsUnknown")(gestureSettingsUnknown.asInstanceOf[js.Any])
    if (homeButton != null) __obj.updateDynamic("homeButton")(homeButton.asInstanceOf[js.Any])
    if (!js.isUndefined(homeFillsViewer)) __obj.updateDynamic("homeFillsViewer")(homeFillsViewer.get.asInstanceOf[js.Any])
    if (!js.isUndefined(iOSDevice)) __obj.updateDynamic("iOSDevice")(iOSDevice.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(imageLoaderLimit)) __obj.updateDynamic("imageLoaderLimit")(imageLoaderLimit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(imageSmoothingEnabled)) __obj.updateDynamic("imageSmoothingEnabled")(imageSmoothingEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(initialPage)) __obj.updateDynamic("initialPage")(initialPage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inmediateRender)) __obj.updateDynamic("inmediateRender")(inmediateRender.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loadTilesWithAjax)) __obj.updateDynamic("loadTilesWithAjax")(loadTilesWithAjax.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxImageCacheCount)) __obj.updateDynamic("maxImageCacheCount")(maxImageCacheCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxZoomLevel)) __obj.updateDynamic("maxZoomLevel")(maxZoomLevel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxZoomPixelRatio)) __obj.updateDynamic("maxZoomPixelRatio")(maxZoomPixelRatio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minPixelRatio)) __obj.updateDynamic("minPixelRatio")(minPixelRatio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minScrollDeltaTime)) __obj.updateDynamic("minScrollDeltaTime")(minScrollDeltaTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minZoomImageRatio)) __obj.updateDynamic("minZoomImageRatio")(minZoomImageRatio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minZoomLevel)) __obj.updateDynamic("minZoomLevel")(minZoomLevel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mouseNavEnabled)) __obj.updateDynamic("mouseNavEnabled")(mouseNavEnabled.get.asInstanceOf[js.Any])
    if (navImages != null) __obj.updateDynamic("navImages")(navImages.asInstanceOf[js.Any])
    if (!js.isUndefined(navPrevNextWrap)) __obj.updateDynamic("navPrevNextWrap")(navPrevNextWrap.get.asInstanceOf[js.Any])
    if (navigationControlAnchor != null) __obj.updateDynamic("navigationControlAnchor")(navigationControlAnchor.asInstanceOf[js.Any])
    if (!js.isUndefined(navigatorAutoFade)) __obj.updateDynamic("navigatorAutoFade")(navigatorAutoFade.get.asInstanceOf[js.Any])
    if (!js.isUndefined(navigatorAutoResize)) __obj.updateDynamic("navigatorAutoResize")(navigatorAutoResize.get.asInstanceOf[js.Any])
    if (navigatorBackground != null) __obj.updateDynamic("navigatorBackground")(navigatorBackground.asInstanceOf[js.Any])
    if (navigatorBorderColor != null) __obj.updateDynamic("navigatorBorderColor")(navigatorBorderColor.asInstanceOf[js.Any])
    if (navigatorDisplayRegionColor != null) __obj.updateDynamic("navigatorDisplayRegionColor")(navigatorDisplayRegionColor.asInstanceOf[js.Any])
    if (navigatorHeight != null) __obj.updateDynamic("navigatorHeight")(navigatorHeight.asInstanceOf[js.Any])
    if (navigatorId != null) __obj.updateDynamic("navigatorId")(navigatorId.asInstanceOf[js.Any])
    if (navigatorLeft != null) __obj.updateDynamic("navigatorLeft")(navigatorLeft.asInstanceOf[js.Any])
    if (!js.isUndefined(navigatorMaintainSizeRatio)) __obj.updateDynamic("navigatorMaintainSizeRatio")(navigatorMaintainSizeRatio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(navigatorOpacity)) __obj.updateDynamic("navigatorOpacity")(navigatorOpacity.get.asInstanceOf[js.Any])
    if (navigatorPosition != null) __obj.updateDynamic("navigatorPosition")(navigatorPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(navigatorRotate)) __obj.updateDynamic("navigatorRotate")(navigatorRotate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(navigatorSizeRatio)) __obj.updateDynamic("navigatorSizeRatio")(navigatorSizeRatio.get.asInstanceOf[js.Any])
    if (navigatorTop != null) __obj.updateDynamic("navigatorTop")(navigatorTop.asInstanceOf[js.Any])
    if (navigatorWidth != null) __obj.updateDynamic("navigatorWidth")(navigatorWidth.asInstanceOf[js.Any])
    if (nextButton != null) __obj.updateDynamic("nextButton")(nextButton.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (overlays != null) __obj.updateDynamic("overlays")(overlays.asInstanceOf[js.Any])
    if (!js.isUndefined(panHorizontal)) __obj.updateDynamic("panHorizontal")(panHorizontal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(panVertical)) __obj.updateDynamic("panVertical")(panVertical.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pixelsPerArrowPress)) __obj.updateDynamic("pixelsPerArrowPress")(pixelsPerArrowPress.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pixelsPerWheelLine)) __obj.updateDynamic("pixelsPerWheelLine")(pixelsPerWheelLine.get.asInstanceOf[js.Any])
    if (placeholderFillStyle != null) __obj.updateDynamic("placeholderFillStyle")(placeholderFillStyle.asInstanceOf[js.Any])
    if (prefixUrl != null) __obj.updateDynamic("prefixUrl")(prefixUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(preload)) __obj.updateDynamic("preload")(preload.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveImageSizeOnResize)) __obj.updateDynamic("preserveImageSizeOnResize")(preserveImageSizeOnResize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveOverlays)) __obj.updateDynamic("preserveOverlays")(preserveOverlays.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveViewport)) __obj.updateDynamic("preserveViewport")(preserveViewport.get.asInstanceOf[js.Any])
    if (previousButton != null) __obj.updateDynamic("previousButton")(previousButton.asInstanceOf[js.Any])
    if (referenceStripElement != null) __obj.updateDynamic("referenceStripElement")(referenceStripElement.asInstanceOf[js.Any])
    if (!js.isUndefined(referenceStripHeight)) __obj.updateDynamic("referenceStripHeight")(referenceStripHeight.get.asInstanceOf[js.Any])
    if (referenceStripPosition != null) __obj.updateDynamic("referenceStripPosition")(referenceStripPosition.asInstanceOf[js.Any])
    if (referenceStripScroll != null) __obj.updateDynamic("referenceStripScroll")(referenceStripScroll.asInstanceOf[js.Any])
    if (!js.isUndefined(referenceStripSizeRatio)) __obj.updateDynamic("referenceStripSizeRatio")(referenceStripSizeRatio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(referenceStripWidth)) __obj.updateDynamic("referenceStripWidth")(referenceStripWidth.get.asInstanceOf[js.Any])
    if (rotateLeftButton != null) __obj.updateDynamic("rotateLeftButton")(rotateLeftButton.asInstanceOf[js.Any])
    if (rotateRightButton != null) __obj.updateDynamic("rotateRightButton")(rotateRightButton.asInstanceOf[js.Any])
    if (sequenceControlAnchor != null) __obj.updateDynamic("sequenceControlAnchor")(sequenceControlAnchor.asInstanceOf[js.Any])
    if (!js.isUndefined(sequenceMode)) __obj.updateDynamic("sequenceMode")(sequenceMode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showFlipControl)) __obj.updateDynamic("showFlipControl")(showFlipControl.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showFullPageControl)) __obj.updateDynamic("showFullPageControl")(showFullPageControl.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showHomeControl)) __obj.updateDynamic("showHomeControl")(showHomeControl.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showNavigationControl)) __obj.updateDynamic("showNavigationControl")(showNavigationControl.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showNavigator)) __obj.updateDynamic("showNavigator")(showNavigator.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showReferenceStrip)) __obj.updateDynamic("showReferenceStrip")(showReferenceStrip.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showRotationControl)) __obj.updateDynamic("showRotationControl")(showRotationControl.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showSequenceControl)) __obj.updateDynamic("showSequenceControl")(showSequenceControl.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showZoomControl)) __obj.updateDynamic("showZoomControl")(showZoomControl.get.asInstanceOf[js.Any])
    if (!js.isUndefined(smoothTileEdgesMinZoom)) __obj.updateDynamic("smoothTileEdgesMinZoom")(smoothTileEdgesMinZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(springStiffness)) __obj.updateDynamic("springStiffness")(springStiffness.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tabIndex)) __obj.updateDynamic("tabIndex")(tabIndex.get.asInstanceOf[js.Any])
    if (tileSources != null) __obj.updateDynamic("tileSources")(tileSources.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useCanvas)) __obj.updateDynamic("useCanvas")(useCanvas.get.asInstanceOf[js.Any])
    if (viewportMargins != null) __obj.updateDynamic("viewportMargins")(viewportMargins.asInstanceOf[js.Any])
    if (!js.isUndefined(visibilityRatio)) __obj.updateDynamic("visibilityRatio")(visibilityRatio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapHorizontal)) __obj.updateDynamic("wrapHorizontal")(wrapHorizontal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapVertical)) __obj.updateDynamic("wrapVertical")(wrapVertical.get.asInstanceOf[js.Any])
    if (zoomInButton != null) __obj.updateDynamic("zoomInButton")(zoomInButton.asInstanceOf[js.Any])
    if (zoomOutButton != null) __obj.updateDynamic("zoomOutButton")(zoomOutButton.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomPerClick)) __obj.updateDynamic("zoomPerClick")(zoomPerClick.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomPerScroll)) __obj.updateDynamic("zoomPerScroll")(zoomPerScroll.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomPerSecond)) __obj.updateDynamic("zoomPerSecond")(zoomPerSecond.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

