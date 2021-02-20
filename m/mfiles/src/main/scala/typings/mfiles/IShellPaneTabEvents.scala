package typings.mfiles

import typings.mfiles.MFiles.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IShellPaneTabEvents extends IEvents {
  
  var OnHideTab: js.UndefOr[js.Function0[Unit]] = js.native
  
  var OnShowTab: js.UndefOr[js.Function0[Unit]] = js.native
  
  var OnStarted: js.UndefOr[js.Function0[Unit]] = js.native
  
  var OnStop: js.UndefOr[js.Function0[Unit]] = js.native
  
  var OnTabSelected: js.UndefOr[js.Function0[Unit]] = js.native
  
  var OnTabUnselected: js.UndefOr[js.Function0[Unit]] = js.native
}
object IShellPaneTabEvents {
  
  @scala.inline
  def apply(Register: (Event, js.Function) => Double, Unregister: Double => Unit): IShellPaneTabEvents = {
    val __obj = js.Dynamic.literal(Register = js.Any.fromFunction2(Register), Unregister = js.Any.fromFunction1(Unregister))
    __obj.asInstanceOf[IShellPaneTabEvents]
  }
  
  @scala.inline
  implicit class IShellPaneTabEventsMutableBuilder[Self <: IShellPaneTabEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnHideTab(value: () => Unit): Self = StObject.set(x, "OnHideTab", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnHideTabUndefined: Self = StObject.set(x, "OnHideTab", js.undefined)
    
    @scala.inline
    def setOnShowTab(value: () => Unit): Self = StObject.set(x, "OnShowTab", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnShowTabUndefined: Self = StObject.set(x, "OnShowTab", js.undefined)
    
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
