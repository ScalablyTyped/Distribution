package typings
package overlayscrollbarsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_XY extends js.Object {
  var x: js.UndefOr[overlayscrollbarsLib.overlayscrollbarsMod.ScrollBehavior] = js.undefined
  var y: js.UndefOr[overlayscrollbarsLib.overlayscrollbarsMod.ScrollBehavior] = js.undefined
}

object Anon_XY {
  @scala.inline
  def apply(
    x: overlayscrollbarsLib.overlayscrollbarsMod.ScrollBehavior = null,
    y: overlayscrollbarsLib.overlayscrollbarsMod.ScrollBehavior = null
  ): Anon_XY = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x)
    if (y != null) __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[Anon_XY]
  }
}

