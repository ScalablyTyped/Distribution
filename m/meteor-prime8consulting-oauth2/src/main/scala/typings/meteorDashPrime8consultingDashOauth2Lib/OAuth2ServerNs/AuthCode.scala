package typings
package meteorDashPrime8consultingDashOauth2Lib.OAuth2ServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthCode extends js.Object {
  var authCode: java.lang.String
  var clientId: java.lang.String
  var expires: stdLib.Date
  var userId: java.lang.String
}

object AuthCode {
  @scala.inline
  def apply(
    authCode: java.lang.String,
    clientId: java.lang.String,
    expires: stdLib.Date,
    userId: java.lang.String
  ): AuthCode = {
    val __obj = js.Dynamic.literal(authCode = authCode, clientId = clientId, expires = expires, userId = userId)
  
    __obj.asInstanceOf[AuthCode]
  }
}

