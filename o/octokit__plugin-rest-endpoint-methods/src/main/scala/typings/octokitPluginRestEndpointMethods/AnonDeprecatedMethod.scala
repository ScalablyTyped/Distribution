package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDeprecatedMethod extends js.Object {
  var deprecated: String
  var method: String
  var url: String
}

object AnonDeprecatedMethod {
  @scala.inline
  def apply(deprecated: String, method: String, url: String): AnonDeprecatedMethod = {
    val __obj = js.Dynamic.literal(deprecated = deprecated.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDeprecatedMethod]
  }
}

