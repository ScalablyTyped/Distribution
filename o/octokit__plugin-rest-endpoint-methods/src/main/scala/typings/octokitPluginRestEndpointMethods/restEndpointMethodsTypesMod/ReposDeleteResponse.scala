package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposDeleteResponse extends js.Object {
  var documentation_url: String
  var message: String
}

object ReposDeleteResponse {
  @scala.inline
  def apply(documentation_url: String, message: String): ReposDeleteResponse = {
    val __obj = js.Dynamic.literal(documentation_url = documentation_url.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposDeleteResponse]
  }
}

