package typings
package popmotionLib.libReactionsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HotSubscription extends js.Object {
  def unsubscribe(): scala.Unit
}

object HotSubscription {
  @scala.inline
  def apply(unsubscribe: () => scala.Unit): HotSubscription = {
    val __obj = js.Dynamic.literal(unsubscribe = js.Any.fromFunction0(unsubscribe))
  
    __obj.asInstanceOf[HotSubscription]
  }
}

