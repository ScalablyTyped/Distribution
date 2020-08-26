package typings.officeUiFabricReact.selectionZoneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISelectionZone extends js.Object {
  /**
    * Method to ignore subsequent focus.
    */
  def ignoreNextFocus(): Unit = js.native
}

object ISelectionZone {
  @scala.inline
  def apply(ignoreNextFocus: () => Unit): ISelectionZone = {
    val __obj = js.Dynamic.literal(ignoreNextFocus = js.Any.fromFunction0(ignoreNextFocus))
    __obj.asInstanceOf[ISelectionZone]
  }
  @scala.inline
  implicit class ISelectionZoneOps[Self <: ISelectionZone] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIgnoreNextFocus(value: () => Unit): Self = this.set("ignoreNextFocus", js.Any.fromFunction0(value))
  }
  
}

