package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWindowEvents extends IEvents {
  var OnCloseWindow: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
}

object IWindowEvents {
  @scala.inline
  def apply(
    Register: js.Function2[mfilesLib.MFilesNs.Event, js.Function, scala.Double],
    Unregister: js.Function1[scala.Double, scala.Unit],
    OnCloseWindow: js.Function0[scala.Boolean] = null
  ): IWindowEvents = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Register")(Register)
    __obj.updateDynamic("Unregister")(Unregister)
    if (OnCloseWindow != null) __obj.updateDynamic("OnCloseWindow")(OnCloseWindow)
    __obj.asInstanceOf[IWindowEvents]
  }
}

