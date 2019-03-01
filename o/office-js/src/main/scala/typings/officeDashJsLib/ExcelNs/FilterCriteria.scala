package typings
package officeDashJsLib.ExcelNs

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
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * The first criterion used to filter data. Used as an operator in the case of "custom" filtering.
    For example ">50" for number greater than 50 or "=*s" for values ending in "s".
    
    Used as a number in the case of top/bottom items/percents. E.g. "5" for the top 5 items if filterOn is set to "topItems"
    *
    * [Api set: ExcelApi 1.2]
    */
  var criterion1: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * The second criterion used to filter data. Only used as an operator in the case of "custom" filtering.
    *
    * [Api set: ExcelApi 1.2]
    */
  var criterion2: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * The dynamic criteria from the Excel.DynamicFilterCriteria set to apply on this column. Used with "dynamic" filtering.
    *
    * [Api set: ExcelApi 1.2]
    */
  var dynamicCriteria: js.UndefOr[
    DynamicFilterCriteria | officeDashJsLib.officeDashJsLibStrings.Unknown | officeDashJsLib.officeDashJsLibStrings.AboveAverage | officeDashJsLib.officeDashJsLibStrings.AllDatesInPeriodApril | officeDashJsLib.officeDashJsLibStrings.AllDatesInPeriodAugust | officeDashJsLib.officeDashJsLibStrings.AllDatesInPeriodDecember | officeDashJsLib.officeDashJsLibStrings.AllDatesInPeriodFebruray | officeDashJsLib.officeDashJsLibStrings.AllDatesInPeriodJanuary | officeDashJsLib.officeDashJsLibStrings.AllDatesInPeriodJuly | officeDashJsLib.officeDashJsLibStrings.AllDatesInPeriodJune | officeDashJsLib.officeDashJsLibStrings.AllDatesInPeriodMarch | officeDashJsLib.officeDashJsLibStrings.AllDatesInPeriodMay | officeDashJsLib.officeDashJsLibStrings.AllDatesInPeriodNovember | officeDashJsLib.officeDashJsLibStrings.AllDatesInPeriodOctober | officeDashJsLib.officeDashJsLibStrings.AllDatesInPeriodQuarter1 | officeDashJsLib.officeDashJsLibStrings.AllDatesInPeriodQuarter2 | officeDashJsLib.officeDashJsLibStrings.AllDatesInPeriodQuarter3 | officeDashJsLib.officeDashJsLibStrings.AllDatesInPeriodQuarter4 | officeDashJsLib.officeDashJsLibStrings.AllDatesInPeriodSeptember | officeDashJsLib.officeDashJsLibStrings.BelowAverage | officeDashJsLib.officeDashJsLibStrings.LastMonth | officeDashJsLib.officeDashJsLibStrings.LastQuarter | officeDashJsLib.officeDashJsLibStrings.LastWeek | officeDashJsLib.officeDashJsLibStrings.LastYear | officeDashJsLib.officeDashJsLibStrings.NextMonth | officeDashJsLib.officeDashJsLibStrings.NextQuarter | officeDashJsLib.officeDashJsLibStrings.NextWeek | officeDashJsLib.officeDashJsLibStrings.NextYear | officeDashJsLib.officeDashJsLibStrings.ThisMonth | officeDashJsLib.officeDashJsLibStrings.ThisQuarter | officeDashJsLib.officeDashJsLibStrings.ThisWeek | officeDashJsLib.officeDashJsLibStrings.ThisYear | officeDashJsLib.officeDashJsLibStrings.Today | officeDashJsLib.officeDashJsLibStrings.Tomorrow | officeDashJsLib.officeDashJsLibStrings.YearToDate | officeDashJsLib.officeDashJsLibStrings.Yesterday
  ] = js.undefined
  /**
    *
    * The property used by the filter to determine whether the values should stay visible.
    *
    * [Api set: ExcelApi 1.2]
    */
  var filterOn: FilterOn | officeDashJsLib.officeDashJsLibStrings.BottomItems | officeDashJsLib.officeDashJsLibStrings.BottomPercent | officeDashJsLib.officeDashJsLibStrings.CellColor | officeDashJsLib.officeDashJsLibStrings.Dynamic | officeDashJsLib.officeDashJsLibStrings.FontColor | officeDashJsLib.officeDashJsLibStrings.Values | officeDashJsLib.officeDashJsLibStrings.TopItems | officeDashJsLib.officeDashJsLibStrings.TopPercent | officeDashJsLib.officeDashJsLibStrings.Icon | officeDashJsLib.officeDashJsLibStrings.Custom
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
  var operator: js.UndefOr[
    FilterOperator | officeDashJsLib.officeDashJsLibStrings.And | officeDashJsLib.officeDashJsLibStrings.Or
  ] = js.undefined
  /**
    *
    * The set of values to be used as part of "values" filtering.
    *
    * [Api set: ExcelApi 1.2]
    */
  var values: js.UndefOr[js.Array[java.lang.String | FilterDatetime]] = js.undefined
}

