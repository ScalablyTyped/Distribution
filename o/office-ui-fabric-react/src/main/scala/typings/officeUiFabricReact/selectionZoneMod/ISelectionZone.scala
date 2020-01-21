package typings.officeUiFabricReact.selectionZoneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISelectionZone extends js.Object {
  /**
    * Method to ignore subsequent focus.
    */
  def ignoreNextFocus(): Unit
}

object ISelectionZone {
  @scala.inline
  def apply(ignoreNextFocus: () => Unit): ISelectionZone = {
    val __obj = js.Dynamic.literal(ignoreNextFocus = js.Any.fromFunction0(ignoreNextFocus))
  
    __obj.asInstanceOf[ISelectionZone]
  }
}

