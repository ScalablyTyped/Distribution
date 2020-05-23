package typings.playcanvas.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RingRadius extends js.Object {
  var ringRadius: js.UndefOr[Double] = js.undefined
  var segments: js.UndefOr[Double] = js.undefined
  var sides: js.UndefOr[Double] = js.undefined
  var tubeRadius: js.UndefOr[Double] = js.undefined
}

object RingRadius {
  @scala.inline
  def apply(
    ringRadius: js.UndefOr[Double] = js.undefined,
    segments: js.UndefOr[Double] = js.undefined,
    sides: js.UndefOr[Double] = js.undefined,
    tubeRadius: js.UndefOr[Double] = js.undefined
  ): RingRadius = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ringRadius)) __obj.updateDynamic("ringRadius")(ringRadius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(segments)) __obj.updateDynamic("segments")(segments.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sides)) __obj.updateDynamic("sides")(sides.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tubeRadius)) __obj.updateDynamic("tubeRadius")(tubeRadius.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RingRadius]
  }
}

