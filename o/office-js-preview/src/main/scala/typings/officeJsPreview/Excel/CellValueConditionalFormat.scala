package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.Interfaces.CellValueConditionalFormatData
import typings.officeJsPreview.Excel.Interfaces.CellValueConditionalFormatLoadOptions
import typings.officeJsPreview.Excel.Interfaces.CellValueConditionalFormatUpdateData
import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.UpdateOptions
import typings.officeJsPreview.anon.Expand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a cell value conditional format.
  *
  * [Api set: ExcelApi 1.6]
  */
@js.native
trait CellValueConditionalFormat extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_CellValueConditionalFormat: RequestContext = js.native
  /**
    *
    * Returns a format object, encapsulating the conditional formats font, fill, borders, and other properties.
    *
    * [Api set: ExcelApi 1.6]
    */
  val format: ConditionalRangeFormat = js.native
  /**
    *
    * Specifies the Rule object on this conditional format.
    *
    * [Api set: ExcelApi 1.6]
    */
  var rule: ConditionalCellValueRule = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): CellValueConditionalFormat = js.native
  def load(options: CellValueConditionalFormatLoadOptions): CellValueConditionalFormat = js.native
  def load(propertyNamesAndPaths: Expand): CellValueConditionalFormat = js.native
  def load(propertyNames: String): CellValueConditionalFormat = js.native
  def load(propertyNames: js.Array[String]): CellValueConditionalFormat = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: CellValueConditionalFormat): Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.CellValueConditionalFormat): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: CellValueConditionalFormatUpdateData): Unit = js.native
  def set(properties: CellValueConditionalFormatUpdateData, options: UpdateOptions): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.CellValueConditionalFormat object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.CellValueConditionalFormatData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): CellValueConditionalFormatData = js.native
}

