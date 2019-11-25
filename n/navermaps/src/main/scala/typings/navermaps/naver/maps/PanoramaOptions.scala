package typings.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanoramaOptions extends js.Object {
  var aroundControl: Boolean
  var aroundControlOptions: AroundControlOptions
  var logoControl: Boolean
  var logoControlOptions: LogoControlOptions
  var maxScale: Double
  var maxZoom: Double
  var minScale: Double
  var minZoom: Double
  var panoId: String
  var position: LatLng | LatLngLiteral
  var pov: PanoramaPov
  var size: Size | SizeLiteral
  var visible: Boolean
  var zoomControl: Boolean
  var zoomControlOptions: ZoomControlOptions
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
}

