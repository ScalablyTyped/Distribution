package typings
package meteorDashPrime8consultingDashOauth2Lib.OAuth2ServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscribeTo extends js.Object {
  /**
    * Wrapper function to subscribe to the auth code subscription. Returns a standard subscription handle.
    */
  def authCode(): meteorLib.MeteorNs.SubscriptionHandle
}

object SubscribeTo {
  @scala.inline
  def apply(authCode: js.Function0[meteorLib.MeteorNs.SubscriptionHandle]): SubscribeTo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("authCode")(authCode)
    __obj.asInstanceOf[SubscribeTo]
  }
}

