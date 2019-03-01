package typings
package npmlogLib.npmlogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleObject extends js.Object {
  var bell: js.UndefOr[scala.Boolean] = js.undefined
  var bg: js.UndefOr[java.lang.String] = js.undefined
  var bold: js.UndefOr[scala.Boolean] = js.undefined
  var fg: js.UndefOr[java.lang.String] = js.undefined
  var inverse: js.UndefOr[scala.Boolean] = js.undefined
  var underline: js.UndefOr[scala.Boolean] = js.undefined
}

object StyleObject {
  @scala.inline
  def apply(
    bell: js.UndefOr[scala.Boolean] = js.undefined,
    bg: java.lang.String = null,
    bold: js.UndefOr[scala.Boolean] = js.undefined,
    fg: java.lang.String = null,
    inverse: js.UndefOr[scala.Boolean] = js.undefined,
    underline: js.UndefOr[scala.Boolean] = js.undefined
  ): StyleObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bell)) __obj.updateDynamic("bell")(bell)
    if (bg != null) __obj.updateDynamic("bg")(bg)
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold)
    if (fg != null) __obj.updateDynamic("fg")(fg)
    if (!js.isUndefined(inverse)) __obj.updateDynamic("inverse")(inverse)
    if (!js.isUndefined(underline)) __obj.updateDynamic("underline")(underline)
    __obj.asInstanceOf[StyleObject]
  }
}

