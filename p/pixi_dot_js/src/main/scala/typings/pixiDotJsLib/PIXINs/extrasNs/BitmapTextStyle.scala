package typings
package pixiDotJsLib.PIXINs.extrasNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BitmapTextStyle extends js.Object {
  var align: js.UndefOr[java.lang.String] = js.undefined
  var font: js.UndefOr[java.lang.String | pixiDotJsLib.Anon_Name] = js.undefined
  var tint: js.UndefOr[scala.Double] = js.undefined
}

object BitmapTextStyle {
  @scala.inline
  def apply(
    align: java.lang.String = null,
    font: java.lang.String | pixiDotJsLib.Anon_Name = null,
    tint: scala.Int | scala.Double = null
  ): BitmapTextStyle = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (tint != null) __obj.updateDynamic("tint")(tint.asInstanceOf[js.Any])
    __obj.asInstanceOf[BitmapTextStyle]
  }
}

