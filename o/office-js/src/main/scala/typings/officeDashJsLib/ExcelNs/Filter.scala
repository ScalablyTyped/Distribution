package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Manages the filtering of a table's column.
  *
  * [Api set: ExcelApi 1.2]
  */
@JSGlobal("Excel.Filter")
@js.native
class Filter ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /**
    *
    * The currently applied filter on the given column. Read-only.
    *
    * [Api set: ExcelApi 1.2]
    */
  val criteria: FilterCriteria = js.native
  /**
    *
    * Apply the given filter criteria on the given column.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param criteria The criteria to apply.
    */
  @JSName("apply")
  def apply(criteria: FilterCriteria): scala.Unit = js.native
  /**
    *
    * Apply a "Bottom Item" filter to the column for the given number of elements.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param count The number of elements from the bottom to show.
    */
  def applyBottomItemsFilter(count: scala.Double): scala.Unit = js.native
  /**
    *
    * Apply a "Bottom Percent" filter to the column for the given percentage of elements.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param percent The percentage of elements from the bottom to show.
    */
  def applyBottomPercentFilter(percent: scala.Double): scala.Unit = js.native
  /**
    *
    * Apply a "Cell Color" filter to the column for the given color.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param color The background color of the cells to show.
    */
  def applyCellColorFilter(color: java.lang.String): scala.Unit = js.native
  /**
    *
    * Apply an "Icon" filter to the column for the given criteria strings.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param criteria1 The first criteria string.
    * @param criteria2 Optional. The second criteria string.
    * @param oper Optional. The operator that describes how the two criteria are joined.
    */
  def applyCustomFilter(criteria1: java.lang.String): scala.Unit = js.native
  def applyCustomFilter(criteria1: java.lang.String, criteria2: java.lang.String): scala.Unit = js.native
  def applyCustomFilter(criteria1: java.lang.String, criteria2: java.lang.String, oper: FilterOperator): scala.Unit = js.native
  @JSName("applyCustomFilter")
  def applyCustomFilter_And(
    criteria1: java.lang.String,
    criteria2: java.lang.String,
    oper: officeDashJsLib.officeDashJsLibStrings.And
  ): scala.Unit = js.native
  @JSName("applyCustomFilter")
  def applyCustomFilter_Or(
    criteria1: java.lang.String,
    criteria2: java.lang.String,
    oper: officeDashJsLib.officeDashJsLibStrings.Or
  ): scala.Unit = js.native
  /**
    *
    * Apply a "Dynamic" filter to the column.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param criteria The dynamic criteria to apply.
    */
  def applyDynamicFilter(
    criteria: officeDashJsLib.officeDashJsLibStrings.Unknown | officeDashJsLib.officeDashJsLibStrings.AboveAverage | officeDashJsLib.officeDashJsLibStrings.AllDatesInPeriodApril | officeDashJsLib.officeDashJsLibStrings.AllDatesInPeriodAugust | officeDashJsLib.officeDashJsLibStrings.AllDatesInPeriodDecember | officeDashJsLib.officeDashJsLibStrings.AllDatesInPeriodFebruray | officeDashJsLib.officeDashJsLibStrings.AllDatesInPeriodJanuary | officeDashJsLib.officeDashJsLibStrings.AllDatesInPeriodJuly | officeDashJsLib.officeDashJsLibStrings.AllDatesInPeriodJune | officeDashJsLib.officeDashJsLibStrings.AllDatesInPeriodMarch | officeDashJsLib.officeDashJsLibStrings.AllDatesInPeriodMay | officeDashJsLib.officeDashJsLibStrings.AllDatesInPeriodNovember | officeDashJsLib.officeDashJsLibStrings.AllDatesInPeriodOctober | officeDashJsLib.officeDashJsLibStrings.AllDatesInPeriodQuarter1 | officeDashJsLib.officeDashJsLibStrings.AllDatesInPeriodQuarter2 | officeDashJsLib.officeDashJsLibStrings.AllDatesInPeriodQuarter3 | officeDashJsLib.officeDashJsLibStrings.AllDatesInPeriodQuarter4 | officeDashJsLib.officeDashJsLibStrings.AllDatesInPeriodSeptember | officeDashJsLib.officeDashJsLibStrings.BelowAverage | officeDashJsLib.officeDashJsLibStrings.LastMonth | officeDashJsLib.officeDashJsLibStrings.LastQuarter | officeDashJsLib.officeDashJsLibStrings.LastWeek | officeDashJsLib.officeDashJsLibStrings.LastYear | officeDashJsLib.officeDashJsLibStrings.NextMonth | officeDashJsLib.officeDashJsLibStrings.NextQuarter | officeDashJsLib.officeDashJsLibStrings.NextWeek | officeDashJsLib.officeDashJsLibStrings.NextYear | officeDashJsLib.officeDashJsLibStrings.ThisMonth | officeDashJsLib.officeDashJsLibStrings.ThisQuarter | officeDashJsLib.officeDashJsLibStrings.ThisWeek | officeDashJsLib.officeDashJsLibStrings.ThisYear | officeDashJsLib.officeDashJsLibStrings.Today | officeDashJsLib.officeDashJsLibStrings.Tomorrow | officeDashJsLib.officeDashJsLibStrings.YearToDate | officeDashJsLib.officeDashJsLibStrings.Yesterday
  ): scala.Unit = js.native
  /**
    *
    * Apply a "Dynamic" filter to the column.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param criteria The dynamic criteria to apply.
    */
  def applyDynamicFilter(criteria: DynamicFilterCriteria): scala.Unit = js.native
  /**
    *
    * Apply a "Font Color" filter to the column for the given color.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param color The font color of the cells to show.
    */
  def applyFontColorFilter(color: java.lang.String): scala.Unit = js.native
  /**
    *
    * Apply an "Icon" filter to the column for the given icon.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param icon The icons of the cells to show.
    */
  def applyIconFilter(icon: Icon): scala.Unit = js.native
  /**
    *
    * Apply a "Top Item" filter to the column for the given number of elements.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param count The number of elements from the top to show.
    */
  def applyTopItemsFilter(count: scala.Double): scala.Unit = js.native
  /**
    *
    * Apply a "Top Percent" filter to the column for the given percentage of elements.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param percent The percentage of elements from the top to show.
    */
  def applyTopPercentFilter(percent: scala.Double): scala.Unit = js.native
  /**
    *
    * Apply a "Values" filter to the column for the given values.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param values The list of values to show. This must be an array of strings or an array of Excel.FilterDateTime objects.
    */
  def applyValuesFilter(values: js.Array[java.lang.String | FilterDatetime]): scala.Unit = js.native
  /**
    *
    * Clear the filter on the given column.
    *
    * [Api set: ExcelApi 1.2]
    */
  def clear(): scala.Unit = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.Filter` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.Filter` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.Filter` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Filter = js.native
  def load(option: java.lang.String): Filter = js.native
  def load(option: js.Array[java.lang.String]): Filter = js.native
  def load(option: officeDashJsLib.Anon_Select): Filter = js.native
  def load(option: officeDashJsLib.ExcelNs.InterfacesNs.FilterLoadOptions): Filter = js.native
  def toJSON(): officeDashJsLib.ExcelNs.InterfacesNs.FilterData = js.native
}

