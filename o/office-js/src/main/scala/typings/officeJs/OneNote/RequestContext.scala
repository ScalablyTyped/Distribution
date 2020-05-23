package typings.officeJs.OneNote

import typings.officeJs.OfficeExtension.ClientRequestContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestContext extends ClientRequestContext {
  val application: Application = js.native
}

