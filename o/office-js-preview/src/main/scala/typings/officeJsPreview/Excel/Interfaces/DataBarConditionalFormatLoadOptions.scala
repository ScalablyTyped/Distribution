package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an Excel conditional data bar type.
  *
  * @remarks
  * [Api set: ExcelApi 1.6]
  */
trait DataBarConditionalFormatLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * HTML color code representing the color of the Axis line, in the form #RRGGBB (e.g., "FFA500") or as a named HTML color (e.g., "orange").
    Value is "" (an empty string) if no axis is present or set.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var axisColor: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Representation of how the axis is determined for an Excel data bar.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var axisFormat: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the direction that the data bar graphic should be based on.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var barDirection: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The rule for what consistutes the lower bound (and how to calculate it, if applicable) for a data bar.
    The `ConditionalDataBarRule` object must be set as a JSON object (use `x.lowerBoundRule = {...}` instead of `x.lowerBoundRule.formula = ...`).
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var lowerBoundRule: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Representation of all values to the left of the axis in an Excel data bar.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var negativeFormat: js.UndefOr[ConditionalDataBarNegativeFormatLoadOptions] = js.undefined
  
  /**
    * Representation of all values to the right of the axis in an Excel data bar.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var positiveFormat: js.UndefOr[ConditionalDataBarPositiveFormatLoadOptions] = js.undefined
  
  /**
    * If `true`, hides the values from the cells where the data bar is applied.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var showDataBarOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The rule for what constitutes the upper bound (and how to calculate it, if applicable) for a data bar.
    The `ConditionalDataBarRule` object must be set as a JSON object (use `x.upperBoundRule = {...}` instead of `x.upperBoundRule.formula = ...`).
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var upperBoundRule: js.UndefOr[Boolean] = js.undefined
}
object DataBarConditionalFormatLoadOptions {
  
  inline def apply(): DataBarConditionalFormatLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataBarConditionalFormatLoadOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataBarConditionalFormatLoadOptions] (val x: Self) extends AnyVal {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setAxisColor(value: Boolean): Self = StObject.set(x, "axisColor", value.asInstanceOf[js.Any])
    
    inline def setAxisColorUndefined: Self = StObject.set(x, "axisColor", js.undefined)
    
    inline def setAxisFormat(value: Boolean): Self = StObject.set(x, "axisFormat", value.asInstanceOf[js.Any])
    
    inline def setAxisFormatUndefined: Self = StObject.set(x, "axisFormat", js.undefined)
    
    inline def setBarDirection(value: Boolean): Self = StObject.set(x, "barDirection", value.asInstanceOf[js.Any])
    
    inline def setBarDirectionUndefined: Self = StObject.set(x, "barDirection", js.undefined)
    
    inline def setLowerBoundRule(value: Boolean): Self = StObject.set(x, "lowerBoundRule", value.asInstanceOf[js.Any])
    
    inline def setLowerBoundRuleUndefined: Self = StObject.set(x, "lowerBoundRule", js.undefined)
    
    inline def setNegativeFormat(value: ConditionalDataBarNegativeFormatLoadOptions): Self = StObject.set(x, "negativeFormat", value.asInstanceOf[js.Any])
    
    inline def setNegativeFormatUndefined: Self = StObject.set(x, "negativeFormat", js.undefined)
    
    inline def setPositiveFormat(value: ConditionalDataBarPositiveFormatLoadOptions): Self = StObject.set(x, "positiveFormat", value.asInstanceOf[js.Any])
    
    inline def setPositiveFormatUndefined: Self = StObject.set(x, "positiveFormat", js.undefined)
    
    inline def setShowDataBarOnly(value: Boolean): Self = StObject.set(x, "showDataBarOnly", value.asInstanceOf[js.Any])
    
    inline def setShowDataBarOnlyUndefined: Self = StObject.set(x, "showDataBarOnly", js.undefined)
    
    inline def setUpperBoundRule(value: Boolean): Self = StObject.set(x, "upperBoundRule", value.asInstanceOf[js.Any])
    
    inline def setUpperBoundRuleUndefined: Self = StObject.set(x, "upperBoundRule", js.undefined)
  }
}
