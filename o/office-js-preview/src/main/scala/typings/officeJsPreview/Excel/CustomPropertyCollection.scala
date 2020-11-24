package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.Interfaces.CollectionLoadOptions
import typings.officeJsPreview.Excel.Interfaces.CustomPropertyCollectionData
import typings.officeJsPreview.Excel.Interfaces.CustomPropertyCollectionLoadOptions
import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.ClientResult
import typings.officeJsPreview.OfficeExtension.LoadOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Contains the collection of customProperty objects.
  *
  * [Api set: ExcelApi 1.7]
  */
@js.native
trait CustomPropertyCollection extends ClientObject {
  
  /**
    * Creates a new or sets an existing custom property.
    *
    * [Api set: ExcelApi 1.7]
    *
    * @param key Required. The custom property's key, which is case-insensitive. The key is limited to 255 characters outside of Excel on the web (larger keys are automatically trimmed to 255 characters on other platforms).
    * @param value Required. The custom property's value. The value is limited to 255 characters outside of Excel on the web (larger values are automatically trimmed to 255 characters on other platforms).
    */
  def add(key: String, value: js.Any): CustomProperty = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_CustomPropertyCollection: RequestContext = js.native
  
  /**
    * Deletes all custom properties in this collection.
    *
    * [Api set: ExcelApi 1.7]
    */
  def deleteAll(): Unit = js.native
  
  /**
    * Gets the count of custom properties.
    *
    * [Api set: ExcelApi 1.7]
    */
  def getCount(): ClientResult[Double] = js.native
  
  /**
    * Gets a custom property object by its key, which is case-insensitive. Throws if the custom property does not exist.
    *
    * [Api set: ExcelApi 1.7]
    *
    * @param key The key that identifies the custom property object.
    */
  def getItem(key: String): CustomProperty = js.native
  
  /**
    * Gets a custom property object by its key, which is case-insensitive. Returns a null object if the custom property does not exist.
    *
    * [Api set: ExcelApi 1.7]
    *
    * @param key Required. The key that identifies the custom property object.
    */
  def getItemOrNullObject(key: String): CustomProperty = js.native
  
  /** Gets the loaded child items in this collection. */
  val items: js.Array[CustomProperty] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): CustomPropertyCollection = js.native
  def load(options: CustomPropertyCollectionLoadOptions with CollectionLoadOptions): CustomPropertyCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): CustomPropertyCollection = js.native
  def load(propertyNames: String): CustomPropertyCollection = js.native
  def load(propertyNames: js.Array[String]): CustomPropertyCollection = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.CustomPropertyCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.CustomPropertyCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): CustomPropertyCollectionData = js.native
}
