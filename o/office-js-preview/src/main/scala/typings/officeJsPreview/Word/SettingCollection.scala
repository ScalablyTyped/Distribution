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
  * Contains the collection of {@link Word.Setting} objects.
  *
  * @remarks
  * [Api set: WordApi 1.4]
  */
@js.native
trait SettingCollection
  extends StObject
     with ClientObject {
  
  /**
    * Creates a new setting or sets an existing setting.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    *
    * @param key Required. The setting's key, which is case-sensitive.
    * @param value Required. The setting's value.
    */
  def add(key: String, value: Any): Setting = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_SettingCollection: RequestContext = js.native
  
  /**
    * Deletes all settings in this add-in.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  def deleteAll(): Unit = js.native
  
  /**
    * Gets the count of settings.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  def getCount(): ClientResult[Double] = js.native
  
  /**
    * Gets a setting object by its key, which is case-sensitive. Throws an `ItemNotFound` error if the setting does not exist.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    *
    * @param key The key that identifies the setting object.
    */
  def getItem(key: String): Setting = js.native
  
  /**
    * Gets a setting object by its key, which is case-sensitive. If the setting does not exist, then this method will return an object with its `isNullObject` property set to `true`. For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: WordApi 1.4]
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
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for {@link https://docs.microsoft.com/javascript/api/office/officeextension.clientrequestcontext#office-officeextension-clientrequestcontext-trackedobjects-member | context.trackedObjects.add(thisObject)}. If you are using this object across `.sync` calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you need to add the object to the tracked object collection when the object was first created. If this object is part of a collection, you should also track the parent collection.
    */
  def track(): SettingCollection = js.native
  
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for {@link https://docs.microsoft.com/javascript/api/office/officeextension.clientrequestcontext#office-officeextension-clientrequestcontext-trackedobjects-member | context.trackedObjects.remove(thisObject)}. Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call `context.sync()` before the memory release takes effect.
    */
  def untrack(): SettingCollection = js.native
}
