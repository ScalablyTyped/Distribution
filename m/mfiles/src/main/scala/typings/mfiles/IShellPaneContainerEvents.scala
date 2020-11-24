package typings.mfiles

import typings.mfiles.MFiles.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IShellPaneContainerEvents extends IEvents {
  
  var OnHidePane: js.UndefOr[js.Function0[Unit]] = js.native
  
  var OnMinimizedStateChanged: js.UndefOr[js.Function0[Unit]] = js.native
  
  var OnNewTab: js.UndefOr[js.Function1[/* tab */ IShellPaneTab, Unit]] = js.native
  
  var OnPaneResized: js.UndefOr[js.Function0[Unit]] = js.native
  
  var OnShowPane: js.UndefOr[js.Function0[Unit]] = js.native
  
  var OnStarted: js.UndefOr[js.Function0[Unit]] = js.native
  
  var OnStop: js.UndefOr[js.Function0[Unit]] = js.native
  
  var OnTabSelected: js.UndefOr[js.Function0[Unit]] = js.native
  
  var OnTabUnselected: js.UndefOr[js.Function0[Unit]] = js.native
}
object IShellPaneContainerEvents {
  
  @scala.inline
  def apply(Register: (Event, js.Function) => Double, Unregister: Double => Unit): IShellPaneContainerEvents = {
    val __obj = js.Dynamic.literal(Register = js.Any.fromFunction2(Register), Unregister = js.Any.fromFunction1(Unregister))
    __obj.asInstanceOf[IShellPaneContainerEvents]
  }
  
  @scala.inline
  implicit class IShellPaneContainerEventsOps[Self <: IShellPaneContainerEvents] (val x: Self) extends AnyVal {
    
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
    def setOnHidePane(value: () => Unit): Self = this.set("OnHidePane", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnHidePane: Self = this.set("OnHidePane", js.undefined)
    
    @scala.inline
    def setOnMinimizedStateChanged(value: () => Unit): Self = this.set("OnMinimizedStateChanged", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnMinimizedStateChanged: Self = this.set("OnMinimizedStateChanged", js.undefined)
    
    @scala.inline
    def setOnNewTab(value: /* tab */ IShellPaneTab => Unit): Self = this.set("OnNewTab", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnNewTab: Self = this.set("OnNewTab", js.undefined)
    
    @scala.inline
    def setOnPaneResized(value: () => Unit): Self = this.set("OnPaneResized", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnPaneResized: Self = this.set("OnPaneResized", js.undefined)
    
    @scala.inline
    def setOnShowPane(value: () => Unit): Self = this.set("OnShowPane", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnShowPane: Self = this.set("OnShowPane", js.undefined)
    
    @scala.inline
    def setOnStarted(value: () => Unit): Self = this.set("OnStarted", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnStarted: Self = this.set("OnStarted", js.undefined)
    
    @scala.inline
    def setOnStop(value: () => Unit): Self = this.set("OnStop", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnStop: Self = this.set("OnStop", js.undefined)
    
    @scala.inline
    def setOnTabSelected(value: () => Unit): Self = this.set("OnTabSelected", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnTabSelected: Self = this.set("OnTabSelected", js.undefined)
    
    @scala.inline
    def setOnTabUnselected(value: () => Unit): Self = this.set("OnTabUnselected", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnTabUnselected: Self = this.set("OnTabUnselected", js.undefined)
  }
}
