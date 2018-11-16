package typings
package officeDashJsLib.ExcelNs

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
class SettingCollection ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
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
  val onSettingsChanged: officeDashJsLib.OfficeExtensionNs.EventHandlers[SettingsChangedEventArgs] = js.native
  /**
           *
           * Sets or adds the specified setting to the workbook.
           *
           * [Api set: ExcelApi 1.4]
           *
           * @param key The Key of the new setting.
           * @param value The Value for the new setting.
           */
  def add(key: java.lang.String, value: java.lang.String): Setting = js.native
  /**
           *
           * Sets or adds the specified setting to the workbook.
           *
           * [Api set: ExcelApi 1.4]
           *
           * @param key The Key of the new setting.
           * @param value The Value for the new setting.
           */
  def add(key: java.lang.String, value: js.Any): Setting = js.native
  /**
           *
           * Sets or adds the specified setting to the workbook.
           *
           * [Api set: ExcelApi 1.4]
           *
           * @param key The Key of the new setting.
           * @param value The Value for the new setting.
           */
  def add(key: java.lang.String, value: js.Array[_]): Setting = js.native
  /**
           *
           * Sets or adds the specified setting to the workbook.
           *
           * [Api set: ExcelApi 1.4]
           *
           * @param key The Key of the new setting.
           * @param value The Value for the new setting.
           */
  def add(key: java.lang.String, value: scala.Boolean): Setting = js.native
  /**
           *
           * Sets or adds the specified setting to the workbook.
           *
           * [Api set: ExcelApi 1.4]
           *
           * @param key The Key of the new setting.
           * @param value The Value for the new setting.
           */
  def add(key: java.lang.String, value: scala.Double): Setting = js.native
  /**
           *
           * Sets or adds the specified setting to the workbook.
           *
           * [Api set: ExcelApi 1.4]
           *
           * @param key The Key of the new setting.
           * @param value The Value for the new setting.
           */
  def add(key: java.lang.String, value: stdLib.Date): Setting = js.native
  /**
           *
           * Gets the number of Settings in the collection.
           *
           * [Api set: ExcelApi 1.4]
           */
  def getCount(): officeDashJsLib.OfficeExtensionNs.ClientResult[scala.Double] = js.native
  /**
           *
           * Gets a Setting entry via the key.
           *
           * [Api set: ExcelApi 1.4]
           *
           * @param key Key of the setting.
           */
  def getItem(key: java.lang.String): Setting = js.native
  /**
           *
           * Gets a Setting entry via the key. If the Setting does not exist, will return a null object.
           *
           * [Api set: ExcelApi 1.4]
           *
           * @param key The key of the setting.
           */
  def getItemOrNullObject(key: java.lang.String): Setting = js.native
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
  def load(
    option: officeDashJsLib.ExcelNs.InterfacesNs.SettingCollectionLoadOptions with officeDashJsLib.ExcelNs.InterfacesNs.CollectionLoadOptions
  ): SettingCollection = js.native
  def load(option: java.lang.String): SettingCollection = js.native
  def load(option: js.Array[java.lang.String]): SettingCollection = js.native
  def load(option: officeDashJsLib.OfficeExtensionNs.LoadOption): SettingCollection = js.native
  def toJSON(): officeDashJsLib.ExcelNs.InterfacesNs.SettingCollectionData = js.native
}

