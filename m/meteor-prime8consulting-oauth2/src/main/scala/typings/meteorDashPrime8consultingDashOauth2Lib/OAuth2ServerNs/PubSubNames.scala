package typings
package meteorDashPrime8consultingDashOauth2Lib.OAuth2ServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PubSubNames extends js.Object {
  /**
    * Constant string representing the auth codes pub/sub.
    */
  var authCodes: java.lang.String
  /**
    * Constant string representing the refresh token pub/sub.
    */
  var refreshTokens: java.lang.String
}

object PubSubNames {
  @scala.inline
  def apply(authCodes: java.lang.String, refreshTokens: java.lang.String): PubSubNames = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("authCodes")(authCodes)
    __obj.updateDynamic("refreshTokens")(refreshTokens)
    __obj.asInstanceOf[PubSubNames]
  }
}

