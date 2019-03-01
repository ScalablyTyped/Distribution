package typings
package overlayscrollbarsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_XYBlockBehavior extends js.Object {
  var x: js.UndefOr[overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.BlockBehavior] = js.undefined
  var y: js.UndefOr[overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.BlockBehavior] = js.undefined
}

object Anon_XYBlockBehavior {
  @scala.inline
  def apply(
    x: overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.BlockBehavior = null,
    y: overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.BlockBehavior = null
  ): Anon_XYBlockBehavior = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x)
    if (y != null) __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[Anon_XYBlockBehavior]
  }
}

