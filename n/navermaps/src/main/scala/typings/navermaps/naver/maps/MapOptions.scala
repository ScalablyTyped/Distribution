package typings.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapOptions extends js.Object {
  var background: js.UndefOr[String] = js.native
  var baseTileOpacity: js.UndefOr[Double] = js.native
  var bounds: js.UndefOr[js.Any] = js.native
  var center: js.UndefOr[js.Any] = js.native
  var disableDoubleClickZoom: js.UndefOr[Boolean] = js.native
  var disableDoubleTapZoom: js.UndefOr[Boolean] = js.native
  var disableKineticPan: js.UndefOr[Boolean] = js.native
  var disableTwoFingerTapZoom: js.UndefOr[Boolean] = js.native
  var draggable: js.UndefOr[Boolean] = js.native
  var keyboardShortcuts: js.UndefOr[Boolean] = js.native
  var logoControl: js.UndefOr[Boolean] = js.native
  var logoControlOptions: js.UndefOr[js.Any] = js.native
  var mapDataControl: js.UndefOr[Boolean] = js.native
  var mapDataControlOptions: js.UndefOr[js.Any] = js.native
  var mapTypeControl: js.UndefOr[Boolean] = js.native
  var mapTypeControlOptions: js.UndefOr[js.Any] = js.native
  var mapTypeId: js.UndefOr[String] = js.native
  var mapTypes: js.UndefOr[js.Any] = js.native
  var maxBounds: js.UndefOr[js.Any] = js.native
  var maxZoom: js.UndefOr[Double] = js.native
  var minZoom: js.UndefOr[Double] = js.native
  var overlayZoomEffect: js.UndefOr[Null | String] = js.native
  var padding: js.UndefOr[js.Any] = js.native
  var pinchZoom: js.UndefOr[Boolean] = js.native
  var resizeOrigin: js.UndefOr[js.Any] = js.native
  var scaleControl: js.UndefOr[Boolean] = js.native
  var scaleControlOptions: js.UndefOr[js.Any] = js.native
  var scrollWheel: js.UndefOr[Boolean] = js.native
  var size: js.UndefOr[js.Any] = js.native
  var tileSpare: js.UndefOr[Double] = js.native
  var tileTransition: js.UndefOr[Boolean] = js.native
  var zoom: js.UndefOr[Double] = js.native
  var zoomControl: js.UndefOr[Boolean] = js.native
  var zoomControlOptions: js.UndefOr[js.Any] = js.native
  var zoomOrigin: js.UndefOr[js.Any] = js.native
}

