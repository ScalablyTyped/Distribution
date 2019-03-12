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
    Register: (mfilesLib.MFilesNs.Event, js.Function) => scala.Double,
    Unregister: scala.Double => scala.Unit,
    OnHideTab: () => scala.Unit = null,
    OnShowTab: () => scala.Unit = null,
    OnStarted: () => scala.Unit = null,
    OnStop: () => scala.Unit = null,
    OnTabSelected: () => scala.Unit = null,
    OnTabUnselected: () => scala.Unit = null
  ): IShellPaneTabEvents = {
    val __obj = js.Dynamic.literal(Register = js.Any.fromFunction2(Register), Unregister = js.Any.fromFunction1(Unregister))
    if (OnHideTab != null) __obj.updateDynamic("OnHideTab")(js.Any.fromFunction0(OnHideTab))
    if (OnShowTab != null) __obj.updateDynamic("OnShowTab")(js.Any.fromFunction0(OnShowTab))
    if (OnStarted != null) __obj.updateDynamic("OnStarted")(js.Any.fromFunction0(OnStarted))
    if (OnStop != null) __obj.updateDynamic("OnStop")(js.Any.fromFunction0(OnStop))
    if (OnTabSelected != null) __obj.updateDynamic("OnTabSelected")(js.Any.fromFunction0(OnTabSelected))
    if (OnTabUnselected != null) __obj.updateDynamic("OnTabUnselected")(js.Any.fromFunction0(OnTabUnselected))
    __obj.asInstanceOf[IShellPaneTabEvents]
  }
}

