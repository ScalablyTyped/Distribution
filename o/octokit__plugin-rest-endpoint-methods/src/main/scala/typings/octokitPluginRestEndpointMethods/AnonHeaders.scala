package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeaders extends js.Object {
  var headers: AnonAccept
  var method: String
  var params: AnonInstallationid
  var url: String
}

object AnonHeaders {
  @scala.inline
  def apply(headers: AnonAccept, method: String, params: AnonInstallationid, url: String): AnonHeaders = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHeaders]
  }
}

