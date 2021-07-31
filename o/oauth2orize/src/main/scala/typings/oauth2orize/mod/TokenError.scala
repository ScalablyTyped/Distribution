package typings.oauth2orize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("oauth2orize", "TokenError")
@js.native
/**
  * @param code The code sets the status unless status is present. Mapping:
  * invalid_request = 400
  * invalid_client = 401
  * invalid_grant = 403
  * unauthorized_client = 403
  * unsupported_grant_type = 501
  * invalid_scope = 400
  * Defaults to server_error.
  * @param status Defaults to 500 if code is not specified.
  */
class TokenError () extends OAuth2Error {
  def this(message: String) = this()
  def this(message: String, code: String) = this()
  def this(message: String, code: TokenErrorCode) = this()
  def this(message: Unit, code: String) = this()
  def this(message: Unit, code: TokenErrorCode) = this()
  def this(message: String, code: String, uri: String) = this()
  def this(message: String, code: Unit, uri: String) = this()
  def this(message: String, code: TokenErrorCode, uri: String) = this()
  def this(message: Unit, code: String, uri: String) = this()
  def this(message: Unit, code: Unit, uri: String) = this()
  def this(message: Unit, code: TokenErrorCode, uri: String) = this()
  def this(message: String, code: String, uri: String, status: Double) = this()
  def this(message: String, code: String, uri: Unit, status: Double) = this()
  def this(message: String, code: Unit, uri: String, status: Double) = this()
  def this(message: String, code: Unit, uri: Unit, status: Double) = this()
  def this(message: String, code: TokenErrorCode, uri: String, status: Double) = this()
  def this(message: String, code: TokenErrorCode, uri: Unit, status: Double) = this()
  def this(message: Unit, code: String, uri: String, status: Double) = this()
  def this(message: Unit, code: String, uri: Unit, status: Double) = this()
  def this(message: Unit, code: Unit, uri: String, status: Double) = this()
  def this(message: Unit, code: Unit, uri: Unit, status: Double) = this()
  def this(message: Unit, code: TokenErrorCode, uri: String, status: Double) = this()
  def this(message: Unit, code: TokenErrorCode, uri: Unit, status: Double) = this()
}
