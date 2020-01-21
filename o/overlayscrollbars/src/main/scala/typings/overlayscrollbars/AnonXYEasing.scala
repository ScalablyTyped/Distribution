package typings.overlayscrollbars

import typings.overlayscrollbars.mod.Easing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonXYEasing extends js.Object {
  var x: js.UndefOr[Easing] = js.undefined
  var y: js.UndefOr[Easing] = js.undefined
}

object AnonXYEasing {
  @scala.inline
  def apply(x: Easing = null, y: Easing = null): AnonXYEasing = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonXYEasing]
  }
}