object MapOptions {
  @scala.inline
  def apply(): MapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapOptions]
  }
  @scala.inline
  implicit class MapOptionsOps[Self <: MapOptions] (val x: Self) extends AnyVal {
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
    def setBackground(value: String): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    @scala.inline
    def setBaseTileOpacity(value: Double): Self = this.set("baseTileOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseTileOpacity: Self = this.set("baseTileOpacity", js.undefined)
    @scala.inline
    def setBounds(value: js.Any): Self = this.set("bounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBounds: Self = this.set("bounds", js.undefined)
    @scala.inline
    def setCenter(value: js.Any): Self = this.set("center", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    @scala.inline
    def setDisableDoubleClickZoom(value: Boolean): Self = this.set("disableDoubleClickZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableDoubleClickZoom: Self = this.set("disableDoubleClickZoom", js.undefined)
    @scala.inline
    def setDisableDoubleTapZoom(value: Boolean): Self = this.set("disableDoubleTapZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableDoubleTapZoom: Self = this.set("disableDoubleTapZoom", js.undefined)
    @scala.inline
    def setDisableKineticPan(value: Boolean): Self = this.set("disableKineticPan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableKineticPan: Self = this.set("disableKineticPan", js.undefined)
    @scala.inline
    def setDisableTwoFingerTapZoom(value: Boolean): Self = this.set("disableTwoFingerTapZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableTwoFingerTapZoom: Self = this.set("disableTwoFingerTapZoom", js.undefined)
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    @scala.inline
    def setKeyboardShortcuts(value: Boolean): Self = this.set("keyboardShortcuts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboardShortcuts: Self = this.set("keyboardShortcuts", js.undefined)
    @scala.inline
    def setLogoControl(value: Boolean): Self = this.set("logoControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogoControl: Self = this.set("logoControl", js.undefined)
    @scala.inline
    def setLogoControlOptions(value: js.Any): Self = this.set("logoControlOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogoControlOptions: Self = this.set("logoControlOptions", js.undefined)
    @scala.inline
    def setMapDataControl(value: Boolean): Self = this.set("mapDataControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapDataControl: Self = this.set("mapDataControl", js.undefined)
    @scala.inline
    def setMapDataControlOptions(value: js.Any): Self = this.set("mapDataControlOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapDataControlOptions: Self = this.set("mapDataControlOptions", js.undefined)
    @scala.inline
    def setMapTypeControl(value: Boolean): Self = this.set("mapTypeControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapTypeControl: Self = this.set("mapTypeControl", js.undefined)
    @scala.inline
    def setMapTypeControlOptions(value: js.Any): Self = this.set("mapTypeControlOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapTypeControlOptions: Self = this.set("mapTypeControlOptions", js.undefined)
    @scala.inline
    def setMapTypeId(value: String): Self = this.set("mapTypeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapTypeId: Self = this.set("mapTypeId", js.undefined)
    @scala.inline
    def setMapTypes(value: js.Any): Self = this.set("mapTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapTypes: Self = this.set("mapTypes", js.undefined)
    @scala.inline
    def setMaxBounds(value: js.Any): Self = this.set("maxBounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxBounds: Self = this.set("maxBounds", js.undefined)
    @scala.inline
    def setMaxZoom(value: Double): Self = this.set("maxZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxZoom: Self = this.set("maxZoom", js.undefined)
    @scala.inline
    def setMinZoom(value: Double): Self = this.set("minZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinZoom: Self = this.set("minZoom", js.undefined)
    @scala.inline
    def setOverlayZoomEffect(value: String): Self = this.set("overlayZoomEffect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlayZoomEffect: Self = this.set("overlayZoomEffect", js.undefined)
    @scala.inline
    def setOverlayZoomEffectNull: Self = this.set("overlayZoomEffect", null)
    @scala.inline
    def setPadding(value: js.Any): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setPinchZoom(value: Boolean): Self = this.set("pinchZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePinchZoom: Self = this.set("pinchZoom", js.undefined)
    @scala.inline
    def setResizeOrigin(value: js.Any): Self = this.set("resizeOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResizeOrigin: Self = this.set("resizeOrigin", js.undefined)
    @scala.inline
    def setScaleControl(value: Boolean): Self = this.set("scaleControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleControl: Self = this.set("scaleControl", js.undefined)
    @scala.inline
    def setScaleControlOptions(value: js.Any): Self = this.set("scaleControlOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleControlOptions: Self = this.set("scaleControlOptions", js.undefined)
    @scala.inline
    def setScrollWheel(value: Boolean): Self = this.set("scrollWheel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollWheel: Self = this.set("scrollWheel", js.undefined)
    @scala.inline
    def setSize(value: js.Any): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setTileSpare(value: Double): Self = this.set("tileSpare", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTileSpare: Self = this.set("tileSpare", js.undefined)
    @scala.inline
    def setTileTransition(value: Boolean): Self = this.set("tileTransition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTileTransition: Self = this.set("tileTransition", js.undefined)
    @scala.inline
    def setZoom(value: Double): Self = this.set("zoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
    @scala.inline
    def setZoomControl(value: Boolean): Self = this.set("zoomControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomControl: Self = this.set("zoomControl", js.undefined)
    @scala.inline
    def setZoomControlOptions(value: js.Any): Self = this.set("zoomControlOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomControlOptions: Self = this.set("zoomControlOptions", js.undefined)
    @scala.inline
    def setZoomOrigin(value: js.Any): Self = this.set("zoomOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomOrigin: Self = this.set("zoomOrigin", js.undefined)
  }
  
}

