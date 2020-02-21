package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeadersMethodParamsUrlAnonContenttype extends js.Object {
  var headers: AnonContenttype
  var method: String
  var params: AnonData
  var url: String
}

object AnonHeadersMethodParamsUrlAnonContenttype {
  @scala.inline
  def apply(headers: AnonContenttype, method: String, params: AnonData, url: String): AnonHeadersMethodParamsUrlAnonContenttype = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHeadersMethodParamsUrlAnonContenttype]
  }
}

