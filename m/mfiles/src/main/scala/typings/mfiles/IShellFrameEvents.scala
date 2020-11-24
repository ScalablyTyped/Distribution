package typings.mfiles

import typings.mfiles.MFiles.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IShellFrameEvents extends IEvents {
  
  var OnActiveListingChanged: js.UndefOr[
    js.Function2[/* oldListing */ Null | IShellListing, /* newListing */ IShellListing, Unit]
  ] = js.native
  
  var OnNewBottomPane: js.UndefOr[
    js.Function1[/* bottomPane */ IShellPaneContainer, Unit | IShellPaneContainerEvents]
  ] = js.native
  
  var OnNewCommands: js.UndefOr[js.Function1[/* commands */ ICommands, Unit | ICommandsEvents]] = js.native
  
  var OnNewRightPane: js.UndefOr[
    js.Function1[/* rightPane */ IShellPaneContainer, Unit | IShellPaneContainerEvents]
  ] = js.native
  
  var OnNewSearchPane: js.UndefOr[js.Function1[/* searchPane */ ISearchPane, Unit | ISearchPaneEvents]] = js.native
  
  var OnNewShellListing: js.UndefOr[js.Function1[/* shellListing */ IShellListing, Unit | IShellListingEvents]] = js.native
  
  var OnNewTaskPane: js.UndefOr[js.Function1[/* taskPane */ ITaskPane, Unit | ITaskPaneEvents]] = js.native
  
  var OnShowMainMenu: js.UndefOr[js.Function0[Unit]] = js.native
  
  var OnStarted: js.UndefOr[js.Function0[Unit]] = js.native
  
  var OnStop: js.UndefOr[js.Function0[Unit]] = js.native
}
object IShellFrameEvents {
  
  @scala.inline
  def apply(Register: (Event, js.Function) => Double, Unregister: Double => Unit): IShellFrameEvents = {
    val __obj = js.Dynamic.literal(Register = js.Any.fromFunction2(Register), Unregister = js.Any.fromFunction1(Unregister))
    __obj.asInstanceOf[IShellFrameEvents]
  }
  
  @scala.inline
  implicit class IShellFrameEventsOps[Self <: IShellFrameEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOnActiveListingChanged(value: (/* oldListing */ Null | IShellListing, /* newListing */ IShellListing) => Unit): Self = this.set("OnActiveListingChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnActiveListingChanged: Self = this.set("OnActiveListingChanged", js.undefined)
    
    @scala.inline
    def setOnNewBottomPane(value: /* bottomPane */ IShellPaneContainer => Unit | IShellPaneContainerEvents): Self = this.set("OnNewBottomPane", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnNewBottomPane: Self = this.set("OnNewBottomPane", js.undefined)
    
    @scala.inline
    def setOnNewCommands(value: /* commands */ ICommands => Unit | ICommandsEvents): Self = this.set("OnNewCommands", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnNewCommands: Self = this.set("OnNewCommands", js.undefined)
    
    @scala.inline
    def setOnNewRightPane(value: /* rightPane */ IShellPaneContainer => Unit | IShellPaneContainerEvents): Self = this.set("OnNewRightPane", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnNewRightPane: Self = this.set("OnNewRightPane", js.undefined)
    
    @scala.inline
    def setOnNewSearchPane(value: /* searchPane */ ISearchPane => Unit | ISearchPaneEvents): Self = this.set("OnNewSearchPane", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnNewSearchPane: Self = this.set("OnNewSearchPane", js.undefined)
    
    @scala.inline
    def setOnNewShellListing(value: /* shellListing */ IShellListing => Unit | IShellListingEvents): Self = this.set("OnNewShellListing", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnNewShellListing: Self = this.set("OnNewShellListing", js.undefined)
    
    @scala.inline
    def setOnNewTaskPane(value: /* taskPane */ ITaskPane => Unit | ITaskPaneEvents): Self = this.set("OnNewTaskPane", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnNewTaskPane: Self = this.set("OnNewTaskPane", js.undefined)
    
    @scala.inline
    def setOnShowMainMenu(value: () => Unit): Self = this.set("OnShowMainMenu", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnShowMainMenu: Self = this.set("OnShowMainMenu", js.undefined)
    
    @scala.inline
    def setOnStarted(value: () => Unit): Self = this.set("OnStarted", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnStarted: Self = this.set("OnStarted", js.undefined)
    
    @scala.inline
    def setOnStop(value: () => Unit): Self = this.set("OnStop", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnStop: Self = this.set("OnStop", js.undefined)
  }
}
