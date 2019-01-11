package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the border formatting of a chart element.
  *
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ChartBorder")
@js.native
class ChartBorder ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /**
    *
    * HTML color code representing the color of borders in the chart.
    *
    * [Api set: ExcelApi 1.7]
    */
  var color: java.lang.String = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartBorder: RequestContext = js.native
  /**
    *
    * Represents the line style of the border. See Excel.ChartLineStyle for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var lineStyle: ChartLineStyle | officeDashJsLib.officeDashJsLibStrings.None | officeDashJsLib.officeDashJsLibStrings.Continuous | officeDashJsLib.officeDashJsLibStrings.Dash | officeDashJsLib.officeDashJsLibStrings.DashDot | officeDashJsLib.officeDashJsLibStrings.DashDotDot | officeDashJsLib.officeDashJsLibStrings.Dot | officeDashJsLib.officeDashJsLibStrings.Grey25 | officeDashJsLib.officeDashJsLibStrings.Grey50 | officeDashJsLib.officeDashJsLibStrings.Grey75 | officeDashJsLib.officeDashJsLibStrings.Automatic | officeDashJsLib.officeDashJsLibStrings.RoundDot = js.native
  /**
    *
    * Represents weight of the border, in points.
    *
    * [Api set: ExcelApi 1.7]
    */
  var weight: scala.Double = js.native
  /**
    *
    * Clear the border format of a chart element.
    *
    * [Api set: ExcelApi 1.8]
    */
  def clear(): scala.Unit = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.ChartBorder` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.ChartBorder` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.ChartBorder` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ChartBorder = js.native
  def load(option: java.lang.String): ChartBorder = js.native
  def load(option: js.Array[java.lang.String]): ChartBorder = js.native
  def load(option: officeDashJsLib.Anon_Expand): ChartBorder = js.native
  def load(option: officeDashJsLib.ExcelNs.InterfacesNs.ChartBorderLoadOptions): ChartBorder = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ChartBorder): scala.Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.ChartBorder): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: officeDashJsLib.ExcelNs.InterfacesNs.ChartBorderUpdateData): scala.Unit = js.native
  def set(
    properties: officeDashJsLib.ExcelNs.InterfacesNs.ChartBorderUpdateData,
    options: officeDashJsLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ChartBorder object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartBorderData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): officeDashJsLib.ExcelNs.InterfacesNs.ChartBorderData = js.native
}

