package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShellPaneTabEvents extends IEvents {
  var OnHideTab: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var OnShowTab: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var OnStarted: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var OnStop: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var OnTabSelected: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var OnTabUnselected: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object IShellPaneTabEvents {
  @scala.inline
  def apply(
    Register: js.Function2[mfilesLib.MFilesNs.Event, js.Function, scala.Double],
    Unregister: js.Function1[scala.Double, scala.Unit],
    OnHideTab: js.Function0[scala.Unit] = null,
    OnShowTab: js.Function0[scala.Unit] = null,
    OnStarted: js.Function0[scala.Unit] = null,
    OnStop: js.Function0[scala.Unit] = null,
    OnTabSelected: js.Function0[scala.Unit] = null,
    OnTabUnselected: js.Function0[scala.Unit] = null
  ): IShellPaneTabEvents = {
    val __obj = js.Dynamic.literal(Register = Register, Unregister = Unregister)
    if (OnHideTab != null) __obj.updateDynamic("OnHideTab")(OnHideTab)
    if (OnShowTab != null) __obj.updateDynamic("OnShowTab")(OnShowTab)
    if (OnStarted != null) __obj.updateDynamic("OnStarted")(OnStarted)
    if (OnStop != null) __obj.updateDynamic("OnStop")(OnStop)
    if (OnTabSelected != null) __obj.updateDynamic("OnTabSelected")(OnTabSelected)
    if (OnTabUnselected != null) __obj.updateDynamic("OnTabUnselected")(OnTabUnselected)
    __obj.asInstanceOf[IShellPaneTabEvents]
  }
}

