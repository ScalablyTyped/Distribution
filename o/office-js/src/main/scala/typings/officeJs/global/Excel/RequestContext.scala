package typings.officeJs.global.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The RequestContext object facilitates requests to the Excel application. Since the Office add-in and the Excel application run in two different processes, the request context is required to get access to the Excel object model from the add-in.
  */
@JSGlobal("Excel.RequestContext")
@js.native
class RequestContext ()
  extends typings.officeJs.Excel.RequestContext {
  def this(url: String) = this()
  def this(url: typings.officeJs.Excel.Session) = this()
}

