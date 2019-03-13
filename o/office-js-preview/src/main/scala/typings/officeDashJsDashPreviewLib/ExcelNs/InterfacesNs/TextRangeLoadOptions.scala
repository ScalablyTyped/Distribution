package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Contains the text that is attached to a shape, in addition to properties and methods for manipulating the text.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait TextRangeLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Returns a ShapeFont object that represents the font attributes for the text range.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var font: js.UndefOr[ShapeFontLoadOptions] = js.undefined
  /**
    *
    * Represents the plain text content of the text range.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var text: js.UndefOr[scala.Boolean] = js.undefined
}

object TextRangeLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[scala.Boolean] = js.undefined,
    font: ShapeFontLoadOptions = null,
    text: js.UndefOr[scala.Boolean] = js.undefined
  ): TextRangeLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (font != null) __obj.updateDynamic("font")(font)
    if (!js.isUndefined(text)) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[TextRangeLoadOptions]
  }
}

