package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Setting represents a key-value pair of a setting persisted to the document (per file per add-in). These custom key-value pair can be used to store state or lifecycle information needed by the content or task-pane add-in. Note that settings are persisted in the document and hence it is not a place to store any sensitive or protected information such as user information and password.
  *
  * [Api set: ExcelApi 1.4]
  */
@JSGlobal("Excel.Setting")
@js.native
class Setting ()
  extends officeDashJsDashPreviewLib.OfficeExtensionNs.ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Setting: RequestContext = js.native
  /**
    *
    * Returns the key that represents the id of the Setting. Read-only.
    *
    * [Api set: ExcelApi 1.4]
    */
  val key: java.lang.String = js.native
  /**
    *
    * Represents the value stored for this setting.
    *
    * [Api set: ExcelApi 1.4]
    */
  var value: js.Any = js.native
  /**
    *
    * Deletes the setting.
    *
    * [Api set: ExcelApi 1.4]
    */
  def delete(): scala.Unit = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.Setting` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.Setting` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.Setting` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Setting = js.native
  def load(option: java.lang.String): Setting = js.native
  def load(option: js.Array[java.lang.String]): Setting = js.native
  def load(option: officeDashJsDashPreviewLib.Anon_Expand): Setting = js.native
  def load(option: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.SettingLoadOptions): Setting = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.Setting): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.SettingUpdateData): scala.Unit = js.native
  def set(
    properties: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.SettingUpdateData,
    options: officeDashJsDashPreviewLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: Setting): scala.Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.Setting object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.SettingData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.SettingData = js.native
}

/* static members */
@JSGlobal("Excel.Setting")
@js.native
object Setting extends js.Object {
  var DateJSONPrefix: js.Any = js.native
  var DateJSONSuffix: js.Any = js.native
  var replaceStringDateWithDate: js.Any = js.native
}

