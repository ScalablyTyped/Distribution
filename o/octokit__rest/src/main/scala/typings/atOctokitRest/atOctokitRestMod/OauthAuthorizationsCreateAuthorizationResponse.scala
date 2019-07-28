package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OauthAuthorizationsCreateAuthorizationResponse extends js.Object {
  var app: OauthAuthorizationsCreateAuthorizationResponseApp
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

object OauthAuthorizationsCreateAuthorizationResponse {
  @scala.inline
  def apply(
    app: OauthAuthorizationsCreateAuthorizationResponseApp,
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
  ): OauthAuthorizationsCreateAuthorizationResponse = {
    val __obj = js.Dynamic.literal(app = app, created_at = created_at, fingerprint = fingerprint, hashed_token = hashed_token, id = id, note = note, note_url = note_url, scopes = scopes, token = token, token_last_eight = token_last_eight, updated_at = updated_at, url = url)
  
    __obj.asInstanceOf[OauthAuthorizationsCreateAuthorizationResponse]
  }
}

