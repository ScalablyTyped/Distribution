package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShellPaneContainerEvents extends IEvents {
  var OnHidePane: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var OnMinimizedStateChanged: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var OnNewTab: js.UndefOr[js.Function1[/* tab */ IShellPaneTab, scala.Unit]] = js.undefined
  var OnPaneResized: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var OnShowPane: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var OnStarted: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var OnStop: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var OnTabSelected: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var OnTabUnselected: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object IShellPaneContainerEvents {
  @scala.inline
  def apply(
    Register: (mfilesLib.MFilesNs.Event, js.Function) => scala.Double,
    Unregister: scala.Double => scala.Unit,
    OnHidePane: () => scala.Unit = null,
    OnMinimizedStateChanged: () => scala.Unit = null,
    OnNewTab: /* tab */ IShellPaneTab => scala.Unit = null,
    OnPaneResized: () => scala.Unit = null,
    OnShowPane: () => scala.Unit = null,
    OnStarted: () => scala.Unit = null,
    OnStop: () => scala.Unit = null,
    OnTabSelected: () => scala.Unit = null,
    OnTabUnselected: () => scala.Unit = null
  ): IShellPaneContainerEvents = {
    val __obj = js.Dynamic.literal(Register = js.Any.fromFunction2(Register), Unregister = js.Any.fromFunction1(Unregister))
    if (OnHidePane != null) __obj.updateDynamic("OnHidePane")(js.Any.fromFunction0(OnHidePane))
    if (OnMinimizedStateChanged != null) __obj.updateDynamic("OnMinimizedStateChanged")(js.Any.fromFunction0(OnMinimizedStateChanged))
    if (OnNewTab != null) __obj.updateDynamic("OnNewTab")(js.Any.fromFunction1(OnNewTab))
    if (OnPaneResized != null) __obj.updateDynamic("OnPaneResized")(js.Any.fromFunction0(OnPaneResized))
    if (OnShowPane != null) __obj.updateDynamic("OnShowPane")(js.Any.fromFunction0(OnShowPane))
    if (OnStarted != null) __obj.updateDynamic("OnStarted")(js.Any.fromFunction0(OnStarted))
    if (OnStop != null) __obj.updateDynamic("OnStop")(js.Any.fromFunction0(OnStop))
    if (OnTabSelected != null) __obj.updateDynamic("OnTabSelected")(js.Any.fromFunction0(OnTabSelected))
    if (OnTabUnselected != null) __obj.updateDynamic("OnTabUnselected")(js.Any.fromFunction0(OnTabUnselected))
    __obj.asInstanceOf[IShellPaneContainerEvents]
  }
}

