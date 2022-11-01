package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * MapOptions
  */
trait MapOptions extends StObject {
  
  // See https://navermaps.github.io/maps.js.ncp/docs/naver.maps.html#.MapOptions
  var background: js.UndefOr[String] = js.undefined
  
  var baseTileOpacity: js.UndefOr[Double] = js.undefined
  
  var blankTileImage: js.UndefOr[Null | String] = js.undefined
  
  var bounds: js.UndefOr[Bounds | BoundsLiteral] = js.undefined
  
  var center: js.UndefOr[Coord | CoordLiteral] = js.undefined
  
  // default 16
  var disableDoubleClickZoom: js.UndefOr[Boolean] = js.undefined
  
  var disableDoubleTapZoom: js.UndefOr[Boolean] = js.undefined
  
  var disableKineticPan: js.UndefOr[Boolean] = js.undefined
  
  var disableTwoFingerTapZoom: js.UndefOr[Boolean] = js.undefined
  
  var draggable: js.UndefOr[Boolean] = js.undefined
  
  var keyboardShortcuts: js.UndefOr[Boolean] = js.undefined
  
  var logoControl: js.UndefOr[Boolean] = js.undefined
  
  var logoControlOptions: js.UndefOr[LogoControlOptions] = js.undefined
  
  var mapDataControl: js.UndefOr[Boolean] = js.undefined
  
  var mapDataControlOptions: js.UndefOr[MapDataControlOptions] = js.undefined
  
  var mapTypeControl: js.UndefOr[Boolean] = js.undefined
  
  var mapTypeControlOptions: js.UndefOr[MapTypeControlOptions] = js.undefined
  
  var mapTypeId: js.UndefOr[String] = js.undefined
  
  var mapTypes: js.UndefOr[MapTypeRegistry] = js.undefined
  
  var maxBounds: js.UndefOr[Bounds | BoundsLiteral] = js.undefined
  
  var maxZoom: js.UndefOr[Double] = js.undefined
  
  var minZoom: js.UndefOr[Double] = js.undefined
  
  var overlayZoomEffect: js.UndefOr[Null | String] = js.undefined
  
  var padding: js.UndefOr[typings.navermaps.naver.maps.padding] = js.undefined
  
  var pinchZoom: js.UndefOr[Boolean] = js.undefined
  
  var resizeOrigin: js.UndefOr[Position] = js.undefined
  
  var scaleControl: js.UndefOr[Boolean] = js.undefined
  
  var scaleControlOptions: js.UndefOr[ScaleControlOptions] = js.undefined
  
  var scrollWheel: js.UndefOr[Boolean] = js.undefined
  
  var size: js.UndefOr[Size | SizeLiteral] = js.undefined
  
  var tileDuration: js.UndefOr[Double] = js.undefined
  
  var tileSpare: js.UndefOr[Double] = js.undefined
  
  var tileTransition: js.UndefOr[Boolean] = js.undefined
  
  // default naver.maps.LatLng(37.5666103, 126.9783882)
  var zoom: js.UndefOr[Double] = js.undefined
  
  var zoomControl: js.UndefOr[Boolean] = js.undefined
  
  var zoomControlOptions: js.UndefOr[ZoomControlOptions] = js.undefined
  
  var zoomOrigin: js.UndefOr[Coord | CoordLiteral] = js.undefined
}
object MapOptions {
  
