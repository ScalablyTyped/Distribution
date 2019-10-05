package typings.officeDashJs.Excel

import typings.officeDashJs.Anon_Expand
import typings.officeDashJs.Excel.Interfaces.ChartTrendlineFormatData
import typings.officeDashJs.Excel.Interfaces.ChartTrendlineFormatLoadOptions
import typings.officeDashJs.Excel.Interfaces.ChartTrendlineFormatUpdateData
import typings.officeDashJs.OfficeExtension.ClientObject
import typings.officeDashJs.OfficeExtension.UpdateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the format properties for chart trendline.
  *
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ChartTrendlineFormat")
@js.native
class ChartTrendlineFormat () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartTrendlineFormat: RequestContext = js.native
  /**
    *
    * Represents chart line formatting. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  val line: ChartLineFormat = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ChartTrendlineFormat = js.native
  def load(options: ChartTrendlineFormatLoadOptions): ChartTrendlineFormat = js.native
  def load(propertyNamesAndPaths: Anon_Expand): ChartTrendlineFormat = js.native
  def load(propertyNames: String): ChartTrendlineFormat = js.native
  def load(propertyNames: js.Array[String]): ChartTrendlineFormat = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ChartTrendlineFormat): Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.ChartTrendlineFormat): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ChartTrendlineFormatUpdateData): Unit = js.native
  def set(properties: ChartTrendlineFormatUpdateData, options: UpdateOptions): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ChartTrendlineFormat object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartTrendlineFormatData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ChartTrendlineFormatData = js.native
}

