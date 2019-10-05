package typings.meteorDashPrime8consultingDashOauth2.OAuth2Server

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
    val __obj = js.Dynamic.literal(authorizationCode = authorizationCode, error = error, redirectToUri = redirectToUri, success = success)
  
    __obj.asInstanceOf[AuthCodeGrantResult]
  }
}

