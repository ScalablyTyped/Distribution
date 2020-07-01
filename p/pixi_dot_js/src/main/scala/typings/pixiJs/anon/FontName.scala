package typings.pixiJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontName extends js.Object {
  var align: js.UndefOr[String] = js.undefined
  var fontName: String
  var fontSize: js.UndefOr[Double] = js.undefined
  var letterSpacing: js.UndefOr[Double] = js.undefined
  var maxWidth: js.UndefOr[Double] = js.undefined
  var tint: js.UndefOr[Double] = js.undefined
}

object FontName {
  @scala.inline
  def apply(
    fontName: String,
    align: String = null,
    fontSize: js.UndefOr[Double] = js.undefined,
    letterSpacing: js.UndefOr[Double] = js.undefined,
    maxWidth: js.UndefOr[Double] = js.undefined,
    tint: js.UndefOr[Double] = js.undefined
  ): FontName = {
    val __obj = js.Dynamic.literal(fontName = fontName.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(fontSize)) __obj.updateDynamic("fontSize")(fontSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(letterSpacing)) __obj.updateDynamic("letterSpacing")(letterSpacing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxWidth)) __obj.updateDynamic("maxWidth")(maxWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tint)) __obj.updateDynamic("tint")(tint.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontName]
  }
}

