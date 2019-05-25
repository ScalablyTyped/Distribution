package typings
package olLib.sourceBingMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoverageArea extends js.Object {
  var bbox: js.Array[scala.Double]
  var zoomMax: scala.Double
  var zoomMin: scala.Double
}

object CoverageArea {
  @scala.inline
  def apply(bbox: js.Array[scala.Double], zoomMax: scala.Double, zoomMin: scala.Double): CoverageArea = {
    val __obj = js.Dynamic.literal(bbox = bbox, zoomMax = zoomMax, zoomMin = zoomMin)
  
    __obj.asInstanceOf[CoverageArea]
  }
}

