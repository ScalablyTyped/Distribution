package typings.officeDashJsDashPreview.ExcelNs

import typings.officeDashJsDashPreview.Anon_Expand
import typings.officeDashJsDashPreview.ExcelNs.InterfacesNs.ChartBorderData
import typings.officeDashJsDashPreview.ExcelNs.InterfacesNs.ChartBorderLoadOptions
import typings.officeDashJsDashPreview.ExcelNs.InterfacesNs.ChartBorderUpdateData
import typings.officeDashJsDashPreview.OfficeExtensionNs.ClientObject
import typings.officeDashJsDashPreview.OfficeExtensionNs.UpdateOptions
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Automatic
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Continuous
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Dash
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.DashDot
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.DashDotDot
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Dot
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Grey25
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Grey50
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Grey75
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.None
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.RoundDot
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
class ChartBorder () extends ClientObject {
  /**
    *
    * HTML color code representing the color of borders in the chart.
    *
    * [Api set: ExcelApi 1.7]
    */
  var color: String = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartBorder: RequestContext = js.native
  /**
    *
    * Represents the line style of the border. See Excel.ChartLineStyle for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var lineStyle: ChartLineStyle | None | Continuous | Dash | DashDot | DashDotDot | Dot | Grey25 | Grey50 | Grey75 | Automatic | RoundDot = js.native
  /**
    *
    * Represents weight of the border, in points.
    *
    * [Api set: ExcelApi 1.7]
    */
  var weight: Double = js.native
  /**
    *
    * Clear the border format of a chart element.
    *
    * [Api set: ExcelApi 1.8]
    */
  def clear(): Unit = js.native
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
  def load(option: String): ChartBorder = js.native
  def load(option: js.Array[String]): ChartBorder = js.native
  def load(option: Anon_Expand): ChartBorder = js.native
  def load(option: ChartBorderLoadOptions): ChartBorder = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ChartBorder): Unit = js.native
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
  def set(properties: ChartBorderUpdateData): Unit = js.native
  def set(properties: ChartBorderUpdateData, options: UpdateOptions): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ChartBorder object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartBorderData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ChartBorderData = js.native
}

