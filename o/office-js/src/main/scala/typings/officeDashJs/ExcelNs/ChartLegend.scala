package typings.officeDashJs.ExcelNs

import typings.officeDashJs.Anon_Expand
import typings.officeDashJs.ExcelNs.InterfacesNs.ChartLegendData
import typings.officeDashJs.ExcelNs.InterfacesNs.ChartLegendLoadOptions
import typings.officeDashJs.ExcelNs.InterfacesNs.ChartLegendUpdateData
import typings.officeDashJs.OfficeExtensionNs.ClientObject
import typings.officeDashJs.OfficeExtensionNs.UpdateOptions
import typings.officeDashJs.officeDashJsStrings.Bottom
import typings.officeDashJs.officeDashJsStrings.Corner
import typings.officeDashJs.officeDashJsStrings.Custom
import typings.officeDashJs.officeDashJsStrings.Invalid
import typings.officeDashJs.officeDashJsStrings.Left
import typings.officeDashJs.officeDashJsStrings.Right
import typings.officeDashJs.officeDashJsStrings.Top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the legend in a chart.
  *
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.ChartLegend")
@js.native
class ChartLegend () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartLegend: RequestContext = js.native
  /**
    *
    * Represents the formatting of a chart legend, which includes fill and font formatting. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val format: ChartLegendFormat = js.native
  /**
    *
    * Represents the height, in points, of the legend on the chart. Null if legend is not visible.
    *
    * [Api set: ExcelApi 1.7]
    */
  var height: Double = js.native
  /**
    *
    * Represents the left, in points, of a chart legend. Null if legend is not visible.
    *
    * [Api set: ExcelApi 1.7]
    */
  var left: Double = js.native
  /**
    *
    * Represents a collection of legendEntries in the legend. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  val legendEntries: ChartLegendEntryCollection = js.native
  /**
    *
    * Boolean value for whether the chart legend should overlap with the main body of the chart.
    *
    * [Api set: ExcelApi 1.1]
    */
  var overlay: Boolean = js.native
  /**
    *
    * Represents the position of the legend on the chart. See Excel.ChartLegendPosition for details.
    *
    * [Api set: ExcelApi 1.1]
    */
  var position: ChartLegendPosition | Invalid | Top | Bottom | Left | Right | Corner | Custom = js.native
  /**
    *
    * Represents if the legend has a shadow on the chart.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showShadow: Boolean = js.native
  /**
    *
    * Represents the top of a chart legend.
    *
    * [Api set: ExcelApi 1.7]
    */
  var top: Double = js.native
  /**
    *
    * A boolean value the represents the visibility of a ChartLegend object.
    *
    * [Api set: ExcelApi 1.1]
    */
  var visible: Boolean = js.native
  /**
    *
    * Represents the width, in points, of the legend on the chart. Null if legend is not visible.
    *
    * [Api set: ExcelApi 1.7]
    */
  var width: Double = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.ChartLegend` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.ChartLegend` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.ChartLegend` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ChartLegend = js.native
  def load(option: String): ChartLegend = js.native
  def load(option: js.Array[String]): ChartLegend = js.native
  def load(option: Anon_Expand): ChartLegend = js.native
  def load(option: ChartLegendLoadOptions): ChartLegend = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ChartLegend): Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.ChartLegend): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ChartLegendUpdateData): Unit = js.native
  def set(properties: ChartLegendUpdateData, options: UpdateOptions): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ChartLegend object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartLegendData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ChartLegendData = js.native
}

