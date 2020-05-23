package typings.overlayscrollbars.anon

import typings.overlayscrollbars.mod.Easing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XEasing extends js.Object {
  var x: js.UndefOr[Easing] = js.undefined
  var y: js.UndefOr[Easing] = js.undefined
}

object XEasing {
  @scala.inline
  def apply(x: js.UndefOr[Null | Easing] = js.undefined, y: js.UndefOr[Null | Easing] = js.undefined): XEasing = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[XEasing]
  }
}

