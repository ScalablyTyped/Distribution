package typings.officeDashJsDashPreview.Word

import typings.officeDashJsDashPreview.OfficeExtension.ClientObject
import typings.officeDashJsDashPreview.OfficeExtension.ClientResult
import typings.officeDashJsDashPreview.OfficeExtension.LoadOption
import typings.officeDashJsDashPreview.Word.Interfaces.CollectionLoadOptions
import typings.officeDashJsDashPreview.Word.Interfaces.CustomXmlPartScopedCollectionData
import typings.officeDashJsDashPreview.Word.Interfaces.CustomXmlPartScopedCollectionLoadOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Contains the collection of {@link Word.CustomXmlPart} objects with a specific namespace.
  *
  * [Api set: WordApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Word.CustomXmlPartScopedCollection")
@js.native
class CustomXmlPartScopedCollection () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_CustomXmlPartScopedCollection: RequestContext = js.native
  /** Gets the loaded child items in this collection. */
  val items: js.Array[CustomXmlPart] = js.native
  /**
    *
    * Gets the number of items in the collection.
    *
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  def getCount(): ClientResult[Double] = js.native
  /**
    *
    * Gets a custom XML part based on its ID. Read only.
    *
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param id ID of the custom XML part to be retrieved.
    */
  def getItem(id: String): CustomXmlPart = js.native
  /**
    *
    * Gets a custom XML part based on its ID. Returns a null object if the CustomXmlPart does not exist in the collection.
    *
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param id Required. ID of the object to be retrieved.
    */
  def getItemOrNullObject(id: String): CustomXmlPart = js.native
  /**
    *
    * If the collection contains exactly one item, this method returns it. Otherwise, this method produces an error.
    *
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  def getOnlyItem(): CustomXmlPart = js.native
  /**
    *
    * If the collection contains exactly one item, this method returns it. Otherwise, this method returns a null object.
    *
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  def getOnlyItemOrNullObject(): CustomXmlPart = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Word.CustomXmlPartScopedCollection` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Word.CustomXmlPartScopedCollection` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Word.CustomXmlPartScopedCollection` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): CustomXmlPartScopedCollection = js.native
  def load(option: CustomXmlPartScopedCollectionLoadOptions with CollectionLoadOptions): CustomXmlPartScopedCollection = js.native
  def load(option: String): CustomXmlPartScopedCollection = js.native
  def load(option: js.Array[String]): CustomXmlPartScopedCollection = js.native
  def load(option: LoadOption): CustomXmlPartScopedCollection = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Word.CustomXmlPartScopedCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Word.Interfaces.CustomXmlPartScopedCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): CustomXmlPartScopedCollectionData = js.native
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for context.trackedObjects.add(thisObject). If you are using this object across ".sync" calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): CustomXmlPartScopedCollection = js.native
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for context.trackedObjects.remove(thisObject). Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call "context.sync()" before the memory release takes effect.
    */
  def untrack(): CustomXmlPartScopedCollection = js.native
}

