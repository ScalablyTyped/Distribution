package typings.officeDashJsDashPreview.WordNs

import typings.officeDashJsDashPreview.Anon_Expand
import typings.officeDashJsDashPreview.OfficeExtensionNs.ClientObject
import typings.officeDashJsDashPreview.OfficeExtensionNs.UpdateOptions
import typings.officeDashJsDashPreview.WordNs.InterfacesNs.CustomPropertyData
import typings.officeDashJsDashPreview.WordNs.InterfacesNs.CustomPropertyLoadOptions
import typings.officeDashJsDashPreview.WordNs.InterfacesNs.CustomPropertyUpdateData
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Boolean
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Date
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a custom property.
  *
  * [Api set: WordApi 1.3]
  */
@JSGlobal("Word.CustomProperty")
@js.native
class CustomProperty () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_CustomProperty: RequestContext = js.native
  /**
    *
    * Gets the key of the custom property. Read only.
    *
    * [Api set: WordApi 1.3]
    */
  val key: String = js.native
  /**
    *
    * Gets the value type of the custom property. Possible values are: String, Number, Date, Boolean. Read only.
    *
    * [Api set: WordApi 1.3]
    */
  val `type`: DocumentPropertyType | typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.String | Number | Date | Boolean = js.native
  /**
    *
    * Gets or sets the value of the custom property. Note that even though Word for the web and the docx file format allow these properties to be arbitrarily long, the desktop version of Word will truncate string values to 255 16-bit chars (possibly creating invalid unicode by breaking up a surrogate pair).
    *
    * [Api set: WordApi 1.3]
    */
  var value: js.Any = js.native
  /**
    *
    * Deletes the custom property.
    *
    * [Api set: WordApi 1.3]
    */
  def delete(): Unit = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Word.CustomProperty` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Word.CustomProperty` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Word.CustomProperty` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): CustomProperty = js.native
  def load(option: String): CustomProperty = js.native
  def load(option: js.Array[String]): CustomProperty = js.native
  def load(option: Anon_Expand): CustomProperty = js.native
  def load(option: CustomPropertyLoadOptions): CustomProperty = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: CustomProperty): Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Word.CustomProperty): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: CustomPropertyUpdateData): Unit = js.native
  def set(properties: CustomPropertyUpdateData, options: UpdateOptions): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Word.CustomProperty object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Word.Interfaces.CustomPropertyData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): CustomPropertyData = js.native
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for context.trackedObjects.add(thisObject). If you are using this object across ".sync" calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): CustomProperty = js.native
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for context.trackedObjects.remove(thisObject). Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call "context.sync()" before the memory release takes effect.
    */
  def untrack(): CustomProperty = js.native
}

