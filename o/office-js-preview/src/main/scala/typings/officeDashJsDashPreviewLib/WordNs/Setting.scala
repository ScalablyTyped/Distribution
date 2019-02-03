package typings
package officeDashJsDashPreviewLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a setting of the add-in.
  *
  * [Api set: WordApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Word.Setting")
@js.native
class Setting ()
  extends officeDashJsDashPreviewLib.OfficeExtensionNs.ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Setting: RequestContext = js.native
  /**
    *
    * Gets the key of the setting. Read only.
    *
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val key: java.lang.String = js.native
  /**
    *
    * Gets or sets the value of the setting.
    *
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var value: js.Any = js.native
  /**
    *
    * Deletes the setting.
    *
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  def delete(): scala.Unit = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Word.Setting` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Word.Setting` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Word.Setting` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Setting = js.native
  def load(option: java.lang.String): Setting = js.native
  def load(option: js.Array[java.lang.String]): Setting = js.native
  def load(option: officeDashJsDashPreviewLib.Anon_Expand): Setting = js.native
  def load(option: officeDashJsDashPreviewLib.WordNs.InterfacesNs.SettingLoadOptions): Setting = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Word.Setting): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: officeDashJsDashPreviewLib.WordNs.InterfacesNs.SettingUpdateData): scala.Unit = js.native
  def set(
    properties: officeDashJsDashPreviewLib.WordNs.InterfacesNs.SettingUpdateData,
    options: officeDashJsDashPreviewLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: Setting): scala.Unit = js.native
  def toJSON(): officeDashJsDashPreviewLib.WordNs.InterfacesNs.SettingData = js.native
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for context.trackedObjects.add(thisObject). If you are using this object across ".sync" calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): Setting = js.native
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for context.trackedObjects.remove(thisObject). Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call "context.sync()" before the memory release takes effect.
    */
  def untrack(): Setting = js.native
}

/* static members */
@JSGlobal("Word.Setting")
@js.native
object Setting extends js.Object {
  var DateJSONPrefix: js.Any = js.native
  var DateJSONSuffix: js.Any = js.native
  def _replaceDateWithStringDate(value: js.Any): js.Any = js.native
  /* private */ def replaceStringDateWithDate(value: js.Any): js.Any = js.native
}

