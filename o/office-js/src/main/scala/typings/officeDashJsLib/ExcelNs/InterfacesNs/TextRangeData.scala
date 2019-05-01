package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "textRange.toJSON()". */
trait TextRangeData extends js.Object {
  /**
    *
    * Returns a ShapeFont object that represents the font attributes for the text range. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var font: js.UndefOr[ShapeFontData] = js.undefined
  /**
    *
    * Represents the plain text content of the text range.
    *
    * [Api set: ExcelApi 1.9]
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object TextRangeData {
  @scala.inline
  def apply(font: ShapeFontData = null, text: java.lang.String = null): TextRangeData = {
    val __obj = js.Dynamic.literal()
    if (font != null) __obj.updateDynamic("font")(font)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[TextRangeData]
  }
}

