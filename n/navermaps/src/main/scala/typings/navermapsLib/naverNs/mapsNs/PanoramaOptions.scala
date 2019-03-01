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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("aroundControl")(aroundControl)
    __obj.updateDynamic("aroundControlOptions")(aroundControlOptions)
    __obj.updateDynamic("logoControl")(logoControl)
    __obj.updateDynamic("logoControlOptions")(logoControlOptions)
    __obj.updateDynamic("maxScale")(maxScale)
    __obj.updateDynamic("maxZoom")(maxZoom)
    __obj.updateDynamic("minScale")(minScale)
    __obj.updateDynamic("minZoom")(minZoom)
    __obj.updateDynamic("panoId")(panoId)
    __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.updateDynamic("pov")(pov)
    __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.updateDynamic("visible")(visible)
    __obj.updateDynamic("zoomControl")(zoomControl)
    __obj.updateDynamic("zoomControlOptions")(zoomControlOptions)
    __obj.asInstanceOf[PanoramaOptions]
  }
}

