package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the Application object, for use in "application.set({ ... })". */

trait ApplicationUpdateData extends js.Object {
  /**
               *
               * Returns the calculation mode used in the workbook, as defined by the constants in Excel.CalculationMode. Possible values are: `Automatic`, where Excel controls recalculation; `AutomaticExceptTables`, where Excel controls recalculation but ignores changes in tables; `Manual`, where calculation is done when the user requests it.
               *
               * [Api set: ExcelApi 1.1 for get, 1.8 for set]
               */
  var calculationMode: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.CalculationMode | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Automatic | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.AutomaticExceptTables | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Manual
  ] = js.undefined
  /**
              *
              * Returns the Iterative Calculation settings.
              On Excel for Windows and Excel for Mac, the settings will apply to the Excel Application.
              On Excel Online and Excel for other platforms, the settings will apply to the active workbook.
              *
              * [Api set: ExcelApi BETA (PREVIEW ONLY)]
              * @beta
              */
  var iterativeCalculation: js.UndefOr[IterativeCalculationUpdateData] = js.undefined
}

