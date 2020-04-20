package typings.meteor.Meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** utils **/
/** Pub/Sub **/
trait SubscriptionHandle extends js.Object {
  def ready(): Boolean
  def stop(): Unit
}

object SubscriptionHandle {
  @scala.inline
  def apply(ready: () => Boolean, stop: () => Unit): SubscriptionHandle = {
    val __obj = js.Dynamic.literal(ready = js.Any.fromFunction0(ready), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[SubscriptionHandle]
  }
}

