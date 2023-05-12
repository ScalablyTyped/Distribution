package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the Excel application that manages the workbook.
  *
  * @remarks
  * [Api set: ExcelApi 1.1]
  */
trait ApplicationLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Returns the Excel calculation engine version used for the last full recalculation.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var calculationEngineVersion: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Returns the calculation mode used in the workbook, as defined by the constants in `Excel.CalculationMode`. Possible values are: `Automatic`, where Excel controls recalculation; `AutomaticExceptTables`, where Excel controls recalculation but ignores changes in tables; `Manual`, where calculation is done when the user requests it.
    *
    * @remarks
    * [Api set: ExcelApi 1.1 for get, 1.8 for set]
    */
  var calculationMode: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Returns the calculation state of the application. See `Excel.CalculationState` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var calculationState: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Provides information based on current system culture settings. This includes the culture names, number formatting, and other culturally dependent settings.
    *
    * @remarks
    * [Api set: ExcelApi 1.11]
    */
  var cultureInfo: js.UndefOr[CultureInfoLoadOptions] = js.undefined
  
  /**
    * Gets the string used as the decimal separator for numeric values. This is based on the local Excel settings.
    *
    * @remarks
    * [Api set: ExcelApi 1.11]
    */
  var decimalSeparator: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether the Format Stale Values option within Calculation Options is enabled or disabled.
    The stale formulas are rendered with stale formatting if the option is enabled.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var formatStaleValues: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Returns the iterative calculation settings.
    In Excel on Windows and Mac, the settings will apply to the Excel Application.
    In Excel on the web and other platforms, the settings will apply to the active workbook.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var iterativeCalculation: js.UndefOr[IterativeCalculationLoadOptions] = js.undefined
  
  /**
    * Gets the string used to separate groups of digits to the left of the decimal for numeric values. This is based on the local Excel settings.
    *
    * @remarks
    * [Api set: ExcelApi 1.11]
    */
  var thousandsSeparator: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies if the system separators of Excel are enabled.
    System separators include the decimal separator and thousands separator.
    *
    * @remarks
    * [Api set: ExcelApi 1.11]
    */
  var useSystemSeparators: js.UndefOr[Boolean] = js.undefined
}
object ApplicationLoadOptions {
  
  inline def apply(): ApplicationLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationLoadOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationLoadOptions] (val x: Self) extends AnyVal {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setCalculationEngineVersion(value: Boolean): Self = StObject.set(x, "calculationEngineVersion", value.asInstanceOf[js.Any])
    
    inline def setCalculationEngineVersionUndefined: Self = StObject.set(x, "calculationEngineVersion", js.undefined)
    
    inline def setCalculationMode(value: Boolean): Self = StObject.set(x, "calculationMode", value.asInstanceOf[js.Any])
    
    inline def setCalculationModeUndefined: Self = StObject.set(x, "calculationMode", js.undefined)
    
    inline def setCalculationState(value: Boolean): Self = StObject.set(x, "calculationState", value.asInstanceOf[js.Any])
    
    inline def setCalculationStateUndefined: Self = StObject.set(x, "calculationState", js.undefined)
    
    inline def setCultureInfo(value: CultureInfoLoadOptions): Self = StObject.set(x, "cultureInfo", value.asInstanceOf[js.Any])
    
    inline def setCultureInfoUndefined: Self = StObject.set(x, "cultureInfo", js.undefined)
    
    inline def setDecimalSeparator(value: Boolean): Self = StObject.set(x, "decimalSeparator", value.asInstanceOf[js.Any])
    
    inline def setDecimalSeparatorUndefined: Self = StObject.set(x, "decimalSeparator", js.undefined)
    
    inline def setFormatStaleValues(value: Boolean): Self = StObject.set(x, "formatStaleValues", value.asInstanceOf[js.Any])
    
    inline def setFormatStaleValuesUndefined: Self = StObject.set(x, "formatStaleValues", js.undefined)
    
    inline def setIterativeCalculation(value: IterativeCalculationLoadOptions): Self = StObject.set(x, "iterativeCalculation", value.asInstanceOf[js.Any])
    
    inline def setIterativeCalculationUndefined: Self = StObject.set(x, "iterativeCalculation", js.undefined)
    
    inline def setThousandsSeparator(value: Boolean): Self = StObject.set(x, "thousandsSeparator", value.asInstanceOf[js.Any])
    
    inline def setThousandsSeparatorUndefined: Self = StObject.set(x, "thousandsSeparator", js.undefined)
    
    inline def setUseSystemSeparators(value: Boolean): Self = StObject.set(x, "useSystemSeparators", value.asInstanceOf[js.Any])
    
    inline def setUseSystemSeparatorsUndefined: Self = StObject.set(x, "useSystemSeparators", js.undefined)
  }
}
