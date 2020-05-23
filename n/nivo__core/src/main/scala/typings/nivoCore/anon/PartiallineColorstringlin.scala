package typings.nivoCore.anon

import typings.nivoCore.nivoCoreNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  lineColor  :string,   lineStrokeWidth  :number,   textColor  :string,   fontSize  :string | 0}> */
trait PartiallineColorstringlin extends js.Object {
  var fontSize: js.UndefOr[String | `0`] = js.undefined
  var lineColor: js.UndefOr[String] = js.undefined
  var lineStrokeWidth: js.UndefOr[Double] = js.undefined
  var textColor: js.UndefOr[String] = js.undefined
}

object PartiallineColorstringlin {
  @scala.inline
  def apply(
    fontSize: String | `0` = null,
    lineColor: String = null,
    lineStrokeWidth: js.UndefOr[Double] = js.undefined,
    textColor: String = null
  ): PartiallineColorstringlin = {
    val __obj = js.Dynamic.literal()
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor.asInstanceOf[js.Any])
    if (!js.isUndefined(lineStrokeWidth)) __obj.updateDynamic("lineStrokeWidth")(lineStrokeWidth.get.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartiallineColorstringlin]
  }
}

