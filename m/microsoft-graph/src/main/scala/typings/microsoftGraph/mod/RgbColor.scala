package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RgbColor extends js.Object {
  // Blue value
  var b: js.UndefOr[Double] = js.undefined
  // Green value
  var g: js.UndefOr[Double] = js.undefined
  // Red value
  var r: js.UndefOr[Double] = js.undefined
}

object RgbColor {
  @scala.inline
  def apply(b: Int | Double = null, g: Int | Double = null, r: Int | Double = null): RgbColor = {
    val __obj = js.Dynamic.literal()
    if (b != null) __obj.updateDynamic("b")(b.asInstanceOf[js.Any])
    if (g != null) __obj.updateDynamic("g")(g.asInstanceOf[js.Any])
    if (r != null) __obj.updateDynamic("r")(r.asInstanceOf[js.Any])
    __obj.asInstanceOf[RgbColor]
  }
}

