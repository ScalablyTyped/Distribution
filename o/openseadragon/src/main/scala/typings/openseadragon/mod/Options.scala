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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
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
  
  var immediateRender: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If sequenceMode is true, display this page initially.
    * @default 0
    */
  var initialPage: js.UndefOr[Double] = js.undefined
  
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
  
  var overlays: js.UndefOr[js.Array[js.Any]] = js.undefined
  
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
  
  var rotationIncrement: js.UndefOr[Double] = js.undefined
  
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
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setAnimationTime(value: Double): Self = StObject.set(x, "animationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationTimeUndefined: Self = StObject.set(x, "animationTime", js.undefined)
    
    @scala.inline
    def setAutoHideControls(value: Boolean): Self = StObject.set(x, "autoHideControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoHideControlsUndefined: Self = StObject.set(x, "autoHideControls", js.undefined)
    
    @scala.inline
    def setAutoResize(value: Boolean): Self = StObject.set(x, "autoResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoResizeUndefined: Self = StObject.set(x, "autoResize", js.undefined)
    
    @scala.inline
    def setBlendTime(value: Double): Self = StObject.set(x, "blendTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlendTimeUndefined: Self = StObject.set(x, "blendTime", js.undefined)
    
    @scala.inline
    def setClickDistThreshold(value: Double): Self = StObject.set(x, "clickDistThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickDistThresholdUndefined: Self = StObject.set(x, "clickDistThreshold", js.undefined)
    
    @scala.inline
    def setClickTimeThreshold(value: Double): Self = StObject.set(x, "clickTimeThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickTimeThresholdUndefined: Self = StObject.set(x, "clickTimeThreshold", js.undefined)
    
    @scala.inline
    def setCollectionColumns(value: Double): Self = StObject.set(x, "collectionColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollectionColumnsUndefined: Self = StObject.set(x, "collectionColumns", js.undefined)
    
    @scala.inline
    def setCollectionLayout(value: horizontal | vertical): Self = StObject.set(x, "collectionLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollectionLayoutUndefined: Self = StObject.set(x, "collectionLayout", js.undefined)
    
    @scala.inline
    def setCollectionMode(value: Boolean): Self = StObject.set(x, "collectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollectionModeUndefined: Self = StObject.set(x, "collectionMode", js.undefined)
    
    @scala.inline
    def setCollectionRows(value: Double): Self = StObject.set(x, "collectionRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollectionRowsUndefined: Self = StObject.set(x, "collectionRows", js.undefined)
    
    @scala.inline
    def setCollectionTileMargin(value: Double): Self = StObject.set(x, "collectionTileMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollectionTileMarginUndefined: Self = StObject.set(x, "collectionTileMargin", js.undefined)
    
    @scala.inline
    def setCollectionTileSize(value: Double): Self = StObject.set(x, "collectionTileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollectionTileSizeUndefined: Self = StObject.set(x, "collectionTileSize", js.undefined)
    
    @scala.inline
    def setCompositeOperation(
      value: `source-over` | `source-atop` | `source-in` | `source-out` | `destination-over` | `destination-atop` | `destination-in` | `destination-out` | lighter | copy | xor
    ): Self = StObject.set(x, "compositeOperation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompositeOperationUndefined: Self = StObject.set(x, "compositeOperation", js.undefined)
    
    @scala.inline
    def setConstrainDuringPan(value: Boolean): Self = StObject.set(x, "constrainDuringPan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstrainDuringPanUndefined: Self = StObject.set(x, "constrainDuringPan", js.undefined)
    
    @scala.inline
    def setControlsFadeDelay(value: Double): Self = StObject.set(x, "controlsFadeDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlsFadeDelayUndefined: Self = StObject.set(x, "controlsFadeDelay", js.undefined)
    
    @scala.inline
    def setControlsFadeLength(value: Double): Self = StObject.set(x, "controlsFadeLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlsFadeLengthUndefined: Self = StObject.set(x, "controlsFadeLength", js.undefined)
    
    @scala.inline
    def setCrossOriginPolicy(value: Anonymous | `use-credentials` | `false`): Self = StObject.set(x, "crossOriginPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossOriginPolicyUndefined: Self = StObject.set(x, "crossOriginPolicy", js.undefined)
    
    @scala.inline
    def setDblClickDistThreshold(value: Double): Self = StObject.set(x, "dblClickDistThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDblClickDistThresholdUndefined: Self = StObject.set(x, "dblClickDistThreshold", js.undefined)
    
    @scala.inline
    def setDblClickTimeThreshold(value: Double): Self = StObject.set(x, "dblClickTimeThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDblClickTimeThresholdUndefined: Self = StObject.set(x, "dblClickTimeThreshold", js.undefined)
    
    @scala.inline
    def setDebugGridColor(value: js.Array[String]): Self = StObject.set(x, "debugGridColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugGridColorUndefined: Self = StObject.set(x, "debugGridColor", js.undefined)
    
    @scala.inline
    def setDebugGridColorVarargs(value: String*): Self = StObject.set(x, "debugGridColor", js.Array(value :_*))
    
    @scala.inline
    def setDebugMode(value: Boolean): Self = StObject.set(x, "debugMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugModeUndefined: Self = StObject.set(x, "debugMode", js.undefined)
    
    @scala.inline
    def setDefaultZoomLevel(value: Double): Self = StObject.set(x, "defaultZoomLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultZoomLevelUndefined: Self = StObject.set(x, "defaultZoomLevel", js.undefined)
    
    @scala.inline
    def setDegrees(value: Double): Self = StObject.set(x, "degrees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDegreesUndefined: Self = StObject.set(x, "degrees", js.undefined)
    
    @scala.inline
    def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setFlipped(value: Boolean): Self = StObject.set(x, "flipped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlippedUndefined: Self = StObject.set(x, "flipped", js.undefined)
    
    @scala.inline
    def setFullPageButton(value: String): Self = StObject.set(x, "fullPageButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullPageButtonUndefined: Self = StObject.set(x, "fullPageButton", js.undefined)
    
    @scala.inline
    def setGestureSettingsMouse(value: GestureSettings): Self = StObject.set(x, "gestureSettingsMouse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGestureSettingsMouseUndefined: Self = StObject.set(x, "gestureSettingsMouse", js.undefined)
    
    @scala.inline
    def setGestureSettingsPen(value: GestureSettings): Self = StObject.set(x, "gestureSettingsPen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGestureSettingsPenUndefined: Self = StObject.set(x, "gestureSettingsPen", js.undefined)
    
    @scala.inline
    def setGestureSettingsTouch(value: GestureSettings): Self = StObject.set(x, "gestureSettingsTouch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGestureSettingsTouchUndefined: Self = StObject.set(x, "gestureSettingsTouch", js.undefined)
    
    @scala.inline
    def setGestureSettingsUnknown(value: GestureSettings): Self = StObject.set(x, "gestureSettingsUnknown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGestureSettingsUnknownUndefined: Self = StObject.set(x, "gestureSettingsUnknown", js.undefined)
    
    @scala.inline
    def setHomeButton(value: String): Self = StObject.set(x, "homeButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomeButtonUndefined: Self = StObject.set(x, "homeButton", js.undefined)
    
    @scala.inline
    def setHomeFillsViewer(value: Boolean): Self = StObject.set(x, "homeFillsViewer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomeFillsViewerUndefined: Self = StObject.set(x, "homeFillsViewer", js.undefined)
    
    @scala.inline
    def setIOSDevice(value: Boolean): Self = StObject.set(x, "iOSDevice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIOSDeviceUndefined: Self = StObject.set(x, "iOSDevice", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setImageLoaderLimit(value: Double): Self = StObject.set(x, "imageLoaderLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageLoaderLimitUndefined: Self = StObject.set(x, "imageLoaderLimit", js.undefined)
    
    @scala.inline
    def setImageSmoothingEnabled(value: Boolean): Self = StObject.set(x, "imageSmoothingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageSmoothingEnabledUndefined: Self = StObject.set(x, "imageSmoothingEnabled", js.undefined)
    
    @scala.inline
    def setImmediateRender(value: Boolean): Self = StObject.set(x, "immediateRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImmediateRenderUndefined: Self = StObject.set(x, "immediateRender", js.undefined)
    
    @scala.inline
    def setInitialPage(value: Double): Self = StObject.set(x, "initialPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialPageUndefined: Self = StObject.set(x, "initialPage", js.undefined)
    
    @scala.inline
    def setLoadTilesWithAjax(value: Boolean): Self = StObject.set(x, "loadTilesWithAjax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadTilesWithAjaxUndefined: Self = StObject.set(x, "loadTilesWithAjax", js.undefined)
    
    @scala.inline
    def setMaxImageCacheCount(value: Double): Self = StObject.set(x, "maxImageCacheCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxImageCacheCountUndefined: Self = StObject.set(x, "maxImageCacheCount", js.undefined)
    
    @scala.inline
    def setMaxZoomLevel(value: Double): Self = StObject.set(x, "maxZoomLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxZoomLevelUndefined: Self = StObject.set(x, "maxZoomLevel", js.undefined)
    
    @scala.inline
    def setMaxZoomPixelRatio(value: Double): Self = StObject.set(x, "maxZoomPixelRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxZoomPixelRatioUndefined: Self = StObject.set(x, "maxZoomPixelRatio", js.undefined)
    
    @scala.inline
    def setMinPixelRatio(value: Double): Self = StObject.set(x, "minPixelRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinPixelRatioUndefined: Self = StObject.set(x, "minPixelRatio", js.undefined)
    
    @scala.inline
    def setMinScrollDeltaTime(value: Double): Self = StObject.set(x, "minScrollDeltaTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinScrollDeltaTimeUndefined: Self = StObject.set(x, "minScrollDeltaTime", js.undefined)
    
    @scala.inline
    def setMinZoomImageRatio(value: Double): Self = StObject.set(x, "minZoomImageRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinZoomImageRatioUndefined: Self = StObject.set(x, "minZoomImageRatio", js.undefined)
    
    @scala.inline
    def setMinZoomLevel(value: Double): Self = StObject.set(x, "minZoomLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinZoomLevelUndefined: Self = StObject.set(x, "minZoomLevel", js.undefined)
    
    @scala.inline
    def setMouseNavEnabled(value: Double): Self = StObject.set(x, "mouseNavEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseNavEnabledUndefined: Self = StObject.set(x, "mouseNavEnabled", js.undefined)
    
    @scala.inline
    def setNavImages(value: NavImages): Self = StObject.set(x, "navImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavImagesUndefined: Self = StObject.set(x, "navImages", js.undefined)
    
    @scala.inline
    def setNavPrevNextWrap(value: Boolean): Self = StObject.set(x, "navPrevNextWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavPrevNextWrapUndefined: Self = StObject.set(x, "navPrevNextWrap", js.undefined)
    
    @scala.inline
    def setNavigationControlAnchor(value: ControlAnchor): Self = StObject.set(x, "navigationControlAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigationControlAnchorUndefined: Self = StObject.set(x, "navigationControlAnchor", js.undefined)
    
    @scala.inline
    def setNavigatorAutoFade(value: Boolean): Self = StObject.set(x, "navigatorAutoFade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigatorAutoFadeUndefined: Self = StObject.set(x, "navigatorAutoFade", js.undefined)
    
    @scala.inline
    def setNavigatorAutoResize(value: Boolean): Self = StObject.set(x, "navigatorAutoResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigatorAutoResizeUndefined: Self = StObject.set(x, "navigatorAutoResize", js.undefined)
    
    @scala.inline
    def setNavigatorBackground(value: String): Self = StObject.set(x, "navigatorBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigatorBackgroundUndefined: Self = StObject.set(x, "navigatorBackground", js.undefined)
    
    @scala.inline
    def setNavigatorBorderColor(value: String): Self = StObject.set(x, "navigatorBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigatorBorderColorUndefined: Self = StObject.set(x, "navigatorBorderColor", js.undefined)
    
    @scala.inline
    def setNavigatorDisplayRegionColor(value: String): Self = StObject.set(x, "navigatorDisplayRegionColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigatorDisplayRegionColorUndefined: Self = StObject.set(x, "navigatorDisplayRegionColor", js.undefined)
    
    @scala.inline
    def setNavigatorHeight(value: Double | String): Self = StObject.set(x, "navigatorHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigatorHeightUndefined: Self = StObject.set(x, "navigatorHeight", js.undefined)
    
    @scala.inline
    def setNavigatorId(value: String): Self = StObject.set(x, "navigatorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigatorIdUndefined: Self = StObject.set(x, "navigatorId", js.undefined)
    
    @scala.inline
    def setNavigatorLeft(value: Double | String): Self = StObject.set(x, "navigatorLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigatorLeftUndefined: Self = StObject.set(x, "navigatorLeft", js.undefined)
    
    @scala.inline
    def setNavigatorMaintainSizeRatio(value: Boolean): Self = StObject.set(x, "navigatorMaintainSizeRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigatorMaintainSizeRatioUndefined: Self = StObject.set(x, "navigatorMaintainSizeRatio", js.undefined)
    
    @scala.inline
    def setNavigatorOpacity(value: Double): Self = StObject.set(x, "navigatorOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigatorOpacityUndefined: Self = StObject.set(x, "navigatorOpacity", js.undefined)
    
    @scala.inline
    def setNavigatorPosition(value: TOP_LEFT | TOP_RIGHT | BOTTOM_LEFT | BOTTOM_RIGHT | ABSOLUTE): Self = StObject.set(x, "navigatorPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigatorPositionUndefined: Self = StObject.set(x, "navigatorPosition", js.undefined)
    
    @scala.inline
    def setNavigatorRotate(value: Boolean): Self = StObject.set(x, "navigatorRotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigatorRotateUndefined: Self = StObject.set(x, "navigatorRotate", js.undefined)
    
    @scala.inline
    def setNavigatorSizeRatio(value: Double): Self = StObject.set(x, "navigatorSizeRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigatorSizeRatioUndefined: Self = StObject.set(x, "navigatorSizeRatio", js.undefined)
    
    @scala.inline
    def setNavigatorTop(value: Double | String): Self = StObject.set(x, "navigatorTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigatorTopUndefined: Self = StObject.set(x, "navigatorTop", js.undefined)
    
    @scala.inline
    def setNavigatorWidth(value: Double | String): Self = StObject.set(x, "navigatorWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigatorWidthUndefined: Self = StObject.set(x, "navigatorWidth", js.undefined)
    
    @scala.inline
    def setNextButton(value: String): Self = StObject.set(x, "nextButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextButtonUndefined: Self = StObject.set(x, "nextButton", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setOverlays(value: js.Array[js.Any]): Self = StObject.set(x, "overlays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlaysUndefined: Self = StObject.set(x, "overlays", js.undefined)
    
    @scala.inline
    def setOverlaysVarargs(value: js.Any*): Self = StObject.set(x, "overlays", js.Array(value :_*))
    
    @scala.inline
    def setPanHorizontal(value: Boolean): Self = StObject.set(x, "panHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanHorizontalUndefined: Self = StObject.set(x, "panHorizontal", js.undefined)
    
    @scala.inline
    def setPanVertical(value: Boolean): Self = StObject.set(x, "panVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanVerticalUndefined: Self = StObject.set(x, "panVertical", js.undefined)
    
    @scala.inline
    def setPixelsPerArrowPress(value: Double): Self = StObject.set(x, "pixelsPerArrowPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelsPerArrowPressUndefined: Self = StObject.set(x, "pixelsPerArrowPress", js.undefined)
    
    @scala.inline
    def setPixelsPerWheelLine(value: Double): Self = StObject.set(x, "pixelsPerWheelLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelsPerWheelLineUndefined: Self = StObject.set(x, "pixelsPerWheelLine", js.undefined)
    
    @scala.inline
    def setPlaceholderFillStyle(value: String | CanvasGradient | CanvasPattern): Self = StObject.set(x, "placeholderFillStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderFillStyleUndefined: Self = StObject.set(x, "placeholderFillStyle", js.undefined)
    
    @scala.inline
    def setPrefixUrl(value: String): Self = StObject.set(x, "prefixUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUrlUndefined: Self = StObject.set(x, "prefixUrl", js.undefined)
    
    @scala.inline
    def setPreload(value: Boolean): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
    
    @scala.inline
    def setPreserveImageSizeOnResize(value: Boolean): Self = StObject.set(x, "preserveImageSizeOnResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveImageSizeOnResizeUndefined: Self = StObject.set(x, "preserveImageSizeOnResize", js.undefined)
    
    @scala.inline
    def setPreserveOverlays(value: Boolean): Self = StObject.set(x, "preserveOverlays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveOverlaysUndefined: Self = StObject.set(x, "preserveOverlays", js.undefined)
    
    @scala.inline
    def setPreserveViewport(value: Boolean): Self = StObject.set(x, "preserveViewport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveViewportUndefined: Self = StObject.set(x, "preserveViewport", js.undefined)
    
    @scala.inline
    def setPreviousButton(value: String): Self = StObject.set(x, "previousButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousButtonUndefined: Self = StObject.set(x, "previousButton", js.undefined)
    
    @scala.inline
    def setReferenceStripElement(value: HTMLElement): Self = StObject.set(x, "referenceStripElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceStripElementUndefined: Self = StObject.set(x, "referenceStripElement", js.undefined)
    
    @scala.inline
    def setReferenceStripHeight(value: Double): Self = StObject.set(x, "referenceStripHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceStripHeightUndefined: Self = StObject.set(x, "referenceStripHeight", js.undefined)
    
    @scala.inline
    def setReferenceStripPosition(value: String): Self = StObject.set(x, "referenceStripPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceStripPositionUndefined: Self = StObject.set(x, "referenceStripPosition", js.undefined)
    
    @scala.inline
    def setReferenceStripScroll(value: String): Self = StObject.set(x, "referenceStripScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceStripScrollUndefined: Self = StObject.set(x, "referenceStripScroll", js.undefined)
    
    @scala.inline
    def setReferenceStripSizeRatio(value: Double): Self = StObject.set(x, "referenceStripSizeRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceStripSizeRatioUndefined: Self = StObject.set(x, "referenceStripSizeRatio", js.undefined)
    
    @scala.inline
    def setReferenceStripWidth(value: Double): Self = StObject.set(x, "referenceStripWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceStripWidthUndefined: Self = StObject.set(x, "referenceStripWidth", js.undefined)
    
    @scala.inline
    def setRotateLeftButton(value: String): Self = StObject.set(x, "rotateLeftButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotateLeftButtonUndefined: Self = StObject.set(x, "rotateLeftButton", js.undefined)
    
    @scala.inline
    def setRotateRightButton(value: String): Self = StObject.set(x, "rotateRightButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotateRightButtonUndefined: Self = StObject.set(x, "rotateRightButton", js.undefined)
    
    @scala.inline
    def setRotationIncrement(value: Double): Self = StObject.set(x, "rotationIncrement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationIncrementUndefined: Self = StObject.set(x, "rotationIncrement", js.undefined)
    
    @scala.inline
    def setSequenceControlAnchor(value: ControlAnchor): Self = StObject.set(x, "sequenceControlAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSequenceControlAnchorUndefined: Self = StObject.set(x, "sequenceControlAnchor", js.undefined)
    
    @scala.inline
    def setSequenceMode(value: Boolean): Self = StObject.set(x, "sequenceMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSequenceModeUndefined: Self = StObject.set(x, "sequenceMode", js.undefined)
    
    @scala.inline
    def setShowFlipControl(value: Boolean): Self = StObject.set(x, "showFlipControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowFlipControlUndefined: Self = StObject.set(x, "showFlipControl", js.undefined)
    
    @scala.inline
    def setShowFullPageControl(value: Boolean): Self = StObject.set(x, "showFullPageControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowFullPageControlUndefined: Self = StObject.set(x, "showFullPageControl", js.undefined)
    
    @scala.inline
    def setShowHomeControl(value: Boolean): Self = StObject.set(x, "showHomeControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowHomeControlUndefined: Self = StObject.set(x, "showHomeControl", js.undefined)
    
    @scala.inline
    def setShowNavigationControl(value: Boolean): Self = StObject.set(x, "showNavigationControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowNavigationControlUndefined: Self = StObject.set(x, "showNavigationControl", js.undefined)
    
    @scala.inline
    def setShowNavigator(value: Boolean): Self = StObject.set(x, "showNavigator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowNavigatorUndefined: Self = StObject.set(x, "showNavigator", js.undefined)
    
    @scala.inline
    def setShowReferenceStrip(value: Boolean): Self = StObject.set(x, "showReferenceStrip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowReferenceStripUndefined: Self = StObject.set(x, "showReferenceStrip", js.undefined)
    
    @scala.inline
    def setShowRotationControl(value: Boolean): Self = StObject.set(x, "showRotationControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowRotationControlUndefined: Self = StObject.set(x, "showRotationControl", js.undefined)
    
    @scala.inline
    def setShowSequenceControl(value: Boolean): Self = StObject.set(x, "showSequenceControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowSequenceControlUndefined: Self = StObject.set(x, "showSequenceControl", js.undefined)
    
    @scala.inline
    def setShowZoomControl(value: Boolean): Self = StObject.set(x, "showZoomControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowZoomControlUndefined: Self = StObject.set(x, "showZoomControl", js.undefined)
    
    @scala.inline
    def setSmoothTileEdgesMinZoom(value: Double): Self = StObject.set(x, "smoothTileEdgesMinZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmoothTileEdgesMinZoomUndefined: Self = StObject.set(x, "smoothTileEdgesMinZoom", js.undefined)
    
    @scala.inline
    def setSpringStiffness(value: Double): Self = StObject.set(x, "springStiffness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpringStiffnessUndefined: Self = StObject.set(x, "springStiffness", js.undefined)
    
    @scala.inline
    def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
    @scala.inline
    def setTileSources(value: String | (js.Array[String | TileSource]) | TileSourceOptions | Levels | Image): Self = StObject.set(x, "tileSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileSourcesUndefined: Self = StObject.set(x, "tileSources", js.undefined)
    
    @scala.inline
    def setTileSourcesVarargs(value: (String | TileSource)*): Self = StObject.set(x, "tileSources", js.Array(value :_*))
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setUseCanvas(value: Boolean): Self = StObject.set(x, "useCanvas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseCanvasUndefined: Self = StObject.set(x, "useCanvas", js.undefined)
    
    @scala.inline
    def setViewportMargins(value: js.Object): Self = StObject.set(x, "viewportMargins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewportMarginsUndefined: Self = StObject.set(x, "viewportMargins", js.undefined)
    
    @scala.inline
    def setVisibilityRatio(value: Double): Self = StObject.set(x, "visibilityRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityRatioUndefined: Self = StObject.set(x, "visibilityRatio", js.undefined)
    
    @scala.inline
    def setWrapHorizontal(value: Boolean): Self = StObject.set(x, "wrapHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapHorizontalUndefined: Self = StObject.set(x, "wrapHorizontal", js.undefined)
    
    @scala.inline
    def setWrapVertical(value: Boolean): Self = StObject.set(x, "wrapVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapVerticalUndefined: Self = StObject.set(x, "wrapVertical", js.undefined)
    
    @scala.inline
    def setZoomInButton(value: String): Self = StObject.set(x, "zoomInButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomInButtonUndefined: Self = StObject.set(x, "zoomInButton", js.undefined)
    
    @scala.inline
    def setZoomOutButton(value: String): Self = StObject.set(x, "zoomOutButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomOutButtonUndefined: Self = StObject.set(x, "zoomOutButton", js.undefined)
    
    @scala.inline
    def setZoomPerClick(value: Double): Self = StObject.set(x, "zoomPerClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomPerClickUndefined: Self = StObject.set(x, "zoomPerClick", js.undefined)
    
    @scala.inline
    def setZoomPerScroll(value: Double): Self = StObject.set(x, "zoomPerScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomPerScrollUndefined: Self = StObject.set(x, "zoomPerScroll", js.undefined)
    
    @scala.inline
    def setZoomPerSecond(value: Double): Self = StObject.set(x, "zoomPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomPerSecondUndefined: Self = StObject.set(x, "zoomPerSecond", js.undefined)
  }
}
