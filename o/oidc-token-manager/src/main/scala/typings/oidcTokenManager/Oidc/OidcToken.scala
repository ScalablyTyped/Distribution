package typings.oidcTokenManager.Oidc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OidcToken extends js.Object {
  var access_token: String
  var expired: Boolean
  var expires_at: Double
  var expires_in: Double
  var id_token: String
  var profile: String
  var scope: String
  var scopes: js.Array[String]
  var session_state: js.Any
  def toJSON(): String
}

object OidcToken {
  @scala.inline
  def apply(
    access_token: String,
    expired: Boolean,
    expires_at: Double,
    expires_in: Double,
    id_token: String,
    profile: String,
    scope: String,
    scopes: js.Array[String],
    session_state: js.Any,
    toJSON: () => String
  ): OidcToken = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], expired = expired.asInstanceOf[js.Any], expires_at = expires_at.asInstanceOf[js.Any], expires_in = expires_in.asInstanceOf[js.Any], id_token = id_token.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], session_state = session_state.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[OidcToken]
  }
}

