package typings.officeJsPreview.OneNote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("OneNote.RequestContext")
@js.native
class RequestContext ()
  extends typings.officeJsPreview.OfficeCore.RequestContext {
  def this(url: String) = this()
  val application: Application = js.native
}

