package typings.officeDashJsDashPreview.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Contains the text that is attached to a shape, in addition to properties and methods for manipulating the text.
  *
  * [Api set: ExcelApi 1.9]
  */
trait TextRangeLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Returns a ShapeFont object that represents the font attributes for the text range.
    *
    * [Api set: ExcelApi 1.9]
    */
  var font: js.UndefOr[ShapeFontLoadOptions] = js.undefined
  /**
    *
    * Represents the plain text content of the text range.
    *
    * [Api set: ExcelApi 1.9]
    */
  var text: js.UndefOr[Boolean] = js.undefined
}

object TextRangeLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    font: ShapeFontLoadOptions = null,
    text: js.UndefOr[Boolean] = js.undefined
  ): TextRangeLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (font != null) __obj.updateDynamic("font")(font)
    if (!js.isUndefined(text)) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[TextRangeLoadOptions]
  }
}

