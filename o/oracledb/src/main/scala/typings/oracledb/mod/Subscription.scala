package typings.oracledb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Result of connection.subscribe() for continous query notification subscriptions.
  * 
  * @see https://oracle.github.io/node-oracledb/doc/api.html#cqn
  * @since 4.0
  */
trait Subscription extends js.Object {
  /**
    * Value of REGID in the database view USER_CHANGE_NOTIFICATION_REGS or the value of REG_ID in USER_SUBSCR_REGISTRATIONS.
    * 
    * For advanced queue SUBSCR_NAMESPACE_AQ subscriptions, regId is undefined.
    */
  var regId: js.UndefOr[String] = js.undefined
}

object Subscription {
  @scala.inline
  def apply(regId: String = null): Subscription = {
    val __obj = js.Dynamic.literal()
    if (regId != null) __obj.updateDynamic("regId")(regId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subscription]
  }
}

