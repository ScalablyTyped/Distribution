package typings
package officeDashJsLib.ExcelNs.InterfacesNs

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
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Returns the Excel calculation engine version used for the last full recalculation. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var calculationEngineVersion: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Returns the calculation mode used in the workbook, as defined by the constants in Excel.CalculationMode. Possible values are: `Automatic`, where Excel controls recalculation; `AutomaticExceptTables`, where Excel controls recalculation but ignores changes in tables; `Manual`, where calculation is done when the user requests it.
    *
    * [Api set: ExcelApi 1.1 for get, 1.8 for set]
    */
  var calculationMode: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Returns the calculation state of the application. See Excel.CalculationState for details. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var calculationState: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Returns the Iterative Calculation settings.
    On Excel for Windows and Excel for Mac, the settings will apply to the Excel Application.
    On Excel Online and Excel for other platforms, the settings will apply to the active workbook.
    *
    * [Api set: ExcelApi 1.9]
    */
  var iterativeCalculation: js.UndefOr[IterativeCalculationLoadOptions] = js.undefined
}

object ApplicationLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[scala.Boolean] = js.undefined,
    calculationEngineVersion: js.UndefOr[scala.Boolean] = js.undefined,
    calculationMode: js.UndefOr[scala.Boolean] = js.undefined,
    calculationState: js.UndefOr[scala.Boolean] = js.undefined,
    iterativeCalculation: IterativeCalculationLoadOptions = null
  ): ApplicationLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(calculationEngineVersion)) __obj.updateDynamic("calculationEngineVersion")(calculationEngineVersion)
    if (!js.isUndefined(calculationMode)) __obj.updateDynamic("calculationMode")(calculationMode)
    if (!js.isUndefined(calculationState)) __obj.updateDynamic("calculationState")(calculationState)
    if (iterativeCalculation != null) __obj.updateDynamic("iterativeCalculation")(iterativeCalculation)
    __obj.asInstanceOf[ApplicationLoadOptions]
  }
}

