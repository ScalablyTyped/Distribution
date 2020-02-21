package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMethodParamsUrlAnonMessage extends js.Object {
  var method: String
  var params: AnonMessage
  var url: String
}

object AnonMethodParamsUrlAnonMessage {
  @scala.inline
  def apply(method: String, params: AnonMessage, url: String): AnonMethodParamsUrlAnonMessage = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMethodParamsUrlAnonMessage]
  }
}

