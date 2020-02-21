package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeadersMethodParams extends js.Object {
  var headers: AnonAccept
  var method: String
  var params: AnonBody
  var url: String
}

object AnonHeadersMethodParams {
  @scala.inline
  def apply(headers: AnonAccept, method: String, params: AnonBody, url: String): AnonHeadersMethodParams = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHeadersMethodParams]
  }
}

