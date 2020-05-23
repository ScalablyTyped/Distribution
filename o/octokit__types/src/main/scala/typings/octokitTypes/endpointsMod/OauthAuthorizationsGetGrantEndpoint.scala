package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OauthAuthorizationsGetGrantEndpoint extends js.Object {
  var grant_id: Double
}

object OauthAuthorizationsGetGrantEndpoint {
  @scala.inline
  def apply(grant_id: Double): OauthAuthorizationsGetGrantEndpoint = {
    val __obj = js.Dynamic.literal(grant_id = grant_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[OauthAuthorizationsGetGrantEndpoint]
  }
}

