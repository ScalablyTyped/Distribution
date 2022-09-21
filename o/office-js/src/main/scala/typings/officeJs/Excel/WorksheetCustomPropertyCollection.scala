package typings.officeJs.Excel

import typings.officeJs.Excel.Interfaces.CollectionLoadOptions
import typings.officeJs.Excel.Interfaces.WorksheetCustomPropertyCollectionData
import typings.officeJs.Excel.Interfaces.WorksheetCustomPropertyCollectionLoadOptions
import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.ClientResult
import typings.officeJs.OfficeExtension.LoadOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains the collection of worksheet-level custom property.
  *
  * @remarks
  * [Api set: ExcelApi 1.12]
  */
@js.native
trait WorksheetCustomPropertyCollection
  extends StObject
     with ClientObject {
  
  /**
    * Adds a new custom property that maps to the provided key. This overwrites existing custom properties with that key.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    *
    * @param key The key that identifies the custom property object. It is case-insensitive.The key is limited to 255 characters (larger values will cause an `InvalidArgument` error to be thrown.)
    * @param value The value of this custom property.
    */
  def add(key: String, value: String): WorksheetCustomProperty = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_WorksheetCustomPropertyCollection: RequestContext = js.native
  
  /**
    * Gets the number of custom properties on this worksheet.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  def getCount(): ClientResult[Double] = js.native
  
  /**
    * Gets a custom property object by its key, which is case-insensitive. Throws an error if the custom property does not exist.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    *
    * @param key The key that identifies the custom property object. It is case-insensitive.
    */
  def getItem(key: String): WorksheetCustomProperty = js.native
  
  /**
    * Gets a custom property object by its key, which is case-insensitive. If the custom property doesn't exist, then this method returns an object with its `isNullObject` property set to `true`.
    For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    *
    * @param key The key that identifies the custom property object. It is case-insensitive.
    */
  def getItemOrNullObject(key: String): WorksheetCustomProperty = js.native
  
  /** Gets the loaded child items in this collection. */
  val items: js.Array[WorksheetCustomProperty] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): WorksheetCustomPropertyCollection = js.native
  def load(options: WorksheetCustomPropertyCollectionLoadOptions & CollectionLoadOptions): WorksheetCustomPropertyCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): WorksheetCustomPropertyCollection = js.native
  def load(propertyNames: String): WorksheetCustomPropertyCollection = js.native
  def load(propertyNames: js.Array[String]): WorksheetCustomPropertyCollection = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.WorksheetCustomPropertyCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.WorksheetCustomPropertyCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): WorksheetCustomPropertyCollectionData = js.native
}
