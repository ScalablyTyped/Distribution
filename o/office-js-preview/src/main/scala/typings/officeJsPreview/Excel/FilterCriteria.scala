package typings.officeJsPreview.Excel

import typings.officeJsPreview.officeJsPreviewStrings.AboveAverage
import typings.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodApril
import typings.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodAugust
import typings.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodDecember
import typings.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodFebruray
import typings.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodJanuary
import typings.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodJuly
import typings.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodJune
import typings.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodMarch
import typings.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodMay
import typings.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodNovember
import typings.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodOctober
import typings.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodQuarter1
import typings.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodQuarter2
import typings.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodQuarter3
import typings.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodQuarter4
import typings.officeJsPreview.officeJsPreviewStrings.AllDatesInPeriodSeptember
import typings.officeJsPreview.officeJsPreviewStrings.And
import typings.officeJsPreview.officeJsPreviewStrings.BelowAverage
import typings.officeJsPreview.officeJsPreviewStrings.BottomItems
import typings.officeJsPreview.officeJsPreviewStrings.BottomPercent
import typings.officeJsPreview.officeJsPreviewStrings.CellColor
import typings.officeJsPreview.officeJsPreviewStrings.Custom
import typings.officeJsPreview.officeJsPreviewStrings.Dynamic
import typings.officeJsPreview.officeJsPreviewStrings.FontColor
import typings.officeJsPreview.officeJsPreviewStrings.LastMonth
import typings.officeJsPreview.officeJsPreviewStrings.LastQuarter
import typings.officeJsPreview.officeJsPreviewStrings.LastWeek
import typings.officeJsPreview.officeJsPreviewStrings.LastYear
import typings.officeJsPreview.officeJsPreviewStrings.NextMonth
import typings.officeJsPreview.officeJsPreviewStrings.NextQuarter
import typings.officeJsPreview.officeJsPreviewStrings.NextWeek
import typings.officeJsPreview.officeJsPreviewStrings.NextYear
import typings.officeJsPreview.officeJsPreviewStrings.Or
import typings.officeJsPreview.officeJsPreviewStrings.ThisMonth
import typings.officeJsPreview.officeJsPreviewStrings.ThisQuarter
import typings.officeJsPreview.officeJsPreviewStrings.ThisWeek
import typings.officeJsPreview.officeJsPreviewStrings.ThisYear
import typings.officeJsPreview.officeJsPreviewStrings.Today
import typings.officeJsPreview.officeJsPreviewStrings.Tomorrow
import typings.officeJsPreview.officeJsPreviewStrings.TopItems
import typings.officeJsPreview.officeJsPreviewStrings.TopPercent
import typings.officeJsPreview.officeJsPreviewStrings.Unknown_
import typings.officeJsPreview.officeJsPreviewStrings.Values
import typings.officeJsPreview.officeJsPreviewStrings.YearToDate
import typings.officeJsPreview.officeJsPreviewStrings.Yesterday
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the filtering criteria applied to a column.
  *
  * [Api set: ExcelApi 1.2]
  */
@js.native
trait FilterCriteria extends StObject {
  
  /**
    *
    * The HTML color string used to filter cells. Used with "cellColor" and "fontColor" filtering.
    *
    * [Api set: ExcelApi 1.2]
    */
  var color: js.UndefOr[String] = js.native
  
  /**
    *
    * The first criterion used to filter data. Used as an operator in the case of "custom" filtering.
    For example ">50" for number greater than 50 or "=*s" for values ending in "s".
    
    Used as a number in the case of top/bottom items/percents (e.g., "5" for the top 5 items if filterOn is set to "topItems").
    *
    * [Api set: ExcelApi 1.2]
    */
  var criterion1: js.UndefOr[String] = js.native
  
  /**
    *
    * The second criterion used to filter data. Only used as an operator in the case of "custom" filtering.
    *
    * [Api set: ExcelApi 1.2]
    */
  var criterion2: js.UndefOr[String] = js.native
  
