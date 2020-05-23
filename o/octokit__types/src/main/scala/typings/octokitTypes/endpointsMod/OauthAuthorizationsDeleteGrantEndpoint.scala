package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OauthAuthorizationsDeleteGrantEndpoint extends js.Object {
  var grant_id: Double
}

object OauthAuthorizationsDeleteGrantEndpoint {
  @scala.inline
  def apply(grant_id: Double): OauthAuthorizationsDeleteGrantEndpoint = {
    val __obj = js.Dynamic.literal(grant_id = grant_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[OauthAuthorizationsDeleteGrantEndpoint]
  }
}

