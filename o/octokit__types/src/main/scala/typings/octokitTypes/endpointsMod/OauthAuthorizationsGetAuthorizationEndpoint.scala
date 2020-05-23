package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OauthAuthorizationsGetAuthorizationEndpoint extends js.Object {
  var authorization_id: Double
}

object OauthAuthorizationsGetAuthorizationEndpoint {
  @scala.inline
  def apply(authorization_id: Double): OauthAuthorizationsGetAuthorizationEndpoint = {
    val __obj = js.Dynamic.literal(authorization_id = authorization_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[OauthAuthorizationsGetAuthorizationEndpoint]
  }
}

