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
trait FilterCriteria extends js.Object {
  
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
  var filterOn: FilterOn | BottomItems | BottomPercent | CellColor | Dynamic | FontColor | Values | TopItems | TopPercent | typings.officeJs.officeJsStrings.Icon | Custom = js.native
  
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
    filterOn: FilterOn | BottomItems | BottomPercent | CellColor | Dynamic | FontColor | Values | TopItems | TopPercent | typings.officeJs.officeJsStrings.Icon | Custom
  ): FilterCriteria = {
    val __obj = js.Dynamic.literal(filterOn = filterOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterCriteria]
  }
  
  @scala.inline
  implicit class FilterCriteriaOps[Self <: FilterCriteria] (val x: Self) extends AnyVal {
    
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
    def setFilterOn(
      value: FilterOn | BottomItems | BottomPercent | CellColor | Dynamic | FontColor | Values | TopItems | TopPercent | typings.officeJs.officeJsStrings.Icon | Custom
    ): Self = this.set("filterOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setCriterion1(value: String): Self = this.set("criterion1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCriterion1: Self = this.set("criterion1", js.undefined)
    
    @scala.inline
    def setCriterion2(value: String): Self = this.set("criterion2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCriterion2: Self = this.set("criterion2", js.undefined)
    
    @scala.inline
    def setDynamicCriteria(
      value: DynamicFilterCriteria | Unknown_ | AboveAverage | AllDatesInPeriodApril | AllDatesInPeriodAugust | AllDatesInPeriodDecember | AllDatesInPeriodFebruray | AllDatesInPeriodJanuary | AllDatesInPeriodJuly | AllDatesInPeriodJune | AllDatesInPeriodMarch | AllDatesInPeriodMay | AllDatesInPeriodNovember | AllDatesInPeriodOctober | AllDatesInPeriodQuarter1 | AllDatesInPeriodQuarter2 | AllDatesInPeriodQuarter3 | AllDatesInPeriodQuarter4 | AllDatesInPeriodSeptember | BelowAverage | LastMonth | LastQuarter | LastWeek | LastYear | NextMonth | NextQuarter | NextWeek | NextYear | ThisMonth | ThisQuarter | ThisWeek | ThisYear | Today | Tomorrow | YearToDate | Yesterday
    ): Self = this.set("dynamicCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDynamicCriteria: Self = this.set("dynamicCriteria", js.undefined)
    
    @scala.inline
    def setIcon(value: Icon): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setOperator(value: FilterOperator | And | Or): Self = this.set("operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperator: Self = this.set("operator", js.undefined)
    
    @scala.inline
    def setSubField(value: String): Self = this.set("subField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubField: Self = this.set("subField", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: (String | FilterDatetime)*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[String | FilterDatetime]): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
}
