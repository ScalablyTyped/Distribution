package typings.officeJsPreview.Excel

import typings.officeJsPreview.AnonExpand
import typings.officeJsPreview.Excel.Interfaces.TopBottomConditionalFormatData
import typings.officeJsPreview.Excel.Interfaces.TopBottomConditionalFormatLoadOptions
import typings.officeJsPreview.Excel.Interfaces.TopBottomConditionalFormatUpdateData
import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.UpdateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a Top/Bottom conditional format.
  *
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.TopBottomConditionalFormat")
@js.native
class TopBottomConditionalFormat () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_TopBottomConditionalFormat: RequestContext = js.native
  /**
    *
    * Returns a format object, encapsulating the conditional formats font, fill, borders, and other properties. Read-only.
    *
    * [Api set: ExcelApi 1.6]
    */
  val format: ConditionalRangeFormat = js.native
  /**
    *
    * The criteria of the Top/Bottom conditional format.
    *
    * [Api set: ExcelApi 1.6]
    */
  var rule: ConditionalTopBottomRule = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): TopBottomConditionalFormat = js.native
  def load(options: TopBottomConditionalFormatLoadOptions): TopBottomConditionalFormat = js.native
  def load(propertyNamesAndPaths: AnonExpand): TopBottomConditionalFormat = js.native
  def load(propertyNames: String): TopBottomConditionalFormat = js.native
  def load(propertyNames: js.Array[String]): TopBottomConditionalFormat = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.TopBottomConditionalFormat): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: TopBottomConditionalFormatUpdateData): Unit = js.native
  def set(properties: TopBottomConditionalFormatUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: TopBottomConditionalFormat): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.TopBottomConditionalFormat object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.TopBottomConditionalFormatData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): TopBottomConditionalFormatData = js.native
}

