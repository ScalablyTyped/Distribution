package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Credentialauthorizedat extends js.Object {
  var credential_authorized_at: String
  var credential_id: String
  var credential_type: String
  var login: String
  var scopes: js.Array[String]
  var token_last_eight: String
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
}

