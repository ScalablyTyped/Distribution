package typings.navermaps.naverNs.mapsNs

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
    val __obj = js.Dynamic.literal(aroundControl = aroundControl, aroundControlOptions = aroundControlOptions, logoControl = logoControl, logoControlOptions = logoControlOptions, maxScale = maxScale, maxZoom = maxZoom, minScale = minScale, minZoom = minZoom, panoId = panoId, position = position.asInstanceOf[js.Any], pov = pov, size = size.asInstanceOf[js.Any], visible = visible, zoomControl = zoomControl, zoomControlOptions = zoomControlOptions)
  
    __obj.asInstanceOf[PanoramaOptions]
  }
}

