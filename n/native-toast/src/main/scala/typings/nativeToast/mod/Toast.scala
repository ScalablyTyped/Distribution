package typings.nativeToast.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Toast extends js.Object {
  def destroy(): Unit
  def hide(): Unit
  def show(): Unit
}

object Toast {
  @scala.inline
  def apply(destroy: () => Unit, hide: () => Unit, show: () => Unit): Toast = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show))
  
    __obj.asInstanceOf[Toast]
  }
}

