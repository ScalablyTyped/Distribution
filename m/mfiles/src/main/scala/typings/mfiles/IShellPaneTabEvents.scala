package typings.mfiles

import typings.mfiles.MFiles.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IShellPaneTabEvents
  extends StObject
     with IEvents {
  
  var OnHideTab: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var OnShowTab: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var OnStarted: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var OnStop: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var OnTabSelected: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var OnTabUnselected: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object IShellPaneTabEvents {
  
  inline def apply(Register: (Event, js.Function) => Double, Unregister: Double => Unit): IShellPaneTabEvents = {
    val __obj = js.Dynamic.literal(Register = js.Any.fromFunction2(Register), Unregister = js.Any.fromFunction1(Unregister))
    __obj.asInstanceOf[IShellPaneTabEvents]
  }
  
  extension [Self <: IShellPaneTabEvents](x: Self) {
    
    inline def setOnHideTab(value: () => Unit): Self = StObject.set(x, "OnHideTab", js.Any.fromFunction0(value))
    
    inline def setOnHideTabUndefined: Self = StObject.set(x, "OnHideTab", js.undefined)
    
    inline def setOnShowTab(value: () => Unit): Self = StObject.set(x, "OnShowTab", js.Any.fromFunction0(value))
    
    inline def setOnShowTabUndefined: Self = StObject.set(x, "OnShowTab", js.undefined)
    
    inline def setOnStarted(value: () => Unit): Self = StObject.set(x, "OnStarted", js.Any.fromFunction0(value))
    
    inline def setOnStartedUndefined: Self = StObject.set(x, "OnStarted", js.undefined)
    
    inline def setOnStop(value: () => Unit): Self = StObject.set(x, "OnStop", js.Any.fromFunction0(value))
    
    inline def setOnStopUndefined: Self = StObject.set(x, "OnStop", js.undefined)
    
    inline def setOnTabSelected(value: () => Unit): Self = StObject.set(x, "OnTabSelected", js.Any.fromFunction0(value))
    
    inline def setOnTabSelectedUndefined: Self = StObject.set(x, "OnTabSelected", js.undefined)
    
    inline def setOnTabUnselected(value: () => Unit): Self = StObject.set(x, "OnTabUnselected", js.Any.fromFunction0(value))
    
    inline def setOnTabUnselectedUndefined: Self = StObject.set(x, "OnTabUnselected", js.undefined)
  }
}
