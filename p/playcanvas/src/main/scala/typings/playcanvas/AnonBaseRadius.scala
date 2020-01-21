package typings.playcanvas

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBaseRadius extends js.Object {
  var baseRadius: js.UndefOr[Double] = js.undefined
  var capSegments: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var heightSegments: js.UndefOr[Double] = js.undefined
  var peakRadius: js.UndefOr[Double] = js.undefined
}

object AnonBaseRadius {
  @scala.inline
  def apply(
    baseRadius: Int | Double = null,
    capSegments: Int | Double = null,
    height: Int | Double = null,
    heightSegments: Int | Double = null,
    peakRadius: Int | Double = null
  ): AnonBaseRadius = {
    val __obj = js.Dynamic.literal()
    if (baseRadius != null) __obj.updateDynamic("baseRadius")(baseRadius.asInstanceOf[js.Any])
    if (capSegments != null) __obj.updateDynamic("capSegments")(capSegments.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (heightSegments != null) __obj.updateDynamic("heightSegments")(heightSegments.asInstanceOf[js.Any])
    if (peakRadius != null) __obj.updateDynamic("peakRadius")(peakRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBaseRadius]
  }
}

