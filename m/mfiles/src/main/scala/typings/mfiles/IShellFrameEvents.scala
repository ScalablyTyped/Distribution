package typings.mfiles

import typings.mfiles.MFiles.Event
import org.scalablytyped.runtime.StObject
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
  implicit class IShellFrameEventsMutableBuilder[Self <: IShellFrameEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnActiveListingChanged(value: (/* oldListing */ Null | IShellListing, /* newListing */ IShellListing) => Unit): Self = StObject.set(x, "OnActiveListingChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnActiveListingChangedUndefined: Self = StObject.set(x, "OnActiveListingChanged", js.undefined)
    
    @scala.inline
    def setOnNewBottomPane(value: /* bottomPane */ IShellPaneContainer => Unit | IShellPaneContainerEvents): Self = StObject.set(x, "OnNewBottomPane", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnNewBottomPaneUndefined: Self = StObject.set(x, "OnNewBottomPane", js.undefined)
    
    @scala.inline
    def setOnNewCommands(value: /* commands */ ICommands => Unit | ICommandsEvents): Self = StObject.set(x, "OnNewCommands", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnNewCommandsUndefined: Self = StObject.set(x, "OnNewCommands", js.undefined)
    
    @scala.inline
    def setOnNewRightPane(value: /* rightPane */ IShellPaneContainer => Unit | IShellPaneContainerEvents): Self = StObject.set(x, "OnNewRightPane", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnNewRightPaneUndefined: Self = StObject.set(x, "OnNewRightPane", js.undefined)
    
    @scala.inline
    def setOnNewSearchPane(value: /* searchPane */ ISearchPane => Unit | ISearchPaneEvents): Self = StObject.set(x, "OnNewSearchPane", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnNewSearchPaneUndefined: Self = StObject.set(x, "OnNewSearchPane", js.undefined)
    
    @scala.inline
    def setOnNewShellListing(value: /* shellListing */ IShellListing => Unit | IShellListingEvents): Self = StObject.set(x, "OnNewShellListing", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnNewShellListingUndefined: Self = StObject.set(x, "OnNewShellListing", js.undefined)
    
    @scala.inline
    def setOnNewTaskPane(value: /* taskPane */ ITaskPane => Unit | ITaskPaneEvents): Self = StObject.set(x, "OnNewTaskPane", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnNewTaskPaneUndefined: Self = StObject.set(x, "OnNewTaskPane", js.undefined)
    
    @scala.inline
    def setOnShowMainMenu(value: () => Unit): Self = StObject.set(x, "OnShowMainMenu", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnShowMainMenuUndefined: Self = StObject.set(x, "OnShowMainMenu", js.undefined)
    
    @scala.inline
    def setOnStarted(value: () => Unit): Self = StObject.set(x, "OnStarted", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnStartedUndefined: Self = StObject.set(x, "OnStarted", js.undefined)
    
    @scala.inline
    def setOnStop(value: () => Unit): Self = StObject.set(x, "OnStop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnStopUndefined: Self = StObject.set(x, "OnStop", js.undefined)
  }
}
