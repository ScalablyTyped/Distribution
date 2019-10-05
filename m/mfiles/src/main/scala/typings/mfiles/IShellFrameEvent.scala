package typings.mfiles

import typings.mfiles.MFiles.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShellFrameEvent extends IEvents {
  var OnActiveListingChanged: js.UndefOr[
    js.Function2[/* oldListing */ Null | IShellListing, /* newListing */ IShellListing, Unit]
  ] = js.undefined
  var OnNewBottomPane: js.UndefOr[
    js.Function1[/* bottomPane */ IShellPaneContainer, Unit | IShellPaneContainerEvents]
  ] = js.undefined
  var OnNewCommands: js.UndefOr[js.Function1[/* commands */ ICommands, Unit | ICommandsEvents]] = js.undefined
  var OnNewRightPane: js.UndefOr[
    js.Function1[/* rightPane */ IShellPaneContainer, Unit | IShellPaneContainerEvents]
  ] = js.undefined
  var OnNewSearchPane: js.UndefOr[js.Function1[/* searchPane */ ISearchPane, Unit | ISearchPaneEvents]] = js.undefined
  var OnNewShellListing: js.UndefOr[js.Function1[/* shellListing */ IShellListing, Unit | IShellListingEvents]] = js.undefined
  var OnNewTaskPane: js.UndefOr[js.Function1[/* taskPane */ ITaskPane, Unit | ITaskPaneEvents]] = js.undefined
  var OnShowMainMenu: js.UndefOr[js.Function0[Unit]] = js.undefined
  var OnStarted: js.UndefOr[js.Function0[Unit]] = js.undefined
  var OnStop: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object IShellFrameEvent {
  @scala.inline
  def apply(
    Register: (Event, js.Function) => Double,
    Unregister: Double => Unit,
    OnActiveListingChanged: (/* oldListing */ Null | IShellListing, /* newListing */ IShellListing) => Unit = null,
    OnNewBottomPane: /* bottomPane */ IShellPaneContainer => Unit | IShellPaneContainerEvents = null,
    OnNewCommands: /* commands */ ICommands => Unit | ICommandsEvents = null,
    OnNewRightPane: /* rightPane */ IShellPaneContainer => Unit | IShellPaneContainerEvents = null,
    OnNewSearchPane: /* searchPane */ ISearchPane => Unit | ISearchPaneEvents = null,
    OnNewShellListing: /* shellListing */ IShellListing => Unit | IShellListingEvents = null,
    OnNewTaskPane: /* taskPane */ ITaskPane => Unit | ITaskPaneEvents = null,
    OnShowMainMenu: () => Unit = null,
    OnStarted: () => Unit = null,
    OnStop: () => Unit = null
  ): IShellFrameEvent = {
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
    __obj.asInstanceOf[IShellFrameEvent]
  }
}

