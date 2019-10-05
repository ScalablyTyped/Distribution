package typings.officeDashJs.OneNote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("OneNote.RequestContext")
@js.native
class RequestContext ()
  extends typings.officeDashJs.OfficeCore.RequestContext {
  def this(url: String) = this()
  val application: Application = js.native
}

