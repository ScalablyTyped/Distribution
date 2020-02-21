package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeadersMethod extends js.Object {
  var headers: AnonAccept
  var method: String
  var params: AnonAccesstokenClientid
  var url: String
}

object AnonHeadersMethod {
  @scala.inline
  def apply(headers: AnonAccept, method: String, params: AnonAccesstokenClientid, url: String): AnonHeadersMethod = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHeadersMethod]
  }
}

