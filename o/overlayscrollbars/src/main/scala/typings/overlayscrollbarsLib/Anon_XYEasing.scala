package typings
package overlayscrollbarsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_XYEasing extends js.Object {
  var x: js.UndefOr[overlayscrollbarsLib.overlayscrollbarsMod.Easing] = js.undefined
  var y: js.UndefOr[overlayscrollbarsLib.overlayscrollbarsMod.Easing] = js.undefined
}

object Anon_XYEasing {
  @scala.inline
  def apply(
    x: overlayscrollbarsLib.overlayscrollbarsMod.Easing = null,
    y: overlayscrollbarsLib.overlayscrollbarsMod.Easing = null
  ): Anon_XYEasing = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_XYEasing]
  }
}

