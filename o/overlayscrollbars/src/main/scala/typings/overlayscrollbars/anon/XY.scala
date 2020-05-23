package typings.overlayscrollbars.anon

import typings.overlayscrollbars.mod.BlockBehavior
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XY extends js.Object {
  var x: js.UndefOr[BlockBehavior] = js.undefined
  var y: js.UndefOr[BlockBehavior] = js.undefined
}

object XY {
  @scala.inline
  def apply(x: BlockBehavior = null, y: BlockBehavior = null): XY = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[XY]
  }
}

