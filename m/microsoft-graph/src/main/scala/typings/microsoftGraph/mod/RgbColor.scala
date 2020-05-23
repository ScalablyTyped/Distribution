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
  def apply(
    b: js.UndefOr[Double] = js.undefined,
    g: js.UndefOr[Double] = js.undefined,
    r: js.UndefOr[Double] = js.undefined
  ): RgbColor = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(b)) __obj.updateDynamic("b")(b.get.asInstanceOf[js.Any])
    if (!js.isUndefined(g)) __obj.updateDynamic("g")(g.get.asInstanceOf[js.Any])
    if (!js.isUndefined(r)) __obj.updateDynamic("r")(r.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RgbColor]
  }
}

