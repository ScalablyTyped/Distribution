package typings.mfiles

import typings.mfiles.MFiles.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISearchPaneEvents
  extends StObject
     with IEvents {
  
  var OnHidePane: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var OnShowPane: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var OnStarted: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var OnStop: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object ISearchPaneEvents {
  
  inline def apply(Register: (Event, js.Function) => Double, Unregister: Double => Unit): ISearchPaneEvents = {
    val __obj = js.Dynamic.literal(Register = js.Any.fromFunction2(Register), Unregister = js.Any.fromFunction1(Unregister))
    __obj.asInstanceOf[ISearchPaneEvents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISearchPaneEvents] (val x: Self) extends AnyVal {
    
    inline def setOnHidePane(value: () => Unit): Self = StObject.set(x, "OnHidePane", js.Any.fromFunction0(value))
    
    inline def setOnHidePaneUndefined: Self = StObject.set(x, "OnHidePane", js.undefined)
    
    inline def setOnShowPane(value: () => Unit): Self = StObject.set(x, "OnShowPane", js.Any.fromFunction0(value))
    
    inline def setOnShowPaneUndefined: Self = StObject.set(x, "OnShowPane", js.undefined)
    
    inline def setOnStarted(value: () => Unit): Self = StObject.set(x, "OnStarted", js.Any.fromFunction0(value))
    
    inline def setOnStartedUndefined: Self = StObject.set(x, "OnStarted", js.undefined)
    
    inline def setOnStop(value: () => Unit): Self = StObject.set(x, "OnStop", js.Any.fromFunction0(value))
    
    inline def setOnStopUndefined: Self = StObject.set(x, "OnStop", js.undefined)
  }
}
