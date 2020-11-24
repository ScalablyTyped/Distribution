package typings.oracledb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Result of connection.subscribe() for continous query notification subscriptions.
  * 
  * @see https://oracle.github.io/node-oracledb/doc/api.html#cqn
  * @since 4.0
  */
@js.native
trait Subscription extends js.Object {
  
  /**
    * Value of REGID in the database view USER_CHANGE_NOTIFICATION_REGS or the value of REG_ID in USER_SUBSCR_REGISTRATIONS.
    * 
    * For advanced queue SUBSCR_NAMESPACE_AQ subscriptions, regId is undefined.
    */
  var regId: js.UndefOr[String] = js.native
}
object Subscription {
  
  @scala.inline
  def apply(): Subscription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Subscription]
  }
  
  @scala.inline
  implicit class SubscriptionOps[Self <: Subscription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRegId(value: String): Self = this.set("regId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegId: Self = this.set("regId", js.undefined)
  }
}
