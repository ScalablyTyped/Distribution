package typings.openlayers.mod.olx.style

import typings.openlayers.mod.ColorLike_
import typings.openlayers.mod.Color_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FillOptions extends js.Object {
  var color: js.UndefOr[Color_ | ColorLike_] = js.undefined
}

object FillOptions {
  @scala.inline
  def apply(color: Color_ | ColorLike_ = null): FillOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillOptions]
  }
}

