package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDashboardEvents extends IEvents {
  var OnStarted: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var OnStop: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object IDashboardEvents {
  @scala.inline
  def apply(
    Register: (mfilesLib.MFilesNs.Event, js.Function) => scala.Double,
    Unregister: scala.Double => scala.Unit,
    OnStarted: () => scala.Unit = null,
    OnStop: () => scala.Unit = null
  ): IDashboardEvents = {
    val __obj = js.Dynamic.literal(Register = js.Any.fromFunction2(Register), Unregister = js.Any.fromFunction1(Unregister))
    if (OnStarted != null) __obj.updateDynamic("OnStarted")(js.Any.fromFunction0(OnStarted))
    if (OnStop != null) __obj.updateDynamic("OnStop")(js.Any.fromFunction0(OnStop))
    __obj.asInstanceOf[IDashboardEvents]
  }
}

