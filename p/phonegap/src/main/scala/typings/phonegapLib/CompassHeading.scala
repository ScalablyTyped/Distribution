package typings
package phonegapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompassHeading extends js.Object {
  var headingAccuracy: js.UndefOr[scala.Double] = js.undefined
  var magneticHeading: js.UndefOr[scala.Double] = js.undefined
  var timestamp: js.UndefOr[scala.Double] = js.undefined
  var trueHeading: js.UndefOr[scala.Double] = js.undefined
}

object CompassHeading {
  @scala.inline
  def apply(
    headingAccuracy: scala.Int | scala.Double = null,
    magneticHeading: scala.Int | scala.Double = null,
    timestamp: scala.Int | scala.Double = null,
    trueHeading: scala.Int | scala.Double = null
  ): CompassHeading = {
    val __obj = js.Dynamic.literal()
    if (headingAccuracy != null) __obj.updateDynamic("headingAccuracy")(headingAccuracy.asInstanceOf[js.Any])
    if (magneticHeading != null) __obj.updateDynamic("magneticHeading")(magneticHeading.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (trueHeading != null) __obj.updateDynamic("trueHeading")(trueHeading.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompassHeading]
  }
}

