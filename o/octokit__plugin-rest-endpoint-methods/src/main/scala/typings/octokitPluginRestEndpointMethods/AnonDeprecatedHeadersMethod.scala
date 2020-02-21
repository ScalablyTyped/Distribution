package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDeprecatedHeadersMethod extends js.Object {
  var deprecated: String
  var headers: AnonAccept
  var method: String
  var params: AnonOwnerRepo
  var url: String
}

object AnonDeprecatedHeadersMethod {
  @scala.inline
  def apply(deprecated: String, headers: AnonAccept, method: String, params: AnonOwnerRepo, url: String): AnonDeprecatedHeadersMethod = {
    val __obj = js.Dynamic.literal(deprecated = deprecated.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDeprecatedHeadersMethod]
  }
}

