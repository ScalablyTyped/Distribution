package typings.mfiles

import typings.mfiles.MFilesNs.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICommandsEvents extends IEvents {
  var OnCustomCommand: js.UndefOr[js.Function1[/* commandID */ Double, Unit]] = js.undefined
}

object ICommandsEvents {
  @scala.inline
  def apply(
    Register: (Event, js.Function) => Double,
    Unregister: Double => Unit,
    OnCustomCommand: /* commandID */ Double => Unit = null
  ): ICommandsEvents = {
    val __obj = js.Dynamic.literal(Register = js.Any.fromFunction2(Register), Unregister = js.Any.fromFunction1(Unregister))
    if (OnCustomCommand != null) __obj.updateDynamic("OnCustomCommand")(js.Any.fromFunction1(OnCustomCommand))
    __obj.asInstanceOf[ICommandsEvents]
  }
}

