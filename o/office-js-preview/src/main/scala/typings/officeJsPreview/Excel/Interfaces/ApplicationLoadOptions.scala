package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
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
trait ApplicationLoadOptions extends StObject {
  
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
  implicit class ApplicationLoadOptionsMutableBuilder[Self <: ApplicationLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    @scala.inline
    def setCalculationEngineVersion(value: Boolean): Self = StObject.set(x, "calculationEngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalculationEngineVersionUndefined: Self = StObject.set(x, "calculationEngineVersion", js.undefined)
    
    @scala.inline
    def setCalculationMode(value: Boolean): Self = StObject.set(x, "calculationMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalculationModeUndefined: Self = StObject.set(x, "calculationMode", js.undefined)
    
    @scala.inline
    def setCalculationState(value: Boolean): Self = StObject.set(x, "calculationState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalculationStateUndefined: Self = StObject.set(x, "calculationState", js.undefined)
    
    @scala.inline
    def setCultureInfo(value: CultureInfoLoadOptions): Self = StObject.set(x, "cultureInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCultureInfoUndefined: Self = StObject.set(x, "cultureInfo", js.undefined)
    
    @scala.inline
    def setDecimalSeparator(value: Boolean): Self = StObject.set(x, "decimalSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecimalSeparatorUndefined: Self = StObject.set(x, "decimalSeparator", js.undefined)
    
    @scala.inline
    def setIterativeCalculation(value: IterativeCalculationLoadOptions): Self = StObject.set(x, "iterativeCalculation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIterativeCalculationUndefined: Self = StObject.set(x, "iterativeCalculation", js.undefined)
    
    @scala.inline
    def setThousandsSeparator(value: Boolean): Self = StObject.set(x, "thousandsSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThousandsSeparatorUndefined: Self = StObject.set(x, "thousandsSeparator", js.undefined)
    
    @scala.inline
    def setUseSystemSeparators(value: Boolean): Self = StObject.set(x, "useSystemSeparators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseSystemSeparatorsUndefined: Self = StObject.set(x, "useSystemSeparators", js.undefined)
  }
}
