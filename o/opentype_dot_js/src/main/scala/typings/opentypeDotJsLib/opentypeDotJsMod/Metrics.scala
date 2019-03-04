package typings
package opentypeDotJsLib.opentypeDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metrics extends js.Object {
  var leftSideBearing: scala.Double
  var rightSideBearing: js.UndefOr[scala.Double] = js.undefined
  var xMax: scala.Double
  var xMin: scala.Double
  var yMax: scala.Double
  var yMin: scala.Double
}

object Metrics {
  @scala.inline
  def apply(
    leftSideBearing: scala.Double,
    xMax: scala.Double,
    xMin: scala.Double,
    yMax: scala.Double,
    yMin: scala.Double,
    rightSideBearing: scala.Int | scala.Double = null
  ): Metrics = {
    val __obj = js.Dynamic.literal(leftSideBearing = leftSideBearing, xMax = xMax, xMin = xMin, yMax = yMax, yMin = yMin)
    if (rightSideBearing != null) __obj.updateDynamic("rightSideBearing")(rightSideBearing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metrics]
  }
}

