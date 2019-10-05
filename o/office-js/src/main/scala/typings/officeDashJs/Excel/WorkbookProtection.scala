package typings.officeDashJs.Excel

import typings.officeDashJs.Anon_Expand
import typings.officeDashJs.Excel.Interfaces.WorkbookProtectionData
import typings.officeDashJs.Excel.Interfaces.WorkbookProtectionLoadOptions
import typings.officeDashJs.OfficeExtension.ClientObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the protection of a workbook object.
  *
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.WorkbookProtection")
@js.native
class WorkbookProtection () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_WorkbookProtection: RequestContext = js.native
  /**
    *
    * Indicates if the workbook is protected. Read-Only.
    *
    * [Api set: ExcelApi 1.7]
    */
  val `protected`: Boolean = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): WorkbookProtection = js.native
  def load(options: WorkbookProtectionLoadOptions): WorkbookProtection = js.native
  def load(propertyNamesAndPaths: Anon_Expand): WorkbookProtection = js.native
  def load(propertyNames: String): WorkbookProtection = js.native
  def load(propertyNames: js.Array[String]): WorkbookProtection = js.native
  /**
    *
    * Protects a workbook. Fails if the workbook has been protected.
    *
    * [Api set: ExcelApi 1.7]
    *
    * @param password workbook protection password.
    */
  def protect(): Unit = js.native
  def protect(password: String): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.WorkbookProtection object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.WorkbookProtectionData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): WorkbookProtectionData = js.native
  /**
    *
    * Unprotects a workbook.
    *
    * [Api set: ExcelApi 1.7]
    *
    * @param password workbook protection password.
    */
  def unprotect(): Unit = js.native
  def unprotect(password: String): Unit = js.native
}

