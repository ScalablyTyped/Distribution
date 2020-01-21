package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OauthAuthorizationsGetOrCreateAuthorizationForAppFingerprintResponse extends js.Object {
  var app: OauthAuthorizationsGetOrCreateAuthorizationForAppFingerprintResponseApp
  var created_at: String
  var fingerprint: String
  var hashed_token: String
  var id: Double
  var note: String
  var note_url: String
  var scopes: js.Array[String]
  var token: String
  var token_last_eight: String
  var updated_at: String
  var url: String
}

object OauthAuthorizationsGetOrCreateAuthorizationForAppFingerprintResponse {
  @scala.inline
  def apply(
    app: OauthAuthorizationsGetOrCreateAuthorizationForAppFingerprintResponseApp,
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
    url: String
  ): OauthAuthorizationsGetOrCreateAuthorizationForAppFingerprintResponse = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], hashed_token = hashed_token.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any], note_url = note_url.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], token_last_eight = token_last_eight.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OauthAuthorizationsGetOrCreateAuthorizationForAppFingerprintResponse]
  }
}

