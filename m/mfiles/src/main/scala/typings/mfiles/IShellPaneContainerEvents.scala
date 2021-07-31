package typings.mfiles

import typings.mfiles.MFiles.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IShellPaneContainerEvents
  extends StObject
     with IEvents {
  
  var OnHidePane: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var OnMinimizedStateChanged: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var OnNewTab: js.UndefOr[js.Function1[/* tab */ IShellPaneTab, Unit]] = js.undefined
  
  var OnPaneResized: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var OnShowPane: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var OnStarted: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var OnStop: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var OnTabSelected: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var OnTabUnselected: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object IShellPaneContainerEvents {
  
  @scala.inline
  def apply(Register: (Event, js.Function) => Double, Unregister: Double => Unit): IShellPaneContainerEvents = {
    val __obj = js.Dynamic.literal(Register = js.Any.fromFunction2(Register), Unregister = js.Any.fromFunction1(Unregister))
    __obj.asInstanceOf[IShellPaneContainerEvents]
  }
  
  @scala.inline
  implicit class IShellPaneContainerEventsMutableBuilder[Self <: IShellPaneContainerEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnHidePane(value: () => Unit): Self = StObject.set(x, "OnHidePane", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnHidePaneUndefined: Self = StObject.set(x, "OnHidePane", js.undefined)
    
    @scala.inline
    def setOnMinimizedStateChanged(value: () => Unit): Self = StObject.set(x, "OnMinimizedStateChanged", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnMinimizedStateChangedUndefined: Self = StObject.set(x, "OnMinimizedStateChanged", js.undefined)
    
    @scala.inline
    def setOnNewTab(value: /* tab */ IShellPaneTab => Unit): Self = StObject.set(x, "OnNewTab", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnNewTabUndefined: Self = StObject.set(x, "OnNewTab", js.undefined)
    
    @scala.inline
    def setOnPaneResized(value: () => Unit): Self = StObject.set(x, "OnPaneResized", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnPaneResizedUndefined: Self = StObject.set(x, "OnPaneResized", js.undefined)
    
    @scala.inline
    def setOnShowPane(value: () => Unit): Self = StObject.set(x, "OnShowPane", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnShowPaneUndefined: Self = StObject.set(x, "OnShowPane", js.undefined)
    
    @scala.inline
    def setOnStarted(value: () => Unit): Self = StObject.set(x, "OnStarted", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnStartedUndefined: Self = StObject.set(x, "OnStarted", js.undefined)
    
    @scala.inline
    def setOnStop(value: () => Unit): Self = StObject.set(x, "OnStop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnStopUndefined: Self = StObject.set(x, "OnStop", js.undefined)
    
    @scala.inline
    def setOnTabSelected(value: () => Unit): Self = StObject.set(x, "OnTabSelected", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnTabSelectedUndefined: Self = StObject.set(x, "OnTabSelected", js.undefined)
    
    @scala.inline
    def setOnTabUnselected(value: () => Unit): Self = StObject.set(x, "OnTabUnselected", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnTabUnselectedUndefined: Self = StObject.set(x, "OnTabUnselected", js.undefined)
  }
}
