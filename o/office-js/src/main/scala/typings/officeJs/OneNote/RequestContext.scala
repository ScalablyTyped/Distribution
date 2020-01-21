package typings.officeJs.OneNote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("OneNote.RequestContext")
@js.native
class RequestContext ()
  extends typings.officeJs.OfficeCore.RequestContext {
  def this(url: String) = this()
  val application: Application = js.native
}

