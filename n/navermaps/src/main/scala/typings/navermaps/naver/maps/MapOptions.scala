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
    baseTileOpacity: js.UndefOr[Double] = js.undefined,
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
    maxZoom: js.UndefOr[Double] = js.undefined,
    minZoom: js.UndefOr[Double] = js.undefined,
    overlayZoomEffect: js.UndefOr[Null | String] = js.undefined,
    padding: js.Any = null,
    pinchZoom: js.UndefOr[Boolean] = js.undefined,
    resizeOrigin: js.Any = null,
    scaleControl: js.UndefOr[Boolean] = js.undefined,
    scaleControlOptions: js.Any = null,
    scrollWheel: js.UndefOr[Boolean] = js.undefined,
    size: js.Any = null,
    tileSpare: js.UndefOr[Double] = js.undefined,
    tileTransition: js.UndefOr[Boolean] = js.undefined,
    zoom: js.UndefOr[Double] = js.undefined,
    zoomControl: js.UndefOr[Boolean] = js.undefined,
    zoomControlOptions: js.Any = null,
    zoomOrigin: js.Any = null
  ): MapOptions = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (!js.isUndefined(baseTileOpacity)) __obj.updateDynamic("baseTileOpacity")(baseTileOpacity.get.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (!js.isUndefined(disableDoubleClickZoom)) __obj.updateDynamic("disableDoubleClickZoom")(disableDoubleClickZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableDoubleTapZoom)) __obj.updateDynamic("disableDoubleTapZoom")(disableDoubleTapZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableKineticPan)) __obj.updateDynamic("disableKineticPan")(disableKineticPan.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableTwoFingerTapZoom)) __obj.updateDynamic("disableTwoFingerTapZoom")(disableTwoFingerTapZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboardShortcuts)) __obj.updateDynamic("keyboardShortcuts")(keyboardShortcuts.get.asInstanceOf[js.Any])
    if (!js.isUndefined(logoControl)) __obj.updateDynamic("logoControl")(logoControl.get.asInstanceOf[js.Any])
    if (logoControlOptions != null) __obj.updateDynamic("logoControlOptions")(logoControlOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(mapDataControl)) __obj.updateDynamic("mapDataControl")(mapDataControl.get.asInstanceOf[js.Any])
    if (mapDataControlOptions != null) __obj.updateDynamic("mapDataControlOptions")(mapDataControlOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(mapTypeControl)) __obj.updateDynamic("mapTypeControl")(mapTypeControl.get.asInstanceOf[js.Any])
    if (mapTypeControlOptions != null) __obj.updateDynamic("mapTypeControlOptions")(mapTypeControlOptions.asInstanceOf[js.Any])
    if (mapTypeId != null) __obj.updateDynamic("mapTypeId")(mapTypeId.asInstanceOf[js.Any])
    if (mapTypes != null) __obj.updateDynamic("mapTypes")(mapTypes.asInstanceOf[js.Any])
    if (maxBounds != null) __obj.updateDynamic("maxBounds")(maxBounds.asInstanceOf[js.Any])
    if (!js.isUndefined(maxZoom)) __obj.updateDynamic("maxZoom")(maxZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minZoom)) __obj.updateDynamic("minZoom")(minZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(overlayZoomEffect)) __obj.updateDynamic("overlayZoomEffect")(overlayZoomEffect.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (!js.isUndefined(pinchZoom)) __obj.updateDynamic("pinchZoom")(pinchZoom.get.asInstanceOf[js.Any])
    if (resizeOrigin != null) __obj.updateDynamic("resizeOrigin")(resizeOrigin.asInstanceOf[js.Any])
    if (!js.isUndefined(scaleControl)) __obj.updateDynamic("scaleControl")(scaleControl.get.asInstanceOf[js.Any])
    if (scaleControlOptions != null) __obj.updateDynamic("scaleControlOptions")(scaleControlOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollWheel)) __obj.updateDynamic("scrollWheel")(scrollWheel.get.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(tileSpare)) __obj.updateDynamic("tileSpare")(tileSpare.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tileTransition)) __obj.updateDynamic("tileTransition")(tileTransition.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoom)) __obj.updateDynamic("zoom")(zoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomControl)) __obj.updateDynamic("zoomControl")(zoomControl.get.asInstanceOf[js.Any])
    if (zoomControlOptions != null) __obj.updateDynamic("zoomControlOptions")(zoomControlOptions.asInstanceOf[js.Any])
    if (zoomOrigin != null) __obj.updateDynamic("zoomOrigin")(zoomOrigin.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapOptions]
  }
}

