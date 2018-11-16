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

