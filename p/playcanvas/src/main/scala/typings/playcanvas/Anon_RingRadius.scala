package typings.playcanvas

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RingRadius extends js.Object {
  var ringRadius: js.UndefOr[Double] = js.undefined
  var segments: js.UndefOr[Double] = js.undefined
  var sides: js.UndefOr[Double] = js.undefined
  var tubeRadius: js.UndefOr[Double] = js.undefined
}

object Anon_RingRadius {
  @scala.inline
  def apply(
    ringRadius: Int | Double = null,
    segments: Int | Double = null,
    sides: Int | Double = null,
    tubeRadius: Int | Double = null
  ): Anon_RingRadius = {
    val __obj = js.Dynamic.literal()
    if (ringRadius != null) __obj.updateDynamic("ringRadius")(ringRadius.asInstanceOf[js.Any])
    if (segments != null) __obj.updateDynamic("segments")(segments.asInstanceOf[js.Any])
    if (sides != null) __obj.updateDynamic("sides")(sides.asInstanceOf[js.Any])
    if (tubeRadius != null) __obj.updateDynamic("tubeRadius")(tubeRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_RingRadius]
  }
}

