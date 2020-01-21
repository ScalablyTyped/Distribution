package typings.npmlog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleObject extends js.Object {
  var bell: js.UndefOr[Boolean] = js.undefined
  var bg: js.UndefOr[String] = js.undefined
  var bold: js.UndefOr[Boolean] = js.undefined
  var fg: js.UndefOr[String] = js.undefined
  var inverse: js.UndefOr[Boolean] = js.undefined
  var underline: js.UndefOr[Boolean] = js.undefined
}

object StyleObject {
  @scala.inline
  def apply(
    bell: js.UndefOr[Boolean] = js.undefined,
    bg: String = null,
    bold: js.UndefOr[Boolean] = js.undefined,
    fg: String = null,
    inverse: js.UndefOr[Boolean] = js.undefined,
    underline: js.UndefOr[Boolean] = js.undefined
  ): StyleObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bell)) __obj.updateDynamic("bell")(bell.asInstanceOf[js.Any])
    if (bg != null) __obj.updateDynamic("bg")(bg.asInstanceOf[js.Any])
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold.asInstanceOf[js.Any])
    if (fg != null) __obj.updateDynamic("fg")(fg.asInstanceOf[js.Any])
    if (!js.isUndefined(inverse)) __obj.updateDynamic("inverse")(inverse.asInstanceOf[js.Any])
    if (!js.isUndefined(underline)) __obj.updateDynamic("underline")(underline.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleObject]
  }
}

