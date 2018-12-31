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

