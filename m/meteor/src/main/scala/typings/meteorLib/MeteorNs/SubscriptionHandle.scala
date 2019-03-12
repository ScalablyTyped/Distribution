package typings
package meteorLib.MeteorNs

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
  def apply(ready: () => scala.Boolean, stop: () => scala.Unit): SubscriptionHandle = {
    val __obj = js.Dynamic.literal(ready = js.Any.fromFunction0(ready), stop = js.Any.fromFunction0(stop))
  
    __obj.asInstanceOf[SubscriptionHandle]
  }
}

