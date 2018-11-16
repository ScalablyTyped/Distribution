package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     *
     * Encapsulates the formatting options for line elements.
     *
     * [Api set: ExcelApi 1.1]
     */
@JSGlobal("Excel.ChartLineFormat")
@js.native
class ChartLineFormat ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /**
           *
           * HTML color code representing the color of lines in the chart.
           *
           * [Api set: ExcelApi 1.1]
           */
  var color: java.lang.String = js.native
  /**
           *
           * Represents the line style. See Excel.ChartLineStyle for details.
           *
           * [Api set: ExcelApi 1.7]
           */
  var lineStyle: ChartLineStyle | officeDashJsLib.officeDashJsLibStrings.None | officeDashJsLib.officeDashJsLibStrings.Continuous | officeDashJsLib.officeDashJsLibStrings.Dash | officeDashJsLib.officeDashJsLibStrings.DashDot | officeDashJsLib.officeDashJsLibStrings.DashDotDot | officeDashJsLib.officeDashJsLibStrings.Dot | officeDashJsLib.officeDashJsLibStrings.Grey25 | officeDashJsLib.officeDashJsLibStrings.Grey50 | officeDashJsLib.officeDashJsLibStrings.Grey75 | officeDashJsLib.officeDashJsLibStrings.Automatic | officeDashJsLib.officeDashJsLibStrings.RoundDot = js.native
  /**
           *
           * Represents weight of the line, in points.
           *
           * [Api set: ExcelApi 1.7]
           */
  var weight: scala.Double = js.native
  /**
           *
           * Clear the line format of a chart element.
           *
           * [Api set: ExcelApi 1.1]
           */
  def clear(): scala.Unit = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Excel.ChartLineFormat` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Excel.ChartLineFormat` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.ChartLineFormat` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(): ChartLineFormat = js.native
  def load(option: java.lang.String): ChartLineFormat = js.native
  def load(option: js.Array[java.lang.String]): ChartLineFormat = js.native
  def load(option: officeDashJsLib.Anon_Select): ChartLineFormat = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Excel.ChartLineFormat` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Excel.ChartLineFormat` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.ChartLineFormat` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(option: officeDashJsLib.ExcelNs.InterfacesNs.ChartLineFormatLoadOptions): ChartLineFormat = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ChartLineFormat): scala.Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
           *
           * @remarks
           *
           * This method has the following additional signature:
           *
           * `set(properties: Excel.ChartLineFormat): void`
           *
           * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
           * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
           */
  def set(properties: officeDashJsLib.ExcelNs.InterfacesNs.ChartLineFormatUpdateData): scala.Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
           *
           * @remarks
           *
           * This method has the following additional signature:
           *
           * `set(properties: Excel.ChartLineFormat): void`
           *
           * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
           * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
           */
  def set(
    properties: officeDashJsLib.ExcelNs.InterfacesNs.ChartLineFormatUpdateData,
    options: officeDashJsLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  def toJSON(): officeDashJsLib.ExcelNs.InterfacesNs.ChartLineFormatData = js.native
}

