package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICommandsEvents extends IEvents {
  var OnCustomCommand: js.UndefOr[js.Function1[/* commandID */ scala.Double, scala.Unit]] = js.undefined
}

object ICommandsEvents {
  @scala.inline
  def apply(
    Register: js.Function2[mfilesLib.MFilesNs.Event, js.Function, scala.Double],
    Unregister: js.Function1[scala.Double, scala.Unit],
    OnCustomCommand: js.Function1[/* commandID */ scala.Double, scala.Unit] = null
  ): ICommandsEvents = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Register")(Register)
    __obj.updateDynamic("Unregister")(Unregister)
    if (OnCustomCommand != null) __obj.updateDynamic("OnCustomCommand")(OnCustomCommand)
    __obj.asInstanceOf[ICommandsEvents]
  }
}

