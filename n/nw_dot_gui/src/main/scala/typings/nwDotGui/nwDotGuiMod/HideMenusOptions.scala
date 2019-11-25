package typings.nwDotGui.nwDotGuiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HideMenusOptions extends js.Object {
  var hideEdit: Boolean
  var hideWindow: Boolean
}

object HideMenusOptions {
  @scala.inline
  def apply(hideEdit: Boolean, hideWindow: Boolean): HideMenusOptions = {
    val __obj = js.Dynamic.literal(hideEdit = hideEdit.asInstanceOf[js.Any], hideWindow = hideWindow.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HideMenusOptions]
  }
}

