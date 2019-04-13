package typings
package overlayscrollbarsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_XYOverflowBehavior extends js.Object {
  var x: js.UndefOr[overlayscrollbarsLib.overlayscrollbarsMod.OverflowBehavior] = js.undefined
  var y: js.UndefOr[overlayscrollbarsLib.overlayscrollbarsMod.OverflowBehavior] = js.undefined
}

object Anon_XYOverflowBehavior {
  @scala.inline
  def apply(
    x: overlayscrollbarsLib.overlayscrollbarsMod.OverflowBehavior = null,
    y: overlayscrollbarsLib.overlayscrollbarsMod.OverflowBehavior = null
  ): Anon_XYOverflowBehavior = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x)
    if (y != null) __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[Anon_XYOverflowBehavior]
  }
}

