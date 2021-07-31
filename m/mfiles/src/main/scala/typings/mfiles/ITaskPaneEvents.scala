package typings.mfiles

import typings.mfiles.MFiles.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITaskPaneEvents
  extends StObject
     with IEvents {
  
  var OnHidePane: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var OnShowPane: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var OnStarted: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var OnStop: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object ITaskPaneEvents {
  
  @scala.inline
  def apply(Register: (Event, js.Function) => Double, Unregister: Double => Unit): ITaskPaneEvents = {
    val __obj = js.Dynamic.literal(Register = js.Any.fromFunction2(Register), Unregister = js.Any.fromFunction1(Unregister))
    __obj.asInstanceOf[ITaskPaneEvents]
  }
  
  @scala.inline
  implicit class ITaskPaneEventsMutableBuilder[Self <: ITaskPaneEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnHidePane(value: () => Unit): Self = StObject.set(x, "OnHidePane", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnHidePaneUndefined: Self = StObject.set(x, "OnHidePane", js.undefined)
    
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
  }
}
