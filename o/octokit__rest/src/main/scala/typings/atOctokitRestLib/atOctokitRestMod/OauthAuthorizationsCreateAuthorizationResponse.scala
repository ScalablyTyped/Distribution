package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OauthAuthorizationsCreateAuthorizationResponse extends js.Object {
  var app: OauthAuthorizationsCreateAuthorizationResponseApp
  var created_at: java.lang.String
  var fingerprint: java.lang.String
  var hashed_token: java.lang.String
  var id: scala.Double
  var note: java.lang.String
  var note_url: java.lang.String
  var scopes: js.Array[java.lang.String]
  var token: java.lang.String
  var token_last_eight: java.lang.String
  var updated_at: java.lang.String
  var url: java.lang.String
}

object OauthAuthorizationsCreateAuthorizationResponse {
  @scala.inline
  def apply(
    app: OauthAuthorizationsCreateAuthorizationResponseApp,
    created_at: java.lang.String,
    fingerprint: java.lang.String,
    hashed_token: java.lang.String,
    id: scala.Double,
    note: java.lang.String,
    note_url: java.lang.String,
    scopes: js.Array[java.lang.String],
    token: java.lang.String,
    token_last_eight: java.lang.String,
    updated_at: java.lang.String,
    url: java.lang.String
  ): OauthAuthorizationsCreateAuthorizationResponse = {
    val __obj = js.Dynamic.literal(app = app, created_at = created_at, fingerprint = fingerprint, hashed_token = hashed_token, id = id, note = note, note_url = note_url, scopes = scopes, token = token, token_last_eight = token_last_eight, updated_at = updated_at, url = url)
  
    __obj.asInstanceOf[OauthAuthorizationsCreateAuthorizationResponse]
  }
}

