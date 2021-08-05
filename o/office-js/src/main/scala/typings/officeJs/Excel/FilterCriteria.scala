package typings.officeJs.Excel

import typings.officeJs.officeJsStrings.AboveAverage
import typings.officeJs.officeJsStrings.AllDatesInPeriodApril
import typings.officeJs.officeJsStrings.AllDatesInPeriodAugust
import typings.officeJs.officeJsStrings.AllDatesInPeriodDecember
import typings.officeJs.officeJsStrings.AllDatesInPeriodFebruray
import typings.officeJs.officeJsStrings.AllDatesInPeriodJanuary
import typings.officeJs.officeJsStrings.AllDatesInPeriodJuly
import typings.officeJs.officeJsStrings.AllDatesInPeriodJune
import typings.officeJs.officeJsStrings.AllDatesInPeriodMarch
import typings.officeJs.officeJsStrings.AllDatesInPeriodMay
import typings.officeJs.officeJsStrings.AllDatesInPeriodNovember
import typings.officeJs.officeJsStrings.AllDatesInPeriodOctober
import typings.officeJs.officeJsStrings.AllDatesInPeriodQuarter1
import typings.officeJs.officeJsStrings.AllDatesInPeriodQuarter2
import typings.officeJs.officeJsStrings.AllDatesInPeriodQuarter3
import typings.officeJs.officeJsStrings.AllDatesInPeriodQuarter4
import typings.officeJs.officeJsStrings.AllDatesInPeriodSeptember
import typings.officeJs.officeJsStrings.And
import typings.officeJs.officeJsStrings.BelowAverage
import typings.officeJs.officeJsStrings.BottomItems
import typings.officeJs.officeJsStrings.BottomPercent
import typings.officeJs.officeJsStrings.CellColor
import typings.officeJs.officeJsStrings.Custom
import typings.officeJs.officeJsStrings.Dynamic
import typings.officeJs.officeJsStrings.FontColor
import typings.officeJs.officeJsStrings.LastMonth
import typings.officeJs.officeJsStrings.LastQuarter
import typings.officeJs.officeJsStrings.LastWeek
import typings.officeJs.officeJsStrings.LastYear
import typings.officeJs.officeJsStrings.NextMonth
import typings.officeJs.officeJsStrings.NextQuarter
import typings.officeJs.officeJsStrings.NextWeek
import typings.officeJs.officeJsStrings.NextYear
import typings.officeJs.officeJsStrings.Or
import typings.officeJs.officeJsStrings.ThisMonth
import typings.officeJs.officeJsStrings.ThisQuarter
import typings.officeJs.officeJsStrings.ThisWeek
import typings.officeJs.officeJsStrings.ThisYear
import typings.officeJs.officeJsStrings.Today
import typings.officeJs.officeJsStrings.Tomorrow
import typings.officeJs.officeJsStrings.TopItems
import typings.officeJs.officeJsStrings.TopPercent
import typings.officeJs.officeJsStrings.Unknown_
import typings.officeJs.officeJsStrings.Values
import typings.officeJs.officeJsStrings.YearToDate
import typings.officeJs.officeJsStrings.Yesterday
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the filtering criteria applied to a column.
  *
  * [Api set: ExcelApi 1.2]
  */
trait FilterCriteria extends StObject {
  
  /**
    *
    * The HTML color string used to filter cells. Used with "cellColor" and "fontColor" filtering.
    *
    * [Api set: ExcelApi 1.2]
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    *
    * The first criterion used to filter data. Used as an operator in the case of "custom" filtering.
    For example ">50" for number greater than 50 or "=*s" for values ending in "s".
    
    Used as a number in the case of top/bottom items/percents (e.g., "5" for the top 5 items if filterOn is set to "topItems").
    *
    * [Api set: ExcelApi 1.2]
    */
  var criterion1: js.UndefOr[String] = js.undefined
  
  /**
    *
    * The second criterion used to filter data. Only used as an operator in the case of "custom" filtering.
    *
    * [Api set: ExcelApi 1.2]
    */
  var criterion2: js.UndefOr[String] = js.undefined
  
