package typings.officeJsPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The RequestContext object facilitates requests to the Excel application. Since the Office add-in and the Excel application run in two different processes, the request context is required to get access to the Excel object model from the add-in.
  */
@JSGlobal("Excel.RequestContext")
@js.native
class RequestContext ()
  extends typings.officeJsPreview.OfficeCore.RequestContext {
  def this(url: String) = this()
  def this(url: Session) = this()
  val application: Application = js.native
  /**
    * [Api set: ExcelApi 1.5]
    */
  val runtime: Runtime = js.native
  val workbook: Workbook = js.native
}

