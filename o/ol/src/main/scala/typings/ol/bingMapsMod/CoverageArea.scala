package typings.ol.bingMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoverageArea extends js.Object {
  var bbox: js.Array[Double]
  var zoomMax: Double
  var zoomMin: Double
}

object CoverageArea {
  @scala.inline
  def apply(bbox: js.Array[Double], zoomMax: Double, zoomMin: Double): CoverageArea = {
    val __obj = js.Dynamic.literal(bbox = bbox.asInstanceOf[js.Any], zoomMax = zoomMax.asInstanceOf[js.Any], zoomMin = zoomMin.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverageArea]
  }
}

