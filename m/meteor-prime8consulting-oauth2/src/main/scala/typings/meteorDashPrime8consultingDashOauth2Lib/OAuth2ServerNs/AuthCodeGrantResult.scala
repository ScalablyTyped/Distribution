package typings
package meteorDashPrime8consultingDashOauth2Lib.OAuth2ServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthCodeGrantResult extends js.Object {
  var authorizationCode: java.lang.String
  var error: js.Any
  var redirectToUri: java.lang.String
  var success: scala.Boolean
}

object AuthCodeGrantResult {
  @scala.inline
  def apply(
    authorizationCode: java.lang.String,
    error: js.Any,
    redirectToUri: java.lang.String,
    success: scala.Boolean
  ): AuthCodeGrantResult = {
    val __obj = js.Dynamic.literal(authorizationCode = authorizationCode, error = error, redirectToUri = redirectToUri, success = success)
  
    __obj.asInstanceOf[AuthCodeGrantResult]
  }
}

