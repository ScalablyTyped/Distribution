package typings.meteorPrime8consultingOauth2.OAuth2Server_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthCodeGrantResult extends js.Object {
  var authorizationCode: String
  var error: js.Any
  var redirectToUri: String
  var success: Boolean
}

object AuthCodeGrantResult {
  @scala.inline
  def apply(authorizationCode: String, error: js.Any, redirectToUri: String, success: Boolean): AuthCodeGrantResult = {
    val __obj = js.Dynamic.literal(authorizationCode = authorizationCode.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], redirectToUri = redirectToUri.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AuthCodeGrantResult]
  }
}

