package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.Interfaces.TimelineStyleData
import typings.officeJsPreview.Excel.Interfaces.TimelineStyleLoadOptions
import typings.officeJsPreview.Excel.Interfaces.TimelineStyleUpdateData
import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.UpdateOptions
import typings.officeJsPreview.anon.Expand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a Timeline style, which defines style elements by region in the Timeline.
  *
  * [Api set: ExcelApi 1.10]
  */
@js.native
trait TimelineStyle extends ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_TimelineStyle: RequestContext = js.native
  
  /**
    * Deletes the TableStyle.
    *
    * [Api set: ExcelApi 1.10]
    */
  def delete(): Unit = js.native
  
  /**
    * Creates a duplicate of this TimelineStyle with copies of all the style elements.
    *
    * [Api set: ExcelApi 1.10]
    * @returns The new TimelineStyle object that has been duplicated from this TimelineStyle.
    */
  def duplicate(): TimelineStyle = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): TimelineStyle = js.native
  def load(options: TimelineStyleLoadOptions): TimelineStyle = js.native
  def load(propertyNamesAndPaths: Expand): TimelineStyle = js.native
  def load(propertyNames: String): TimelineStyle = js.native
  def load(propertyNames: js.Array[String]): TimelineStyle = js.native
  
  /**
    *
    * Gets the name of the TimelineStyle.
    *
    * [Api set: ExcelApi 1.10]
    */
  var name: String = js.native
  
  /**
    *
    * Specifies if this TimelineStyle object is read-only.
    *
    * [Api set: ExcelApi 1.10]
    */
  val readOnly: Boolean = js.native
  
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.TimelineStyle): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: TimelineStyleUpdateData): Unit = js.native
  def set(properties: TimelineStyleUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: TimelineStyle): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.TimelineStyle object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.TimelineStyleData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): TimelineStyleData = js.native
}
