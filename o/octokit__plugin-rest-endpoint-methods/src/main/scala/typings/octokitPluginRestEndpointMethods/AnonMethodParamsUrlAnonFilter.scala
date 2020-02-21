package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMethodParamsUrlAnonFilter extends js.Object {
  var method: String
  var params: AnonFilter
  var url: String
}

object AnonMethodParamsUrlAnonFilter {
  @scala.inline
  def apply(method: String, params: AnonFilter, url: String): AnonMethodParamsUrlAnonFilter = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMethodParamsUrlAnonFilter]
  }
}

