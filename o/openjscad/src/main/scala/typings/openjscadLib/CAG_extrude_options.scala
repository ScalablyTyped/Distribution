package typings
package openjscadLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CAG_extrude_options extends js.Object {
  var offset: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var twistangle: js.UndefOr[scala.Double] = js.undefined
  var twiststeps: js.UndefOr[scala.Double] = js.undefined
}

object CAG_extrude_options {
  @scala.inline
  def apply(
    offset: js.Array[scala.Double] = null,
    twistangle: scala.Int | scala.Double = null,
    twiststeps: scala.Int | scala.Double = null
  ): CAG_extrude_options = {
    val __obj = js.Dynamic.literal()
    if (offset != null) __obj.updateDynamic("offset")(offset)
    if (twistangle != null) __obj.updateDynamic("twistangle")(twistangle.asInstanceOf[js.Any])
    if (twiststeps != null) __obj.updateDynamic("twiststeps")(twiststeps.asInstanceOf[js.Any])
    __obj.asInstanceOf[CAG_extrude_options]
  }
}

