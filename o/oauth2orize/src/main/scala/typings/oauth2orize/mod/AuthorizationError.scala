package typings.oauth2orize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def this(message: js.UndefOr[scala.Nothing], code: String) = this()
  def this(message: js.UndefOr[scala.Nothing], code: AuthorizationErrorCode) = this()
  def this(message: String, code: String) = this()
  def this(message: String, code: AuthorizationErrorCode) = this()
  def this(message: js.UndefOr[scala.Nothing], code: js.UndefOr[scala.Nothing], uri: String) = this()
  def this(message: js.UndefOr[scala.Nothing], code: String, uri: String) = this()
  def this(message: js.UndefOr[scala.Nothing], code: AuthorizationErrorCode, uri: String) = this()
  def this(message: String, code: js.UndefOr[scala.Nothing], uri: String) = this()
  def this(message: String, code: String, uri: String) = this()
  def this(message: String, code: AuthorizationErrorCode, uri: String) = this()
  def this(
    message: js.UndefOr[scala.Nothing],
    code: js.UndefOr[scala.Nothing],
    uri: js.UndefOr[scala.Nothing],
    status: Double
  ) = this()
  def this(message: js.UndefOr[scala.Nothing], code: js.UndefOr[scala.Nothing], uri: String, status: Double) = this()
  def this(message: js.UndefOr[scala.Nothing], code: String, uri: js.UndefOr[scala.Nothing], status: Double) = this()
  def this(message: js.UndefOr[scala.Nothing], code: String, uri: String, status: Double) = this()
  def this(
    message: js.UndefOr[scala.Nothing],
    code: AuthorizationErrorCode,
    uri: js.UndefOr[scala.Nothing],
    status: Double
  ) = this()
  def this(message: js.UndefOr[scala.Nothing], code: AuthorizationErrorCode, uri: String, status: Double) = this()
  def this(message: String, code: js.UndefOr[scala.Nothing], uri: js.UndefOr[scala.Nothing], status: Double) = this()
  def this(message: String, code: js.UndefOr[scala.Nothing], uri: String, status: Double) = this()
  def this(message: String, code: String, uri: js.UndefOr[scala.Nothing], status: Double) = this()
  def this(message: String, code: String, uri: String, status: Double) = this()
  def this(message: String, code: AuthorizationErrorCode, uri: js.UndefOr[scala.Nothing], status: Double) = this()
  def this(message: String, code: AuthorizationErrorCode, uri: String, status: Double) = this()
}
