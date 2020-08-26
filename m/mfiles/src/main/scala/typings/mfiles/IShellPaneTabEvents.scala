package typings.mfiles

import typings.mfiles.MFiles.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class IShellPaneTabEventsOps[Self <: IShellPaneTabEvents] (val x: Self) extends AnyVal {
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
    def setOnHideTab(value: () => Unit): Self = this.set("OnHideTab", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnHideTab: Self = this.set("OnHideTab", js.undefined)
    @scala.inline
    def setOnShowTab(value: () => Unit): Self = this.set("OnShowTab", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnShowTab: Self = this.set("OnShowTab", js.undefined)
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

