package typings.popmotion.libReactionsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HotSubscription extends js.Object {
  def unsubscribe(): Unit
}

object HotSubscription {
  @scala.inline
  def apply(unsubscribe: () => Unit): HotSubscription = {
    val __obj = js.Dynamic.literal(unsubscribe = js.Any.fromFunction0(unsubscribe))
  
    __obj.asInstanceOf[HotSubscription]
  }
}

