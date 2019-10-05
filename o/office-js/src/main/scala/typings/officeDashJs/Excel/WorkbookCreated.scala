package typings.officeDashJs.Excel

import typings.officeDashJs.Anon_Expand
import typings.officeDashJs.Excel.Interfaces.WorkbookCreatedData
import typings.officeDashJs.OfficeExtension.ClientObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * The WorkbookCreated object is the top level object created by Application.CreateWorkbook. A WorkbookCreated object is a special Workbook object.
  *
  * [Api set: ExcelApi 1.8]
  */
@JSGlobal("Excel.WorkbookCreated")
@js.native
class WorkbookCreated () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_WorkbookCreated: RequestContext = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param propertyNames A comma-delimited string or an array of strings that specify the properties to load.
    */
  def load(): WorkbookCreated = js.native
  def load(propertyNamesAndPaths: Anon_Expand): WorkbookCreated = js.native
  def load(propertyNames: String): WorkbookCreated = js.native
  def load(propertyNames: js.Array[String]): WorkbookCreated = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.WorkbookCreated object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.WorkbookCreatedData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): WorkbookCreatedData = js.native
}

