package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "application.toJSON()". */
trait ApplicationData extends js.Object {
  /**
    *
    * Returns the Excel calculation engine version used for the last full recalculation. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var calculationEngineVersion: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Returns the calculation mode used in the workbook, as defined by the constants in Excel.CalculationMode. Possible values are: `Automatic`, where Excel controls recalculation; `AutomaticExceptTables`, where Excel controls recalculation but ignores changes in tables; `Manual`, where calculation is done when the user requests it.
    *
    * [Api set: ExcelApi 1.1 for get, 1.8 for set]
    */
  var calculationMode: js.UndefOr[
    officeDashJsLib.ExcelNs.CalculationMode | officeDashJsLib.officeDashJsLibStrings.Automatic | officeDashJsLib.officeDashJsLibStrings.AutomaticExceptTables | officeDashJsLib.officeDashJsLibStrings.Manual
  ] = js.undefined
  /**
    *
    * Returns the calculation state of the application. See Excel.CalculationState for details. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var calculationState: js.UndefOr[
    officeDashJsLib.ExcelNs.CalculationState | officeDashJsLib.officeDashJsLibStrings.Done | officeDashJsLib.officeDashJsLibStrings.Calculating | officeDashJsLib.officeDashJsLibStrings.Pending
  ] = js.undefined
  /**
    *
    * Returns the Iterative Calculation settings.
    On Excel for Windows and Excel for Mac, the settings will apply to the Excel Application.
    On Excel Online and Excel for other platforms, the settings will apply to the active workbook.
    *
    * [Api set: ExcelApi 1.9]
    */
  var iterativeCalculation: js.UndefOr[IterativeCalculationData] = js.undefined
}

object ApplicationData {
  @scala.inline
  def apply(
    calculationEngineVersion: scala.Int | scala.Double = null,
    calculationMode: officeDashJsLib.ExcelNs.CalculationMode | officeDashJsLib.officeDashJsLibStrings.Automatic | officeDashJsLib.officeDashJsLibStrings.AutomaticExceptTables | officeDashJsLib.officeDashJsLibStrings.Manual = null,
    calculationState: officeDashJsLib.ExcelNs.CalculationState | officeDashJsLib.officeDashJsLibStrings.Done | officeDashJsLib.officeDashJsLibStrings.Calculating | officeDashJsLib.officeDashJsLibStrings.Pending = null,
    iterativeCalculation: IterativeCalculationData = null
  ): ApplicationData = {
    val __obj = js.Dynamic.literal()
    if (calculationEngineVersion != null) __obj.updateDynamic("calculationEngineVersion")(calculationEngineVersion.asInstanceOf[js.Any])
    if (calculationMode != null) __obj.updateDynamic("calculationMode")(calculationMode.asInstanceOf[js.Any])
    if (calculationState != null) __obj.updateDynamic("calculationState")(calculationState.asInstanceOf[js.Any])
    if (iterativeCalculation != null) __obj.updateDynamic("iterativeCalculation")(iterativeCalculation)
    __obj.asInstanceOf[ApplicationData]
  }
}

