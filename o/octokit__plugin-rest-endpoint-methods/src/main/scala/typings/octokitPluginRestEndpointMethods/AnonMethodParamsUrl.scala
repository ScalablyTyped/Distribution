package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMethodParamsUrl extends js.Object {
  var method: String
  var params: AnonOwnerRepo
  var url: String
}

object AnonMethodParamsUrl {
  @scala.inline
  def apply(method: String, params: AnonOwnerRepo, url: String): AnonMethodParamsUrl = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMethodParamsUrl]
  }
}

