package typings.officeJs.Excel

import typings.officeJs.Excel.Interfaces.CollectionLoadOptions
import typings.officeJs.Excel.Interfaces.SettingCollectionData
import typings.officeJs.Excel.Interfaces.SettingCollectionLoadOptions
import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.ClientResult
import typings.officeJs.OfficeExtension.EventHandlers
import typings.officeJs.OfficeExtension.LoadOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a collection of key-value pair setting objects that are part of the workbook. The scope is limited to per file and add-in (task-pane or content) combination.
  *
  * @remarks
  * [Api set: ExcelApi 1.4]
  */
@js.native
trait SettingCollection
  extends StObject
     with ClientObject {
  
  /**
    * Sets or adds the specified setting to the workbook.
    *
    * @remarks
    * [Api set: ExcelApi 1.4]
    *
    * @param key The key of the new setting.
    * @param value The value for the new setting.
    */
  def add(key: String, value: String): Setting = js.native
  def add(key: String, value: js.Array[Any]): Setting = js.native
  def add(key: String, value: js.Date): Setting = js.native
  def add(key: String, value: Any): Setting = js.native
  def add(key: String, value: Boolean): Setting = js.native
  def add(key: String, value: Double): Setting = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_SettingCollection: RequestContext = js.native
  
  /**
    * Gets the number of settings in the collection.
    *
    * @remarks
    * [Api set: ExcelApi 1.4]
    */
  def getCount(): ClientResult[Double] = js.native
  
  /**
    * Gets a setting entry via the key.
    *
    * @remarks
    * [Api set: ExcelApi 1.4]
    *
    * @param key Key of the setting.
    */
  def getItem(key: String): Setting = js.native
  
  /**
    * Gets a setting entry via the key. If the setting does not exist, then this method returns an object with its `isNullObject` property set to `true`.
    For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: ExcelApi 1.4]
    *
    * @param key The key of the setting.
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
    * Occurs when the settings in the document are changed.
    *
    * @remarks
    * [Api set: ExcelApi 1.4]
    *
    * @eventproperty
    */
  val onSettingsChanged: EventHandlers[SettingsChangedEventArgs] = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.SettingCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.SettingCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): SettingCollectionData = js.native
}
