package typings.officeDashJsDashPreview.ExcelNs.InterfacesNs

import typings.officeDashJsDashPreview.ExcelNs.CalculationMode
import typings.officeDashJsDashPreview.ExcelNs.CalculationState
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Automatic
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.AutomaticExceptTables
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Calculating
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Done
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Manual
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Pending
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
    * Returns the calculation state of the application. See Excel.CalculationState for details. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var calculationState: js.UndefOr[CalculationState | Done | Calculating | Pending] = js.undefined
  /**
    *
    * Returns the Iterative Calculation settings.
    In Excel on Windows and Mac, the settings will apply to the Excel Application.
    In Excel on the web and other platforms, the settings will apply to the active workbook.
    *
    * [Api set: ExcelApi 1.9]
    */
  var iterativeCalculation: js.UndefOr[IterativeCalculationData] = js.undefined
}

object ApplicationData {
  @scala.inline
  def apply(
    calculationEngineVersion: Int | Double = null,
    calculationMode: CalculationMode | Automatic | AutomaticExceptTables | Manual = null,
    calculationState: CalculationState | Done | Calculating | Pending = null,
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

