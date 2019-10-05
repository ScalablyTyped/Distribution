package typings.officeDashJsDashPreview.Excel

import typings.officeDashJsDashPreview.Anon_Expand
import typings.officeDashJsDashPreview.Excel.Interfaces.RuntimeData
import typings.officeDashJsDashPreview.Excel.Interfaces.RuntimeLoadOptions
import typings.officeDashJsDashPreview.Excel.Interfaces.RuntimeUpdateData
import typings.officeDashJsDashPreview.OfficeExtension.ClientObject
import typings.officeDashJsDashPreview.OfficeExtension.UpdateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the Excel Runtime class.
  *
  * [Api set: ExcelApi 1.5]
  */
@JSGlobal("Excel.Runtime")
@js.native
class Runtime () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Runtime: RequestContext = js.native
  /**
    *
    * Toggle JavaScript events in the current task pane or content add-in.
    *
    * [Api set: ExcelApi 1.8]
    */
  var enableEvents: Boolean = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Runtime = js.native
  def load(options: RuntimeLoadOptions): Runtime = js.native
  def load(propertyNamesAndPaths: Anon_Expand): Runtime = js.native
  def load(propertyNames: String): Runtime = js.native
  def load(propertyNames: js.Array[String]): Runtime = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.Runtime): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: RuntimeUpdateData): Unit = js.native
  def set(properties: RuntimeUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: Runtime): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.Runtime object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.RuntimeData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): RuntimeData = js.native
}

