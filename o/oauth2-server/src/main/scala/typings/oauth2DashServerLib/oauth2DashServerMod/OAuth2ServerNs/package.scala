package typings
package oauth2DashServerLib.oauth2DashServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object OAuth2ServerNs {
  type AccessDeniedError = OAuthError
  /**
    * Represents a generic callback structure for model callbacks
    */
  type Callback[T] = js.Function2[/* err */ js.UndefOr[js.Any], /* result */ js.UndefOr[T], scala.Unit]
  /**
    * For returning falsey parameters in cases of failure
    */
  type Falsey = js.UndefOr[
    oauth2DashServerLib.oauth2DashServerLibStrings.Empty | oauth2DashServerLib.oauth2DashServerLibNumbers.`0` | oauth2DashServerLib.oauth2DashServerLibNumbers.`false` | scala.Null
  ]
  type InsufficientScopeError = OAuthError
  type InvalidArgumentError = OAuthError
  type InvalidClientError = OAuthError
  type InvalidGrantError = OAuthError
  type InvalidRequestError = OAuthError
  type InvalidScopeError = OAuthError
  type InvalidTokenError = OAuthError
  type ServerError = OAuthError
  type UnauthorizedClientError = OAuthError
  type UnauthorizedRequestError = OAuthError
  type UnsupportedGrantTypeError = OAuthError
  type UnsupportedResponseTypeError = OAuthError
}
