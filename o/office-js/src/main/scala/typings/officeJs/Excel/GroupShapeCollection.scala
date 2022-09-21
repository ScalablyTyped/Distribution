package typings.officeJs.Excel

import typings.officeJs.Excel.Interfaces.CollectionLoadOptions
import typings.officeJs.Excel.Interfaces.GroupShapeCollectionData
import typings.officeJs.Excel.Interfaces.GroupShapeCollectionLoadOptions
import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.ClientResult
import typings.officeJs.OfficeExtension.LoadOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the shape collection inside a shape group.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait GroupShapeCollection
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_GroupShapeCollection: RequestContext = js.native
  
  /**
    * Returns the number of shapes in the shape group.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  def getCount(): ClientResult[Double] = js.native
  
  /**
    * Gets a shape using its name or ID.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    *
    * @param key The name or ID of the shape to be retrieved.
    */
  def getItem(key: String): Shape = js.native
  
  /**
    * Gets a shape based on its position in the collection.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    *
    * @param index The zero-based index value of the object to be retrieved.
    */
  def getItemAt(index: Double): Shape = js.native
  
  /**
    * Gets a shape using its name or ID.
    If the shape object does not exist, then this method returns an object with its `isNullObject` property set to `true`.
    For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties  | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: ExcelApi 1.14]
    *
    * @param key The name or ID of the shape to be retrieved.
    */
  def getItemOrNullObject(key: String): Shape = js.native
  
  /** Gets the loaded child items in this collection. */
  val items: js.Array[Shape] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): GroupShapeCollection = js.native
  def load(options: GroupShapeCollectionLoadOptions & CollectionLoadOptions): GroupShapeCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): GroupShapeCollection = js.native
  def load(propertyNames: String): GroupShapeCollection = js.native
  def load(propertyNames: js.Array[String]): GroupShapeCollection = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.GroupShapeCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.GroupShapeCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): GroupShapeCollectionData = js.native
}
