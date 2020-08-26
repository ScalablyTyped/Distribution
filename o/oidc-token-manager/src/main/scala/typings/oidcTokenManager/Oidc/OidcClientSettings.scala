package typings.oidcTokenManager.Oidc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OidcClientSettings extends js.Object {
  var authority: js.UndefOr[String] = js.native
  var filter_protocol_claims: js.UndefOr[Boolean] = js.native
  var load_user_profile: js.UndefOr[Boolean] = js.native
  var request_state_key: js.UndefOr[String] = js.native
  var request_state_store: js.UndefOr[js.Any] = js.native
  var response_type: js.UndefOr[String] = js.native
}

object OidcClientSettings {
  @scala.inline
  def apply(): OidcClientSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OidcClientSettings]
  }
  @scala.inline
  implicit class OidcClientSettingsOps[Self <: OidcClientSettings] (val x: Self) extends AnyVal {
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
    def setAuthority(value: String): Self = this.set("authority", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthority: Self = this.set("authority", js.undefined)
    @scala.inline
    def setFilter_protocol_claims(value: Boolean): Self = this.set("filter_protocol_claims", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter_protocol_claims: Self = this.set("filter_protocol_claims", js.undefined)
    @scala.inline
    def setLoad_user_profile(value: Boolean): Self = this.set("load_user_profile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoad_user_profile: Self = this.set("load_user_profile", js.undefined)
    @scala.inline
    def setRequest_state_key(value: String): Self = this.set("request_state_key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequest_state_key: Self = this.set("request_state_key", js.undefined)
    @scala.inline
    def setRequest_state_store(value: js.Any): Self = this.set("request_state_store", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequest_state_store: Self = this.set("request_state_store", js.undefined)
    @scala.inline
    def setResponse_type(value: String): Self = this.set("response_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponse_type: Self = this.set("response_type", js.undefined)
  }
  
}

