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

