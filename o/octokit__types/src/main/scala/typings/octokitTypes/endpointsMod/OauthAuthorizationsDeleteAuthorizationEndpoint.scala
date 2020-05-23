package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OauthAuthorizationsDeleteAuthorizationEndpoint extends js.Object {
  var authorization_id: Double
}

object OauthAuthorizationsDeleteAuthorizationEndpoint {
  @scala.inline
  def apply(authorization_id: Double): OauthAuthorizationsDeleteAuthorizationEndpoint = {
    val __obj = js.Dynamic.literal(authorization_id = authorization_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[OauthAuthorizationsDeleteAuthorizationEndpoint]
  }
}

