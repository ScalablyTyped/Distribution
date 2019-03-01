package typings
package mediumDashEditorLib.MediumEditorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoreOptions extends js.Object {
  var activeButtonClass: js.UndefOr[java.lang.String] = js.undefined
  var allowMultiParagraphSelection: js.UndefOr[scala.Boolean] = js.undefined
  var anchor: js.UndefOr[AnchorFormOptions] = js.undefined
  var anchorPreview: js.UndefOr[AnchorPreviewOptions | scala.Boolean] = js.undefined
  var autoLink: js.UndefOr[scala.Boolean] = js.undefined
  var buttonLabels: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var contentWindow: js.UndefOr[stdLib.Window] = js.undefined
  var delay: js.UndefOr[scala.Double] = js.undefined
  var disableDoubleReturn: js.UndefOr[scala.Boolean] = js.undefined
  var disableEditing: js.UndefOr[scala.Boolean] = js.undefined
  var disableExtraSpaces: js.UndefOr[scala.Boolean] = js.undefined
  var disableReturn: js.UndefOr[scala.Boolean] = js.undefined
  var elementsContainer: js.UndefOr[stdLib.HTMLElement] = js.undefined
  var extensions: js.UndefOr[js.Any] = js.undefined
  var imageDragging: js.UndefOr[scala.Boolean] = js.undefined
  var keyboardCommands: js.UndefOr[KeyboardCommandsOptions | scala.Boolean] = js.undefined
  var ownerDocument: js.UndefOr[stdLib.Document] = js.undefined
  var paste: js.UndefOr[PasteOptions] = js.undefined
  var placeholder: js.UndefOr[PlaceholderOptions | scala.Boolean] = js.undefined
  var spellcheck: js.UndefOr[scala.Boolean] = js.undefined
  var targetBlank: js.UndefOr[scala.Boolean] = js.undefined
  var toolbar: js.UndefOr[ToolbarOptions | scala.Boolean] = js.undefined
}

object CoreOptions {
  @scala.inline
  def apply(
    activeButtonClass: java.lang.String = null,
    allowMultiParagraphSelection: js.UndefOr[scala.Boolean] = js.undefined,
    anchor: AnchorFormOptions = null,
    anchorPreview: AnchorPreviewOptions | scala.Boolean = null,
    autoLink: js.UndefOr[scala.Boolean] = js.undefined,
    buttonLabels: java.lang.String | scala.Boolean = null,
    contentWindow: stdLib.Window = null,
    delay: scala.Int | scala.Double = null,
    disableDoubleReturn: js.UndefOr[scala.Boolean] = js.undefined,
    disableEditing: js.UndefOr[scala.Boolean] = js.undefined,
    disableExtraSpaces: js.UndefOr[scala.Boolean] = js.undefined,
    disableReturn: js.UndefOr[scala.Boolean] = js.undefined,
    elementsContainer: stdLib.HTMLElement = null,
    extensions: js.Any = null,
    imageDragging: js.UndefOr[scala.Boolean] = js.undefined,
    keyboardCommands: KeyboardCommandsOptions | scala.Boolean = null,
    ownerDocument: stdLib.Document = null,
    paste: PasteOptions = null,
    placeholder: PlaceholderOptions | scala.Boolean = null,
    spellcheck: js.UndefOr[scala.Boolean] = js.undefined,
    targetBlank: js.UndefOr[scala.Boolean] = js.undefined,
    toolbar: ToolbarOptions | scala.Boolean = null
  ): CoreOptions = {
    val __obj = js.Dynamic.literal()
    if (activeButtonClass != null) __obj.updateDynamic("activeButtonClass")(activeButtonClass)
    if (!js.isUndefined(allowMultiParagraphSelection)) __obj.updateDynamic("allowMultiParagraphSelection")(allowMultiParagraphSelection)
    if (anchor != null) __obj.updateDynamic("anchor")(anchor)
    if (anchorPreview != null) __obj.updateDynamic("anchorPreview")(anchorPreview.asInstanceOf[js.Any])
    if (!js.isUndefined(autoLink)) __obj.updateDynamic("autoLink")(autoLink)
    if (buttonLabels != null) __obj.updateDynamic("buttonLabels")(buttonLabels.asInstanceOf[js.Any])
    if (contentWindow != null) __obj.updateDynamic("contentWindow")(contentWindow)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(disableDoubleReturn)) __obj.updateDynamic("disableDoubleReturn")(disableDoubleReturn)
    if (!js.isUndefined(disableEditing)) __obj.updateDynamic("disableEditing")(disableEditing)
    if (!js.isUndefined(disableExtraSpaces)) __obj.updateDynamic("disableExtraSpaces")(disableExtraSpaces)
    if (!js.isUndefined(disableReturn)) __obj.updateDynamic("disableReturn")(disableReturn)
    if (elementsContainer != null) __obj.updateDynamic("elementsContainer")(elementsContainer)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (!js.isUndefined(imageDragging)) __obj.updateDynamic("imageDragging")(imageDragging)
    if (keyboardCommands != null) __obj.updateDynamic("keyboardCommands")(keyboardCommands.asInstanceOf[js.Any])
    if (ownerDocument != null) __obj.updateDynamic("ownerDocument")(ownerDocument)
    if (paste != null) __obj.updateDynamic("paste")(paste)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(spellcheck)) __obj.updateDynamic("spellcheck")(spellcheck)
    if (!js.isUndefined(targetBlank)) __obj.updateDynamic("targetBlank")(targetBlank)
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreOptions]
  }
}

