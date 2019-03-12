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
    Register: (mfilesLib.MFilesNs.Event, js.Function) => scala.Double,
    Unregister: scala.Double => scala.Unit,
    OnActiveListingChanged: (/* oldListing */ scala.Null | IShellListing, /* newListing */ IShellListing) => scala.Unit = null,
    OnNewBottomPane: /* bottomPane */ IShellPaneContainer => scala.Unit | IShellPaneContainerEvents = null,
    OnNewCommands: /* commands */ ICommands => scala.Unit | ICommandsEvents = null,
    OnNewRightPane: /* rightPane */ IShellPaneContainer => scala.Unit | IShellPaneContainerEvents = null,
    OnNewSearchPane: /* searchPane */ ISearchPane => scala.Unit | ISearchPaneEvents = null,
    OnNewShellListing: /* shellListing */ IShellListing => scala.Unit | IShellListingEvents = null,
    OnNewTaskPane: /* taskPane */ ITaskPane => scala.Unit | ITaskPaneEvents = null,
    OnShowMainMenu: () => scala.Unit = null,
    OnStarted: () => scala.Unit = null,
    OnStop: () => scala.Unit = null
  ): IShellFrameEvents = {
    val __obj = js.Dynamic.literal(Register = js.Any.fromFunction2(Register), Unregister = js.Any.fromFunction1(Unregister))
    if (OnActiveListingChanged != null) __obj.updateDynamic("OnActiveListingChanged")(js.Any.fromFunction2(OnActiveListingChanged))
    if (OnNewBottomPane != null) __obj.updateDynamic("OnNewBottomPane")(js.Any.fromFunction1(OnNewBottomPane))
    if (OnNewCommands != null) __obj.updateDynamic("OnNewCommands")(js.Any.fromFunction1(OnNewCommands))
    if (OnNewRightPane != null) __obj.updateDynamic("OnNewRightPane")(js.Any.fromFunction1(OnNewRightPane))
    if (OnNewSearchPane != null) __obj.updateDynamic("OnNewSearchPane")(js.Any.fromFunction1(OnNewSearchPane))
    if (OnNewShellListing != null) __obj.updateDynamic("OnNewShellListing")(js.Any.fromFunction1(OnNewShellListing))
    if (OnNewTaskPane != null) __obj.updateDynamic("OnNewTaskPane")(js.Any.fromFunction1(OnNewTaskPane))
    if (OnShowMainMenu != null) __obj.updateDynamic("OnShowMainMenu")(js.Any.fromFunction0(OnShowMainMenu))
    if (OnStarted != null) __obj.updateDynamic("OnStarted")(js.Any.fromFunction0(OnStarted))
    if (OnStop != null) __obj.updateDynamic("OnStop")(js.Any.fromFunction0(OnStop))
    __obj.asInstanceOf[IShellFrameEvents]
  }
}

