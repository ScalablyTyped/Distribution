package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextColumn extends js.Object {
  // Whether to allow multiple lines of text.
  var allowMultipleLines: js.UndefOr[Boolean] = js.undefined
  // Whether updates to this column should replace existing text, or append to it.
  var appendChangesToExistingText: js.UndefOr[Boolean] = js.undefined
  // The size of the text box.
  var linesForEditing: js.UndefOr[Double] = js.undefined
  // The maximum number of characters for the value.
  var maxLength: js.UndefOr[Double] = js.undefined
  // The type of text being stored. Must be one of plain or richText
  var textType: js.UndefOr[String] = js.undefined
}

object TextColumn {
  @scala.inline
  def apply(
    allowMultipleLines: js.UndefOr[Boolean] = js.undefined,
    appendChangesToExistingText: js.UndefOr[Boolean] = js.undefined,
    linesForEditing: Int | Double = null,
    maxLength: Int | Double = null,
    textType: String = null
  ): TextColumn = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowMultipleLines)) __obj.updateDynamic("allowMultipleLines")(allowMultipleLines.asInstanceOf[js.Any])
    if (!js.isUndefined(appendChangesToExistingText)) __obj.updateDynamic("appendChangesToExistingText")(appendChangesToExistingText.asInstanceOf[js.Any])
    if (linesForEditing != null) __obj.updateDynamic("linesForEditing")(linesForEditing.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (textType != null) __obj.updateDynamic("textType")(textType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextColumn]
  }
}

