package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.CalculationMode
import typings.officeJsPreview.Excel.CalculationState
import typings.officeJsPreview.officeJsPreviewStrings.Automatic
import typings.officeJsPreview.officeJsPreviewStrings.AutomaticExceptTables
import typings.officeJsPreview.officeJsPreviewStrings.Calculating
import typings.officeJsPreview.officeJsPreviewStrings.Done
import typings.officeJsPreview.officeJsPreviewStrings.Manual
import typings.officeJsPreview.officeJsPreviewStrings.Pending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `application.toJSON()`. */
trait ApplicationData extends js.Object {
  /**
    *
    * Returns the Excel calculation engine version used for the last full recalculation.
    *
    * [Api set: ExcelApi 1.9]
    */
  var calculationEngineVersion: js.UndefOr[Double] = js.undefined
  /**
    *
    * Returns the calculation mode used in the workbook, as defined by the constants in Excel.CalculationMode. Possible values are: `Automatic`, where Excel controls recalculation; `AutomaticExceptTables`, where Excel controls recalculation but ignores changes in tables; `Manual`, where calculation is done when the user requests it.
    *
    * [Api set: ExcelApi 1.1 for get, 1.8 for set]
    */
  var calculationMode: js.UndefOr[CalculationMode | Automatic | AutomaticExceptTables | Manual] = js.undefined
  /**
    *
    * Returns the calculation state of the application. See Excel.CalculationState for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var calculationState: js.UndefOr[CalculationState | Done | Calculating | Pending] = js.undefined
  /**
    *
    * Provides information based on current system culture settings. This includes the culture names, number formatting, and other culturally dependent settings.
    *
    * [Api set: ExcelApi 1.11]
    */
  var cultureInfo: js.UndefOr[CultureInfoData] = js.undefined
  /**
    *
    * Gets the string used as the decimal separator for numeric values. This is based on Excel's local settings.
    *
    * [Api set: ExcelApi 1.11]
    */
  var decimalSeparator: js.UndefOr[String] = js.undefined
  /**
    *
    * Returns the Iterative Calculation settings.
    In Excel on Windows and Mac, the settings will apply to the Excel Application.
    In Excel on the web and other platforms, the settings will apply to the active workbook.
    *
    * [Api set: ExcelApi 1.9]
    */
  var iterativeCalculation: js.UndefOr[IterativeCalculationData] = js.undefined
  /**
    *
    * Gets the string used to separate groups of digits to the left of the decimal for numeric values. This is based on Excel's local settings.
    *
    * [Api set: ExcelApi 1.11]
    */
  var thousandsSeparator: js.UndefOr[String] = js.undefined
  /**
    *
    * Specifies if the system separators of Excel are enabled.
    System separators include the decimal separator and thousands separator.
    *
    * [Api set: ExcelApi 1.11]
    */
  var useSystemSeparators: js.UndefOr[Boolean] = js.undefined
}

object ApplicationData {
  @scala.inline
  def apply(
    calculationEngineVersion: js.UndefOr[Double] = js.undefined,
    calculationMode: CalculationMode | Automatic | AutomaticExceptTables | Manual = null,
    calculationState: CalculationState | Done | Calculating | Pending = null,
    cultureInfo: CultureInfoData = null,
    decimalSeparator: String = null,
    iterativeCalculation: IterativeCalculationData = null,
    thousandsSeparator: String = null,
    useSystemSeparators: js.UndefOr[Boolean] = js.undefined
  ): ApplicationData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(calculationEngineVersion)) __obj.updateDynamic("calculationEngineVersion")(calculationEngineVersion.get.asInstanceOf[js.Any])
    if (calculationMode != null) __obj.updateDynamic("calculationMode")(calculationMode.asInstanceOf[js.Any])
    if (calculationState != null) __obj.updateDynamic("calculationState")(calculationState.asInstanceOf[js.Any])
    if (cultureInfo != null) __obj.updateDynamic("cultureInfo")(cultureInfo.asInstanceOf[js.Any])
    if (decimalSeparator != null) __obj.updateDynamic("decimalSeparator")(decimalSeparator.asInstanceOf[js.Any])
    if (iterativeCalculation != null) __obj.updateDynamic("iterativeCalculation")(iterativeCalculation.asInstanceOf[js.Any])
    if (thousandsSeparator != null) __obj.updateDynamic("thousandsSeparator")(thousandsSeparator.asInstanceOf[js.Any])
    if (!js.isUndefined(useSystemSeparators)) __obj.updateDynamic("useSystemSeparators")(useSystemSeparators.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationData]
  }
}

