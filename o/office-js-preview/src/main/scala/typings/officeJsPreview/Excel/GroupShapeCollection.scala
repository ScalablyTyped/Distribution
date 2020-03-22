package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.Interfaces.CollectionLoadOptions
import typings.officeJsPreview.Excel.Interfaces.GroupShapeCollectionData
import typings.officeJsPreview.Excel.Interfaces.GroupShapeCollectionLoadOptions
import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.ClientResult
import typings.officeJsPreview.OfficeExtension.LoadOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the shape collection inside a shape group.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.GroupShapeCollection")
@js.native
class GroupShapeCollection () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_GroupShapeCollection: RequestContext = js.native
  /** Gets the loaded child items in this collection. */
  val items: js.Array[Shape] = js.native
  /**
    * Returns the number of shapes in the shape group. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  def getCount(): ClientResult[Double] = js.native
  /**
    * Gets a shape using its Name or ID.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param key The Name or ID of the shape to be retrieved.
    */
  def getItem(key: String): Shape = js.native
  /**
    * Gets a shape based on its position in the collection.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param index The zero-based index value of the object to be retrieved.
    */
  def getItemAt(index: Double): Shape = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): GroupShapeCollection = js.native
  def load(options: GroupShapeCollectionLoadOptions with CollectionLoadOptions): GroupShapeCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): GroupShapeCollection = js.native
  def load(propertyNames: String): GroupShapeCollection = js.native
  def load(propertyNames: js.Array[String]): GroupShapeCollection = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.GroupShapeCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.GroupShapeCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): GroupShapeCollectionData = js.native
}

