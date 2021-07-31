package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.ConditionalDataBarAxisFormat
import typings.officeJsPreview.Excel.ConditionalDataBarDirection
import typings.officeJsPreview.Excel.ConditionalDataBarRule
import typings.officeJsPreview.officeJsPreviewStrings.Automatic
import typings.officeJsPreview.officeJsPreviewStrings.CellMidPoint
import typings.officeJsPreview.officeJsPreviewStrings.Context
import typings.officeJsPreview.officeJsPreviewStrings.LeftToRight
import typings.officeJsPreview.officeJsPreviewStrings.None
import typings.officeJsPreview.officeJsPreviewStrings.RightToLeft
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `dataBarConditionalFormat.toJSON()`. */
trait DataBarConditionalFormatData extends StObject {
  
  /**
    *
    * HTML color code representing the color of the Axis line, of the form #RRGGBB (e.g., "FFA500") or as a named HTML color (e.g., "orange").
    "" (empty string) if no axis is present or set.
    *
    * [Api set: ExcelApi 1.6]
    */
  var axisColor: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Representation of how the axis is determined for an Excel data bar.
    *
    * [Api set: ExcelApi 1.6]
    */
  var axisFormat: js.UndefOr[ConditionalDataBarAxisFormat | Automatic | None | CellMidPoint] = js.undefined
  
  /**
    *
    * Specifies the direction that the data bar graphic should be based on.
    *
    * [Api set: ExcelApi 1.6]
    */
  var barDirection: js.UndefOr[ConditionalDataBarDirection | Context | LeftToRight | RightToLeft] = js.undefined
  
  /**
    *
    * The rule for what consistutes the lower bound (and how to calculate it, if applicable) for a data bar.
    The `ConditionalDataBarRule` object must be set as a JSON object (use `x.lowerBoundRule = {...}` instead of `x.lowerBoundRule.formula = ...`).
    *
    * [Api set: ExcelApi 1.6]
    */
  var lowerBoundRule: js.UndefOr[ConditionalDataBarRule] = js.undefined
  
  /**
    *
    * Representation of all values to the left of the axis in an Excel data bar.
    *
    * [Api set: ExcelApi 1.6]
    */
  var negativeFormat: js.UndefOr[ConditionalDataBarNegativeFormatData] = js.undefined
  
  /**
    *
    * Representation of all values to the right of the axis in an Excel data bar.
    *
    * [Api set: ExcelApi 1.6]
    */
  var positiveFormat: js.UndefOr[ConditionalDataBarPositiveFormatData] = js.undefined
  
  /**
    *
    * If true, hides the values from the cells where the data bar is applied.
    *
    * [Api set: ExcelApi 1.6]
    */
  var showDataBarOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * The rule for what constitutes the upper bound (and how to calculate it, if applicable) for a data bar.
    The `ConditionalDataBarRule` object must be set as a JSON object (use `x.upperBoundRule = {...}` instead of `x.upperBoundRule.formula = ...`).
    *
    * [Api set: ExcelApi 1.6]
    */
  var upperBoundRule: js.UndefOr[ConditionalDataBarRule] = js.undefined
}
object DataBarConditionalFormatData {
  
  @scala.inline
  def apply(): DataBarConditionalFormatData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataBarConditionalFormatData]
  }
  
  @scala.inline
  implicit class DataBarConditionalFormatDataMutableBuilder[Self <: DataBarConditionalFormatData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxisColor(value: String): Self = StObject.set(x, "axisColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisColorUndefined: Self = StObject.set(x, "axisColor", js.undefined)
    
    @scala.inline
    def setAxisFormat(value: ConditionalDataBarAxisFormat | Automatic | None | CellMidPoint): Self = StObject.set(x, "axisFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisFormatUndefined: Self = StObject.set(x, "axisFormat", js.undefined)
    
    @scala.inline
    def setBarDirection(value: ConditionalDataBarDirection | Context | LeftToRight | RightToLeft): Self = StObject.set(x, "barDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarDirectionUndefined: Self = StObject.set(x, "barDirection", js.undefined)
    
    @scala.inline
    def setLowerBoundRule(value: ConditionalDataBarRule): Self = StObject.set(x, "lowerBoundRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowerBoundRuleUndefined: Self = StObject.set(x, "lowerBoundRule", js.undefined)
    
    @scala.inline
    def setNegativeFormat(value: ConditionalDataBarNegativeFormatData): Self = StObject.set(x, "negativeFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegativeFormatUndefined: Self = StObject.set(x, "negativeFormat", js.undefined)
    
    @scala.inline
    def setPositiveFormat(value: ConditionalDataBarPositiveFormatData): Self = StObject.set(x, "positiveFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositiveFormatUndefined: Self = StObject.set(x, "positiveFormat", js.undefined)
    
    @scala.inline
    def setShowDataBarOnly(value: Boolean): Self = StObject.set(x, "showDataBarOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowDataBarOnlyUndefined: Self = StObject.set(x, "showDataBarOnly", js.undefined)
    
    @scala.inline
    def setUpperBoundRule(value: ConditionalDataBarRule): Self = StObject.set(x, "upperBoundRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpperBoundRuleUndefined: Self = StObject.set(x, "upperBoundRule", js.undefined)
  }
}
