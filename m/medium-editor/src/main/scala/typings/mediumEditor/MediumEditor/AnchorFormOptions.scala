package typings.mediumEditor.MediumEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnchorFormOptions extends js.Object {
  var customClassOption: js.UndefOr[String] = js.undefined
  var customClassOptionText: js.UndefOr[String] = js.undefined
  var linkValidation: js.UndefOr[Boolean] = js.undefined
  var placeholderText: js.UndefOr[String] = js.undefined
  var targetCheckbox: js.UndefOr[Boolean] = js.undefined
  var targetCheckboxText: js.UndefOr[String] = js.undefined
}

object AnchorFormOptions {
  @scala.inline
  def apply(
    customClassOption: String = null,
    customClassOptionText: String = null,
    linkValidation: js.UndefOr[Boolean] = js.undefined,
    placeholderText: String = null,
    targetCheckbox: js.UndefOr[Boolean] = js.undefined,
    targetCheckboxText: String = null
  ): AnchorFormOptions = {
    val __obj = js.Dynamic.literal()
    if (customClassOption != null) __obj.updateDynamic("customClassOption")(customClassOption.asInstanceOf[js.Any])
    if (customClassOptionText != null) __obj.updateDynamic("customClassOptionText")(customClassOptionText.asInstanceOf[js.Any])
    if (!js.isUndefined(linkValidation)) __obj.updateDynamic("linkValidation")(linkValidation.get.asInstanceOf[js.Any])
    if (placeholderText != null) __obj.updateDynamic("placeholderText")(placeholderText.asInstanceOf[js.Any])
    if (!js.isUndefined(targetCheckbox)) __obj.updateDynamic("targetCheckbox")(targetCheckbox.get.asInstanceOf[js.Any])
    if (targetCheckboxText != null) __obj.updateDynamic("targetCheckboxText")(targetCheckboxText.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnchorFormOptions]
  }
}