  /**
    *
    * The dynamic criteria from the Excel.DynamicFilterCriteria set to apply on this column. Used with "dynamic" filtering.
    *
    * [Api set: ExcelApi 1.2]
    */
  var dynamicCriteria: js.UndefOr[
    DynamicFilterCriteria | Unknown_ | AboveAverage | AllDatesInPeriodApril | AllDatesInPeriodAugust | AllDatesInPeriodDecember | AllDatesInPeriodFebruray | AllDatesInPeriodJanuary | AllDatesInPeriodJuly | AllDatesInPeriodJune | AllDatesInPeriodMarch | AllDatesInPeriodMay | AllDatesInPeriodNovember | AllDatesInPeriodOctober | AllDatesInPeriodQuarter1 | AllDatesInPeriodQuarter2 | AllDatesInPeriodQuarter3 | AllDatesInPeriodQuarter4 | AllDatesInPeriodSeptember | BelowAverage | LastMonth | LastQuarter | LastWeek | LastYear | NextMonth | NextQuarter | NextWeek | NextYear | ThisMonth | ThisQuarter | ThisWeek | ThisYear | Today | Tomorrow | YearToDate | Yesterday
  ] = js.native
  
  /**
    *
    * The property used by the filter to determine whether the values should stay visible.
    *
    * [Api set: ExcelApi 1.2]
    */
  var filterOn: FilterOn | BottomItems | BottomPercent | CellColor | Dynamic | FontColor | Values | TopItems | TopPercent | typings.officeJsPreview.officeJsPreviewStrings.Icon | Custom = js.native
  
  /**
    *
    * The icon used to filter cells. Used with "icon" filtering.
    *
    * [Api set: ExcelApi 1.2]
    */
  var icon: js.UndefOr[Icon] = js.native
  
  /**
    *
    * The operator used to combine criterion 1 and 2 when using "custom" filtering.
    *
    * [Api set: ExcelApi 1.2]
    */
  var operator: js.UndefOr[FilterOperator | And | Or] = js.native
  
  /**
    *
    * The property used by the filter to do rich filter on richvalues.
    *
    * [Api set: ExcelApi 1.9]
    */
  var subField: js.UndefOr[String] = js.native
  
  /**
    *
    * The set of values to be used as part of "values" filtering.
    *
    * [Api set: ExcelApi 1.2]
    */
  var values: js.UndefOr[js.Array[String | FilterDatetime]] = js.native
}
object FilterCriteria {
  
  @scala.inline
  def apply(
    filterOn: FilterOn | BottomItems | BottomPercent | CellColor | Dynamic | FontColor | Values | TopItems | TopPercent | typings.officeJsPreview.officeJsPreviewStrings.Icon | Custom
  ): FilterCriteria = {
    val __obj = js.Dynamic.literal(filterOn = filterOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterCriteria]
  }
  
  @scala.inline
  implicit class FilterCriteriaMutableBuilder[Self <: FilterCriteria] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setCriterion1(value: String): Self = StObject.set(x, "criterion1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCriterion1Undefined: Self = StObject.set(x, "criterion1", js.undefined)
    
    @scala.inline
    def setCriterion2(value: String): Self = StObject.set(x, "criterion2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCriterion2Undefined: Self = StObject.set(x, "criterion2", js.undefined)
    
    @scala.inline
    def setDynamicCriteria(
      value: DynamicFilterCriteria | Unknown_ | AboveAverage | AllDatesInPeriodApril | AllDatesInPeriodAugust | AllDatesInPeriodDecember | AllDatesInPeriodFebruray | AllDatesInPeriodJanuary | AllDatesInPeriodJuly | AllDatesInPeriodJune | AllDatesInPeriodMarch | AllDatesInPeriodMay | AllDatesInPeriodNovember | AllDatesInPeriodOctober | AllDatesInPeriodQuarter1 | AllDatesInPeriodQuarter2 | AllDatesInPeriodQuarter3 | AllDatesInPeriodQuarter4 | AllDatesInPeriodSeptember | BelowAverage | LastMonth | LastQuarter | LastWeek | LastYear | NextMonth | NextQuarter | NextWeek | NextYear | ThisMonth | ThisQuarter | ThisWeek | ThisYear | Today | Tomorrow | YearToDate | Yesterday
    ): Self = StObject.set(x, "dynamicCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicCriteriaUndefined: Self = StObject.set(x, "dynamicCriteria", js.undefined)
    
    @scala.inline
    def setFilterOn(
      value: FilterOn | BottomItems | BottomPercent | CellColor | Dynamic | FontColor | Values | TopItems | TopPercent | typings.officeJsPreview.officeJsPreviewStrings.Icon | Custom
    ): Self = StObject.set(x, "filterOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: Icon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setOperator(value: FilterOperator | And | Or): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    @scala.inline
    def setSubField(value: String): Self = StObject.set(x, "subField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubFieldUndefined: Self = StObject.set(x, "subField", js.undefined)
    
    @scala.inline
    def setValues(value: js.Array[String | FilterDatetime]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: (String | FilterDatetime)*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
