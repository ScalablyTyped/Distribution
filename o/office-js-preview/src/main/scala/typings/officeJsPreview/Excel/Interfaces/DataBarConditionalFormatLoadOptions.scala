package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents an Excel Conditional Data Bar Type.
  *
  * [Api set: ExcelApi 1.6]
  */
@js.native
trait DataBarConditionalFormatLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * HTML color code representing the color of the Axis line, of the form #RRGGBB (e.g., "FFA500") or as a named HTML color (e.g., "orange").
    "" (empty string) if no axis is present or set.
    *
    * [Api set: ExcelApi 1.6]
    */
  var axisColor: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Representation of how the axis is determined for an Excel data bar.
    *
    * [Api set: ExcelApi 1.6]
    */
  var axisFormat: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies the direction that the data bar graphic should be based on.
    *
    * [Api set: ExcelApi 1.6]
    */
  var barDirection: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * The rule for what consistutes the lower bound (and how to calculate it, if applicable) for a data bar.
    The `ConditionalDataBarRule` object must be set as a JSON object (use `x.lowerBoundRule = {...}` instead of `x.lowerBoundRule.formula = ...`).
    *
    * [Api set: ExcelApi 1.6]
    */
  var lowerBoundRule: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Representation of all values to the left of the axis in an Excel data bar.
    *
    * [Api set: ExcelApi 1.6]
    */
  var negativeFormat: js.UndefOr[ConditionalDataBarNegativeFormatLoadOptions] = js.native
  
  /**
    *
    * Representation of all values to the right of the axis in an Excel data bar.
    *
    * [Api set: ExcelApi 1.6]
    */
  var positiveFormat: js.UndefOr[ConditionalDataBarPositiveFormatLoadOptions] = js.native
  
  /**
    *
    * If true, hides the values from the cells where the data bar is applied.
    *
    * [Api set: ExcelApi 1.6]
    */
  var showDataBarOnly: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * The rule for what constitutes the upper bound (and how to calculate it, if applicable) for a data bar.
    The `ConditionalDataBarRule` object must be set as a JSON object (use `x.upperBoundRule = {...}` instead of `x.upperBoundRule.formula = ...`).
    *
    * [Api set: ExcelApi 1.6]
    */
  var upperBoundRule: js.UndefOr[Boolean] = js.native
}
object DataBarConditionalFormatLoadOptions {
  
  @scala.inline
  def apply(): DataBarConditionalFormatLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataBarConditionalFormatLoadOptions]
  }
  
  @scala.inline
  implicit class DataBarConditionalFormatLoadOptionsMutableBuilder[Self <: DataBarConditionalFormatLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    @scala.inline
    def setAxisColor(value: Boolean): Self = StObject.set(x, "axisColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisColorUndefined: Self = StObject.set(x, "axisColor", js.undefined)
    
    @scala.inline
    def setAxisFormat(value: Boolean): Self = StObject.set(x, "axisFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisFormatUndefined: Self = StObject.set(x, "axisFormat", js.undefined)
    
    @scala.inline
    def setBarDirection(value: Boolean): Self = StObject.set(x, "barDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarDirectionUndefined: Self = StObject.set(x, "barDirection", js.undefined)
    
    @scala.inline
    def setLowerBoundRule(value: Boolean): Self = StObject.set(x, "lowerBoundRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowerBoundRuleUndefined: Self = StObject.set(x, "lowerBoundRule", js.undefined)
    
    @scala.inline
    def setNegativeFormat(value: ConditionalDataBarNegativeFormatLoadOptions): Self = StObject.set(x, "negativeFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegativeFormatUndefined: Self = StObject.set(x, "negativeFormat", js.undefined)
    
    @scala.inline
    def setPositiveFormat(value: ConditionalDataBarPositiveFormatLoadOptions): Self = StObject.set(x, "positiveFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositiveFormatUndefined: Self = StObject.set(x, "positiveFormat", js.undefined)
    
    @scala.inline
    def setShowDataBarOnly(value: Boolean): Self = StObject.set(x, "showDataBarOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowDataBarOnlyUndefined: Self = StObject.set(x, "showDataBarOnly", js.undefined)
    
    @scala.inline
    def setUpperBoundRule(value: Boolean): Self = StObject.set(x, "upperBoundRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpperBoundRuleUndefined: Self = StObject.set(x, "upperBoundRule", js.undefined)
  }
}
