package typings.officeJsPreview.Excel

import typings.officeJsPreview.AnonExpand
import typings.officeJsPreview.Excel.Interfaces.TextConditionalFormatData
import typings.officeJsPreview.Excel.Interfaces.TextConditionalFormatLoadOptions
import typings.officeJsPreview.Excel.Interfaces.TextConditionalFormatUpdateData
import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.UpdateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a specific text conditional format.
  *
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.TextConditionalFormat")
@js.native
class TextConditionalFormat () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_TextConditionalFormat: RequestContext = js.native
  /**
    *
    * Returns a format object, encapsulating the conditional formats font, fill, borders, and other properties. Read-only.
    *
    * [Api set: ExcelApi 1.6]
    */
  val format: ConditionalRangeFormat = js.native
  /**
    *
    * The rule of the conditional format.
    *
    * [Api set: ExcelApi 1.6]
    */
  var rule: ConditionalTextComparisonRule = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): TextConditionalFormat = js.native
  def load(options: TextConditionalFormatLoadOptions): TextConditionalFormat = js.native
  def load(propertyNamesAndPaths: AnonExpand): TextConditionalFormat = js.native
  def load(propertyNames: String): TextConditionalFormat = js.native
  def load(propertyNames: js.Array[String]): TextConditionalFormat = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.TextConditionalFormat): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: TextConditionalFormatUpdateData): Unit = js.native
  def set(properties: TextConditionalFormatUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: TextConditionalFormat): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.TextConditionalFormat object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.TextConditionalFormatData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): TextConditionalFormatData = js.native
}

