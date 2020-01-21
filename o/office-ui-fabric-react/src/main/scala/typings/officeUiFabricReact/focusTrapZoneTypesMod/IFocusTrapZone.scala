package typings.officeUiFabricReact.focusTrapZoneTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFocusTrapZone extends js.Object {
  /**
    * Sets focus to a descendant in the Trap Zone.
    * See firstFocusableSelector and focusPreviouslyFocusedInnerElement for details.
    */
  def focus(): Unit
}

object IFocusTrapZone {
  @scala.inline
  def apply(focus: () => Unit): IFocusTrapZone = {
    val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus))
  
    __obj.asInstanceOf[IFocusTrapZone]
  }
}

