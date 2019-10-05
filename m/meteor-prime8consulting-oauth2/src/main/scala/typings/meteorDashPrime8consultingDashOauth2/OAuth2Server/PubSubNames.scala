package typings.meteorDashPrime8consultingDashOauth2.OAuth2Server

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PubSubNames extends js.Object {
  /**
    * Constant string representing the auth codes pub/sub.
    */
  var authCodes: String
  /**
    * Constant string representing the refresh token pub/sub.
    */
  var refreshTokens: String
}

object PubSubNames {
  @scala.inline
  def apply(authCodes: String, refreshTokens: String): PubSubNames = {
    val __obj = js.Dynamic.literal(authCodes = authCodes, refreshTokens = refreshTokens)
  
    __obj.asInstanceOf[PubSubNames]
  }
}

