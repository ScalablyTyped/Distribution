package typings.overlayscrollbars

import typings.overlayscrollbars.mod.OverflowBehavior
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonXOverflowBehavior extends js.Object {
  var x: js.UndefOr[OverflowBehavior] = js.undefined
  var y: js.UndefOr[OverflowBehavior] = js.undefined
}

object AnonXOverflowBehavior {
  @scala.inline
  def apply(x: OverflowBehavior = null, y: OverflowBehavior = null): AnonXOverflowBehavior = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonXOverflowBehavior]
  }
}

