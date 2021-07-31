package typings.officeJsPreview.Word

import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.ClientResult
import typings.officeJsPreview.OfficeExtension.LoadOption
import typings.officeJsPreview.Word.Interfaces.CollectionLoadOptions
import typings.officeJsPreview.Word.Interfaces.SettingCollectionData
import typings.officeJsPreview.Word.Interfaces.SettingCollectionLoadOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Contains the collection of {@link Word.Setting} objects.
  *
  * [Api set: WordApi BETA (PREVIEW ONLY)]
  * @beta
  */
@js.native
trait SettingCollection
  extends StObject
     with ClientObject {
  
  /**
    * Creates a new setting or sets an existing setting.
    *
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param key Required. The setting's key, which is case-sensitive.
    * @param value Required. The setting's value.
    */
  def add(key: String, value: js.Any): Setting = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_SettingCollection: RequestContext = js.native
  
  /**
    * Deletes all settings in this add-in.
    *
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  def deleteAll(): Unit = js.native
  
  /**
    * Gets the count of settings.
    *
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  def getCount(): ClientResult[Double] = js.native
  
  /**
    * Gets a setting object by its key, which is case-sensitive. Throws an error if the setting does not exist.
    *
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param key The key that identifies the setting object.
    */
  def getItem(key: String): Setting = js.native
  
  /**
    * Gets a setting object by its key, which is case-sensitive. Returns a null object if the setting does not exist.
    *
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param key Required. The key that identifies the setting object.
    */
  def getItemOrNullObject(key: String): Setting = js.native
  
  /** Gets the loaded child items in this collection. */
  val items: js.Array[Setting] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): SettingCollection = js.native
  def load(options: SettingCollectionLoadOptions & CollectionLoadOptions): SettingCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): SettingCollection = js.native
  def load(propertyNames: String): SettingCollection = js.native
  def load(propertyNames: js.Array[String]): SettingCollection = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Word.SettingCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Word.Interfaces.SettingCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): SettingCollectionData = js.native
  
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for `context.trackedObjects.add(thisObject)`. If you are using this object across `.sync` calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): SettingCollection = js.native
  
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for `context.trackedObjects.remove(thisObject)`. Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call `context.sync()` before the memory release takes effect.
    */
  def untrack(): SettingCollection = js.native
}
