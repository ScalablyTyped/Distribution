package typings.ol.fillMod

import typings.ol.colorMod.Color
import typings.ol.colorlikeMod.ColorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var color: js.UndefOr[Color | ColorLike] = js.undefined
}

object Options {
  @scala.inline
  def apply(color: Color | ColorLike = null): Options = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

