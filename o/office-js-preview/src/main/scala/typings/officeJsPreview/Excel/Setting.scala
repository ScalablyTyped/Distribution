package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.Interfaces.SettingData
import typings.officeJsPreview.Excel.Interfaces.SettingLoadOptions
import typings.officeJsPreview.Excel.Interfaces.SettingUpdateData
import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.UpdateOptions
import typings.officeJsPreview.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Setting represents a key-value pair of a setting persisted to the document (per file, per add-in). These custom key-value pair can be used to store state or lifecycle information needed by the content or task-pane add-in. Note that settings are persisted in the document and hence it is not a place to store any sensitive or protected information such as user information and password.
  *
  * @remarks
  * [Api set: ExcelApi 1.4]
  */
@js.native
trait Setting
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Setting: RequestContext = js.native
  
  /**
    * Deletes the setting.
    *
    * @remarks
    * [Api set: ExcelApi 1.4]
    */
  def delete(): Unit = js.native
  
  /**
    * The key that represents the ID of the setting.
    *
    * @remarks
    * [Api set: ExcelApi 1.4]
    */
  val key: String = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Setting = js.native
  def load(options: SettingLoadOptions): Setting = js.native
  def load(propertyNamesAndPaths: Expand): Setting = js.native
  def load(propertyNames: String): Setting = js.native
  def load(propertyNames: js.Array[String]): Setting = js.native
  
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: SettingUpdateData): Unit = js.native
  def set(properties: SettingUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: Setting): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.Setting object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.SettingData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): SettingData = js.native
  
  /**
    * Represents the value stored for this setting.
    *
    * @remarks
    * [Api set: ExcelApi 1.4]
    */
  var value: Any = js.native
}
