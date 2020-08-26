package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OauthAuthorizationsDeleteAuthorizationEndpoint extends js.Object {
  var authorization_id: Double = js.native
}

object OauthAuthorizationsDeleteAuthorizationEndpoint {
  @scala.inline
  def apply(authorization_id: Double): OauthAuthorizationsDeleteAuthorizationEndpoint = {
    val __obj = js.Dynamic.literal(authorization_id = authorization_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[OauthAuthorizationsDeleteAuthorizationEndpoint]
  }
  @scala.inline
  implicit class OauthAuthorizationsDeleteAuthorizationEndpointOps[Self <: OauthAuthorizationsDeleteAuthorizationEndpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAuthorization_id(value: Double): Self = this.set("authorization_id", value.asInstanceOf[js.Any])
  }
  
}

