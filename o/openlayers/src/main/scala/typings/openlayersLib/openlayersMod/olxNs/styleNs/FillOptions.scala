package typings
package openlayersLib.openlayersMod.olxNs.styleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FillOptions extends js.Object {
  var color: js.UndefOr[openlayersLib.openlayersMod.Color | openlayersLib.openlayersMod.ColorLike] = js.undefined
}

object FillOptions {
  @scala.inline
  def apply(color: openlayersLib.openlayersMod.Color | openlayersLib.openlayersMod.ColorLike = null): FillOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillOptions]
  }
}

