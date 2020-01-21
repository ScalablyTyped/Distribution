package typings.officeJsPreview.Excel

import typings.officeJsPreview.AnonExpand
import typings.officeJsPreview.Excel.Interfaces.ChartPointFormatData
import typings.officeJsPreview.Excel.Interfaces.ChartPointFormatLoadOptions
import typings.officeJsPreview.Excel.Interfaces.ChartPointFormatUpdateData
import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.UpdateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents formatting object for chart points.
  *
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.ChartPointFormat")
@js.native
class ChartPointFormat () extends ClientObject {
  /**
    *
    * Represents the border format of a chart data point, which includes color, style, and weight information. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  val border: ChartBorder = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartPointFormat: RequestContext = js.native
  /**
    *
    * Represents the fill format of a chart, which includes background formatting information. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val fill: ChartFill = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ChartPointFormat = js.native
  def load(options: ChartPointFormatLoadOptions): ChartPointFormat = js.native
  def load(propertyNamesAndPaths: AnonExpand): ChartPointFormat = js.native
  def load(propertyNames: String): ChartPointFormat = js.native
  def load(propertyNames: js.Array[String]): ChartPointFormat = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ChartPointFormat): Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.ChartPointFormat): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ChartPointFormatUpdateData): Unit = js.native
  def set(properties: ChartPointFormatUpdateData, options: UpdateOptions): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ChartPointFormat object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartPointFormatData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ChartPointFormatData = js.native
}

