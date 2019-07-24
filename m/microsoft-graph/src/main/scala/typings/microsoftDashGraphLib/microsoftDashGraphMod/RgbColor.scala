package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RgbColor extends js.Object {
  // Blue value
  var b: js.UndefOr[scala.Double] = js.undefined
  // Green value
  var g: js.UndefOr[scala.Double] = js.undefined
  // Red value
  var r: js.UndefOr[scala.Double] = js.undefined
}

object RgbColor {
  @scala.inline
  def apply(
    b: scala.Int | scala.Double = null,
    g: scala.Int | scala.Double = null,
    r: scala.Int | scala.Double = null
  ): RgbColor = {
    val __obj = js.Dynamic.literal()
    if (b != null) __obj.updateDynamic("b")(b.asInstanceOf[js.Any])
    if (g != null) __obj.updateDynamic("g")(g.asInstanceOf[js.Any])
    if (r != null) __obj.updateDynamic("r")(r.asInstanceOf[js.Any])
    __obj.asInstanceOf[RgbColor]
  }
}

