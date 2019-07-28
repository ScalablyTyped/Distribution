package typings.opentypeDotJs.opentypeDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metrics extends js.Object {
  var leftSideBearing: Double
  var rightSideBearing: js.UndefOr[Double] = js.undefined
  var xMax: Double
  var xMin: Double
  var yMax: Double
  var yMin: Double
}

object Metrics {
  @scala.inline
  def apply(
    leftSideBearing: Double,
    xMax: Double,
    xMin: Double,
    yMax: Double,
    yMin: Double,
    rightSideBearing: Int | Double = null
  ): Metrics = {
    val __obj = js.Dynamic.literal(leftSideBearing = leftSideBearing, xMax = xMax, xMin = xMin, yMax = yMax, yMin = yMin)
    if (rightSideBearing != null) __obj.updateDynamic("rightSideBearing")(rightSideBearing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metrics]
  }
}

