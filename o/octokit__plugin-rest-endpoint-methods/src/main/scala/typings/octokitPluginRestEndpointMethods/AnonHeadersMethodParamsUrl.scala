package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeadersMethodParamsUrl extends js.Object {
  var headers: AnonAccept
  var method: String
  var params: AnonCode
  var url: String
}

object AnonHeadersMethodParamsUrl {
  @scala.inline
  def apply(headers: AnonAccept, method: String, params: AnonCode, url: String): AnonHeadersMethodParamsUrl = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHeadersMethodParamsUrl]
  }
}

