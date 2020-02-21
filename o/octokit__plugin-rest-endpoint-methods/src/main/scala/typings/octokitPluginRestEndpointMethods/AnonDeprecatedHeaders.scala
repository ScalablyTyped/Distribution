package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDeprecatedHeaders extends js.Object {
  var deprecated: String
  var headers: AnonAccept
  var method: String
  var params: AnonOrgAnonRequired
  var url: String
}

object AnonDeprecatedHeaders {
  @scala.inline
  def apply(deprecated: String, headers: AnonAccept, method: String, params: AnonOrgAnonRequired, url: String): AnonDeprecatedHeaders = {
    val __obj = js.Dynamic.literal(deprecated = deprecated.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDeprecatedHeaders]
  }
}

