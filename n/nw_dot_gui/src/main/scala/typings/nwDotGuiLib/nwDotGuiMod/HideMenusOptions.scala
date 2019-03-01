package typings
package nwDotGuiLib.nwDotGuiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HideMenusOptions extends js.Object {
  var hideEdit: scala.Boolean
  var hideWindow: scala.Boolean
}

object HideMenusOptions {
  @scala.inline
  def apply(hideEdit: scala.Boolean, hideWindow: scala.Boolean): HideMenusOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hideEdit")(hideEdit)
    __obj.updateDynamic("hideWindow")(hideWindow)
    __obj.asInstanceOf[HideMenusOptions]
  }
}

