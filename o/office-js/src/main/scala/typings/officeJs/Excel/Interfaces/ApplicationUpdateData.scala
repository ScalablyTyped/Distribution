package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.CalculationMode
import typings.officeJs.officeJsStrings.Automatic
import typings.officeJs.officeJsStrings.AutomaticExceptTables
import typings.officeJs.officeJsStrings.Manual
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the Application object, for use in `application.set({ ... })`. */
trait ApplicationUpdateData extends StObject {
  
  /**
    * Returns the calculation mode used in the workbook, as defined by the constants in `Excel.CalculationMode`. Possible values are: `Automatic`, where Excel controls recalculation; `AutomaticExceptTables`, where Excel controls recalculation but ignores changes in tables; `Manual`, where calculation is done when the user requests it.
    *
    * @remarks
    * [Api set: ExcelApi 1.1 for get, 1.8 for set]
    */
  var calculationMode: js.UndefOr[CalculationMode | Automatic | AutomaticExceptTables | Manual] = js.undefined
  
  /**
    * Returns the iterative calculation settings.
    In Excel on Windows and Mac, the settings will apply to the Excel Application.
    In Excel on the web and other platforms, the settings will apply to the active workbook.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var iterativeCalculation: js.UndefOr[IterativeCalculationUpdateData] = js.undefined
}
object ApplicationUpdateData {
  
  inline def apply(): ApplicationUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationUpdateData]
  }
  
  extension [Self <: ApplicationUpdateData](x: Self) {
    
    inline def setCalculationMode(value: CalculationMode | Automatic | AutomaticExceptTables | Manual): Self = StObject.set(x, "calculationMode", value.asInstanceOf[js.Any])
    
    inline def setCalculationModeUndefined: Self = StObject.set(x, "calculationMode", js.undefined)
    
    inline def setIterativeCalculation(value: IterativeCalculationUpdateData): Self = StObject.set(x, "iterativeCalculation", value.asInstanceOf[js.Any])
    
    inline def setIterativeCalculationUndefined: Self = StObject.set(x, "iterativeCalculation", js.undefined)
  }
}
