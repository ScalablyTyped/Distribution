package typings.officeDashJsDashPreview.Excel.Interfaces

import typings.officeDashJsDashPreview.Excel.CalculationMode
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Automatic
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.AutomaticExceptTables
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Manual
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the Application object, for use in `application.set({ ... })`. */
trait ApplicationUpdateData extends js.Object {
  /**
    *
    * Returns the calculation mode used in the workbook, as defined by the constants in Excel.CalculationMode. Possible values are: `Automatic`, where Excel controls recalculation; `AutomaticExceptTables`, where Excel controls recalculation but ignores changes in tables; `Manual`, where calculation is done when the user requests it.
    *
    * [Api set: ExcelApi 1.1 for get, 1.8 for set]
    */
  var calculationMode: js.UndefOr[CalculationMode | Automatic | AutomaticExceptTables | Manual] = js.undefined
  /**
    *
    * Returns the Iterative Calculation settings.
    In Excel on Windows and Mac, the settings will apply to the Excel Application.
    In Excel on the web and other platforms, the settings will apply to the active workbook.
    *
    * [Api set: ExcelApi 1.9]
    */
  var iterativeCalculation: js.UndefOr[IterativeCalculationUpdateData] = js.undefined
}

object ApplicationUpdateData {
  @scala.inline
  def apply(
    calculationMode: CalculationMode | Automatic | AutomaticExceptTables | Manual = null,
    iterativeCalculation: IterativeCalculationUpdateData = null
  ): ApplicationUpdateData = {
    val __obj = js.Dynamic.literal()
    if (calculationMode != null) __obj.updateDynamic("calculationMode")(calculationMode.asInstanceOf[js.Any])
    if (iterativeCalculation != null) __obj.updateDynamic("iterativeCalculation")(iterativeCalculation)
    __obj.asInstanceOf[ApplicationUpdateData]
  }
}

