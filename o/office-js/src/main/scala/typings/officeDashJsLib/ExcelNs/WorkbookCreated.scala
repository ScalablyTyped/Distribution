package typings
package officeDashJsLib.ExcelNs

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
class WorkbookCreated ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.WorkbookCreated` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.WorkbookCreated` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.WorkbookCreated` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): WorkbookCreated = js.native
  def load(option: java.lang.String): WorkbookCreated = js.native
  def load(option: js.Array[java.lang.String]): WorkbookCreated = js.native
  def load(option: officeDashJsLib.Anon_Select): WorkbookCreated = js.native
  def toJSON(): officeDashJsLib.ExcelNs.InterfacesNs.WorkbookCreatedData = js.native
}

