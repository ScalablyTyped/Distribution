package typings
package navermapsLib.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapOptions extends js.Object {
  var background: js.UndefOr[java.lang.String] = js.undefined
  var baseTileOpacity: js.UndefOr[scala.Double] = js.undefined
  var bounds: js.UndefOr[js.Any] = js.undefined
  var center: js.UndefOr[js.Any] = js.undefined
  var disableDoubleClickZoom: js.UndefOr[scala.Boolean] = js.undefined
  var disableDoubleTapZoom: js.UndefOr[scala.Boolean] = js.undefined
  var disableKineticPan: js.UndefOr[scala.Boolean] = js.undefined
  var disableTwoFingerTapZoom: js.UndefOr[scala.Boolean] = js.undefined
  var draggable: js.UndefOr[scala.Boolean] = js.undefined
  var keyboardShortcuts: js.UndefOr[scala.Boolean] = js.undefined
  var logoControl: js.UndefOr[scala.Boolean] = js.undefined
  var logoControlOptions: js.UndefOr[js.Any] = js.undefined
  var mapDataControl: js.UndefOr[scala.Boolean] = js.undefined
  var mapDataControlOptions: js.UndefOr[js.Any] = js.undefined
  var mapTypeControl: js.UndefOr[scala.Boolean] = js.undefined
  var mapTypeControlOptions: js.UndefOr[js.Any] = js.undefined
  var mapTypeId: js.UndefOr[java.lang.String] = js.undefined
  var mapTypes: js.UndefOr[js.Any] = js.undefined
  var maxBounds: js.UndefOr[js.Any] = js.undefined
  var maxZoom: js.UndefOr[scala.Double] = js.undefined
  var minZoom: js.UndefOr[scala.Double] = js.undefined
  var overlayZoomEffect: js.UndefOr[scala.Null | java.lang.String] = js.undefined
  var padding: js.UndefOr[js.Any] = js.undefined
  var pinchZoom: js.UndefOr[scala.Boolean] = js.undefined
  var resizeOrigin: js.UndefOr[js.Any] = js.undefined
  var scaleControl: js.UndefOr[scala.Boolean] = js.undefined
  var scaleControlOptions: js.UndefOr[js.Any] = js.undefined
  var scrollWheel: js.UndefOr[scala.Boolean] = js.undefined
  var size: js.UndefOr[js.Any] = js.undefined
  var tileSpare: js.UndefOr[scala.Double] = js.undefined
  var tileTransition: js.UndefOr[scala.Boolean] = js.undefined
  var zoom: js.UndefOr[scala.Double] = js.undefined
  var zoomControl: js.UndefOr[scala.Boolean] = js.undefined
  var zoomControlOptions: js.UndefOr[js.Any] = js.undefined
  var zoomOrigin: js.UndefOr[js.Any] = js.undefined
}

object MapOptions {
  @scala.inline
  def apply(
    background: java.lang.String = null,
    baseTileOpacity: scala.Int | scala.Double = null,
    bounds: js.Any = null,
    center: js.Any = null,
    disableDoubleClickZoom: js.UndefOr[scala.Boolean] = js.undefined,
    disableDoubleTapZoom: js.UndefOr[scala.Boolean] = js.undefined,
    disableKineticPan: js.UndefOr[scala.Boolean] = js.undefined,
    disableTwoFingerTapZoom: js.UndefOr[scala.Boolean] = js.undefined,
    draggable: js.UndefOr[scala.Boolean] = js.undefined,
    keyboardShortcuts: js.UndefOr[scala.Boolean] = js.undefined,
    logoControl: js.UndefOr[scala.Boolean] = js.undefined,
    logoControlOptions: js.Any = null,
    mapDataControl: js.UndefOr[scala.Boolean] = js.undefined,
    mapDataControlOptions: js.Any = null,
    mapTypeControl: js.UndefOr[scala.Boolean] = js.undefined,
    mapTypeControlOptions: js.Any = null,
    mapTypeId: java.lang.String = null,
    mapTypes: js.Any = null,
    maxBounds: js.Any = null,
    maxZoom: scala.Int | scala.Double = null,
    minZoom: scala.Int | scala.Double = null,
    overlayZoomEffect: java.lang.String = null,
    padding: js.Any = null,
    pinchZoom: js.UndefOr[scala.Boolean] = js.undefined,
    resizeOrigin: js.Any = null,
    scaleControl: js.UndefOr[scala.Boolean] = js.undefined,
    scaleControlOptions: js.Any = null,
    scrollWheel: js.UndefOr[scala.Boolean] = js.undefined,
    size: js.Any = null,
    tileSpare: scala.Int | scala.Double = null,
    tileTransition: js.UndefOr[scala.Boolean] = js.undefined,
    zoom: scala.Int | scala.Double = null,
    zoomControl: js.UndefOr[scala.Boolean] = js.undefined,
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