  inline def apply(): MapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapOptions]
  }
  
  extension [Self <: MapOptions](x: Self) {
    
    inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setBaseTileOpacity(value: Double): Self = StObject.set(x, "baseTileOpacity", value.asInstanceOf[js.Any])
    
    inline def setBaseTileOpacityUndefined: Self = StObject.set(x, "baseTileOpacity", js.undefined)
    
    inline def setBlankTileImage(value: String): Self = StObject.set(x, "blankTileImage", value.asInstanceOf[js.Any])
    
    inline def setBlankTileImageNull: Self = StObject.set(x, "blankTileImage", null)
    
    inline def setBlankTileImageUndefined: Self = StObject.set(x, "blankTileImage", js.undefined)
    
    inline def setBounds(value: Bounds | BoundsLiteral): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    inline def setCenter(value: Coord | CoordLiteral): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    inline def setDisableDoubleClickZoom(value: Boolean): Self = StObject.set(x, "disableDoubleClickZoom", value.asInstanceOf[js.Any])
    
    inline def setDisableDoubleClickZoomUndefined: Self = StObject.set(x, "disableDoubleClickZoom", js.undefined)
    
    inline def setDisableDoubleTapZoom(value: Boolean): Self = StObject.set(x, "disableDoubleTapZoom", value.asInstanceOf[js.Any])
    
    inline def setDisableDoubleTapZoomUndefined: Self = StObject.set(x, "disableDoubleTapZoom", js.undefined)
    
    inline def setDisableKineticPan(value: Boolean): Self = StObject.set(x, "disableKineticPan", value.asInstanceOf[js.Any])
    
    inline def setDisableKineticPanUndefined: Self = StObject.set(x, "disableKineticPan", js.undefined)
    
    inline def setDisableTwoFingerTapZoom(value: Boolean): Self = StObject.set(x, "disableTwoFingerTapZoom", value.asInstanceOf[js.Any])
    
    inline def setDisableTwoFingerTapZoomUndefined: Self = StObject.set(x, "disableTwoFingerTapZoom", js.undefined)
    
    inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    inline def setKeyboardShortcuts(value: Boolean): Self = StObject.set(x, "keyboardShortcuts", value.asInstanceOf[js.Any])
    
    inline def setKeyboardShortcutsUndefined: Self = StObject.set(x, "keyboardShortcuts", js.undefined)
    
    inline def setLogoControl(value: Boolean): Self = StObject.set(x, "logoControl", value.asInstanceOf[js.Any])
    
    inline def setLogoControlOptions(value: LogoControlOptions): Self = StObject.set(x, "logoControlOptions", value.asInstanceOf[js.Any])
    
    inline def setLogoControlOptionsUndefined: Self = StObject.set(x, "logoControlOptions", js.undefined)
    
    inline def setLogoControlUndefined: Self = StObject.set(x, "logoControl", js.undefined)
    
    inline def setMapDataControl(value: Boolean): Self = StObject.set(x, "mapDataControl", value.asInstanceOf[js.Any])
    
    inline def setMapDataControlOptions(value: MapDataControlOptions): Self = StObject.set(x, "mapDataControlOptions", value.asInstanceOf[js.Any])
    
    inline def setMapDataControlOptionsUndefined: Self = StObject.set(x, "mapDataControlOptions", js.undefined)
    
    inline def setMapDataControlUndefined: Self = StObject.set(x, "mapDataControl", js.undefined)
    
    inline def setMapTypeControl(value: Boolean): Self = StObject.set(x, "mapTypeControl", value.asInstanceOf[js.Any])
    
    inline def setMapTypeControlOptions(value: MapTypeControlOptions): Self = StObject.set(x, "mapTypeControlOptions", value.asInstanceOf[js.Any])
    
    inline def setMapTypeControlOptionsUndefined: Self = StObject.set(x, "mapTypeControlOptions", js.undefined)
    
    inline def setMapTypeControlUndefined: Self = StObject.set(x, "mapTypeControl", js.undefined)
    
    inline def setMapTypeId(value: String): Self = StObject.set(x, "mapTypeId", value.asInstanceOf[js.Any])
    
    inline def setMapTypeIdUndefined: Self = StObject.set(x, "mapTypeId", js.undefined)
    
    inline def setMapTypes(value: MapTypeRegistry): Self = StObject.set(x, "mapTypes", value.asInstanceOf[js.Any])
    
    inline def setMapTypesUndefined: Self = StObject.set(x, "mapTypes", js.undefined)
    
    inline def setMaxBounds(value: Bounds | BoundsLiteral): Self = StObject.set(x, "maxBounds", value.asInstanceOf[js.Any])
    
    inline def setMaxBoundsUndefined: Self = StObject.set(x, "maxBounds", js.undefined)
    
    inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
    
    inline def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
    
    inline def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
    
    inline def setOverlayZoomEffect(value: String): Self = StObject.set(x, "overlayZoomEffect", value.asInstanceOf[js.Any])
    
    inline def setOverlayZoomEffectNull: Self = StObject.set(x, "overlayZoomEffect", null)
    
    inline def setOverlayZoomEffectUndefined: Self = StObject.set(x, "overlayZoomEffect", js.undefined)
    
    inline def setPadding(value: padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPinchZoom(value: Boolean): Self = StObject.set(x, "pinchZoom", value.asInstanceOf[js.Any])
    
    inline def setPinchZoomUndefined: Self = StObject.set(x, "pinchZoom", js.undefined)
    
    inline def setResizeOrigin(value: Position): Self = StObject.set(x, "resizeOrigin", value.asInstanceOf[js.Any])
    
    inline def setResizeOriginUndefined: Self = StObject.set(x, "resizeOrigin", js.undefined)
    
    inline def setScaleControl(value: Boolean): Self = StObject.set(x, "scaleControl", value.asInstanceOf[js.Any])
    
    inline def setScaleControlOptions(value: ScaleControlOptions): Self = StObject.set(x, "scaleControlOptions", value.asInstanceOf[js.Any])
    
    inline def setScaleControlOptionsUndefined: Self = StObject.set(x, "scaleControlOptions", js.undefined)
    
    inline def setScaleControlUndefined: Self = StObject.set(x, "scaleControl", js.undefined)
    
    inline def setScrollWheel(value: Boolean): Self = StObject.set(x, "scrollWheel", value.asInstanceOf[js.Any])
    
    inline def setScrollWheelUndefined: Self = StObject.set(x, "scrollWheel", js.undefined)
    
    inline def setSize(value: Size | SizeLiteral): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTileDuration(value: Double): Self = StObject.set(x, "tileDuration", value.asInstanceOf[js.Any])
    
    inline def setTileDurationUndefined: Self = StObject.set(x, "tileDuration", js.undefined)
    
    inline def setTileSpare(value: Double): Self = StObject.set(x, "tileSpare", value.asInstanceOf[js.Any])
    
    inline def setTileSpareUndefined: Self = StObject.set(x, "tileSpare", js.undefined)
    
    inline def setTileTransition(value: Boolean): Self = StObject.set(x, "tileTransition", value.asInstanceOf[js.Any])
    
    inline def setTileTransitionUndefined: Self = StObject.set(x, "tileTransition", js.undefined)
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomControl(value: Boolean): Self = StObject.set(x, "zoomControl", value.asInstanceOf[js.Any])
    
    inline def setZoomControlOptions(value: ZoomControlOptions): Self = StObject.set(x, "zoomControlOptions", value.asInstanceOf[js.Any])
    
    inline def setZoomControlOptionsUndefined: Self = StObject.set(x, "zoomControlOptions", js.undefined)
    
    inline def setZoomControlUndefined: Self = StObject.set(x, "zoomControl", js.undefined)
    
    inline def setZoomOrigin(value: Coord | CoordLiteral): Self = StObject.set(x, "zoomOrigin", value.asInstanceOf[js.Any])
    
    inline def setZoomOriginUndefined: Self = StObject.set(x, "zoomOrigin", js.undefined)
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
