package typings
package nativeDashToastLib.nativeDashToastMod

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
  def apply(destroy: js.Function0[scala.Unit], hide: js.Function0[scala.Unit], show: js.Function0[scala.Unit]): Toast = {
    val __obj = js.Dynamic.literal(destroy = destroy, hide = hide, show = show)
  
    __obj.asInstanceOf[Toast]
  }
}

