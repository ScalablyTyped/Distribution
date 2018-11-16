package typings
package oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OAuthError
  extends nodeLib.Error {
  /**
           * The HTTP error code.
           */
  var code: scala.Double
  /**
           * A human-readable error message.
           */
  var message: java.lang.String
  /**
           * The OAuth error code.
           */
  var name: java.lang.String
}

