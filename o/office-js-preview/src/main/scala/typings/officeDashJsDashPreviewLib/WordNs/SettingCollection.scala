package typings
package officeDashJsDashPreviewLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Contains the collection of {@link Word.Setting} objects.
  *
  * [Api set: WordApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Word.SettingCollection")
@js.native
class SettingCollection ()
  extends officeDashJsDashPreviewLib.OfficeExtensionNs.ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_SettingCollection: RequestContext = js.native
  /** Gets the loaded child items in this collection. */
  val items: js.Array[Setting] = js.native
  /**
    *
    * Creates a new setting or sets an existing setting.
    *
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param key Required. The setting's key, which is case-sensitive.
    * @param value Required. The setting's value.
    */
  def add(key: java.lang.String, value: js.Any): Setting = js.native
  /**
    *
    * Deletes all settings in this add-in.
    *
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  def deleteAll(): scala.Unit = js.native
  /**
    *
    * Gets the count of settings.
    *
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  def getCount(): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[scala.Double] = js.native
  /**
    *
    * Gets a setting object by its key, which is case-sensitive. Throws if the setting does not exist.
    *
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param key The key that identifies the setting object.
    */
  def getItem(key: java.lang.String): Setting = js.native
  /**
    *
    * Gets a setting object by its key, which is case-sensitive. Returns a null object if the setting does not exist.
    *
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param key Required. The key that identifies the setting object.
    */
  def getItemOrNullObject(key: java.lang.String): Setting = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Word.SettingCollection` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Word.SettingCollection` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Word.SettingCollection` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): SettingCollection = js.native
  def load(
    option: officeDashJsDashPreviewLib.WordNs.InterfacesNs.SettingCollectionLoadOptions with officeDashJsDashPreviewLib.WordNs.InterfacesNs.CollectionLoadOptions
  ): SettingCollection = js.native
  def load(option: java.lang.String): SettingCollection = js.native
  def load(option: js.Array[java.lang.String]): SettingCollection = js.native
  def load(option: officeDashJsDashPreviewLib.OfficeExtensionNs.LoadOption): SettingCollection = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Word.SettingCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Word.Interfaces.SettingCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): officeDashJsDashPreviewLib.WordNs.InterfacesNs.SettingCollectionData = js.native
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for context.trackedObjects.add(thisObject). If you are using this object across ".sync" calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): SettingCollection = js.native
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for context.trackedObjects.remove(thisObject). Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call "context.sync()" before the memory release takes effect.
    */
  def untrack(): SettingCollection = js.native
}

