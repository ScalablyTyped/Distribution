package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchPaneEvents extends IEvents {
  var OnHidePane: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var OnShowPane: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var OnStarted: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var OnStop: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object ISearchPaneEvents {
  @scala.inline
  def apply(
    Register: js.Function2[mfilesLib.MFilesNs.Event, js.Function, scala.Double],
    Unregister: js.Function1[scala.Double, scala.Unit],
    OnHidePane: js.Function0[scala.Unit] = null,
    OnShowPane: js.Function0[scala.Unit] = null,
    OnStarted: js.Function0[scala.Unit] = null,
    OnStop: js.Function0[scala.Unit] = null
  ): ISearchPaneEvents = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Register")(Register)
    __obj.updateDynamic("Unregister")(Unregister)
    if (OnHidePane != null) __obj.updateDynamic("OnHidePane")(OnHidePane)
    if (OnShowPane != null) __obj.updateDynamic("OnShowPane")(OnShowPane)
    if (OnStarted != null) __obj.updateDynamic("OnStarted")(OnStarted)
    if (OnStop != null) __obj.updateDynamic("OnStop")(OnStop)
    __obj.asInstanceOf[ISearchPaneEvents]
  }
}

