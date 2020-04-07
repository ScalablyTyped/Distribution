package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the Excel application that manages the workbook.
  *
  * [Api set: ExcelApi 1.1]
  */
trait ApplicationLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Returns the Excel calculation engine version used for the last full recalculation. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var calculationEngineVersion: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Returns the calculation mode used in the workbook, as defined by the constants in Excel.CalculationMode. Possible values are: `Automatic`, where Excel controls recalculation; `AutomaticExceptTables`, where Excel controls recalculation but ignores changes in tables; `Manual`, where calculation is done when the user requests it.
    *
    * [Api set: ExcelApi 1.1 for get, 1.8 for set]
    */
  var calculationMode: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Returns the calculation state of the application. See Excel.CalculationState for details. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var calculationState: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Provides information based on current system culture settings. This includes the culture names, number formatting, and other culturally dependent settings.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var cultureInfo: js.UndefOr[CultureInfoLoadOptions] = js.undefined
  /**
    *
    * Gets the string used as the decimal separator for numeric values. This is based on Excel's local settings.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var decimalSeparator: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Returns the Iterative Calculation settings.
    In Excel on Windows and Mac, the settings will apply to the Excel Application.
    In Excel on the web and other platforms, the settings will apply to the active workbook.
    *
    * [Api set: ExcelApi 1.9]
    */
  var iterativeCalculation: js.UndefOr[IterativeCalculationLoadOptions] = js.undefined
  /**
    *
    * Gets the string used to separate groups of digits to the left of the decimal for numeric values. This is based on Excel's local settings.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var thousandsSeparator: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies whether the system separators of Microsoft Excel are enabled.
    System separators include the decimal separator and thousands separator.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var useSystemSeparators: js.UndefOr[Boolean] = js.undefined
}

object ApplicationLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    calculationEngineVersion: js.UndefOr[Boolean] = js.undefined,
    calculationMode: js.UndefOr[Boolean] = js.undefined,
    calculationState: js.UndefOr[Boolean] = js.undefined,
    cultureInfo: CultureInfoLoadOptions = null,
    decimalSeparator: js.UndefOr[Boolean] = js.undefined,
    iterativeCalculation: IterativeCalculationLoadOptions = null,
    thousandsSeparator: js.UndefOr[Boolean] = js.undefined,
    useSystemSeparators: js.UndefOr[Boolean] = js.undefined
  ): ApplicationLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all.asInstanceOf[js.Any])
    if (!js.isUndefined(calculationEngineVersion)) __obj.updateDynamic("calculationEngineVersion")(calculationEngineVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(calculationMode)) __obj.updateDynamic("calculationMode")(calculationMode.asInstanceOf[js.Any])
    if (!js.isUndefined(calculationState)) __obj.updateDynamic("calculationState")(calculationState.asInstanceOf[js.Any])
    if (cultureInfo != null) __obj.updateDynamic("cultureInfo")(cultureInfo.asInstanceOf[js.Any])
    if (!js.isUndefined(decimalSeparator)) __obj.updateDynamic("decimalSeparator")(decimalSeparator.asInstanceOf[js.Any])
    if (iterativeCalculation != null) __obj.updateDynamic("iterativeCalculation")(iterativeCalculation.asInstanceOf[js.Any])
    if (!js.isUndefined(thousandsSeparator)) __obj.updateDynamic("thousandsSeparator")(thousandsSeparator.asInstanceOf[js.Any])
    if (!js.isUndefined(useSystemSeparators)) __obj.updateDynamic("useSystemSeparators")(useSystemSeparators.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationLoadOptions]
  }
}

