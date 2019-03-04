package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShellFrameEvents extends IEvents {
  var OnActiveListingChanged: js.UndefOr[
    js.Function2[
      /* oldListing */ scala.Null | IShellListing, 
      /* newListing */ IShellListing, 
      scala.Unit
    ]
  ] = js.undefined
  var OnNewBottomPane: js.UndefOr[
    js.Function1[/* bottomPane */ IShellPaneContainer, scala.Unit | IShellPaneContainerEvents]
  ] = js.undefined
  var OnNewCommands: js.UndefOr[js.Function1[/* commands */ ICommands, scala.Unit | ICommandsEvents]] = js.undefined
  var OnNewRightPane: js.UndefOr[
    js.Function1[/* rightPane */ IShellPaneContainer, scala.Unit | IShellPaneContainerEvents]
  ] = js.undefined
  var OnNewSearchPane: js.UndefOr[js.Function1[/* searchPane */ ISearchPane, scala.Unit | ISearchPaneEvents]] = js.undefined
  var OnNewShellListing: js.UndefOr[js.Function1[/* shellListing */ IShellListing, scala.Unit | IShellListingEvents]] = js.undefined
  var OnNewTaskPane: js.UndefOr[js.Function1[/* taskPane */ ITaskPane, scala.Unit | ITaskPaneEvents]] = js.undefined
  var OnShowMainMenu: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var OnStarted: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var OnStop: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object IShellFrameEvents {
  @scala.inline
  def apply(
    Register: js.Function2[mfilesLib.MFilesNs.Event, js.Function, scala.Double],
    Unregister: js.Function1[scala.Double, scala.Unit],
    OnActiveListingChanged: js.Function2[
      /* oldListing */ scala.Null | IShellListing, 
      /* newListing */ IShellListing, 
      scala.Unit
    ] = null,
    OnNewBottomPane: js.Function1[/* bottomPane */ IShellPaneContainer, scala.Unit | IShellPaneContainerEvents] = null,
    OnNewCommands: js.Function1[/* commands */ ICommands, scala.Unit | ICommandsEvents] = null,
    OnNewRightPane: js.Function1[/* rightPane */ IShellPaneContainer, scala.Unit | IShellPaneContainerEvents] = null,
    OnNewSearchPane: js.Function1[/* searchPane */ ISearchPane, scala.Unit | ISearchPaneEvents] = null,
    OnNewShellListing: js.Function1[/* shellListing */ IShellListing, scala.Unit | IShellListingEvents] = null,
    OnNewTaskPane: js.Function1[/* taskPane */ ITaskPane, scala.Unit | ITaskPaneEvents] = null,
    OnShowMainMenu: js.Function0[scala.Unit] = null,
    OnStarted: js.Function0[scala.Unit] = null,
    OnStop: js.Function0[scala.Unit] = null
  ): IShellFrameEvents = {
    val __obj = js.Dynamic.literal(Register = Register, Unregister = Unregister)
    if (OnActiveListingChanged != null) __obj.updateDynamic("OnActiveListingChanged")(OnActiveListingChanged)
    if (OnNewBottomPane != null) __obj.updateDynamic("OnNewBottomPane")(OnNewBottomPane)
    if (OnNewCommands != null) __obj.updateDynamic("OnNewCommands")(OnNewCommands)
    if (OnNewRightPane != null) __obj.updateDynamic("OnNewRightPane")(OnNewRightPane)
    if (OnNewSearchPane != null) __obj.updateDynamic("OnNewSearchPane")(OnNewSearchPane)
    if (OnNewShellListing != null) __obj.updateDynamic("OnNewShellListing")(OnNewShellListing)
    if (OnNewTaskPane != null) __obj.updateDynamic("OnNewTaskPane")(OnNewTaskPane)
    if (OnShowMainMenu != null) __obj.updateDynamic("OnShowMainMenu")(OnShowMainMenu)
    if (OnStarted != null) __obj.updateDynamic("OnStarted")(OnStarted)
    if (OnStop != null) __obj.updateDynamic("OnStop")(OnStop)
    __obj.asInstanceOf[IShellFrameEvents]
  }
}

