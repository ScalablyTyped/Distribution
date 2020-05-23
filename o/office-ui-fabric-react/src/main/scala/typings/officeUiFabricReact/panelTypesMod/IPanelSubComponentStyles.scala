package typings.officeUiFabricReact.panelTypesMod

import typings.officeUiFabricReact.anon.PartialIButtonStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanelSubComponentStyles extends js.Object {
  /**
    * Styling for close button child component.
    */
  var closeButton: PartialIButtonStyles
}

object IPanelSubComponentStyles {
  @scala.inline
  def apply(closeButton: PartialIButtonStyles): IPanelSubComponentStyles = {
    val __obj = js.Dynamic.literal(closeButton = closeButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPanelSubComponentStyles]
  }
}

