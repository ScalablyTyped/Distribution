package typings
package officeDashJsDashPreviewLib.ExcelNs

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
    DynamicFilterCriteria | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Unknown | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.AboveAverage | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.AllDatesInPeriodApril | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.AllDatesInPeriodAugust | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.AllDatesInPeriodDecember | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.AllDatesInPeriodFebruray | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.AllDatesInPeriodJanuary | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.AllDatesInPeriodJuly | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.AllDatesInPeriodJune | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.AllDatesInPeriodMarch | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.AllDatesInPeriodMay | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.AllDatesInPeriodNovember | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.AllDatesInPeriodOctober | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.AllDatesInPeriodQuarter1 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.AllDatesInPeriodQuarter2 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.AllDatesInPeriodQuarter3 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.AllDatesInPeriodQuarter4 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.AllDatesInPeriodSeptember | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.BelowAverage | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.LastMonth | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.LastQuarter | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.LastWeek | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.LastYear | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.NextMonth | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.NextQuarter | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.NextWeek | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.NextYear | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThisMonth | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThisQuarter | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThisWeek | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThisYear | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Today | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Tomorrow | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.YearToDate | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Yesterday
  ] = js.undefined
  /**
           *
           * The property used by the filter to determine whether the values should stay visible.
           *
           * [Api set: ExcelApi 1.2]
           */
  var filterOn: FilterOn | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.BottomItems | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.BottomPercent | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.CellColor | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Dynamic | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.FontColor | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Values | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.TopItems | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.TopPercent | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Icon | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Custom
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
    FilterOperator | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.And | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Or
  ] = js.undefined
  /**
           *
           * The property used by the filter to do rich filter on richvalues.
           *
           * [Api set: ExcelApi BETA (PREVIEW ONLY)]
           */
  var subField: js.UndefOr[java.lang.String] = js.undefined
  /**
           *
           * The set of values to be used as part of "values" filtering.
           *
           * [Api set: ExcelApi 1.2]
           */
  var values: js.UndefOr[js.Array[java.lang.String | FilterDatetime]] = js.undefined
}

