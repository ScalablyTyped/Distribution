package typings.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompassHeading extends js.Object {
  var headingAccuracy: js.UndefOr[Double] = js.undefined
  var magneticHeading: js.UndefOr[Double] = js.undefined
  var timestamp: js.UndefOr[Double] = js.undefined
  var trueHeading: js.UndefOr[Double] = js.undefined
}

object CompassHeading {
  @scala.inline
  def apply(
    headingAccuracy: Int | Double = null,
    magneticHeading: Int | Double = null,
    timestamp: Int | Double = null,
    trueHeading: Int | Double = null
  ): CompassHeading = {
    val __obj = js.Dynamic.literal()
    if (headingAccuracy != null) __obj.updateDynamic("headingAccuracy")(headingAccuracy.asInstanceOf[js.Any])
    if (magneticHeading != null) __obj.updateDynamic("magneticHeading")(magneticHeading.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (trueHeading != null) __obj.updateDynamic("trueHeading")(trueHeading.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompassHeading]
  }
}

