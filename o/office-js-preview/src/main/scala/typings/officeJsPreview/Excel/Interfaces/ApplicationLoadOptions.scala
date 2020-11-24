package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the Excel application that manages the workbook.
  *
  * [Api set: ExcelApi 1.1]
  */
@js.native
trait ApplicationLoadOptions extends js.Object {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Returns the Excel calculation engine version used for the last full recalculation.
    *
    * [Api set: ExcelApi 1.9]
    */
  var calculationEngineVersion: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Returns the calculation mode used in the workbook, as defined by the constants in Excel.CalculationMode. Possible values are: `Automatic`, where Excel controls recalculation; `AutomaticExceptTables`, where Excel controls recalculation but ignores changes in tables; `Manual`, where calculation is done when the user requests it.
    *
    * [Api set: ExcelApi 1.1 for get, 1.8 for set]
    */
  var calculationMode: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Returns the calculation state of the application. See Excel.CalculationState for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var calculationState: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Provides information based on current system culture settings. This includes the culture names, number formatting, and other culturally dependent settings.
    *
    * [Api set: ExcelApi 1.11]
    */
  var cultureInfo: js.UndefOr[CultureInfoLoadOptions] = js.native
  
  /**
    *
    * Gets the string used as the decimal separator for numeric values. This is based on Excel's local settings.
    *
    * [Api set: ExcelApi 1.11]
    */
  var decimalSeparator: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Returns the Iterative Calculation settings.
    In Excel on Windows and Mac, the settings will apply to the Excel Application.
    In Excel on the web and other platforms, the settings will apply to the active workbook.
    *
    * [Api set: ExcelApi 1.9]
    */
  var iterativeCalculation: js.UndefOr[IterativeCalculationLoadOptions] = js.native
  
  /**
    *
    * Gets the string used to separate groups of digits to the left of the decimal for numeric values. This is based on Excel's local settings.
    *
    * [Api set: ExcelApi 1.11]
    */
  var thousandsSeparator: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies if the system separators of Excel are enabled.
    System separators include the decimal separator and thousands separator.
    *
    * [Api set: ExcelApi 1.11]
    */
  var useSystemSeparators: js.UndefOr[Boolean] = js.native
}
object ApplicationLoadOptions {
  
  @scala.inline
  def apply(): ApplicationLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationLoadOptions]
  }
  
  @scala.inline
  implicit class ApplicationLoadOptionsOps[Self <: ApplicationLoadOptions] (val x: Self) extends AnyVal {
    
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
    def set$all(value: Boolean): Self = this.set("$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$all: Self = this.set("$all", js.undefined)
    
    @scala.inline
    def setCalculationEngineVersion(value: Boolean): Self = this.set("calculationEngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalculationEngineVersion: Self = this.set("calculationEngineVersion", js.undefined)
    
    @scala.inline
    def setCalculationMode(value: Boolean): Self = this.set("calculationMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalculationMode: Self = this.set("calculationMode", js.undefined)
    
    @scala.inline
    def setCalculationState(value: Boolean): Self = this.set("calculationState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalculationState: Self = this.set("calculationState", js.undefined)
    
    @scala.inline
    def setCultureInfo(value: CultureInfoLoadOptions): Self = this.set("cultureInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCultureInfo: Self = this.set("cultureInfo", js.undefined)
    
    @scala.inline
    def setDecimalSeparator(value: Boolean): Self = this.set("decimalSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecimalSeparator: Self = this.set("decimalSeparator", js.undefined)
    
    @scala.inline
    def setIterativeCalculation(value: IterativeCalculationLoadOptions): Self = this.set("iterativeCalculation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIterativeCalculation: Self = this.set("iterativeCalculation", js.undefined)
    
    @scala.inline
    def setThousandsSeparator(value: Boolean): Self = this.set("thousandsSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThousandsSeparator: Self = this.set("thousandsSeparator", js.undefined)
    
    @scala.inline
    def setUseSystemSeparators(value: Boolean): Self = this.set("useSystemSeparators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseSystemSeparators: Self = this.set("useSystemSeparators", js.undefined)
  }
}
