package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeadersMethodParamsUrlAnonAccept extends js.Object {
  var headers: AnonAccept
  var method: String
  var params: AnonInstallationidPermissions
  var url: String
}

object AnonHeadersMethodParamsUrlAnonAccept {
  @scala.inline
  def apply(headers: AnonAccept, method: String, params: AnonInstallationidPermissions, url: String): AnonHeadersMethodParamsUrlAnonAccept = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHeadersMethodParamsUrlAnonAccept]
  }
}

