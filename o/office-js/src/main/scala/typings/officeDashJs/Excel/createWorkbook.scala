package typings.officeDashJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.createWorkbook")
@js.native
object createWorkbook extends js.Object {
  /**
    *
    * Creates and opens a new workbook.  Optionally, the workbook can be pre-populated with a base64-encoded .xlsx file.
    *
    * [Api set: ExcelApi 1.8]
    *
    * @param base64File Optional. The base64 encoded .xlsx file. The default value is null.
    */
  def apply(): js.Promise[Unit] = js.native
  def apply(base64: String): js.Promise[Unit] = js.native
}

