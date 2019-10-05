package typings.officeDashJsDashPreview.Excel

import typings.officeDashJsDashPreview.Anon_Expand
import typings.officeDashJsDashPreview.Excel.Interfaces.ChartBorderData
import typings.officeDashJsDashPreview.Excel.Interfaces.ChartBorderLoadOptions
import typings.officeDashJsDashPreview.Excel.Interfaces.ChartBorderUpdateData
import typings.officeDashJsDashPreview.OfficeExtension.ClientObject
import typings.officeDashJsDashPreview.OfficeExtension.UpdateOptions
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
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ChartBorder = js.native
  def load(options: ChartBorderLoadOptions): ChartBorder = js.native
  def load(propertyNamesAndPaths: Anon_Expand): ChartBorder = js.native
  def load(propertyNames: String): ChartBorder = js.native
  def load(propertyNames: js.Array[String]): ChartBorder = js.native
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

