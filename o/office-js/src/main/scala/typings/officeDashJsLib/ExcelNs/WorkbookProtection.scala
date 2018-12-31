package typings
package officeDashJsLib.ExcelNs

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
class WorkbookProtection ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /**
    *
    * Indicates if the workbook is protected. Read-Only.
    *
    * [Api set: ExcelApi 1.7]
    */
  val `protected`: scala.Boolean = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.WorkbookProtection` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.WorkbookProtection` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.WorkbookProtection` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): WorkbookProtection = js.native
  def load(option: java.lang.String): WorkbookProtection = js.native
  def load(option: js.Array[java.lang.String]): WorkbookProtection = js.native
  def load(option: officeDashJsLib.Anon_Select): WorkbookProtection = js.native
  def load(option: officeDashJsLib.ExcelNs.InterfacesNs.WorkbookProtectionLoadOptions): WorkbookProtection = js.native
  /**
    *
    * Protects a workbook. Fails if the workbook has been protected.
    *
    * [Api set: ExcelApi 1.7]
    *
    * @param password workbook protection password.
    */
  def protect(): scala.Unit = js.native
  def protect(password: java.lang.String): scala.Unit = js.native
  def toJSON(): officeDashJsLib.ExcelNs.InterfacesNs.WorkbookProtectionData = js.native
  /**
    *
    * Unprotects a workbook.
    *
    * [Api set: ExcelApi 1.7]
    *
    * @param password workbook protection password.
    */
  def unprotect(): scala.Unit = js.native
  def unprotect(password: java.lang.String): scala.Unit = js.native
}

