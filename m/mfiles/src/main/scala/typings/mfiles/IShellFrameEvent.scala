package typings.mfiles

import typings.mfiles.MFiles.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IShellFrameEvent
  extends StObject
     with IEvents {
  
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
  
  inline def apply(Register: (Event, js.Function) => Double, Unregister: Double => Unit): IShellFrameEvent = {
    val __obj = js.Dynamic.literal(Register = js.Any.fromFunction2(Register), Unregister = js.Any.fromFunction1(Unregister))
    __obj.asInstanceOf[IShellFrameEvent]
  }
  
  extension [Self <: IShellFrameEvent](x: Self) {
    
    inline def setOnActiveListingChanged(value: (/* oldListing */ Null | IShellListing, /* newListing */ IShellListing) => Unit): Self = StObject.set(x, "OnActiveListingChanged", js.Any.fromFunction2(value))
    
    inline def setOnActiveListingChangedUndefined: Self = StObject.set(x, "OnActiveListingChanged", js.undefined)
    
    inline def setOnNewBottomPane(value: /* bottomPane */ IShellPaneContainer => Unit | IShellPaneContainerEvents): Self = StObject.set(x, "OnNewBottomPane", js.Any.fromFunction1(value))
    
    inline def setOnNewBottomPaneUndefined: Self = StObject.set(x, "OnNewBottomPane", js.undefined)
    
    inline def setOnNewCommands(value: /* commands */ ICommands => Unit | ICommandsEvents): Self = StObject.set(x, "OnNewCommands", js.Any.fromFunction1(value))
    
    inline def setOnNewCommandsUndefined: Self = StObject.set(x, "OnNewCommands", js.undefined)
    
    inline def setOnNewRightPane(value: /* rightPane */ IShellPaneContainer => Unit | IShellPaneContainerEvents): Self = StObject.set(x, "OnNewRightPane", js.Any.fromFunction1(value))
    
    inline def setOnNewRightPaneUndefined: Self = StObject.set(x, "OnNewRightPane", js.undefined)
    
    inline def setOnNewSearchPane(value: /* searchPane */ ISearchPane => Unit | ISearchPaneEvents): Self = StObject.set(x, "OnNewSearchPane", js.Any.fromFunction1(value))
    
    inline def setOnNewSearchPaneUndefined: Self = StObject.set(x, "OnNewSearchPane", js.undefined)
    
    inline def setOnNewShellListing(value: /* shellListing */ IShellListing => Unit | IShellListingEvents): Self = StObject.set(x, "OnNewShellListing", js.Any.fromFunction1(value))
    
    inline def setOnNewShellListingUndefined: Self = StObject.set(x, "OnNewShellListing", js.undefined)
    
    inline def setOnNewTaskPane(value: /* taskPane */ ITaskPane => Unit | ITaskPaneEvents): Self = StObject.set(x, "OnNewTaskPane", js.Any.fromFunction1(value))
    
    inline def setOnNewTaskPaneUndefined: Self = StObject.set(x, "OnNewTaskPane", js.undefined)
    
    inline def setOnShowMainMenu(value: () => Unit): Self = StObject.set(x, "OnShowMainMenu", js.Any.fromFunction0(value))
    
    inline def setOnShowMainMenuUndefined: Self = StObject.set(x, "OnShowMainMenu", js.undefined)
    
    inline def setOnStarted(value: () => Unit): Self = StObject.set(x, "OnStarted", js.Any.fromFunction0(value))
    
    inline def setOnStartedUndefined: Self = StObject.set(x, "OnStarted", js.undefined)
    
    inline def setOnStop(value: () => Unit): Self = StObject.set(x, "OnStop", js.Any.fromFunction0(value))
    
    inline def setOnStopUndefined: Self = StObject.set(x, "OnStop", js.undefined)
  }
}
