package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.Interfaces.SlicerItemData
import typings.officeJsPreview.Excel.Interfaces.SlicerItemLoadOptions
import typings.officeJsPreview.Excel.Interfaces.SlicerItemUpdateData
import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.UpdateOptions
import typings.officeJsPreview.anon.Expand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a slicer item in a slicer.
  *
  * [Api set: ExcelApi 1.10]
  */
@js.native
trait SlicerItem extends ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_SlicerItem: RequestContext = js.native
  
  /**
    *
    * True if the slicer item has data.
    *
    * [Api set: ExcelApi 1.10]
    */
  val hasData: Boolean = js.native
  
  /**
    *
    * True if the slicer item is selected.
    Setting this value will not clear other SlicerItems' selected state.
    By default, if the slicer item is the only one selected, when it is deselected, all items will be selected.
    *
    * [Api set: ExcelApi 1.10]
    */
  var isSelected: Boolean = js.native
  
  /**
    *
    * Represents the unique value representing the slicer item.
    *
    * [Api set: ExcelApi 1.10]
    */
  val key: String = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): SlicerItem = js.native
  def load(options: SlicerItemLoadOptions): SlicerItem = js.native
  def load(propertyNamesAndPaths: Expand): SlicerItem = js.native
  def load(propertyNames: String): SlicerItem = js.native
  def load(propertyNames: js.Array[String]): SlicerItem = js.native
  
  /**
    *
    * Represents the title displayed in the UI.
    *
    * [Api set: ExcelApi 1.10]
    */
  val name: String = js.native
  
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.SlicerItem): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: SlicerItemUpdateData): Unit = js.native
  def set(properties: SlicerItemUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: SlicerItem): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.SlicerItem object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.SlicerItemData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): SlicerItemData = js.native
}
