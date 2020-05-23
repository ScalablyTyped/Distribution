package typings.overlayscrollbars.anon

import typings.overlayscrollbars.mod.OverflowBehavior
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XOverflowBehavior extends js.Object {
  var x: js.UndefOr[OverflowBehavior] = js.undefined
  var y: js.UndefOr[OverflowBehavior] = js.undefined
}

object XOverflowBehavior {
  @scala.inline
  def apply(x: OverflowBehavior = null, y: OverflowBehavior = null): XOverflowBehavior = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[XOverflowBehavior]
  }
}

