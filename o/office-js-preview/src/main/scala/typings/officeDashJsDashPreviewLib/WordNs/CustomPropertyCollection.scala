package typings
package officeDashJsDashPreviewLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Contains the collection of {@link Word.CustomProperty} objects.
  *
  * [Api set: WordApi 1.3]
  */
@JSGlobal("Word.CustomPropertyCollection")
@js.native
class CustomPropertyCollection ()
  extends officeDashJsDashPreviewLib.OfficeExtensionNs.ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_CustomPropertyCollection: RequestContext = js.native
  /** Gets the loaded child items in this collection. */
  val items: js.Array[CustomProperty] = js.native
  /**
    *
    * Creates a new or sets an existing custom property.
    *
    * [Api set: WordApi 1.3]
    *
    * @param key Required. The custom property's key, which is case-insensitive.
    * @param value Required. The custom property's value.
    */
  def add(key: java.lang.String, value: js.Any): CustomProperty = js.native
  /**
    *
    * Deletes all custom properties in this collection.
    *
    * [Api set: WordApi 1.3]
    */
  def deleteAll(): scala.Unit = js.native
  /**
    *
    * Gets the count of custom properties.
    *
    * [Api set: WordApi 1.3]
    */
  def getCount(): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[scala.Double] = js.native
  /**
    *
    * Gets a custom property object by its key, which is case-insensitive. Throws if the custom property does not exist.
    *
    * [Api set: WordApi 1.3]
    *
    * @param key The key that identifies the custom property object.
    */
  def getItem(key: java.lang.String): CustomProperty = js.native
  /**
    *
    * Gets a custom property object by its key, which is case-insensitive. Returns a null object if the custom property does not exist.
    *
    * [Api set: WordApi 1.3]
    *
    * @param key Required. The key that identifies the custom property object.
    */
  def getItemOrNullObject(key: java.lang.String): CustomProperty = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Word.CustomPropertyCollection` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Word.CustomPropertyCollection` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Word.CustomPropertyCollection` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): CustomPropertyCollection = js.native
  def load(
    option: officeDashJsDashPreviewLib.WordNs.InterfacesNs.CustomPropertyCollectionLoadOptions with officeDashJsDashPreviewLib.WordNs.InterfacesNs.CollectionLoadOptions
  ): CustomPropertyCollection = js.native
  def load(option: java.lang.String): CustomPropertyCollection = js.native
  def load(option: js.Array[java.lang.String]): CustomPropertyCollection = js.native
  def load(option: officeDashJsDashPreviewLib.OfficeExtensionNs.LoadOption): CustomPropertyCollection = js.native
  def toJSON(): officeDashJsDashPreviewLib.WordNs.InterfacesNs.CustomPropertyCollectionData = js.native
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for context.trackedObjects.add(thisObject). If you are using this object across ".sync" calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): CustomPropertyCollection = js.native
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for context.trackedObjects.remove(thisObject). Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call "context.sync()" before the memory release takes effect.
    */
  def untrack(): CustomPropertyCollection = js.native
}

