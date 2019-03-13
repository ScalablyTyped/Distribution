package typings
package nativeDashToastLib.nativeDashToastMod.toastNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Toast extends js.Object {
  def destroy(): scala.Unit
  def hide(): scala.Unit
  def show(): scala.Unit
}

object Toast {
  @scala.inline
  def apply(destroy: () => scala.Unit, hide: () => scala.Unit, show: () => scala.Unit): Toast = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show))
  
    __obj.asInstanceOf[Toast]
  }
}

