package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Avatarurl
import typings.octokitTypes.anon.Clientid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppsResetTokenResponseData extends js.Object {
  var app: Clientid = js.native
  var created_at: String = js.native
  var fingerprint: String = js.native
  var hashed_token: String = js.native
  var id: Double = js.native
  var note: String = js.native
  var note_url: String = js.native
  var scopes: js.Array[String] = js.native
  var token: String = js.native
  var token_last_eight: String = js.native
  var updated_at: String = js.native
  var url: String = js.native
  var user: Avatarurl = js.native
}

object AppsResetTokenResponseData {
  @scala.inline
  def apply(
    app: Clientid,
    created_at: String,
    fingerprint: String,
    hashed_token: String,
    id: Double,
    note: String,
    note_url: String,
    scopes: js.Array[String],
    token: String,
    token_last_eight: String,
    updated_at: String,
    url: String,
    user: Avatarurl
  ): AppsResetTokenResponseData = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], hashed_token = hashed_token.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any], note_url = note_url.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], token_last_eight = token_last_eight.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsResetTokenResponseData]
  }
  @scala.inline
  implicit class AppsResetTokenResponseDataOps[Self <: AppsResetTokenResponseData] (val x: Self) extends AnyVal {
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
    def setApp(value: Clientid): Self = this.set("app", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setFingerprint(value: String): Self = this.set("fingerprint", value.asInstanceOf[js.Any])
    @scala.inline
    def setHashed_token(value: String): Self = this.set("hashed_token", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setNote(value: String): Self = this.set("note", value.asInstanceOf[js.Any])
    @scala.inline
    def setNote_url(value: String): Self = this.set("note_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setScopesVarargs(value: String*): Self = this.set("scopes", js.Array(value :_*))
    @scala.inline
    def setScopes(value: js.Array[String]): Self = this.set("scopes", value.asInstanceOf[js.Any])
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    @scala.inline
    def setToken_last_eight(value: String): Self = this.set("token_last_eight", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdated_at(value: String): Self = this.set("updated_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser(value: Avatarurl): Self = this.set("user", value.asInstanceOf[js.Any])
  }
  
}

