package typings.popperDotJs

import typings.popperDotJs.popperDotJsStrings.bottom
import typings.popperDotJs.popperDotJsStrings.left
import typings.popperDotJs.popperDotJsStrings.right
import typings.popperDotJs.popperDotJsStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bottom extends js.Object {
  var gpuAcceleration: js.UndefOr[Boolean] = js.undefined
  var x: js.UndefOr[bottom | top] = js.undefined
  var y: js.UndefOr[left | right] = js.undefined
}

object Anon_Bottom {
  @scala.inline
  def apply(
    gpuAcceleration: js.UndefOr[Boolean] = js.undefined,
    x: bottom | top = null,
    y: left | right = null
  ): Anon_Bottom = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(gpuAcceleration)) __obj.updateDynamic("gpuAcceleration")(gpuAcceleration.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Bottom]
  }
}

