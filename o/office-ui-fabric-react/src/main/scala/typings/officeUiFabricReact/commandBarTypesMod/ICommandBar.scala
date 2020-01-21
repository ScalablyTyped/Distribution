package typings.officeUiFabricReact.commandBarTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICommandBar extends js.Object {
  /**
    * Sets focus to the active command in the list.
    */
  def focus(): Unit
  /**
    * Remeasures the available space.
    */
  def remeasure(): Unit
}

object ICommandBar {
  @scala.inline
  def apply(focus: () => Unit, remeasure: () => Unit): ICommandBar = {
    val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus), remeasure = js.Any.fromFunction0(remeasure))
  
    __obj.asInstanceOf[ICommandBar]
  }
}

