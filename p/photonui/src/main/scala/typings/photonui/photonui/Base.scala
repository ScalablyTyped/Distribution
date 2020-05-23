package typings.photonui.photonui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Base extends js.Object {
  def destroy(): Unit
  def registerCallback(id: String, wEvent: String, callback: js.Function, thisArg: js.Any): Unit
  def removeCallback(id: String): Unit
}

object Base {
  @scala.inline
  def apply(
    destroy: () => Unit,
    registerCallback: (String, String, js.Function, js.Any) => Unit,
    removeCallback: String => Unit
  ): Base = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), registerCallback = js.Any.fromFunction4(registerCallback), removeCallback = js.Any.fromFunction1(removeCallback))
    __obj.asInstanceOf[Base]
  }
}

