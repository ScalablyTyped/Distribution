package typings.officeDashJs.Excel

import typings.officeDashJs.Anon_Expand
import typings.officeDashJs.Excel.Interfaces.CustomConditionalFormatData
import typings.officeDashJs.Excel.Interfaces.CustomConditionalFormatLoadOptions
import typings.officeDashJs.Excel.Interfaces.CustomConditionalFormatUpdateData
import typings.officeDashJs.OfficeExtension.ClientObject
import typings.officeDashJs.OfficeExtension.UpdateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a custom conditional format type.
  *
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.CustomConditionalFormat")
@js.native
class CustomConditionalFormat () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_CustomConditionalFormat: RequestContext = js.native
  /**
    *
    * Returns a format object, encapsulating the conditional formats font, fill, borders, and other properties. Read-only.
    *
    * [Api set: ExcelApi 1.6]
    */
  val format: ConditionalRangeFormat = js.native
  /**
    *
    * Represents the Rule object on this conditional format. Read-only.
    *
    * [Api set: ExcelApi 1.6]
    */
  val rule: ConditionalFormatRule = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): CustomConditionalFormat = js.native
  def load(options: CustomConditionalFormatLoadOptions): CustomConditionalFormat = js.native
  def load(propertyNamesAndPaths: Anon_Expand): CustomConditionalFormat = js.native
  def load(propertyNames: String): CustomConditionalFormat = js.native
  def load(propertyNames: js.Array[String]): CustomConditionalFormat = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: CustomConditionalFormat): Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.CustomConditionalFormat): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: CustomConditionalFormatUpdateData): Unit = js.native
  def set(properties: CustomConditionalFormatUpdateData, options: UpdateOptions): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.CustomConditionalFormat object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.CustomConditionalFormatData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): CustomConditionalFormatData = js.native
}

