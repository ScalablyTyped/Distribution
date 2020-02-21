package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDeprecatedMethodParams extends js.Object {
  var deprecated: String
  var method: String
  var params: AnonClientid
  var url: String
}

object AnonDeprecatedMethodParams {
  @scala.inline
  def apply(deprecated: String, method: String, params: AnonClientid, url: String): AnonDeprecatedMethodParams = {
    val __obj = js.Dynamic.literal(deprecated = deprecated.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDeprecatedMethodParams]
  }
}

