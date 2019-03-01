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
    Register: js.Function2[mfilesLib.MFilesNs.Event, js.Function, scala.Double],
    Unregister: js.Function1[scala.Double, scala.Unit],
    OnHidePane: js.Function0[scala.Unit] = null,
    OnMinimizedStateChanged: js.Function0[scala.Unit] = null,
    OnNewTab: js.Function1[/* tab */ IShellPaneTab, scala.Unit] = null,
    OnPaneResized: js.Function0[scala.Unit] = null,
    OnShowPane: js.Function0[scala.Unit] = null,
    OnStarted: js.Function0[scala.Unit] = null,
    OnStop: js.Function0[scala.Unit] = null,
    OnTabSelected: js.Function0[scala.Unit] = null,
    OnTabUnselected: js.Function0[scala.Unit] = null
  ): IShellPaneContainerEvents = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Register")(Register)
    __obj.updateDynamic("Unregister")(Unregister)
    if (OnHidePane != null) __obj.updateDynamic("OnHidePane")(OnHidePane)
    if (OnMinimizedStateChanged != null) __obj.updateDynamic("OnMinimizedStateChanged")(OnMinimizedStateChanged)
    if (OnNewTab != null) __obj.updateDynamic("OnNewTab")(OnNewTab)
    if (OnPaneResized != null) __obj.updateDynamic("OnPaneResized")(OnPaneResized)
    if (OnShowPane != null) __obj.updateDynamic("OnShowPane")(OnShowPane)
    if (OnStarted != null) __obj.updateDynamic("OnStarted")(OnStarted)
    if (OnStop != null) __obj.updateDynamic("OnStop")(OnStop)
    if (OnTabSelected != null) __obj.updateDynamic("OnTabSelected")(OnTabSelected)
    if (OnTabUnselected != null) __obj.updateDynamic("OnTabUnselected")(OnTabUnselected)
    __obj.asInstanceOf[IShellPaneContainerEvents]
  }
}

