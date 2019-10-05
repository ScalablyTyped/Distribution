package typings.officeDashJsDashPreview.Excel

import typings.officeDashJsDashPreview.Anon_Expand
import typings.officeDashJsDashPreview.Excel.Interfaces.CustomPropertyData
import typings.officeDashJsDashPreview.Excel.Interfaces.CustomPropertyLoadOptions
import typings.officeDashJsDashPreview.Excel.Interfaces.CustomPropertyUpdateData
import typings.officeDashJsDashPreview.OfficeExtension.ClientObject
import typings.officeDashJsDashPreview.OfficeExtension.UpdateOptions
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Boolean
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Date
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Float
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a custom property.
  *
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.CustomProperty")
@js.native
class CustomProperty () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_CustomProperty: RequestContext = js.native
  /**
    *
    * Gets the key of the custom property. Read only.
    *
    * [Api set: ExcelApi 1.7]
    */
  val key: String = js.native
  /**
    *
    * Gets the value type of the custom property. Read only.
    *
    * [Api set: ExcelApi 1.7]
    */
  val `type`: DocumentPropertyType | Number | Boolean | Date | typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.String | Float = js.native
  /**
    *
    * Gets or sets the value of the custom property.
    *
    * [Api set: ExcelApi 1.7]
    */
  var value: js.Any = js.native
  /**
    *
    * Deletes the custom property.
    *
    * [Api set: ExcelApi 1.7]
    */
  def delete(): Unit = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): CustomProperty = js.native
  def load(options: CustomPropertyLoadOptions): CustomProperty = js.native
  def load(propertyNamesAndPaths: Anon_Expand): CustomProperty = js.native
  def load(propertyNames: String): CustomProperty = js.native
  def load(propertyNames: js.Array[String]): CustomProperty = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: CustomProperty): Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.CustomProperty): void`
    *
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
}

