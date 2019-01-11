package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a point of a series in a chart.
  *
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.ChartPoint")
@js.native
class ChartPoint ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartPoint: RequestContext = js.native
  /**
    *
    * Returns the data label of a chart point. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  val dataLabel: ChartDataLabel = js.native
  /**
    *
    * Encapsulates the format properties chart point. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val format: ChartPointFormat = js.native
  /**
    *
    * Represents whether a data point has a data label. Not applicable for surface charts.
    *
    * [Api set: ExcelApi 1.7]
    */
  var hasDataLabel: scala.Boolean = js.native
  /**
    *
    * HTML color code representation of the marker background color of data point. E.g. #FF0000 represents Red.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerBackgroundColor: java.lang.String = js.native
  /**
    *
    * HTML color code representation of the marker foreground color of data point. E.g. #FF0000 represents Red.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerForegroundColor: java.lang.String = js.native
  /**
    *
    * Represents marker size of data point.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerSize: scala.Double = js.native
  /**
    *
    * Represents marker style of a chart data point. See Excel.ChartMarkerStyle for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerStyle: ChartMarkerStyle | officeDashJsLib.officeDashJsLibStrings.Invalid | officeDashJsLib.officeDashJsLibStrings.Automatic | officeDashJsLib.officeDashJsLibStrings.None | officeDashJsLib.officeDashJsLibStrings.Square | officeDashJsLib.officeDashJsLibStrings.Diamond | officeDashJsLib.officeDashJsLibStrings.Triangle | officeDashJsLib.officeDashJsLibStrings.X | officeDashJsLib.officeDashJsLibStrings.Star | officeDashJsLib.officeDashJsLibStrings.Dot | officeDashJsLib.officeDashJsLibStrings.Dash | officeDashJsLib.officeDashJsLibStrings.Circle | officeDashJsLib.officeDashJsLibStrings.Plus | officeDashJsLib.officeDashJsLibStrings.Picture = js.native
  /**
    *
    * Returns the value of a chart point. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val value: js.Any = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.ChartPoint` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.ChartPoint` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.ChartPoint` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ChartPoint = js.native
  def load(option: java.lang.String): ChartPoint = js.native
  def load(option: js.Array[java.lang.String]): ChartPoint = js.native
  def load(option: officeDashJsLib.Anon_Expand): ChartPoint = js.native
  def load(option: officeDashJsLib.ExcelNs.InterfacesNs.ChartPointLoadOptions): ChartPoint = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ChartPoint): scala.Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.ChartPoint): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: officeDashJsLib.ExcelNs.InterfacesNs.ChartPointUpdateData): scala.Unit = js.native
  def set(
    properties: officeDashJsLib.ExcelNs.InterfacesNs.ChartPointUpdateData,
    options: officeDashJsLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ChartPoint object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartPointData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): officeDashJsLib.ExcelNs.InterfacesNs.ChartPointData = js.native
}

