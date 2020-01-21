package typings.officeJsPreview.Excel

import typings.officeJsPreview.AnonExpand
import typings.officeJsPreview.Excel.Interfaces.PivotItemData
import typings.officeJsPreview.Excel.Interfaces.PivotItemLoadOptions
import typings.officeJsPreview.Excel.Interfaces.PivotItemUpdateData
import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.UpdateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the Excel PivotItem.
  *
  * [Api set: ExcelApi 1.8]
  */
@JSGlobal("Excel.PivotItem")
@js.native
class PivotItem () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_PivotItem: RequestContext = js.native
  /**
    *
    * Id of the PivotItem.
    *
    * [Api set: ExcelApi 1.8]
    */
  val id: String = js.native
  /**
    *
    * Determines whether the item is expanded to show child items or if it's collapsed and child items are hidden.
    *
    * [Api set: ExcelApi 1.8]
    */
  var isExpanded: Boolean = js.native
  /**
    *
    * Name of the PivotItem.
    *
    * [Api set: ExcelApi 1.8]
    */
  var name: String = js.native
  /**
    *
    * Determines whether the PivotItem is visible or not.
    *
    * [Api set: ExcelApi 1.8]
    */
  var visible: Boolean = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): PivotItem = js.native
  def load(options: PivotItemLoadOptions): PivotItem = js.native
  def load(propertyNamesAndPaths: AnonExpand): PivotItem = js.native
  def load(propertyNames: String): PivotItem = js.native
  def load(propertyNames: js.Array[String]): PivotItem = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.PivotItem): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: PivotItemUpdateData): Unit = js.native
  def set(properties: PivotItemUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: PivotItem): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.PivotItem object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.PivotItemData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): PivotItemData = js.native
}

