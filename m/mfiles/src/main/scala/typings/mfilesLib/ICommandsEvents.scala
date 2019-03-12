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
    Register: (mfilesLib.MFilesNs.Event, js.Function) => scala.Double,
    Unregister: scala.Double => scala.Unit,
    OnCustomCommand: /* commandID */ scala.Double => scala.Unit = null
  ): ICommandsEvents = {
    val __obj = js.Dynamic.literal(Register = js.Any.fromFunction2(Register), Unregister = js.Any.fromFunction1(Unregister))
    if (OnCustomCommand != null) __obj.updateDynamic("OnCustomCommand")(js.Any.fromFunction1(OnCustomCommand))
    __obj.asInstanceOf[ICommandsEvents]
  }
}

