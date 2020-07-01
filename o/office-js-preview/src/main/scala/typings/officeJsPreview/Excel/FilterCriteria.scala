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
  var filterOn: FilterOn | BottomItems | BottomPercent | CellColor | Dynamic | FontColor | Values | TopItems | TopPercent | typings.officeJsPreview.officeJsPreviewStrings.Icon | Custom
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
    filterOn: FilterOn | BottomItems | BottomPercent | CellColor | Dynamic | FontColor | Values | TopItems | TopPercent | typings.officeJsPreview.officeJsPreviewStrings.Icon | Custom,
    color: String = null,
    criterion1: String = null,
    criterion2: String = null,
    dynamicCriteria: DynamicFilterCriteria | Unknown_ | AboveAverage | AllDatesInPeriodApril | AllDatesInPeriodAugust | AllDatesInPeriodDecember | AllDatesInPeriodFebruray | AllDatesInPeriodJanuary | AllDatesInPeriodJuly | AllDatesInPeriodJune | AllDatesInPeriodMarch | AllDatesInPeriodMay | AllDatesInPeriodNovember | AllDatesInPeriodOctober | AllDatesInPeriodQuarter1 | AllDatesInPeriodQuarter2 | AllDatesInPeriodQuarter3 | AllDatesInPeriodQuarter4 | AllDatesInPeriodSeptember | BelowAverage | LastMonth | LastQuarter | LastWeek | LastYear | NextMonth | NextQuarter | NextWeek | NextYear | ThisMonth | ThisQuarter | ThisWeek | ThisYear | Today | Tomorrow | YearToDate | Yesterday = null,
    icon: Icon = null,
    operator: FilterOperator | And | Or = null,
    subField: String = null,
    values: js.Array[String | FilterDatetime] = null
  ): FilterCriteria = {
    val __obj = js.Dynamic.literal(filterOn = filterOn.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (criterion1 != null) __obj.updateDynamic("criterion1")(criterion1.asInstanceOf[js.Any])
    if (criterion2 != null) __obj.updateDynamic("criterion2")(criterion2.asInstanceOf[js.Any])
    if (dynamicCriteria != null) __obj.updateDynamic("dynamicCriteria")(dynamicCriteria.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    if (subField != null) __obj.updateDynamic("subField")(subField.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterCriteria]
  }
}

