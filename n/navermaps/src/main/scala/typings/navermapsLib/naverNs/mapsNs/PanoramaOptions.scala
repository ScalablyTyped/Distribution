package typings
package navermapsLib.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanoramaOptions extends js.Object {
  var aroundControl: scala.Boolean
  var aroundControlOptions: AroundControlOptions
  var logoControl: scala.Boolean
  var logoControlOptions: LogoControlOptions
  var maxScale: scala.Double
  var maxZoom: scala.Double
  var minScale: scala.Double
  var minZoom: scala.Double
  var panoId: java.lang.String
  var position: LatLng | LatLngLiteral
  var pov: PanoramaPov
  var size: Size | SizeLiteral
  var visible: scala.Boolean
  var zoomControl: scala.Boolean
  var zoomControlOptions: ZoomControlOptions
}

object PanoramaOptions {
  @scala.inline
  def apply(
    aroundControl: scala.Boolean,
    aroundControlOptions: AroundControlOptions,
    logoControl: scala.Boolean,
    logoControlOptions: LogoControlOptions,
    maxScale: scala.Double,
    maxZoom: scala.Double,
    minScale: scala.Double,
    minZoom: scala.Double,
    panoId: java.lang.String,
    position: LatLng | LatLngLiteral,
    pov: PanoramaPov,
    size: Size | SizeLiteral,
    visible: scala.Boolean,
    zoomControl: scala.Boolean,
    zoomControlOptions: ZoomControlOptions
  ): PanoramaOptions = {
    val __obj = js.Dynamic.literal(aroundControl = aroundControl, aroundControlOptions = aroundControlOptions, logoControl = logoControl, logoControlOptions = logoControlOptions, maxScale = maxScale, maxZoom = maxZoom, minScale = minScale, minZoom = minZoom, panoId = panoId, position = position.asInstanceOf[js.Any], pov = pov, size = size.asInstanceOf[js.Any], visible = visible, zoomControl = zoomControl, zoomControlOptions = zoomControlOptions)
  
    __obj.asInstanceOf[PanoramaOptions]
  }
}

