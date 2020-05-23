package typings.opentypeJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathCommand extends js.Object {
  var `type`: String
  var x: js.UndefOr[Double] = js.undefined
  var x1: js.UndefOr[Double] = js.undefined
  var x2: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
  var y1: js.UndefOr[Double] = js.undefined
  var y2: js.UndefOr[Double] = js.undefined
}

object PathCommand {
  @scala.inline
  def apply(
    `type`: String,
    x: js.UndefOr[Double] = js.undefined,
    x1: js.UndefOr[Double] = js.undefined,
    x2: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined,
    y1: js.UndefOr[Double] = js.undefined,
    y2: js.UndefOr[Double] = js.undefined
  ): PathCommand = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x1)) __obj.updateDynamic("x1")(x1.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x2)) __obj.updateDynamic("x2")(x2.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y1)) __obj.updateDynamic("y1")(y1.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y2)) __obj.updateDynamic("y2")(y2.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathCommand]
  }
}

