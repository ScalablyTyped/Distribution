package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the chart axes.
  *
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.ChartAxes")
@js.native
class ChartAxes ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /**
    *
    * Represents the category axis in a chart. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val categoryAxis: ChartAxis = js.native
  /**
    *
    * Represents the series axis of a 3-dimensional chart. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val seriesAxis: ChartAxis = js.native
  /**
    *
    * Represents the value axis in an axis. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val valueAxis: ChartAxis = js.native
  /**
    *
    * Returns the specific axis identified by type and group.
    *
    * [Api set: ExcelApi 1.7]
    *
    * @param type Specifies the axis type. See Excel.ChartAxisType for details.
    * @param group Optional. Specifies the axis group. See Excel.ChartAxisGroup for details.
    */
  def getItem(`type`: ChartAxisType): ChartAxis = js.native
  def getItem(`type`: ChartAxisType, group: ChartAxisGroup): ChartAxis = js.native
  def getItem(
    `type`: officeDashJsLib.officeDashJsLibStrings.Category,
    group: officeDashJsLib.officeDashJsLibStrings.Primary
  ): ChartAxis = js.native
  def getItem(
    `type`: officeDashJsLib.officeDashJsLibStrings.Category,
    group: officeDashJsLib.officeDashJsLibStrings.Secondary
  ): ChartAxis = js.native
  def getItem(
    `type`: officeDashJsLib.officeDashJsLibStrings.Invalid,
    group: officeDashJsLib.officeDashJsLibStrings.Primary
  ): ChartAxis = js.native
  def getItem(
    `type`: officeDashJsLib.officeDashJsLibStrings.Invalid,
    group: officeDashJsLib.officeDashJsLibStrings.Secondary
  ): ChartAxis = js.native
  def getItem(
    `type`: officeDashJsLib.officeDashJsLibStrings.Series,
    group: officeDashJsLib.officeDashJsLibStrings.Primary
  ): ChartAxis = js.native
  def getItem(
    `type`: officeDashJsLib.officeDashJsLibStrings.Series,
    group: officeDashJsLib.officeDashJsLibStrings.Secondary
  ): ChartAxis = js.native
  def getItem(
    `type`: officeDashJsLib.officeDashJsLibStrings.Value,
    group: officeDashJsLib.officeDashJsLibStrings.Primary
  ): ChartAxis = js.native
  def getItem(
    `type`: officeDashJsLib.officeDashJsLibStrings.Value,
    group: officeDashJsLib.officeDashJsLibStrings.Secondary
  ): ChartAxis = js.native
  @JSName("getItem")
  def getItem_Category(`type`: officeDashJsLib.officeDashJsLibStrings.Category): ChartAxis = js.native
  /**
    *
    * Returns the specific axis identified by type and group.
    *
    * [Api set: ExcelApi 1.7]
    *
    * @param type Specifies the axis type. See Excel.ChartAxisType for details.
    * @param group Optional. Specifies the axis group. See Excel.ChartAxisGroup for details.
    */
  @JSName("getItem")
  def getItem_Invalid(`type`: officeDashJsLib.officeDashJsLibStrings.Invalid): ChartAxis = js.native
  @JSName("getItem")
  def getItem_Series(`type`: officeDashJsLib.officeDashJsLibStrings.Series): ChartAxis = js.native
  @JSName("getItem")
  def getItem_Value(`type`: officeDashJsLib.officeDashJsLibStrings.Value): ChartAxis = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.ChartAxes` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.ChartAxes` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.ChartAxes` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ChartAxes = js.native
  def load(option: java.lang.String): ChartAxes = js.native
  def load(option: js.Array[java.lang.String]): ChartAxes = js.native
  def load(option: officeDashJsLib.Anon_Select): ChartAxes = js.native
  def load(option: officeDashJsLib.ExcelNs.InterfacesNs.ChartAxesLoadOptions): ChartAxes = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ChartAxes): scala.Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.ChartAxes): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: officeDashJsLib.ExcelNs.InterfacesNs.ChartAxesUpdateData): scala.Unit = js.native
  def set(
    properties: officeDashJsLib.ExcelNs.InterfacesNs.ChartAxesUpdateData,
    options: officeDashJsLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  def toJSON(): officeDashJsLib.ExcelNs.InterfacesNs.ChartAxesData = js.native
}

