package typings.officeDashJsDashPreview.ExcelNs

import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.AboveAverage
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.AllDatesInPeriodApril
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.AllDatesInPeriodAugust
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.AllDatesInPeriodDecember
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.AllDatesInPeriodFebruray
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.AllDatesInPeriodJanuary
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.AllDatesInPeriodJuly
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.AllDatesInPeriodJune
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.AllDatesInPeriodMarch
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.AllDatesInPeriodMay
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.AllDatesInPeriodNovember
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.AllDatesInPeriodOctober
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.AllDatesInPeriodQuarter1
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.AllDatesInPeriodQuarter2
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.AllDatesInPeriodQuarter3
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.AllDatesInPeriodQuarter4
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.AllDatesInPeriodSeptember
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.And
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.BelowAverage
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.BottomItems
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.BottomPercent
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.CellColor
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Custom
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Dynamic
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.FontColor
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.LastMonth
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.LastQuarter
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.LastWeek
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.LastYear
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.NextMonth
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.NextQuarter
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.NextWeek
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.NextYear
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Or
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThisMonth
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThisQuarter
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThisWeek
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThisYear
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Today
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Tomorrow
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.TopItems
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.TopPercent
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Unknown
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Values
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.YearToDate
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Yesterday
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
  var filterOn: FilterOn | BottomItems | BottomPercent | CellColor | Dynamic | FontColor | Values | TopItems | TopPercent | typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Icon | Custom
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
    filterOn: FilterOn | BottomItems | BottomPercent | CellColor | Dynamic | FontColor | Values | TopItems | TopPercent | typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Icon | Custom,
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

