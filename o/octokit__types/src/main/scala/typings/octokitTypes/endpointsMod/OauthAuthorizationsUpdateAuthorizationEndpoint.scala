package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OauthAuthorizationsUpdateAuthorizationEndpoint extends js.Object {
  /**
    * A list of scopes to add to this authorization.
    */
  var add_scopes: js.UndefOr[js.Array[String]] = js.native
  var authorization_id: Double = js.native
  /**
    * A unique string to distinguish an authorization from others created for the same client ID and user.
    */
  var fingerprint: js.UndefOr[String] = js.native
  /**
    * A note to remind you what the OAuth token is for. Tokens not associated with a specific OAuth application (i.e. personal access tokens) must have a unique note.
    */
  var note: js.UndefOr[String] = js.native
  /**
    * A URL to remind you what app the OAuth token is for.
    */
  var note_url: js.UndefOr[String] = js.native
  /**
    * A list of scopes to remove from this authorization.
    */
  var remove_scopes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Replaces the authorization scopes with these.
    */
  var scopes: js.UndefOr[js.Array[String]] = js.native
}

object OauthAuthorizationsUpdateAuthorizationEndpoint {
  @scala.inline
  def apply(authorization_id: Double): OauthAuthorizationsUpdateAuthorizationEndpoint = {
    val __obj = js.Dynamic.literal(authorization_id = authorization_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[OauthAuthorizationsUpdateAuthorizationEndpoint]
  }
  @scala.inline
  implicit class OauthAuthorizationsUpdateAuthorizationEndpointOps[Self <: OauthAuthorizationsUpdateAuthorizationEndpoint] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setAdd_scopesVarargs(value: String*): Self = this.set("add_scopes", js.Array(value :_*))
    @scala.inline
    def setAdd_scopes(value: js.Array[String]): Self = this.set("add_scopes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdd_scopes: Self = this.set("add_scopes", js.undefined)
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
    def setRemove_scopesVarargs(value: String*): Self = this.set("remove_scopes", js.Array(value :_*))
    @scala.inline
    def setRemove_scopes(value: js.Array[String]): Self = this.set("remove_scopes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemove_scopes: Self = this.set("remove_scopes", js.undefined)
    @scala.inline
    def setScopesVarargs(value: String*): Self = this.set("scopes", js.Array(value :_*))
    @scala.inline
    def setScopes(value: js.Array[String]): Self = this.set("scopes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScopes: Self = this.set("scopes", js.undefined)
  }
  
}

