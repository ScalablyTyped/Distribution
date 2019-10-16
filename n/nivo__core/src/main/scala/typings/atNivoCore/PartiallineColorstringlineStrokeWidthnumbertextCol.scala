package typings.atNivoCore

import typings.atNivoCore.atNivoCoreNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  lineColor  :string,   lineStrokeWidth  :number,   textColor  :string,   fontSize  :string | 0}> */
trait PartiallineColorstringlineStrokeWidthnumbertextCol extends js.Object {
  var fontSize: js.UndefOr[String | `0`] = js.undefined
  var lineColor: js.UndefOr[String] = js.undefined
  var lineStrokeWidth: js.UndefOr[Double] = js.undefined
  var textColor: js.UndefOr[String] = js.undefined
}

object PartiallineColorstringlineStrokeWidthnumbertextCol {
  @scala.inline
  def apply(
    fontSize: String | `0` = null,
    lineColor: String = null,
    lineStrokeWidth: Int | Double = null,
    textColor: String = null
  ): PartiallineColorstringlineStrokeWidthnumbertextCol = {
    val __obj = js.Dynamic.literal()
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor)
    if (lineStrokeWidth != null) __obj.updateDynamic("lineStrokeWidth")(lineStrokeWidth.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor)
    __obj.asInstanceOf[PartiallineColorstringlineStrokeWidthnumbertextCol]
  }
}

