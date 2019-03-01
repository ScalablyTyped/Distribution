package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

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
  var errorAlert: js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.DataValidationErrorAlert] = js.undefined
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
  var prompt: js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.DataValidationPrompt] = js.undefined
  /**
    *
    * Data validation rule that contains different type of data validation criteria.
    *
    * [Api set: ExcelApi 1.8]
    */
  var rule: js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.DataValidationRule] = js.undefined
  /**
    *
    * Type of the data validation, see Excel.DataValidationType for details.
    *
    * [Api set: ExcelApi 1.8]
    */
  var `type`: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.DataValidationType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.None | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.WholeNumber | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Decimal | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.List | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Date | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Time | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.TextLength | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Custom | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Inconsistent | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MixedCriteria
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
    errorAlert: officeDashJsDashPreviewLib.ExcelNs.DataValidationErrorAlert = null,
    ignoreBlanks: js.UndefOr[scala.Boolean] = js.undefined,
    prompt: officeDashJsDashPreviewLib.ExcelNs.DataValidationPrompt = null,
    rule: officeDashJsDashPreviewLib.ExcelNs.DataValidationRule = null,
    `type`: officeDashJsDashPreviewLib.ExcelNs.DataValidationType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.None | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.WholeNumber | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Decimal | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.List | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Date | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Time | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.TextLength | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Custom | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Inconsistent | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MixedCriteria = null,
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

