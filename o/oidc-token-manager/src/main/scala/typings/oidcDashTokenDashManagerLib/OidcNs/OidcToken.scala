package typings
package oidcDashTokenDashManagerLib.OidcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OidcToken extends js.Object {
  var access_token: java.lang.String
  var expired: scala.Boolean
  var expires_at: scala.Double
  var expires_in: scala.Double
  var id_token: java.lang.String
  var profile: java.lang.String
  var scope: java.lang.String
  var scopes: js.Array[java.lang.String]
  var session_state: js.Any
  def toJSON(): java.lang.String
}

object OidcToken {
  @scala.inline
  def apply(
    access_token: java.lang.String,
    expired: scala.Boolean,
    expires_at: scala.Double,
    expires_in: scala.Double,
    id_token: java.lang.String,
    profile: java.lang.String,
    scope: java.lang.String,
    scopes: js.Array[java.lang.String],
    session_state: js.Any,
    toJSON: js.Function0[java.lang.String]
  ): OidcToken = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("access_token")(access_token)
    __obj.updateDynamic("expired")(expired)
    __obj.updateDynamic("expires_at")(expires_at)
    __obj.updateDynamic("expires_in")(expires_in)
    __obj.updateDynamic("id_token")(id_token)
    __obj.updateDynamic("profile")(profile)
    __obj.updateDynamic("scope")(scope)
    __obj.updateDynamic("scopes")(scopes)
    __obj.updateDynamic("session_state")(session_state)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.asInstanceOf[OidcToken]
  }
}

