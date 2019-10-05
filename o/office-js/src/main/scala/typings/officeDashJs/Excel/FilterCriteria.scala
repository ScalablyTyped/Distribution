package typings.officeDashJs.Excel

import typings.officeDashJs.officeDashJsStrings.AboveAverage
import typings.officeDashJs.officeDashJsStrings.AllDatesInPeriodApril
import typings.officeDashJs.officeDashJsStrings.AllDatesInPeriodAugust
import typings.officeDashJs.officeDashJsStrings.AllDatesInPeriodDecember
import typings.officeDashJs.officeDashJsStrings.AllDatesInPeriodFebruray
import typings.officeDashJs.officeDashJsStrings.AllDatesInPeriodJanuary
import typings.officeDashJs.officeDashJsStrings.AllDatesInPeriodJuly
import typings.officeDashJs.officeDashJsStrings.AllDatesInPeriodJune
import typings.officeDashJs.officeDashJsStrings.AllDatesInPeriodMarch
import typings.officeDashJs.officeDashJsStrings.AllDatesInPeriodMay
import typings.officeDashJs.officeDashJsStrings.AllDatesInPeriodNovember
import typings.officeDashJs.officeDashJsStrings.AllDatesInPeriodOctober
import typings.officeDashJs.officeDashJsStrings.AllDatesInPeriodQuarter1
import typings.officeDashJs.officeDashJsStrings.AllDatesInPeriodQuarter2
import typings.officeDashJs.officeDashJsStrings.AllDatesInPeriodQuarter3
import typings.officeDashJs.officeDashJsStrings.AllDatesInPeriodQuarter4
import typings.officeDashJs.officeDashJsStrings.AllDatesInPeriodSeptember
import typings.officeDashJs.officeDashJsStrings.And
import typings.officeDashJs.officeDashJsStrings.BelowAverage
import typings.officeDashJs.officeDashJsStrings.BottomItems
import typings.officeDashJs.officeDashJsStrings.BottomPercent
import typings.officeDashJs.officeDashJsStrings.CellColor
import typings.officeDashJs.officeDashJsStrings.Custom
import typings.officeDashJs.officeDashJsStrings.Dynamic
import typings.officeDashJs.officeDashJsStrings.FontColor
import typings.officeDashJs.officeDashJsStrings.LastMonth
import typings.officeDashJs.officeDashJsStrings.LastQuarter
import typings.officeDashJs.officeDashJsStrings.LastWeek
import typings.officeDashJs.officeDashJsStrings.LastYear
import typings.officeDashJs.officeDashJsStrings.NextMonth
import typings.officeDashJs.officeDashJsStrings.NextQuarter
import typings.officeDashJs.officeDashJsStrings.NextWeek
import typings.officeDashJs.officeDashJsStrings.NextYear
import typings.officeDashJs.officeDashJsStrings.Or
import typings.officeDashJs.officeDashJsStrings.ThisMonth
import typings.officeDashJs.officeDashJsStrings.ThisQuarter
import typings.officeDashJs.officeDashJsStrings.ThisWeek
import typings.officeDashJs.officeDashJsStrings.ThisYear
import typings.officeDashJs.officeDashJsStrings.Today
import typings.officeDashJs.officeDashJsStrings.Tomorrow
import typings.officeDashJs.officeDashJsStrings.TopItems
import typings.officeDashJs.officeDashJsStrings.TopPercent
import typings.officeDashJs.officeDashJsStrings.Unknown
import typings.officeDashJs.officeDashJsStrings.Values
import typings.officeDashJs.officeDashJsStrings.YearToDate
import typings.officeDashJs.officeDashJsStrings.Yesterday
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the filtering criteria applied to a column.
  *
  * [Api set: ExcelApi 1.2]
  */
trait FilterCriteria extends js.Object {
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
    
    Used as a number in the case of top/bottom items/percents. E.g. "5" for the top 5 items if filterOn is set to "topItems"
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
    DynamicFilterCriteria | Unknown | AboveAverage | AllDatesInPeriodApril | AllDatesInPeriodAugust | AllDatesInPeriodDecember | AllDatesInPeriodFebruray | AllDatesInPeriodJanuary | AllDatesInPeriodJuly | AllDatesInPeriodJune | AllDatesInPeriodMarch | AllDatesInPeriodMay | AllDatesInPeriodNovember | AllDatesInPeriodOctober | AllDatesInPeriodQuarter1 | AllDatesInPeriodQuarter2 | AllDatesInPeriodQuarter3 | AllDatesInPeriodQuarter4 | AllDatesInPeriodSeptember | BelowAverage | LastMonth | LastQuarter | LastWeek | LastYear | NextMonth | NextQuarter | NextWeek | NextYear | ThisMonth | ThisQuarter | ThisWeek | ThisYear | Today | Tomorrow | YearToDate | Yesterday
  ] = js.undefined
  /**
    *
    * The property used by the filter to determine whether the values should stay visible.
    *
    * [Api set: ExcelApi 1.2]
    */
  var filterOn: FilterOn | BottomItems | BottomPercent | CellColor | Dynamic | FontColor | Values | TopItems | TopPercent | typings.officeDashJs.officeDashJsStrings.Icon | Custom
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
  @scala.inline
  def apply(
    filterOn: FilterOn | BottomItems | BottomPercent | CellColor | Dynamic | FontColor | Values | TopItems | TopPercent | typings.officeDashJs.officeDashJsStrings.Icon | Custom,
    color: String = null,
    criterion1: String = null,
    criterion2: String = null,
    dynamicCriteria: DynamicFilterCriteria | Unknown | AboveAverage | AllDatesInPeriodApril | AllDatesInPeriodAugust | AllDatesInPeriodDecember | AllDatesInPeriodFebruray | AllDatesInPeriodJanuary | AllDatesInPeriodJuly | AllDatesInPeriodJune | AllDatesInPeriodMarch | AllDatesInPeriodMay | AllDatesInPeriodNovember | AllDatesInPeriodOctober | AllDatesInPeriodQuarter1 | AllDatesInPeriodQuarter2 | AllDatesInPeriodQuarter3 | AllDatesInPeriodQuarter4 | AllDatesInPeriodSeptember | BelowAverage | LastMonth | LastQuarter | LastWeek | LastYear | NextMonth | NextQuarter | NextWeek | NextYear | ThisMonth | ThisQuarter | ThisWeek | ThisYear | Today | Tomorrow | YearToDate | Yesterday = null,
    icon: Icon = null,
    operator: FilterOperator | And | Or = null,
    subField: String = null,
    values: js.Array[String | FilterDatetime] = null
  ): FilterCriteria = {
    val __obj = js.Dynamic.literal(filterOn = filterOn.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (criterion1 != null) __obj.updateDynamic("criterion1")(criterion1)
    if (criterion2 != null) __obj.updateDynamic("criterion2")(criterion2)
    if (dynamicCriteria != null) __obj.updateDynamic("dynamicCriteria")(dynamicCriteria.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    if (subField != null) __obj.updateDynamic("subField")(subField)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[FilterCriteria]
  }
}

