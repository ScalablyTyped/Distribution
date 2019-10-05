package typings.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapOptions extends js.Object {
  var background: js.UndefOr[String] = js.undefined
  var baseTileOpacity: js.UndefOr[Double] = js.undefined
  var bounds: js.UndefOr[js.Any] = js.undefined
  var center: js.UndefOr[js.Any] = js.undefined
  var disableDoubleClickZoom: js.UndefOr[Boolean] = js.undefined
  var disableDoubleTapZoom: js.UndefOr[Boolean] = js.undefined
  var disableKineticPan: js.UndefOr[Boolean] = js.undefined
  var disableTwoFingerTapZoom: js.UndefOr[Boolean] = js.undefined
  var draggable: js.UndefOr[Boolean] = js.undefined
  var keyboardShortcuts: js.UndefOr[Boolean] = js.undefined
  var logoControl: js.UndefOr[Boolean] = js.undefined
  var logoControlOptions: js.UndefOr[js.Any] = js.undefined
  var mapDataControl: js.UndefOr[Boolean] = js.undefined
  var mapDataControlOptions: js.UndefOr[js.Any] = js.undefined
  var mapTypeControl: js.UndefOr[Boolean] = js.undefined
  var mapTypeControlOptions: js.UndefOr[js.Any] = js.undefined
  var mapTypeId: js.UndefOr[String] = js.undefined
  var mapTypes: js.UndefOr[js.Any] = js.undefined
  var maxBounds: js.UndefOr[js.Any] = js.undefined
  var maxZoom: js.UndefOr[Double] = js.undefined
  var minZoom: js.UndefOr[Double] = js.undefined
  var overlayZoomEffect: js.UndefOr[Null | String] = js.undefined
  var padding: js.UndefOr[js.Any] = js.undefined
  var pinchZoom: js.UndefOr[Boolean] = js.undefined
  var resizeOrigin: js.UndefOr[js.Any] = js.undefined
  var scaleControl: js.UndefOr[Boolean] = js.undefined
  var scaleControlOptions: js.UndefOr[js.Any] = js.undefined
  var scrollWheel: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[js.Any] = js.undefined
  var tileSpare: js.UndefOr[Double] = js.undefined
  var tileTransition: js.UndefOr[Boolean] = js.undefined
  var zoom: js.UndefOr[Double] = js.undefined
  var zoomControl: js.UndefOr[Boolean] = js.undefined
  var zoomControlOptions: js.UndefOr[js.Any] = js.undefined
  var zoomOrigin: js.UndefOr[js.Any] = js.undefined
}

