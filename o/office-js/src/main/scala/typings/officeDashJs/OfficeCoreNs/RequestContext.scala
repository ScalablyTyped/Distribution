package typings.officeDashJs.OfficeCoreNs

import typings.officeDashJs.OfficeExtensionNs.ClientRequestContext
import typings.officeDashJs.OfficeExtensionNs.RequestUrlAndHeaderInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("OfficeCore.RequestContext")
@js.native
class RequestContext () extends ClientRequestContext {
  def this(url: String) = this()
  def this(url: js.Any) = this()
  def this(url: RequestUrlAndHeaderInfo) = this()
}

