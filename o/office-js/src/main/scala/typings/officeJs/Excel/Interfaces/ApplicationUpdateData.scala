package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.CalculationMode
import typings.officeJs.officeJsStrings.Automatic
import typings.officeJs.officeJsStrings.AutomaticExceptTables
import typings.officeJs.officeJsStrings.Manual
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the Application object, for use in `application.set({ ... })`. */
@js.native
trait ApplicationUpdateData extends js.Object {
  
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
  implicit class ApplicationUpdateDataOps[Self <: ApplicationUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCalculationMode(value: CalculationMode | Automatic | AutomaticExceptTables | Manual): Self = this.set("calculationMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalculationMode: Self = this.set("calculationMode", js.undefined)
    
    @scala.inline
    def setIterativeCalculation(value: IterativeCalculationUpdateData): Self = this.set("iterativeCalculation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIterativeCalculation: Self = this.set("iterativeCalculation", js.undefined)
  }
}
