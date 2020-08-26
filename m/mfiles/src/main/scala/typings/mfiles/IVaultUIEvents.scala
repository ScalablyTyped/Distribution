package typings.mfiles

import typings.mfiles.MFiles.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultUIEvents extends IEvents {
  var OnNewVaultEntry: js.UndefOr[js.Function1[/* vaultEntry */ IVaultEntry, Unit | IVaultEntryEvents]] = js.native
  var OnStarted: js.UndefOr[js.Function0[Unit]] = js.native
  var OnStop: js.UndefOr[js.Function0[Unit]] = js.native
}

object IVaultUIEvents {
  @scala.inline
  def apply(Register: (Event, js.Function) => Double, Unregister: Double => Unit): IVaultUIEvents = {
    val __obj = js.Dynamic.literal(Register = js.Any.fromFunction2(Register), Unregister = js.Any.fromFunction1(Unregister))
    __obj.asInstanceOf[IVaultUIEvents]
  }
  @scala.inline
  implicit class IVaultUIEventsOps[Self <: IVaultUIEvents] (val x: Self) extends AnyVal {
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
    def setOnNewVaultEntry(value: /* vaultEntry */ IVaultEntry => Unit | IVaultEntryEvents): Self = this.set("OnNewVaultEntry", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnNewVaultEntry: Self = this.set("OnNewVaultEntry", js.undefined)
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

