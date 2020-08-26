package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Credentialauthorizedat extends js.Object {
  var credential_authorized_at: String = js.native
  var credential_id: String = js.native
  var credential_type: String = js.native
  var login: String = js.native
  var scopes: js.Array[String] = js.native
  var token_last_eight: String = js.native
}

object Credentialauthorizedat {
  @scala.inline
  def apply(
    credential_authorized_at: String,
    credential_id: String,
    credential_type: String,
    login: String,
    scopes: js.Array[String],
    token_last_eight: String
  ): Credentialauthorizedat = {
    val __obj = js.Dynamic.literal(credential_authorized_at = credential_authorized_at.asInstanceOf[js.Any], credential_id = credential_id.asInstanceOf[js.Any], credential_type = credential_type.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], token_last_eight = token_last_eight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Credentialauthorizedat]
  }
  @scala.inline
  implicit class CredentialauthorizedatOps[Self <: Credentialauthorizedat] (val x: Self) extends AnyVal {
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
    def setCredential_authorized_at(value: String): Self = this.set("credential_authorized_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setCredential_id(value: String): Self = this.set("credential_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setCredential_type(value: String): Self = this.set("credential_type", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogin(value: String): Self = this.set("login", value.asInstanceOf[js.Any])
    @scala.inline
    def setScopesVarargs(value: String*): Self = this.set("scopes", js.Array(value :_*))
    @scala.inline
    def setScopes(value: js.Array[String]): Self = this.set("scopes", value.asInstanceOf[js.Any])
    @scala.inline
    def setToken_last_eight(value: String): Self = this.set("token_last_eight", value.asInstanceOf[js.Any])
  }
  
}

