package typings.officeJs.Visio

import typings.officeJs.OfficeExtension.EmbeddedSession
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The RequestContext object facilitates requests to the Visio application. Since the Office add-in and the Visio application run in two different processes, the request context is required to get access to the Visio object model from the add-in.
  */
@JSGlobal("Visio.RequestContext")
@js.native
class RequestContext ()
  extends typings.officeJs.OfficeCore.RequestContext {
  def this(url: String) = this()
  def this(url: EmbeddedSession) = this()
  val document: Document = js.native
}

