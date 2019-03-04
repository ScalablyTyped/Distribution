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

object OAuthError {
  @scala.inline
  def apply(
    code: scala.Double,
    message: java.lang.String,
    name: java.lang.String,
    stack: java.lang.String = null
  ): OAuthError = {
    val __obj = js.Dynamic.literal(code = code, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[OAuthError]
  }
}

