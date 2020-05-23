package typings.preloadjs.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbstractRequest extends js.Object {
  def cancel(): Unit
  def destroy(): Unit
  def load(): Unit
}

object AbstractRequest {
  @scala.inline
  def apply(cancel: () => Unit, destroy: () => Unit, load: () => Unit): AbstractRequest = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), destroy = js.Any.fromFunction0(destroy), load = js.Any.fromFunction0(load))
    __obj.asInstanceOf[AbstractRequest]
  }
}

