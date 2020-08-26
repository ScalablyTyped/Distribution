package typings.mfiles

import typings.mfiles.MFiles.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISearchPaneEvents extends IEvents {
  var OnHidePane: js.UndefOr[js.Function0[Unit]] = js.native
  var OnShowPane: js.UndefOr[js.Function0[Unit]] = js.native
  var OnStarted: js.UndefOr[js.Function0[Unit]] = js.native
  var OnStop: js.UndefOr[js.Function0[Unit]] = js.native
}

object ISearchPaneEvents {
  @scala.inline
  def apply(Register: (Event, js.Function) => Double, Unregister: Double => Unit): ISearchPaneEvents = {
    val __obj = js.Dynamic.literal(Register = js.Any.fromFunction2(Register), Unregister = js.Any.fromFunction1(Unregister))
    __obj.asInstanceOf[ISearchPaneEvents]
  }
  @scala.inline
  implicit class ISearchPaneEventsOps[Self <: ISearchPaneEvents] (val x: Self) extends AnyVal {
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
  }
  
}

