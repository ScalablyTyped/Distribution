package typings.officeDashJs.ExcelNs

import typings.officeDashJs.ExcelNs.InterfacesNs.CollectionLoadOptions
import typings.officeDashJs.ExcelNs.InterfacesNs.SettingCollectionData
import typings.officeDashJs.ExcelNs.InterfacesNs.SettingCollectionLoadOptions
import typings.officeDashJs.OfficeExtensionNs.ClientObject
import typings.officeDashJs.OfficeExtensionNs.ClientResult
import typings.officeDashJs.OfficeExtensionNs.EventHandlers
import typings.officeDashJs.OfficeExtensionNs.LoadOption
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of key-value pair setting objects that are part of the workbook. The scope is limited to per file and add-in (task-pane or content) combination.
  *
  * [Api set: ExcelApi 1.4]
  */
@JSGlobal("Excel.SettingCollection")
@js.native
class SettingCollection () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_SettingCollection: RequestContext = js.native
  /** Gets the loaded child items in this collection. */
  val items: js.Array[Setting] = js.native
  /**
    *
    * Occurs when the Settings in the document are changed.
    *
    * [Api set: ExcelApi 1.4]
    *
    * @eventproperty
    */
  val onSettingsChanged: EventHandlers[SettingsChangedEventArgs] = js.native
  /**
    *
    * Sets or adds the specified setting to the workbook.
    *
    * [Api set: ExcelApi 1.4]
    *
    * @param key The Key of the new setting.
    * @param value The Value for the new setting.
    */
  def add(key: String, value: String): Setting = js.native
  def add(key: String, value: js.Any): Setting = js.native
  def add(key: String, value: js.Array[_]): Setting = js.native
  def add(key: String, value: Boolean): Setting = js.native
  def add(key: String, value: Double): Setting = js.native
  def add(key: String, value: Date): Setting = js.native
  /**
    *
    * Gets the number of Settings in the collection.
    *
    * [Api set: ExcelApi 1.4]
    */
  def getCount(): ClientResult[Double] = js.native
  /**
    *
    * Gets a Setting entry via the key.
    *
    * [Api set: ExcelApi 1.4]
    *
    * @param key Key of the setting.
    */
  def getItem(key: String): Setting = js.native
  /**
    *
    * Gets a Setting entry via the key. If the Setting does not exist, will return a null object.
    *
    * [Api set: ExcelApi 1.4]
    *
    * @param key The key of the setting.
    */
  def getItemOrNullObject(key: String): Setting = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.SettingCollection` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.SettingCollection` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.SettingCollection` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): SettingCollection = js.native
  def load(option: SettingCollectionLoadOptions with CollectionLoadOptions): SettingCollection = js.native
  def load(option: String): SettingCollection = js.native
  def load(option: js.Array[String]): SettingCollection = js.native
  def load(option: LoadOption): SettingCollection = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.SettingCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.SettingCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): SettingCollectionData = js.native
}

