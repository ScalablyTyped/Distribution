package typings.opentypeDotJs.opentypeDotJsMod

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
    x: Int | Double = null,
    x1: Int | Double = null,
    x2: Int | Double = null,
    y: Int | Double = null,
    y1: Int | Double = null,
    y2: Int | Double = null
  ): PathCommand = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (x1 != null) __obj.updateDynamic("x1")(x1.asInstanceOf[js.Any])
    if (x2 != null) __obj.updateDynamic("x2")(x2.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (y1 != null) __obj.updateDynamic("y1")(y1.asInstanceOf[js.Any])
    if (y2 != null) __obj.updateDynamic("y2")(y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathCommand]
  }
}

