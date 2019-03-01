package typings
package mediumDashEditorLib.MediumEditorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnchorFormOptions extends js.Object {
  var customClassOption: js.UndefOr[java.lang.String] = js.undefined
  var customClassOptionText: js.UndefOr[java.lang.String] = js.undefined
  var linkValidation: js.UndefOr[scala.Boolean] = js.undefined
  var placeholderText: js.UndefOr[java.lang.String] = js.undefined
  var targetCheckbox: js.UndefOr[scala.Boolean] = js.undefined
  var targetCheckboxText: js.UndefOr[java.lang.String] = js.undefined
}

object AnchorFormOptions {
  @scala.inline
  def apply(
    customClassOption: java.lang.String = null,
    customClassOptionText: java.lang.String = null,
    linkValidation: js.UndefOr[scala.Boolean] = js.undefined,
    placeholderText: java.lang.String = null,
    targetCheckbox: js.UndefOr[scala.Boolean] = js.undefined,
    targetCheckboxText: java.lang.String = null
  ): AnchorFormOptions = {
    val __obj = js.Dynamic.literal()
    if (customClassOption != null) __obj.updateDynamic("customClassOption")(customClassOption)
    if (customClassOptionText != null) __obj.updateDynamic("customClassOptionText")(customClassOptionText)
    if (!js.isUndefined(linkValidation)) __obj.updateDynamic("linkValidation")(linkValidation)
    if (placeholderText != null) __obj.updateDynamic("placeholderText")(placeholderText)
    if (!js.isUndefined(targetCheckbox)) __obj.updateDynamic("targetCheckbox")(targetCheckbox)
    if (targetCheckboxText != null) __obj.updateDynamic("targetCheckboxText")(targetCheckboxText)
    __obj.asInstanceOf[AnchorFormOptions]
  }
}

