package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "dataValidation.toJSON()". */
trait DataValidationData extends js.Object {
  /**
    *
    * Error alert when user enters invalid data.
    *
    * [Api set: ExcelApi 1.8]
    */
  var errorAlert: js.UndefOr[officeDashJsLib.ExcelNs.DataValidationErrorAlert] = js.undefined
  /**
    *
    * Ignore blanks: no data validation will be performed on blank cells, it defaults to true.
    *
    * [Api set: ExcelApi 1.8]
    */
  var ignoreBlanks: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Prompt when users select a cell.
    *
    * [Api set: ExcelApi 1.8]
    */
  var prompt: js.UndefOr[officeDashJsLib.ExcelNs.DataValidationPrompt] = js.undefined
  /**
    *
    * Data validation rule that contains different type of data validation criteria.
    *
    * [Api set: ExcelApi 1.8]
    */
  var rule: js.UndefOr[officeDashJsLib.ExcelNs.DataValidationRule] = js.undefined
  /**
    *
    * Type of the data validation, see Excel.DataValidationType for details.
    *
    * [Api set: ExcelApi 1.8]
    */
  var `type`: js.UndefOr[
    officeDashJsLib.ExcelNs.DataValidationType | officeDashJsLib.officeDashJsLibStrings.None | officeDashJsLib.officeDashJsLibStrings.WholeNumber | officeDashJsLib.officeDashJsLibStrings.Decimal | officeDashJsLib.officeDashJsLibStrings.List | officeDashJsLib.officeDashJsLibStrings.Date | officeDashJsLib.officeDashJsLibStrings.Time | officeDashJsLib.officeDashJsLibStrings.TextLength | officeDashJsLib.officeDashJsLibStrings.Custom | officeDashJsLib.officeDashJsLibStrings.Inconsistent | officeDashJsLib.officeDashJsLibStrings.MixedCriteria
  ] = js.undefined
  /**
    *
    * Represents if all cell values are valid according to the data validation rules.
    Returns true if all cell values are valid, or false if all cell values are invalid.
    Returns null if there are both valid and invalid cell values within the range.
    *
    * [Api set: ExcelApi 1.8]
    */
  var valid: js.UndefOr[scala.Boolean] = js.undefined
}

object DataValidationData {
  @scala.inline
  def apply(
    errorAlert: officeDashJsLib.ExcelNs.DataValidationErrorAlert = null,
    ignoreBlanks: js.UndefOr[scala.Boolean] = js.undefined,
    prompt: officeDashJsLib.ExcelNs.DataValidationPrompt = null,
    rule: officeDashJsLib.ExcelNs.DataValidationRule = null,
    `type`: officeDashJsLib.ExcelNs.DataValidationType | officeDashJsLib.officeDashJsLibStrings.None | officeDashJsLib.officeDashJsLibStrings.WholeNumber | officeDashJsLib.officeDashJsLibStrings.Decimal | officeDashJsLib.officeDashJsLibStrings.List | officeDashJsLib.officeDashJsLibStrings.Date | officeDashJsLib.officeDashJsLibStrings.Time | officeDashJsLib.officeDashJsLibStrings.TextLength | officeDashJsLib.officeDashJsLibStrings.Custom | officeDashJsLib.officeDashJsLibStrings.Inconsistent | officeDashJsLib.officeDashJsLibStrings.MixedCriteria = null,
    valid: js.UndefOr[scala.Boolean] = js.undefined
  ): DataValidationData = {
    val __obj = js.Dynamic.literal()
    if (errorAlert != null) __obj.updateDynamic("errorAlert")(errorAlert)
    if (!js.isUndefined(ignoreBlanks)) __obj.updateDynamic("ignoreBlanks")(ignoreBlanks)
    if (prompt != null) __obj.updateDynamic("prompt")(prompt)
    if (rule != null) __obj.updateDynamic("rule")(rule)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(valid)) __obj.updateDynamic("valid")(valid)
    __obj.asInstanceOf[DataValidationData]
  }
}

