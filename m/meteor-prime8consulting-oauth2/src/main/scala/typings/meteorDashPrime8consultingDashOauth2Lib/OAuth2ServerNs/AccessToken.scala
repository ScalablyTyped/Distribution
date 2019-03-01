package typings
package meteorDashPrime8consultingDashOauth2Lib.OAuth2ServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessToken extends js.Object {
  var accessToken: java.lang.String
  var clientId: java.lang.String
  var expires: stdLib.Date
  var userId: java.lang.String
}

object AccessToken {
  @scala.inline
  def apply(
    accessToken: java.lang.String,
    clientId: java.lang.String,
    expires: stdLib.Date,
    userId: java.lang.String
  ): AccessToken = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accessToken")(accessToken)
    __obj.updateDynamic("clientId")(clientId)
    __obj.updateDynamic("expires")(expires)
    __obj.updateDynamic("userId")(userId)
    __obj.asInstanceOf[AccessToken]
  }
}

