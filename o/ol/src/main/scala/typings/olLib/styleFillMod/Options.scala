package typings
package olLib.styleFillMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var color: js.UndefOr[olLib.colorMod.Color | olLib.colorlikeMod.ColorLike] = js.undefined
}

object Options {
  @scala.inline
  def apply(color: olLib.colorMod.Color | olLib.colorlikeMod.ColorLike = null): Options = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

