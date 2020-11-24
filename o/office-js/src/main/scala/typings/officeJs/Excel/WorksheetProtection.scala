package typings.officeJs.Excel

import typings.officeJs.Excel.Interfaces.WorksheetProtectionData
import typings.officeJs.Excel.Interfaces.WorksheetProtectionLoadOptions
import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.anon.Expand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the protection of a sheet object.
  *
  * [Api set: ExcelApi 1.2]
  */
@js.native
trait WorksheetProtection extends ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_WorksheetProtection: RequestContext = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): WorksheetProtection = js.native
  def load(options: WorksheetProtectionLoadOptions): WorksheetProtection = js.native
  def load(propertyNamesAndPaths: Expand): WorksheetProtection = js.native
  def load(propertyNames: String): WorksheetProtection = js.native
  def load(propertyNames: js.Array[String]): WorksheetProtection = js.native
  
  /**
    *
    * Specifies the protection options for the worksheet.
    *
    * [Api set: ExcelApi 1.2]
    */
  val options: WorksheetProtectionOptions = js.native
  
  /**
    * Protects a worksheet. Fails if the worksheet has already been protected.
    *
    * [Api set: ExcelApi 1.2 for options; 1.7 for password]
    *
    * @param options Optional. Sheet protection options.
    * @param password Optional. Sheet protection password.
    */
  def protect(): Unit = js.native
  def protect(options: js.UndefOr[scala.Nothing], password: String): Unit = js.native
  def protect(options: WorksheetProtectionOptions): Unit = js.native
  def protect(options: WorksheetProtectionOptions, password: String): Unit = js.native
  
  /**
    *
    * Specifies if the worksheet is protected.
    *
    * [Api set: ExcelApi 1.2]
    */
  val `protected`: Boolean = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.WorksheetProtection object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.WorksheetProtectionData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): WorksheetProtectionData = js.native
  
  /**
    * Unprotects a worksheet.
    *
    * [Api set: ExcelApi 1.7 for password]
    *
    * @param password sheet protection password.
    */
  def unprotect(): Unit = js.native
  def unprotect(password: String): Unit = js.native
}
