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

@js.native
trait Options extends js.Object {
  var ajaxHeaders: js.UndefOr[js.Object] = js.native
  var ajaxWithCredentials: js.UndefOr[Boolean] = js.native
  var alwaysBlend: js.UndefOr[Boolean] = js.native
  var animationTime: js.UndefOr[Double] = js.native
  var autoHideControls: js.UndefOr[Boolean] = js.native
  var autoResize: js.UndefOr[Boolean] = js.native
  var blendTime: js.UndefOr[Double] = js.native
  var clickDistThreshold: js.UndefOr[Double] = js.native
  var clickTimeThreshold: js.UndefOr[Double] = js.native
  var collectionColumns: js.UndefOr[Double] = js.native
  var collectionLayout: js.UndefOr[horizontal | vertical] = js.native
  var collectionMode: js.UndefOr[Boolean] = js.native
  var collectionRows: js.UndefOr[Double] = js.native
  var collectionTileMargin: js.UndefOr[Double] = js.native
  var collectionTileSize: js.UndefOr[Double] = js.native
  var compositeOperation: js.UndefOr[
    `source-over` | `source-atop` | `source-in` | `source-out` | `destination-over` | `destination-atop` | `destination-in` | `destination-out` | lighter | copy | xor
  ] = js.native
  var constrainDuringPan: js.UndefOr[Boolean] = js.native
  var controlsFadeDelay: js.UndefOr[Double] = js.native
  var controlsFadeLength: js.UndefOr[Double] = js.native
  var crossOriginPolicy: js.UndefOr[Anonymous | `use-credentials` | `false`] = js.native
  var dblClickDistThreshold: js.UndefOr[Double] = js.native
  var dblClickTimeThreshold: js.UndefOr[Double] = js.native
  var debugGridColor: js.UndefOr[js.Array[String]] = js.native
  var debugMode: js.UndefOr[Boolean] = js.native
  var defaultZoomLevel: js.UndefOr[Double] = js.native
  var degrees: js.UndefOr[Double] = js.native
  var element: js.UndefOr[HTMLElement] = js.native
  var flipped: js.UndefOr[Boolean] = js.native
  var fullPageButton: js.UndefOr[String] = js.native
  var gestureSettingsMouse: js.UndefOr[GestureSettings] = js.native
  var gestureSettingsPen: js.UndefOr[GestureSettings] = js.native
  var gestureSettingsTouch: js.UndefOr[GestureSettings] = js.native
  var gestureSettingsUnknown: js.UndefOr[GestureSettings] = js.native
  var homeButton: js.UndefOr[String] = js.native
  var homeFillsViewer: js.UndefOr[Boolean] = js.native
  var iOSDevice: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var imageLoaderLimit: js.UndefOr[Double] = js.native
  var imageSmoothingEnabled: js.UndefOr[Boolean] = js.native
  var immediateRender: js.UndefOr[Boolean] = js.native
  /**
    * If sequenceMode is true, display this page initially.
    * @default 0
    */
  var initialPage: js.UndefOr[Double] = js.native
  var loadTilesWithAjax: js.UndefOr[Boolean] = js.native
  var maxImageCacheCount: js.UndefOr[Double] = js.native
  var maxZoomLevel: js.UndefOr[Double] = js.native
  var maxZoomPixelRatio: js.UndefOr[Double] = js.native
  var minPixelRatio: js.UndefOr[Double] = js.native
  var minScrollDeltaTime: js.UndefOr[Double] = js.native
  var minZoomImageRatio: js.UndefOr[Double] = js.native
  var minZoomLevel: js.UndefOr[Double] = js.native
  var mouseNavEnabled: js.UndefOr[Double] = js.native
  var navImages: js.UndefOr[NavImages] = js.native
  var navPrevNextWrap: js.UndefOr[Boolean] = js.native
  var navigationControlAnchor: js.UndefOr[ControlAnchor] = js.native
  var navigatorAutoFade: js.UndefOr[Boolean] = js.native
  var navigatorAutoResize: js.UndefOr[Boolean] = js.native
  var navigatorBackground: js.UndefOr[String] = js.native
  var navigatorBorderColor: js.UndefOr[String] = js.native
  var navigatorDisplayRegionColor: js.UndefOr[String] = js.native
  var navigatorHeight: js.UndefOr[Double | String] = js.native
  var navigatorId: js.UndefOr[String] = js.native
  var navigatorLeft: js.UndefOr[Double | String] = js.native
  var navigatorMaintainSizeRatio: js.UndefOr[Boolean] = js.native
  var navigatorOpacity: js.UndefOr[Double] = js.native
  var navigatorPosition: js.UndefOr[TOP_LEFT | TOP_RIGHT | BOTTOM_LEFT | BOTTOM_RIGHT | ABSOLUTE] = js.native
  var navigatorRotate: js.UndefOr[Boolean] = js.native
  var navigatorSizeRatio: js.UndefOr[Double] = js.native
  var navigatorTop: js.UndefOr[Double | String] = js.native
  var navigatorWidth: js.UndefOr[Double | String] = js.native
  var nextButton: js.UndefOr[String] = js.native
  var opacity: js.UndefOr[Double] = js.native
  var overlays: js.UndefOr[js.Array[_]] = js.native
  var panHorizontal: js.UndefOr[Boolean] = js.native
  var panVertical: js.UndefOr[Boolean] = js.native
  var pixelsPerArrowPress: js.UndefOr[Double] = js.native
  var pixelsPerWheelLine: js.UndefOr[Double] = js.native
  var placeholderFillStyle: js.UndefOr[String | CanvasGradient | CanvasPattern] = js.native
  var prefixUrl: js.UndefOr[String] = js.native
  var preload: js.UndefOr[Boolean] = js.native
  var preserveImageSizeOnResize: js.UndefOr[Boolean] = js.native
  var preserveOverlays: js.UndefOr[Boolean] = js.native
  var preserveViewport: js.UndefOr[Boolean] = js.native
  var previousButton: js.UndefOr[String] = js.native
  var referenceStripElement: js.UndefOr[HTMLElement] = js.native
  var referenceStripHeight: js.UndefOr[Double] = js.native
  var referenceStripPosition: js.UndefOr[String] = js.native
  var referenceStripScroll: js.UndefOr[String] = js.native
  var referenceStripSizeRatio: js.UndefOr[Double] = js.native
  var referenceStripWidth: js.UndefOr[Double] = js.native
  var rotateLeftButton: js.UndefOr[String] = js.native
  var rotateRightButton: js.UndefOr[String] = js.native
  var rotationIncrement: js.UndefOr[Double] = js.native
  var sequenceControlAnchor: js.UndefOr[ControlAnchor] = js.native
  var sequenceMode: js.UndefOr[Boolean] = js.native
  var showFlipControl: js.UndefOr[Boolean] = js.native
  var showFullPageControl: js.UndefOr[Boolean] = js.native
  var showHomeControl: js.UndefOr[Boolean] = js.native
  var showNavigationControl: js.UndefOr[Boolean] = js.native
  var showNavigator: js.UndefOr[Boolean] = js.native
  var showReferenceStrip: js.UndefOr[Boolean] = js.native
  var showRotationControl: js.UndefOr[Boolean] = js.native
  var showSequenceControl: js.UndefOr[Boolean] = js.native
  var showZoomControl: js.UndefOr[Boolean] = js.native
  var smoothTileEdgesMinZoom: js.UndefOr[Double] = js.native
  var springStiffness: js.UndefOr[Double] = js.native
  var tabIndex: js.UndefOr[Double] = js.native
  var tileSources: js.UndefOr[String | (js.Array[String | TileSource]) | TileSourceOptions | Levels | Image] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var useCanvas: js.UndefOr[Boolean] = js.native
  var viewportMargins: js.UndefOr[js.Object] = js.native
  var visibilityRatio: js.UndefOr[Double] = js.native
  var wrapHorizontal: js.UndefOr[Boolean] = js.native
  var wrapVertical: js.UndefOr[Boolean] = js.native
  var zoomInButton: js.UndefOr[String] = js.native
  var zoomOutButton: js.UndefOr[String] = js.native
  var zoomPerClick: js.UndefOr[Double] = js.native
  var zoomPerScroll: js.UndefOr[Double] = js.native
  var zoomPerSecond: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setAnimationTime(value: Double): Self = this.set("animationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationTime: Self = this.set("animationTime", js.undefined)
    @scala.inline
    def setAutoHideControls(value: Boolean): Self = this.set("autoHideControls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoHideControls: Self = this.set("autoHideControls", js.undefined)
    @scala.inline
    def setAutoResize(value: Boolean): Self = this.set("autoResize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoResize: Self = this.set("autoResize", js.undefined)
    @scala.inline
    def setBlendTime(value: Double): Self = this.set("blendTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlendTime: Self = this.set("blendTime", js.undefined)
    @scala.inline
    def setClickDistThreshold(value: Double): Self = this.set("clickDistThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickDistThreshold: Self = this.set("clickDistThreshold", js.undefined)
    @scala.inline
    def setClickTimeThreshold(value: Double): Self = this.set("clickTimeThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickTimeThreshold: Self = this.set("clickTimeThreshold", js.undefined)
    @scala.inline
    def setCollectionColumns(value: Double): Self = this.set("collectionColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollectionColumns: Self = this.set("collectionColumns", js.undefined)
    @scala.inline
    def setCollectionLayout(value: horizontal | vertical): Self = this.set("collectionLayout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollectionLayout: Self = this.set("collectionLayout", js.undefined)
    @scala.inline
    def setCollectionMode(value: Boolean): Self = this.set("collectionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollectionMode: Self = this.set("collectionMode", js.undefined)
    @scala.inline
    def setCollectionRows(value: Double): Self = this.set("collectionRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollectionRows: Self = this.set("collectionRows", js.undefined)
    @scala.inline
    def setCollectionTileMargin(value: Double): Self = this.set("collectionTileMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollectionTileMargin: Self = this.set("collectionTileMargin", js.undefined)
    @scala.inline
    def setCollectionTileSize(value: Double): Self = this.set("collectionTileSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollectionTileSize: Self = this.set("collectionTileSize", js.undefined)
    @scala.inline
    def setCompositeOperation(
      value: `source-over` | `source-atop` | `source-in` | `source-out` | `destination-over` | `destination-atop` | `destination-in` | `destination-out` | lighter | copy | xor
    ): Self = this.set("compositeOperation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompositeOperation: Self = this.set("compositeOperation", js.undefined)
    @scala.inline
    def setConstrainDuringPan(value: Boolean): Self = this.set("constrainDuringPan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConstrainDuringPan: Self = this.set("constrainDuringPan", js.undefined)
    @scala.inline
    def setControlsFadeDelay(value: Double): Self = this.set("controlsFadeDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControlsFadeDelay: Self = this.set("controlsFadeDelay", js.undefined)
    @scala.inline
    def setControlsFadeLength(value: Double): Self = this.set("controlsFadeLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControlsFadeLength: Self = this.set("controlsFadeLength", js.undefined)
    @scala.inline
    def setCrossOriginPolicy(value: Anonymous | `use-credentials` | `false`): Self = this.set("crossOriginPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrossOriginPolicy: Self = this.set("crossOriginPolicy", js.undefined)
    @scala.inline
    def setDblClickDistThreshold(value: Double): Self = this.set("dblClickDistThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDblClickDistThreshold: Self = this.set("dblClickDistThreshold", js.undefined)
    @scala.inline
    def setDblClickTimeThreshold(value: Double): Self = this.set("dblClickTimeThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDblClickTimeThreshold: Self = this.set("dblClickTimeThreshold", js.undefined)
    @scala.inline
    def setDebugGridColorVarargs(value: String*): Self = this.set("debugGridColor", js.Array(value :_*))
    @scala.inline
    def setDebugGridColor(value: js.Array[String]): Self = this.set("debugGridColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebugGridColor: Self = this.set("debugGridColor", js.undefined)
    @scala.inline
    def setDebugMode(value: Boolean): Self = this.set("debugMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebugMode: Self = this.set("debugMode", js.undefined)
    @scala.inline
    def setDefaultZoomLevel(value: Double): Self = this.set("defaultZoomLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultZoomLevel: Self = this.set("defaultZoomLevel", js.undefined)
    @scala.inline
    def setDegrees(value: Double): Self = this.set("degrees", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDegrees: Self = this.set("degrees", js.undefined)
    @scala.inline
    def setElement(value: HTMLElement): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    @scala.inline
    def setFlipped(value: Boolean): Self = this.set("flipped", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlipped: Self = this.set("flipped", js.undefined)
    @scala.inline
    def setFullPageButton(value: String): Self = this.set("fullPageButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullPageButton: Self = this.set("fullPageButton", js.undefined)
    @scala.inline
    def setGestureSettingsMouse(value: GestureSettings): Self = this.set("gestureSettingsMouse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGestureSettingsMouse: Self = this.set("gestureSettingsMouse", js.undefined)
    @scala.inline
    def setGestureSettingsPen(value: GestureSettings): Self = this.set("gestureSettingsPen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGestureSettingsPen: Self = this.set("gestureSettingsPen", js.undefined)
    @scala.inline
    def setGestureSettingsTouch(value: GestureSettings): Self = this.set("gestureSettingsTouch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGestureSettingsTouch: Self = this.set("gestureSettingsTouch", js.undefined)
    @scala.inline
    def setGestureSettingsUnknown(value: GestureSettings): Self = this.set("gestureSettingsUnknown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGestureSettingsUnknown: Self = this.set("gestureSettingsUnknown", js.undefined)
    @scala.inline
    def setHomeButton(value: String): Self = this.set("homeButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHomeButton: Self = this.set("homeButton", js.undefined)
    @scala.inline
    def setHomeFillsViewer(value: Boolean): Self = this.set("homeFillsViewer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHomeFillsViewer: Self = this.set("homeFillsViewer", js.undefined)
    @scala.inline
    def setIOSDevice(value: Boolean): Self = this.set("iOSDevice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIOSDevice: Self = this.set("iOSDevice", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setImageLoaderLimit(value: Double): Self = this.set("imageLoaderLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageLoaderLimit: Self = this.set("imageLoaderLimit", js.undefined)
    @scala.inline
    def setImageSmoothingEnabled(value: Boolean): Self = this.set("imageSmoothingEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageSmoothingEnabled: Self = this.set("imageSmoothingEnabled", js.undefined)
    @scala.inline
    def setImmediateRender(value: Boolean): Self = this.set("immediateRender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImmediateRender: Self = this.set("immediateRender", js.undefined)
    @scala.inline
    def setInitialPage(value: Double): Self = this.set("initialPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialPage: Self = this.set("initialPage", js.undefined)
    @scala.inline
    def setLoadTilesWithAjax(value: Boolean): Self = this.set("loadTilesWithAjax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadTilesWithAjax: Self = this.set("loadTilesWithAjax", js.undefined)
    @scala.inline
    def setMaxImageCacheCount(value: Double): Self = this.set("maxImageCacheCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxImageCacheCount: Self = this.set("maxImageCacheCount", js.undefined)
    @scala.inline
    def setMaxZoomLevel(value: Double): Self = this.set("maxZoomLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxZoomLevel: Self = this.set("maxZoomLevel", js.undefined)
    @scala.inline
    def setMaxZoomPixelRatio(value: Double): Self = this.set("maxZoomPixelRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxZoomPixelRatio: Self = this.set("maxZoomPixelRatio", js.undefined)
    @scala.inline
    def setMinPixelRatio(value: Double): Self = this.set("minPixelRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinPixelRatio: Self = this.set("minPixelRatio", js.undefined)
    @scala.inline
    def setMinScrollDeltaTime(value: Double): Self = this.set("minScrollDeltaTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinScrollDeltaTime: Self = this.set("minScrollDeltaTime", js.undefined)
    @scala.inline
    def setMinZoomImageRatio(value: Double): Self = this.set("minZoomImageRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinZoomImageRatio: Self = this.set("minZoomImageRatio", js.undefined)
    @scala.inline
    def setMinZoomLevel(value: Double): Self = this.set("minZoomLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinZoomLevel: Self = this.set("minZoomLevel", js.undefined)
    @scala.inline
    def setMouseNavEnabled(value: Double): Self = this.set("mouseNavEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMouseNavEnabled: Self = this.set("mouseNavEnabled", js.undefined)
    @scala.inline
    def setNavImages(value: NavImages): Self = this.set("navImages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavImages: Self = this.set("navImages", js.undefined)
    @scala.inline
    def setNavPrevNextWrap(value: Boolean): Self = this.set("navPrevNextWrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavPrevNextWrap: Self = this.set("navPrevNextWrap", js.undefined)
    @scala.inline
    def setNavigationControlAnchor(value: ControlAnchor): Self = this.set("navigationControlAnchor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigationControlAnchor: Self = this.set("navigationControlAnchor", js.undefined)
    @scala.inline
    def setNavigatorAutoFade(value: Boolean): Self = this.set("navigatorAutoFade", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigatorAutoFade: Self = this.set("navigatorAutoFade", js.undefined)
    @scala.inline
    def setNavigatorAutoResize(value: Boolean): Self = this.set("navigatorAutoResize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigatorAutoResize: Self = this.set("navigatorAutoResize", js.undefined)
    @scala.inline
    def setNavigatorBackground(value: String): Self = this.set("navigatorBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigatorBackground: Self = this.set("navigatorBackground", js.undefined)
    @scala.inline
    def setNavigatorBorderColor(value: String): Self = this.set("navigatorBorderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigatorBorderColor: Self = this.set("navigatorBorderColor", js.undefined)
    @scala.inline
    def setNavigatorDisplayRegionColor(value: String): Self = this.set("navigatorDisplayRegionColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigatorDisplayRegionColor: Self = this.set("navigatorDisplayRegionColor", js.undefined)
    @scala.inline
    def setNavigatorHeight(value: Double | String): Self = this.set("navigatorHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigatorHeight: Self = this.set("navigatorHeight", js.undefined)
    @scala.inline
    def setNavigatorId(value: String): Self = this.set("navigatorId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigatorId: Self = this.set("navigatorId", js.undefined)
    @scala.inline
    def setNavigatorLeft(value: Double | String): Self = this.set("navigatorLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigatorLeft: Self = this.set("navigatorLeft", js.undefined)
    @scala.inline
    def setNavigatorMaintainSizeRatio(value: Boolean): Self = this.set("navigatorMaintainSizeRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigatorMaintainSizeRatio: Self = this.set("navigatorMaintainSizeRatio", js.undefined)
    @scala.inline
    def setNavigatorOpacity(value: Double): Self = this.set("navigatorOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigatorOpacity: Self = this.set("navigatorOpacity", js.undefined)
    @scala.inline
    def setNavigatorPosition(value: TOP_LEFT | TOP_RIGHT | BOTTOM_LEFT | BOTTOM_RIGHT | ABSOLUTE): Self = this.set("navigatorPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigatorPosition: Self = this.set("navigatorPosition", js.undefined)
    @scala.inline
    def setNavigatorRotate(value: Boolean): Self = this.set("navigatorRotate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigatorRotate: Self = this.set("navigatorRotate", js.undefined)
    @scala.inline
    def setNavigatorSizeRatio(value: Double): Self = this.set("navigatorSizeRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigatorSizeRatio: Self = this.set("navigatorSizeRatio", js.undefined)
    @scala.inline
    def setNavigatorTop(value: Double | String): Self = this.set("navigatorTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigatorTop: Self = this.set("navigatorTop", js.undefined)
    @scala.inline
    def setNavigatorWidth(value: Double | String): Self = this.set("navigatorWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigatorWidth: Self = this.set("navigatorWidth", js.undefined)
    @scala.inline
    def setNextButton(value: String): Self = this.set("nextButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextButton: Self = this.set("nextButton", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setOverlaysVarargs(value: js.Any*): Self = this.set("overlays", js.Array(value :_*))
    @scala.inline
    def setOverlays(value: js.Array[_]): Self = this.set("overlays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlays: Self = this.set("overlays", js.undefined)
    @scala.inline
    def setPanHorizontal(value: Boolean): Self = this.set("panHorizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePanHorizontal: Self = this.set("panHorizontal", js.undefined)
    @scala.inline
    def setPanVertical(value: Boolean): Self = this.set("panVertical", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePanVertical: Self = this.set("panVertical", js.undefined)
    @scala.inline
    def setPixelsPerArrowPress(value: Double): Self = this.set("pixelsPerArrowPress", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePixelsPerArrowPress: Self = this.set("pixelsPerArrowPress", js.undefined)
    @scala.inline
    def setPixelsPerWheelLine(value: Double): Self = this.set("pixelsPerWheelLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePixelsPerWheelLine: Self = this.set("pixelsPerWheelLine", js.undefined)
    @scala.inline
    def setPlaceholderFillStyle(value: String | CanvasGradient | CanvasPattern): Self = this.set("placeholderFillStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholderFillStyle: Self = this.set("placeholderFillStyle", js.undefined)
    @scala.inline
    def setPrefixUrl(value: String): Self = this.set("prefixUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixUrl: Self = this.set("prefixUrl", js.undefined)
    @scala.inline
    def setPreload(value: Boolean): Self = this.set("preload", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreload: Self = this.set("preload", js.undefined)
    @scala.inline
    def setPreserveImageSizeOnResize(value: Boolean): Self = this.set("preserveImageSizeOnResize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserveImageSizeOnResize: Self = this.set("preserveImageSizeOnResize", js.undefined)
    @scala.inline
    def setPreserveOverlays(value: Boolean): Self = this.set("preserveOverlays", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserveOverlays: Self = this.set("preserveOverlays", js.undefined)
    @scala.inline
    def setPreserveViewport(value: Boolean): Self = this.set("preserveViewport", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserveViewport: Self = this.set("preserveViewport", js.undefined)
    @scala.inline
    def setPreviousButton(value: String): Self = this.set("previousButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviousButton: Self = this.set("previousButton", js.undefined)
    @scala.inline
    def setReferenceStripElement(value: HTMLElement): Self = this.set("referenceStripElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferenceStripElement: Self = this.set("referenceStripElement", js.undefined)
    @scala.inline
    def setReferenceStripHeight(value: Double): Self = this.set("referenceStripHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferenceStripHeight: Self = this.set("referenceStripHeight", js.undefined)
    @scala.inline
    def setReferenceStripPosition(value: String): Self = this.set("referenceStripPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferenceStripPosition: Self = this.set("referenceStripPosition", js.undefined)
    @scala.inline
    def setReferenceStripScroll(value: String): Self = this.set("referenceStripScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferenceStripScroll: Self = this.set("referenceStripScroll", js.undefined)
    @scala.inline
    def setReferenceStripSizeRatio(value: Double): Self = this.set("referenceStripSizeRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferenceStripSizeRatio: Self = this.set("referenceStripSizeRatio", js.undefined)
    @scala.inline
    def setReferenceStripWidth(value: Double): Self = this.set("referenceStripWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferenceStripWidth: Self = this.set("referenceStripWidth", js.undefined)
    @scala.inline
    def setRotateLeftButton(value: String): Self = this.set("rotateLeftButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotateLeftButton: Self = this.set("rotateLeftButton", js.undefined)
    @scala.inline
    def setRotateRightButton(value: String): Self = this.set("rotateRightButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotateRightButton: Self = this.set("rotateRightButton", js.undefined)
    @scala.inline
    def setRotationIncrement(value: Double): Self = this.set("rotationIncrement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotationIncrement: Self = this.set("rotationIncrement", js.undefined)
    @scala.inline
    def setSequenceControlAnchor(value: ControlAnchor): Self = this.set("sequenceControlAnchor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSequenceControlAnchor: Self = this.set("sequenceControlAnchor", js.undefined)
    @scala.inline
    def setSequenceMode(value: Boolean): Self = this.set("sequenceMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSequenceMode: Self = this.set("sequenceMode", js.undefined)
    @scala.inline
    def setShowFlipControl(value: Boolean): Self = this.set("showFlipControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowFlipControl: Self = this.set("showFlipControl", js.undefined)
    @scala.inline
    def setShowFullPageControl(value: Boolean): Self = this.set("showFullPageControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowFullPageControl: Self = this.set("showFullPageControl", js.undefined)
    @scala.inline
    def setShowHomeControl(value: Boolean): Self = this.set("showHomeControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowHomeControl: Self = this.set("showHomeControl", js.undefined)
    @scala.inline
    def setShowNavigationControl(value: Boolean): Self = this.set("showNavigationControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowNavigationControl: Self = this.set("showNavigationControl", js.undefined)
    @scala.inline
    def setShowNavigator(value: Boolean): Self = this.set("showNavigator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowNavigator: Self = this.set("showNavigator", js.undefined)
    @scala.inline
    def setShowReferenceStrip(value: Boolean): Self = this.set("showReferenceStrip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowReferenceStrip: Self = this.set("showReferenceStrip", js.undefined)
    @scala.inline
    def setShowRotationControl(value: Boolean): Self = this.set("showRotationControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowRotationControl: Self = this.set("showRotationControl", js.undefined)
    @scala.inline
    def setShowSequenceControl(value: Boolean): Self = this.set("showSequenceControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowSequenceControl: Self = this.set("showSequenceControl", js.undefined)
    @scala.inline
    def setShowZoomControl(value: Boolean): Self = this.set("showZoomControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowZoomControl: Self = this.set("showZoomControl", js.undefined)
    @scala.inline
    def setSmoothTileEdgesMinZoom(value: Double): Self = this.set("smoothTileEdgesMinZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmoothTileEdgesMinZoom: Self = this.set("smoothTileEdgesMinZoom", js.undefined)
    @scala.inline
    def setSpringStiffness(value: Double): Self = this.set("springStiffness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpringStiffness: Self = this.set("springStiffness", js.undefined)
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    @scala.inline
    def setTileSourcesVarargs(value: (String | TileSource)*): Self = this.set("tileSources", js.Array(value :_*))
    @scala.inline
    def setTileSources(value: String | (js.Array[String | TileSource]) | TileSourceOptions | Levels | Image): Self = this.set("tileSources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTileSources: Self = this.set("tileSources", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setUseCanvas(value: Boolean): Self = this.set("useCanvas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseCanvas: Self = this.set("useCanvas", js.undefined)
    @scala.inline
    def setViewportMargins(value: js.Object): Self = this.set("viewportMargins", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewportMargins: Self = this.set("viewportMargins", js.undefined)
    @scala.inline
    def setVisibilityRatio(value: Double): Self = this.set("visibilityRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibilityRatio: Self = this.set("visibilityRatio", js.undefined)
    @scala.inline
    def setWrapHorizontal(value: Boolean): Self = this.set("wrapHorizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapHorizontal: Self = this.set("wrapHorizontal", js.undefined)
    @scala.inline
    def setWrapVertical(value: Boolean): Self = this.set("wrapVertical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapVertical: Self = this.set("wrapVertical", js.undefined)
    @scala.inline
    def setZoomInButton(value: String): Self = this.set("zoomInButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomInButton: Self = this.set("zoomInButton", js.undefined)
    @scala.inline
    def setZoomOutButton(value: String): Self = this.set("zoomOutButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomOutButton: Self = this.set("zoomOutButton", js.undefined)
    @scala.inline
    def setZoomPerClick(value: Double): Self = this.set("zoomPerClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomPerClick: Self = this.set("zoomPerClick", js.undefined)
    @scala.inline
    def setZoomPerScroll(value: Double): Self = this.set("zoomPerScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomPerScroll: Self = this.set("zoomPerScroll", js.undefined)
    @scala.inline
    def setZoomPerSecond(value: Double): Self = this.set("zoomPerSecond", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomPerSecond: Self = this.set("zoomPerSecond", js.undefined)
  }
  
}

