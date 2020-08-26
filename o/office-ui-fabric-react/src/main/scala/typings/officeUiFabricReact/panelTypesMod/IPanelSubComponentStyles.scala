package typings.officeUiFabricReact.panelTypesMod

import typings.officeUiFabricReact.anon.PartialIButtonStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPanelSubComponentStyles extends js.Object {
  /**
    * Styling for close button child component.
    */
  var closeButton: PartialIButtonStyles = js.native
}

object IPanelSubComponentStyles {
  @scala.inline
  def apply(closeButton: PartialIButtonStyles): IPanelSubComponentStyles = {
    val __obj = js.Dynamic.literal(closeButton = closeButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPanelSubComponentStyles]
  }
  @scala.inline
  implicit class IPanelSubComponentStylesOps[Self <: IPanelSubComponentStyles] (val x: Self) extends AnyVal {
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
    def setCloseButton(value: PartialIButtonStyles): Self = this.set("closeButton", value.asInstanceOf[js.Any])
  }
  
}

