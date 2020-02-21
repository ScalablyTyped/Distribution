package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMethodParams extends js.Object {
  var method: String
  var params: AnonEncryptedvalue
  var url: String
}

object AnonMethodParams {
  @scala.inline
  def apply(method: String, params: AnonEncryptedvalue, url: String): AnonMethodParams = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMethodParams]
  }
}

