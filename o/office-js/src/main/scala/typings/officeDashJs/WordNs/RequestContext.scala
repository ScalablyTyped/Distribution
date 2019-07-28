package typings.officeDashJs.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The RequestContext object facilitates requests to the Word application. Since the Office add-in and the Word application run in two different processes, the request context is required to get access to the Word object model from the add-in.
  */
@JSGlobal("Word.RequestContext")
@js.native
class RequestContext ()
  extends typings.officeDashJs.OfficeCoreNs.RequestContext {
  def this(url: String) = this()
  val application: Application = js.native
  val document: Document = js.native
}

