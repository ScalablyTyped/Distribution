package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchEmailLegacyResponse extends js.Object {
  var user: SearchEmailLegacyResponseUser
}

object SearchEmailLegacyResponse {
  @scala.inline
  def apply(user: SearchEmailLegacyResponseUser): SearchEmailLegacyResponse = {
    val __obj = js.Dynamic.literal(user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SearchEmailLegacyResponse]
  }
}

