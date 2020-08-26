package typings.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PanoramaOptions extends js.Object {
  var aroundControl: Boolean = js.native
  var aroundControlOptions: AroundControlOptions = js.native
  var logoControl: Boolean = js.native
  var logoControlOptions: LogoControlOptions = js.native
  var maxScale: Double = js.native
  var maxZoom: Double = js.native
  var minScale: Double = js.native
  var minZoom: Double = js.native
  var panoId: String = js.native
  var position: LatLng | LatLngLiteral = js.native
  var pov: PanoramaPov = js.native
  var size: Size | SizeLiteral = js.native
  var visible: Boolean = js.native
  var zoomControl: Boolean = js.native
  var zoomControlOptions: ZoomControlOptions = js.native
}

object PanoramaOptions {
  @scala.inline
  def apply(
    aroundControl: Boolean,
    aroundControlOptions: AroundControlOptions,
    logoControl: Boolean,
    logoControlOptions: LogoControlOptions,
    maxScale: Double,
    maxZoom: Double,
    minScale: Double,
    minZoom: Double,
    panoId: String,
    position: LatLng | LatLngLiteral,
    pov: PanoramaPov,
    size: Size | SizeLiteral,
    visible: Boolean,
    zoomControl: Boolean,
    zoomControlOptions: ZoomControlOptions
  ): PanoramaOptions = {
    val __obj = js.Dynamic.literal(aroundControl = aroundControl.asInstanceOf[js.Any], aroundControlOptions = aroundControlOptions.asInstanceOf[js.Any], logoControl = logoControl.asInstanceOf[js.Any], logoControlOptions = logoControlOptions.asInstanceOf[js.Any], maxScale = maxScale.asInstanceOf[js.Any], maxZoom = maxZoom.asInstanceOf[js.Any], minScale = minScale.asInstanceOf[js.Any], minZoom = minZoom.asInstanceOf[js.Any], panoId = panoId.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], pov = pov.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], zoomControl = zoomControl.asInstanceOf[js.Any], zoomControlOptions = zoomControlOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanoramaOptions]
  }
  @scala.inline
  implicit class PanoramaOptionsOps[Self <: PanoramaOptions] (val x: Self) extends AnyVal {
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
    def setAroundControl(value: Boolean): Self = this.set("aroundControl", value.asInstanceOf[js.Any])
    @scala.inline
    def setAroundControlOptions(value: AroundControlOptions): Self = this.set("aroundControlOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogoControl(value: Boolean): Self = this.set("logoControl", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogoControlOptions(value: LogoControlOptions): Self = this.set("logoControlOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxScale(value: Double): Self = this.set("maxScale", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxZoom(value: Double): Self = this.set("maxZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinScale(value: Double): Self = this.set("minScale", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinZoom(value: Double): Self = this.set("minZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def setPanoId(value: String): Self = this.set("panoId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: LatLng | LatLngLiteral): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setPov(value: PanoramaPov): Self = this.set("pov", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Size | SizeLiteral): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def setZoomControl(value: Boolean): Self = this.set("zoomControl", value.asInstanceOf[js.Any])
    @scala.inline
    def setZoomControlOptions(value: ZoomControlOptions): Self = this.set("zoomControlOptions", value.asInstanceOf[js.Any])
  }
  
}

