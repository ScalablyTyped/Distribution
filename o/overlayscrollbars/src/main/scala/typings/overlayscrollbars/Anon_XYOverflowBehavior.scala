package typings.overlayscrollbars

import typings.overlayscrollbars.overlayscrollbarsMod.OverflowBehavior
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_XYOverflowBehavior extends js.Object {
  var x: js.UndefOr[OverflowBehavior] = js.undefined
  var y: js.UndefOr[OverflowBehavior] = js.undefined
}

object Anon_XYOverflowBehavior {
  @scala.inline
  def apply(x: OverflowBehavior = null, y: OverflowBehavior = null): Anon_XYOverflowBehavior = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x)
    if (y != null) __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[Anon_XYOverflowBehavior]
  }
}