object FilterCriteria {
  @scala.inline
  def apply(
    filterOn: FilterOn | officeDashJsLib.officeDashJsLibStrings.BottomItems | officeDashJsLib.officeDashJsLibStrings.BottomPercent | officeDashJsLib.officeDashJsLibStrings.CellColor | officeDashJsLib.officeDashJsLibStrings.Dynamic | officeDashJsLib.officeDashJsLibStrings.FontColor | officeDashJsLib.officeDashJsLibStrings.Values | officeDashJsLib.officeDashJsLibStrings.TopItems | officeDashJsLib.officeDashJsLibStrings.TopPercent | officeDashJsLib.officeDashJsLibStrings.Icon | officeDashJsLib.officeDashJsLibStrings.Custom,
    color: java.lang.String = null,
    criterion1: java.lang.String = null,
    criterion2: java.lang.String = null,
    dynamicCriteria: DynamicFilterCriteria | officeDashJsLib.officeDashJsLibStrings.Unknown | officeDashJsLib.officeDashJsLibStrings.AboveAverage | officeDashJsLib.officeDashJsLibStrings.AllDatesInPeriodApril | officeDashJsLib.officeDashJsLibStrings.AllDatesInPeriodAugust | officeDashJsLib.officeDashJsLibStrings.AllDatesInPeriodDecember | officeDashJsLib.officeDashJsLibStrings.AllDatesInPeriodFebruray | officeDashJsLib.officeDashJsLibStrings.AllDatesInPeriodJanuary | officeDashJsLib.officeDashJsLibStrings.AllDatesInPeriodJuly | officeDashJsLib.officeDashJsLibStrings.AllDatesInPeriodJune | officeDashJsLib.officeDashJsLibStrings.AllDatesInPeriodMarch | officeDashJsLib.officeDashJsLibStrings.AllDatesInPeriodMay | officeDashJsLib.officeDashJsLibStrings.AllDatesInPeriodNovember | officeDashJsLib.officeDashJsLibStrings.AllDatesInPeriodOctober | officeDashJsLib.officeDashJsLibStrings.AllDatesInPeriodQuarter1 | officeDashJsLib.officeDashJsLibStrings.AllDatesInPeriodQuarter2 | officeDashJsLib.officeDashJsLibStrings.AllDatesInPeriodQuarter3 | officeDashJsLib.officeDashJsLibStrings.AllDatesInPeriodQuarter4 | officeDashJsLib.officeDashJsLibStrings.AllDatesInPeriodSeptember | officeDashJsLib.officeDashJsLibStrings.BelowAverage | officeDashJsLib.officeDashJsLibStrings.LastMonth | officeDashJsLib.officeDashJsLibStrings.LastQuarter | officeDashJsLib.officeDashJsLibStrings.LastWeek | officeDashJsLib.officeDashJsLibStrings.LastYear | officeDashJsLib.officeDashJsLibStrings.NextMonth | officeDashJsLib.officeDashJsLibStrings.NextQuarter | officeDashJsLib.officeDashJsLibStrings.NextWeek | officeDashJsLib.officeDashJsLibStrings.NextYear | officeDashJsLib.officeDashJsLibStrings.ThisMonth | officeDashJsLib.officeDashJsLibStrings.ThisQuarter | officeDashJsLib.officeDashJsLibStrings.ThisWeek | officeDashJsLib.officeDashJsLibStrings.ThisYear | officeDashJsLib.officeDashJsLibStrings.Today | officeDashJsLib.officeDashJsLibStrings.Tomorrow | officeDashJsLib.officeDashJsLibStrings.YearToDate | officeDashJsLib.officeDashJsLibStrings.Yesterday = null,
    icon: Icon = null,
    operator: FilterOperator | officeDashJsLib.officeDashJsLibStrings.And | officeDashJsLib.officeDashJsLibStrings.Or = null,
    values: js.Array[java.lang.String | FilterDatetime] = null
  ): FilterCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("filterOn")(filterOn.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (criterion1 != null) __obj.updateDynamic("criterion1")(criterion1)
    if (criterion2 != null) __obj.updateDynamic("criterion2")(criterion2)
    if (dynamicCriteria != null) __obj.updateDynamic("dynamicCriteria")(dynamicCriteria.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[FilterCriteria]
  }
}

