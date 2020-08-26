package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OauthAuthorizationsGetOrCreateAuthorizationForAppEndpoint extends js.Object {
  var client_id: String = js.native
  /**
    * The 40 character OAuth app client secret associated with the client ID specified in the URL.
    */
  var client_secret: String = js.native
  /**
    * A unique string to distinguish an authorization from others created for the same client and user. If provided, this API is functionally equivalent to [Get-or-create an authorization for a specific app and fingerprint](https://developer.github.com/v3/oauth_authorizations/#get-or-create-an-authorization-for-a-specific-app-and-fingerprint).
    */
  var fingerprint: js.UndefOr[String] = js.native
  /**
    * A note to remind you what the OAuth token is for.
    */
  var note: js.UndefOr[String] = js.native
  /**
    * A URL to remind you what app the OAuth token is for.
    */
  var note_url: js.UndefOr[String] = js.native
  /**
    * A list of scopes that this authorization is in.
    */
  var scopes: js.UndefOr[js.Array[String]] = js.native
}

object OauthAuthorizationsGetOrCreateAuthorizationForAppEndpoint {
  @scala.inline
  def apply(client_id: String, client_secret: String): OauthAuthorizationsGetOrCreateAuthorizationForAppEndpoint = {
    val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any], client_secret = client_secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[OauthAuthorizationsGetOrCreateAuthorizationForAppEndpoint]
  }
  @scala.inline
  implicit class OauthAuthorizationsGetOrCreateAuthorizationForAppEndpointOps[Self <: OauthAuthorizationsGetOrCreateAuthorizationForAppEndpoint] (val x: Self) extends AnyVal {
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
    def setClient_id(value: String): Self = this.set("client_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setClient_secret(value: String): Self = this.set("client_secret", value.asInstanceOf[js.Any])
    @scala.inline
    def setFingerprint(value: String): Self = this.set("fingerprint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFingerprint: Self = this.set("fingerprint", js.undefined)
    @scala.inline
    def setNote(value: String): Self = this.set("note", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNote: Self = this.set("note", js.undefined)
    @scala.inline
    def setNote_url(value: String): Self = this.set("note_url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNote_url: Self = this.set("note_url", js.undefined)
    @scala.inline
    def setScopesVarargs(value: String*): Self = this.set("scopes", js.Array(value :_*))
    @scala.inline
    def setScopes(value: js.Array[String]): Self = this.set("scopes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScopes: Self = this.set("scopes", js.undefined)
  }
  
}

