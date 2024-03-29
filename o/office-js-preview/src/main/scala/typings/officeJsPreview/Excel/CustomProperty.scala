package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.Interfaces.CustomPropertyData
import typings.officeJsPreview.Excel.Interfaces.CustomPropertyLoadOptions
import typings.officeJsPreview.Excel.Interfaces.CustomPropertyUpdateData
import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.UpdateOptions
import typings.officeJsPreview.anon.Expand
import typings.officeJsPreview.officeJsPreviewStrings.Boolean
import typings.officeJsPreview.officeJsPreviewStrings.Date
import typings.officeJsPreview.officeJsPreviewStrings.Float
import typings.officeJsPreview.officeJsPreviewStrings.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a custom property.
  *
  * @remarks
  * [Api set: ExcelApi 1.7]
  */
@js.native
trait CustomProperty
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_CustomProperty: RequestContext = js.native
  
  /**
    * Deletes the custom property.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  def delete(): Unit = js.native
  
  /**
    * The key of the custom property. The key is limited to 255 characters outside of Excel on the web (larger keys are automatically trimmed to 255 characters on other platforms).
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  val key: String = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): CustomProperty = js.native
  def load(options: CustomPropertyLoadOptions): CustomProperty = js.native
  def load(propertyNamesAndPaths: Expand): CustomProperty = js.native
  def load(propertyNames: String): CustomProperty = js.native
  def load(propertyNames: js.Array[String]): CustomProperty = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: CustomProperty): Unit = js.native
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: CustomPropertyUpdateData): Unit = js.native
  def set(properties: CustomPropertyUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.CustomProperty object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.CustomPropertyData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): CustomPropertyData = js.native
  
  /**
    * The type of the value used for the custom property.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  val `type`: DocumentPropertyType | Number | Boolean | Date | typings.officeJsPreview.officeJsPreviewStrings.String | Float = js.native
  
  /**
    * The value of the custom property. The value is limited to 255 characters outside of Excel on the web (larger values are automatically trimmed to 255 characters on other platforms).
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var value: Any = js.native
}
