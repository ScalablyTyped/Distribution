package typings.officeUiFabricReact.modalTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IModal extends js.Object {
  /**
    * Sets focus on the first focusable, or configured, child in focus trap zone
    */
  def focus(): Unit
}

object IModal {
  @scala.inline
  def apply(focus: () => Unit): IModal = {
    val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus))
    __obj.asInstanceOf[IModal]
  }
}

