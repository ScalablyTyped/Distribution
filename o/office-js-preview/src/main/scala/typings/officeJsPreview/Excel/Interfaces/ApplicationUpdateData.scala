package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.CalculationMode
import typings.officeJsPreview.officeJsPreviewStrings.Automatic
import typings.officeJsPreview.officeJsPreviewStrings.AutomaticExceptTables
import typings.officeJsPreview.officeJsPreviewStrings.Manual
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the Application object, for use in `application.set({ ... })`. */
@js.native
trait ApplicationUpdateData extends StObject {
  
  /**
    *
    * Returns the calculation mode used in the workbook, as defined by the constants in Excel.CalculationMode. Possible values are: `Automatic`, where Excel controls recalculation; `AutomaticExceptTables`, where Excel controls recalculation but ignores changes in tables; `Manual`, where calculation is done when the user requests it.
    *
    * [Api set: ExcelApi 1.1 for get, 1.8 for set]
    */
  var calculationMode: js.UndefOr[CalculationMode | Automatic | AutomaticExceptTables | Manual] = js.native
  
  /**
    *
    * Returns the Iterative Calculation settings.
    In Excel on Windows and Mac, the settings will apply to the Excel Application.
    In Excel on the web and other platforms, the settings will apply to the active workbook.
    *
    * [Api set: ExcelApi 1.9]
    */
  var iterativeCalculation: js.UndefOr[IterativeCalculationUpdateData] = js.native
}
object ApplicationUpdateData {
  
  @scala.inline
  def apply(): ApplicationUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationUpdateData]
  }
  
  @scala.inline
  implicit class ApplicationUpdateDataMutableBuilder[Self <: ApplicationUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalculationMode(value: CalculationMode | Automatic | AutomaticExceptTables | Manual): Self = StObject.set(x, "calculationMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalculationModeUndefined: Self = StObject.set(x, "calculationMode", js.undefined)
    
    @scala.inline
    def setIterativeCalculation(value: IterativeCalculationUpdateData): Self = StObject.set(x, "iterativeCalculation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIterativeCalculationUndefined: Self = StObject.set(x, "iterativeCalculation", js.undefined)
  }
}