object MapOptions {
  @scala.inline
  def apply(
    background: String = null,
    baseTileOpacity: Int | Double = null,
    bounds: js.Any = null,
    center: js.Any = null,
    disableDoubleClickZoom: js.UndefOr[Boolean] = js.undefined,
    disableDoubleTapZoom: js.UndefOr[Boolean] = js.undefined,
    disableKineticPan: js.UndefOr[Boolean] = js.undefined,
    disableTwoFingerTapZoom: js.UndefOr[Boolean] = js.undefined,
    draggable: js.UndefOr[Boolean] = js.undefined,
    keyboardShortcuts: js.UndefOr[Boolean] = js.undefined,
    logoControl: js.UndefOr[Boolean] = js.undefined,
    logoControlOptions: js.Any = null,
    mapDataControl: js.UndefOr[Boolean] = js.undefined,
    mapDataControlOptions: js.Any = null,
    mapTypeControl: js.UndefOr[Boolean] = js.undefined,
    mapTypeControlOptions: js.Any = null,
    mapTypeId: String = null,
    mapTypes: js.Any = null,
    maxBounds: js.Any = null,
    maxZoom: Int | Double = null,
    minZoom: Int | Double = null,
    overlayZoomEffect: String = null,
    padding: js.Any = null,
    pinchZoom: js.UndefOr[Boolean] = js.undefined,
    resizeOrigin: js.Any = null,
    scaleControl: js.UndefOr[Boolean] = js.undefined,
    scaleControlOptions: js.Any = null,
    scrollWheel: js.UndefOr[Boolean] = js.undefined,
    size: js.Any = null,
    tileSpare: Int | Double = null,
    tileTransition: js.UndefOr[Boolean] = js.undefined,
    zoom: Int | Double = null,
    zoomControl: js.UndefOr[Boolean] = js.undefined,
    zoomControlOptions: js.Any = null,
    zoomOrigin: js.Any = null
  ): MapOptions = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background)
    if (baseTileOpacity != null) __obj.updateDynamic("baseTileOpacity")(baseTileOpacity.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds)
    if (center != null) __obj.updateDynamic("center")(center)
    if (!js.isUndefined(disableDoubleClickZoom)) __obj.updateDynamic("disableDoubleClickZoom")(disableDoubleClickZoom)
    if (!js.isUndefined(disableDoubleTapZoom)) __obj.updateDynamic("disableDoubleTapZoom")(disableDoubleTapZoom)
    if (!js.isUndefined(disableKineticPan)) __obj.updateDynamic("disableKineticPan")(disableKineticPan)
    if (!js.isUndefined(disableTwoFingerTapZoom)) __obj.updateDynamic("disableTwoFingerTapZoom")(disableTwoFingerTapZoom)
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (!js.isUndefined(keyboardShortcuts)) __obj.updateDynamic("keyboardShortcuts")(keyboardShortcuts)
    if (!js.isUndefined(logoControl)) __obj.updateDynamic("logoControl")(logoControl)
    if (logoControlOptions != null) __obj.updateDynamic("logoControlOptions")(logoControlOptions)
    if (!js.isUndefined(mapDataControl)) __obj.updateDynamic("mapDataControl")(mapDataControl)
    if (mapDataControlOptions != null) __obj.updateDynamic("mapDataControlOptions")(mapDataControlOptions)
    if (!js.isUndefined(mapTypeControl)) __obj.updateDynamic("mapTypeControl")(mapTypeControl)
    if (mapTypeControlOptions != null) __obj.updateDynamic("mapTypeControlOptions")(mapTypeControlOptions)
    if (mapTypeId != null) __obj.updateDynamic("mapTypeId")(mapTypeId)
    if (mapTypes != null) __obj.updateDynamic("mapTypes")(mapTypes)
    if (maxBounds != null) __obj.updateDynamic("maxBounds")(maxBounds)
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (overlayZoomEffect != null) __obj.updateDynamic("overlayZoomEffect")(overlayZoomEffect)
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (!js.isUndefined(pinchZoom)) __obj.updateDynamic("pinchZoom")(pinchZoom)
    if (resizeOrigin != null) __obj.updateDynamic("resizeOrigin")(resizeOrigin)
    if (!js.isUndefined(scaleControl)) __obj.updateDynamic("scaleControl")(scaleControl)
    if (scaleControlOptions != null) __obj.updateDynamic("scaleControlOptions")(scaleControlOptions)
    if (!js.isUndefined(scrollWheel)) __obj.updateDynamic("scrollWheel")(scrollWheel)
    if (size != null) __obj.updateDynamic("size")(size)
    if (tileSpare != null) __obj.updateDynamic("tileSpare")(tileSpare.asInstanceOf[js.Any])
    if (!js.isUndefined(tileTransition)) __obj.updateDynamic("tileTransition")(tileTransition)
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomControl)) __obj.updateDynamic("zoomControl")(zoomControl)
    if (zoomControlOptions != null) __obj.updateDynamic("zoomControlOptions")(zoomControlOptions)
    if (zoomOrigin != null) __obj.updateDynamic("zoomOrigin")(zoomOrigin)
    __obj.asInstanceOf[MapOptions]
  }
}

