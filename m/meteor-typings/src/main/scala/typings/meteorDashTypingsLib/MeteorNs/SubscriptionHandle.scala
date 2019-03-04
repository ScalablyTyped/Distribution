package typings
package meteorDashTypingsLib.MeteorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** utils **/
/** Pub/Sub **/
trait SubscriptionHandle extends js.Object {
  def ready(): scala.Boolean
  def stop(): scala.Unit
}

object SubscriptionHandle {
  @scala.inline
  def apply(ready: js.Function0[scala.Boolean], stop: js.Function0[scala.Unit]): SubscriptionHandle = {
    val __obj = js.Dynamic.literal(ready = ready, stop = stop)
  
    __obj.asInstanceOf[SubscriptionHandle]
  }
}

