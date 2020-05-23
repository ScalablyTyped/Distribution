package typings.playcanvas.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseRadius extends js.Object {
  var baseRadius: js.UndefOr[Double] = js.undefined
  var capSegments: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var heightSegments: js.UndefOr[Double] = js.undefined
  var peakRadius: js.UndefOr[Double] = js.undefined
}

object BaseRadius {
  @scala.inline
  def apply(
    baseRadius: js.UndefOr[Double] = js.undefined,
    capSegments: js.UndefOr[Double] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    heightSegments: js.UndefOr[Double] = js.undefined,
    peakRadius: js.UndefOr[Double] = js.undefined
  ): BaseRadius = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(baseRadius)) __obj.updateDynamic("baseRadius")(baseRadius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(capSegments)) __obj.updateDynamic("capSegments")(capSegments.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(heightSegments)) __obj.updateDynamic("heightSegments")(heightSegments.get.asInstanceOf[js.Any])
    if (!js.isUndefined(peakRadius)) __obj.updateDynamic("peakRadius")(peakRadius.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseRadius]
  }
}

