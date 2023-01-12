package typings.oracledb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Result of connection.subscribe() for continous query notification subscriptions.
  *
  * @see https://oracle.github.io/node-oracledb/doc/api.html#cqn
  * @since 4.0
  */
trait Subscription extends StObject {
  
  /**
    * Value of REGID in the database view USER_CHANGE_NOTIFICATION_REGS or the value of REG_ID in USER_SUBSCR_REGISTRATIONS.
    *
    * For advanced queue SUBSCR_NAMESPACE_AQ subscriptions, regId is undefined.
    */
  var regId: js.UndefOr[String] = js.undefined
}
object Subscription {
  
  inline def apply(): Subscription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Subscription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Subscription] (val x: Self) extends AnyVal {
    
    inline def setRegId(value: String): Self = StObject.set(x, "regId", value.asInstanceOf[js.Any])
    
    inline def setRegIdUndefined: Self = StObject.set(x, "regId", js.undefined)
  }
}
