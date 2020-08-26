package typings.mfiles

import typings.mfiles.MFiles.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IShellUIEvents extends IEvents {
  var OnNewCommonDialogShellFrame: js.UndefOr[js.Function1[/* shellFrame */ IShellFrame, Unit | IShellFrameEvents]] = js.native
  var OnNewEmbeddedShellFrame: js.UndefOr[js.Function1[/* shellFrame */ IShellFrame, Unit | IShellFrameEvents]] = js.native
  var OnNewNormalShellFrame: js.UndefOr[js.Function1[/* shellFrame */ IShellFrame, Unit | IShellFrameEvents]] = js.native
  var OnNewShellFrame: js.UndefOr[js.Function1[/* shellFrame */ IShellFrame, Unit | IShellFrameEvents]] = js.native
  var OnStarted: js.UndefOr[js.Function0[Unit]] = js.native
  var OnStop: js.UndefOr[js.Function0[Unit]] = js.native
}

object IShellUIEvents {
  @scala.inline
  def apply(Register: (Event, js.Function) => Double, Unregister: Double => Unit): IShellUIEvents = {
    val __obj = js.Dynamic.literal(Register = js.Any.fromFunction2(Register), Unregister = js.Any.fromFunction1(Unregister))
    __obj.asInstanceOf[IShellUIEvents]
  }
  @scala.inline
  implicit class IShellUIEventsOps[Self <: IShellUIEvents] (val x: Self) extends AnyVal {
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
    def setOnNewCommonDialogShellFrame(value: /* shellFrame */ IShellFrame => Unit | IShellFrameEvents): Self = this.set("OnNewCommonDialogShellFrame", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnNewCommonDialogShellFrame: Self = this.set("OnNewCommonDialogShellFrame", js.undefined)
    @scala.inline
    def setOnNewEmbeddedShellFrame(value: /* shellFrame */ IShellFrame => Unit | IShellFrameEvents): Self = this.set("OnNewEmbeddedShellFrame", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnNewEmbeddedShellFrame: Self = this.set("OnNewEmbeddedShellFrame", js.undefined)
    @scala.inline
    def setOnNewNormalShellFrame(value: /* shellFrame */ IShellFrame => Unit | IShellFrameEvents): Self = this.set("OnNewNormalShellFrame", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnNewNormalShellFrame: Self = this.set("OnNewNormalShellFrame", js.undefined)
    @scala.inline
    def setOnNewShellFrame(value: /* shellFrame */ IShellFrame => Unit | IShellFrameEvents): Self = this.set("OnNewShellFrame", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnNewShellFrame: Self = this.set("OnNewShellFrame", js.undefined)
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

