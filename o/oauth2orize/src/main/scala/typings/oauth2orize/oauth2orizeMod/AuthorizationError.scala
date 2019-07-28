package typings.oauth2orize.oauth2orizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("oauth2orize", "AuthorizationError")
@js.native
/**
  * @param code The code sets the status unless status is present. Mapping:
  * invalid_request = 400
  * unauthorized_client = 403
  * access_denied = 403
  * unsupported_response_type = 501
  * invalid_scope = 400
  * temporarily_unavailable = 503
  * Defaults to *server_error*.
  * @param status Defaults to 500 if code is not specified.
  */
class AuthorizationError () extends OAuth2Error {
  def this(message: String) = this()
  def this(message: String, code: String) = this()
  def this(message: String, code: AuthorizationErrorCode) = this()
  def this(message: String, code: String, uri: String) = this()
  def this(message: String, code: AuthorizationErrorCode, uri: String) = this()
  def this(message: String, code: String, uri: String, status: Double) = this()
  def this(message: String, code: AuthorizationErrorCode, uri: String, status: Double) = this()
}