  /**
    *
    * The dynamic criteria from the Excel.DynamicFilterCriteria set to apply on this column. Used with "dynamic" filtering.
    *
    * [Api set: ExcelApi 1.2]
    */
  var dynamicCriteria: js.UndefOr[
    DynamicFilterCriteria | Unknown_ | AboveAverage | AllDatesInPeriodApril | AllDatesInPeriodAugust | AllDatesInPeriodDecember | AllDatesInPeriodFebruray | AllDatesInPeriodJanuary | AllDatesInPeriodJuly | AllDatesInPeriodJune | AllDatesInPeriodMarch | AllDatesInPeriodMay | AllDatesInPeriodNovember | AllDatesInPeriodOctober | AllDatesInPeriodQuarter1 | AllDatesInPeriodQuarter2 | AllDatesInPeriodQuarter3 | AllDatesInPeriodQuarter4 | AllDatesInPeriodSeptember | BelowAverage | LastMonth | LastQuarter | LastWeek | LastYear | NextMonth | NextQuarter | NextWeek | NextYear | ThisMonth | ThisQuarter | ThisWeek | ThisYear | Today | Tomorrow | YearToDate | Yesterday
  ] = js.undefined
  
  /**
    *
    * The property used by the filter to determine whether the values should stay visible.
    *
    * [Api set: ExcelApi 1.2]
    */
  var filterOn: FilterOn | BottomItems | BottomPercent | CellColor | Dynamic | FontColor | Values | TopItems | TopPercent | typings.officeJs.officeJsStrings.Icon | Custom
  
  /**
    *
    * The icon used to filter cells. Used with "icon" filtering.
    *
    * [Api set: ExcelApi 1.2]
    */
  var icon: js.UndefOr[Icon] = js.undefined
  
  /**
    *
    * The operator used to combine criterion 1 and 2 when using "custom" filtering.
    *
    * [Api set: ExcelApi 1.2]
    */
  var operator: js.UndefOr[FilterOperator | And | Or] = js.undefined
  
  /**
    *
    * The property used by the filter to do rich filter on richvalues.
    *
    * [Api set: ExcelApi 1.9]
    */
  var subField: js.UndefOr[String] = js.undefined
  
  /**
    *
    * The set of values to be used as part of "values" filtering.
    *
    * [Api set: ExcelApi 1.2]
    */
  var values: js.UndefOr[js.Array[String | FilterDatetime]] = js.undefined
}
object FilterCriteria {
  
  inline def apply(
    filterOn: FilterOn | BottomItems | BottomPercent | CellColor | Dynamic | FontColor | Values | TopItems | TopPercent | typings.officeJs.officeJsStrings.Icon | Custom
  ): FilterCriteria = {
    val __obj = js.Dynamic.literal(filterOn = filterOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterCriteria]
  }
  
  extension [Self <: FilterCriteria](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setCriterion1(value: String): Self = StObject.set(x, "criterion1", value.asInstanceOf[js.Any])
    
    inline def setCriterion1Undefined: Self = StObject.set(x, "criterion1", js.undefined)
    
    inline def setCriterion2(value: String): Self = StObject.set(x, "criterion2", value.asInstanceOf[js.Any])
    
    inline def setCriterion2Undefined: Self = StObject.set(x, "criterion2", js.undefined)
    
    inline def setDynamicCriteria(
      value: DynamicFilterCriteria | Unknown_ | AboveAverage | AllDatesInPeriodApril | AllDatesInPeriodAugust | AllDatesInPeriodDecember | AllDatesInPeriodFebruray | AllDatesInPeriodJanuary | AllDatesInPeriodJuly | AllDatesInPeriodJune | AllDatesInPeriodMarch | AllDatesInPeriodMay | AllDatesInPeriodNovember | AllDatesInPeriodOctober | AllDatesInPeriodQuarter1 | AllDatesInPeriodQuarter2 | AllDatesInPeriodQuarter3 | AllDatesInPeriodQuarter4 | AllDatesInPeriodSeptember | BelowAverage | LastMonth | LastQuarter | LastWeek | LastYear | NextMonth | NextQuarter | NextWeek | NextYear | ThisMonth | ThisQuarter | ThisWeek | ThisYear | Today | Tomorrow | YearToDate | Yesterday
    ): Self = StObject.set(x, "dynamicCriteria", value.asInstanceOf[js.Any])
    
    inline def setDynamicCriteriaUndefined: Self = StObject.set(x, "dynamicCriteria", js.undefined)
    
    inline def setFilterOn(
      value: FilterOn | BottomItems | BottomPercent | CellColor | Dynamic | FontColor | Values | TopItems | TopPercent | typings.officeJs.officeJsStrings.Icon | Custom
    ): Self = StObject.set(x, "filterOn", value.asInstanceOf[js.Any])
    
    inline def setIcon(value: Icon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setOperator(value: FilterOperator | And | Or): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    inline def setSubField(value: String): Self = StObject.set(x, "subField", value.asInstanceOf[js.Any])
    
    inline def setSubFieldUndefined: Self = StObject.set(x, "subField", js.undefined)
    
    inline def setValues(value: js.Array[String | FilterDatetime]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: (String | FilterDatetime)*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
