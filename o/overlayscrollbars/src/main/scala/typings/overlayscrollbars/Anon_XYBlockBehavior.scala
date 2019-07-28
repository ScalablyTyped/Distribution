package typings.overlayscrollbars

import typings.overlayscrollbars.overlayscrollbarsMod.BlockBehavior
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_XYBlockBehavior extends js.Object {
  var x: js.UndefOr[BlockBehavior] = js.undefined
  var y: js.UndefOr[BlockBehavior] = js.undefined
}

object Anon_XYBlockBehavior {
  @scala.inline
  def apply(x: BlockBehavior = null, y: BlockBehavior = null): Anon_XYBlockBehavior = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x)
    if (y != null) __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[Anon_XYBlockBehavior]
  }
}

