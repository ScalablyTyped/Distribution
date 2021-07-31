package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.CalculationMode
import typings.officeJsPreview.Excel.CalculationState
import typings.officeJsPreview.officeJsPreviewStrings.Automatic
import typings.officeJsPreview.officeJsPreviewStrings.AutomaticExceptTables
import typings.officeJsPreview.officeJsPreviewStrings.Calculating
import typings.officeJsPreview.officeJsPreviewStrings.Done
import typings.officeJsPreview.officeJsPreviewStrings.Manual
import typings.officeJsPreview.officeJsPreviewStrings.Pending
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `application.toJSON()`. */
trait ApplicationData extends StObject {
  
  /**
    *
    * Returns the Excel calculation engine version used for the last full recalculation.
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
    * Returns the calculation state of the application. See Excel.CalculationState for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var calculationState: js.UndefOr[CalculationState | Done | Calculating | Pending] = js.undefined
  
  /**
    *
    * Provides information based on current system culture settings. This includes the culture names, number formatting, and other culturally dependent settings.
    *
    * [Api set: ExcelApi 1.11]
    */
  var cultureInfo: js.UndefOr[CultureInfoData] = js.undefined
  
  /**
    *
    * Gets the string used as the decimal separator for numeric values. This is based on Excel's local settings.
    *
    * [Api set: ExcelApi 1.11]
    */
  var decimalSeparator: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Returns the Iterative Calculation settings.
    In Excel on Windows and Mac, the settings will apply to the Excel Application.
    In Excel on the web and other platforms, the settings will apply to the active workbook.
    *
    * [Api set: ExcelApi 1.9]
    */
  var iterativeCalculation: js.UndefOr[IterativeCalculationData] = js.undefined
  
  /**
    *
    * Gets the string used to separate groups of digits to the left of the decimal for numeric values. This is based on Excel's local settings.
    *
    * [Api set: ExcelApi 1.11]
    */
  var thousandsSeparator: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Specifies if the system separators of Excel are enabled.
    System separators include the decimal separator and thousands separator.
    *
    * [Api set: ExcelApi 1.11]
    */
  var useSystemSeparators: js.UndefOr[Boolean] = js.undefined
}
object ApplicationData {
  
  @scala.inline
  def apply(): ApplicationData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationData]
  }
  
  @scala.inline
  implicit class ApplicationDataMutableBuilder[Self <: ApplicationData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalculationEngineVersion(value: Double): Self = StObject.set(x, "calculationEngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalculationEngineVersionUndefined: Self = StObject.set(x, "calculationEngineVersion", js.undefined)
    
    @scala.inline
    def setCalculationMode(value: CalculationMode | Automatic | AutomaticExceptTables | Manual): Self = StObject.set(x, "calculationMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalculationModeUndefined: Self = StObject.set(x, "calculationMode", js.undefined)
    
    @scala.inline
    def setCalculationState(value: CalculationState | Done | Calculating | Pending): Self = StObject.set(x, "calculationState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalculationStateUndefined: Self = StObject.set(x, "calculationState", js.undefined)
    
    @scala.inline
    def setCultureInfo(value: CultureInfoData): Self = StObject.set(x, "cultureInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCultureInfoUndefined: Self = StObject.set(x, "cultureInfo", js.undefined)
    
    @scala.inline
    def setDecimalSeparator(value: String): Self = StObject.set(x, "decimalSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecimalSeparatorUndefined: Self = StObject.set(x, "decimalSeparator", js.undefined)
    
    @scala.inline
    def setIterativeCalculation(value: IterativeCalculationData): Self = StObject.set(x, "iterativeCalculation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIterativeCalculationUndefined: Self = StObject.set(x, "iterativeCalculation", js.undefined)
    
    @scala.inline
    def setThousandsSeparator(value: String): Self = StObject.set(x, "thousandsSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThousandsSeparatorUndefined: Self = StObject.set(x, "thousandsSeparator", js.undefined)
    
    @scala.inline
    def setUseSystemSeparators(value: Boolean): Self = StObject.set(x, "useSystemSeparators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseSystemSeparatorsUndefined: Self = StObject.set(x, "useSystemSeparators", js.undefined)
  }
}
