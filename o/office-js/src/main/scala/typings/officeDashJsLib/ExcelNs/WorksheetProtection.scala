package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the protection of a sheet object.
  *
  * [Api set: ExcelApi 1.2]
  */
@JSGlobal("Excel.WorksheetProtection")
@js.native
class WorksheetProtection ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_WorksheetProtection: RequestContext = js.native
  /**
    *
    * Sheet protection options. Read-only.
    *
    * [Api set: ExcelApi 1.2]
    */
  val options: WorksheetProtectionOptions = js.native
  /**
    *
    * Indicates if the worksheet is protected. Read-only.
    *
    * [Api set: ExcelApi 1.2]
    */
  val `protected`: scala.Boolean = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.WorksheetProtection` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.WorksheetProtection` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.WorksheetProtection` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): WorksheetProtection = js.native
  def load(option: java.lang.String): WorksheetProtection = js.native
  def load(option: js.Array[java.lang.String]): WorksheetProtection = js.native
  def load(option: officeDashJsLib.Anon_Expand): WorksheetProtection = js.native
  def load(option: officeDashJsLib.ExcelNs.InterfacesNs.WorksheetProtectionLoadOptions): WorksheetProtection = js.native
  /**
    *
    * Protects a worksheet. Fails if the worksheet has already been protected.
    *
    * [Api set: ExcelApi 1.2 for options; 1.7 for password]
    *
    * @param options Optional. Sheet protection options.
    * @param password Optional. Sheet protection password.
    */
  def protect(): scala.Unit = js.native
  def protect(options: WorksheetProtectionOptions): scala.Unit = js.native
  def protect(options: WorksheetProtectionOptions, password: java.lang.String): scala.Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.WorksheetProtection object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.WorksheetProtectionData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): officeDashJsLib.ExcelNs.InterfacesNs.WorksheetProtectionData = js.native
  /**
    *
    * Unprotects a worksheet.
    *
    * [Api set: ExcelApi 1.7 for password]
    *
    * @param password sheet protection password.
    */
  def unprotect(): scala.Unit = js.native
  def unprotect(password: java.lang.String): scala.Unit = js.native
}

