package typings.mediumDashEditor.MediumEditorNs

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolbarOptions extends js.Object {
  var align: js.UndefOr[String] = js.undefined
  var allowMultiParagraphSelection: js.UndefOr[Boolean] = js.undefined
  var buttons: js.UndefOr[js.Array[Button]] = js.undefined
  var diffLeft: js.UndefOr[Double] = js.undefined
  var diffTop: js.UndefOr[Double] = js.undefined
  var firstButtonClass: js.UndefOr[String] = js.undefined
  var lastButtonClass: js.UndefOr[String] = js.undefined
  var relativeContainer: js.UndefOr[Node] = js.undefined
  var standardizeSelectionStart: js.UndefOr[Boolean] = js.undefined
  var static: js.UndefOr[Boolean] = js.undefined
  var sticky: js.UndefOr[Boolean] = js.undefined
  var stickyTopOffset: js.UndefOr[Double] = js.undefined
  var updateOnEmptySelection: js.UndefOr[Boolean] = js.undefined
}

object ToolbarOptions {
  @scala.inline
  def apply(
    align: String = null,
    allowMultiParagraphSelection: js.UndefOr[Boolean] = js.undefined,
    buttons: js.Array[Button] = null,
    diffLeft: Int | Double = null,
    diffTop: Int | Double = null,
    firstButtonClass: String = null,
    lastButtonClass: String = null,
    relativeContainer: Node = null,
    standardizeSelectionStart: js.UndefOr[Boolean] = js.undefined,
    static: js.UndefOr[Boolean] = js.undefined,
    sticky: js.UndefOr[Boolean] = js.undefined,
    stickyTopOffset: Int | Double = null,
    updateOnEmptySelection: js.UndefOr[Boolean] = js.undefined
  ): ToolbarOptions = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (!js.isUndefined(allowMultiParagraphSelection)) __obj.updateDynamic("allowMultiParagraphSelection")(allowMultiParagraphSelection)
    if (buttons != null) __obj.updateDynamic("buttons")(buttons)
    if (diffLeft != null) __obj.updateDynamic("diffLeft")(diffLeft.asInstanceOf[js.Any])
    if (diffTop != null) __obj.updateDynamic("diffTop")(diffTop.asInstanceOf[js.Any])
    if (firstButtonClass != null) __obj.updateDynamic("firstButtonClass")(firstButtonClass)
    if (lastButtonClass != null) __obj.updateDynamic("lastButtonClass")(lastButtonClass)
    if (relativeContainer != null) __obj.updateDynamic("relativeContainer")(relativeContainer)
    if (!js.isUndefined(standardizeSelectionStart)) __obj.updateDynamic("standardizeSelectionStart")(standardizeSelectionStart)
    if (!js.isUndefined(static)) __obj.updateDynamic("static")(static)
    if (!js.isUndefined(sticky)) __obj.updateDynamic("sticky")(sticky)
    if (stickyTopOffset != null) __obj.updateDynamic("stickyTopOffset")(stickyTopOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(updateOnEmptySelection)) __obj.updateDynamic("updateOnEmptySelection")(updateOnEmptySelection)
    __obj.asInstanceOf[ToolbarOptions]
  }
}

