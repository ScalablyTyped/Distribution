package typings.officeJs.Excel

import typings.officeJs.AnonExpand
import typings.officeJs.Excel.Interfaces.ChartTitleFormatData
import typings.officeJs.Excel.Interfaces.ChartTitleFormatLoadOptions
import typings.officeJs.Excel.Interfaces.ChartTitleFormatUpdateData
import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.UpdateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides access to the office art formatting for chart title.
  *
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.ChartTitleFormat")
@js.native
class ChartTitleFormat () extends ClientObject {
  /**
    *
    * Represents the border format of chart title, which includes color, linestyle, and weight. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  val border: ChartBorder = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartTitleFormat: RequestContext = js.native
  /**
    *
    * Represents the fill format of an object, which includes background formatting information. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val fill: ChartFill = js.native
  /**
    *
    * Represents the font attributes (font name, font size, color, etc.) for an object. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val font: ChartFont = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ChartTitleFormat = js.native
  def load(options: ChartTitleFormatLoadOptions): ChartTitleFormat = js.native
  def load(propertyNamesAndPaths: AnonExpand): ChartTitleFormat = js.native
  def load(propertyNames: String): ChartTitleFormat = js.native
  def load(propertyNames: js.Array[String]): ChartTitleFormat = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ChartTitleFormat): Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.ChartTitleFormat): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ChartTitleFormatUpdateData): Unit = js.native
  def set(properties: ChartTitleFormatUpdateData, options: UpdateOptions): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ChartTitleFormat object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartTitleFormatData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ChartTitleFormatData = js.native
}

