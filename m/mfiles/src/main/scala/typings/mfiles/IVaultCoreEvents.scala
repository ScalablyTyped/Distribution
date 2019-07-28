package typings.mfiles

import typings.mfiles.MFilesNs.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultCoreEvents extends IEvents {
  var OnNewVaultEntry: js.UndefOr[js.Function1[/* vaultEntry */ IVaultEntry, Unit | IVaultEntryEvents]] = js.undefined
  var OnStarted: js.UndefOr[js.Function0[Unit]] = js.undefined
  var OnStop: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object IVaultCoreEvents {
  @scala.inline
  def apply(
    Register: (Event, js.Function) => Double,
    Unregister: Double => Unit,
    OnNewVaultEntry: /* vaultEntry */ IVaultEntry => Unit | IVaultEntryEvents = null,
    OnStarted: () => Unit = null,
    OnStop: () => Unit = null
  ): IVaultCoreEvents = {
    val __obj = js.Dynamic.literal(Register = js.Any.fromFunction2(Register), Unregister = js.Any.fromFunction1(Unregister))
    if (OnNewVaultEntry != null) __obj.updateDynamic("OnNewVaultEntry")(js.Any.fromFunction1(OnNewVaultEntry))
    if (OnStarted != null) __obj.updateDynamic("OnStarted")(js.Any.fromFunction0(OnStarted))
    if (OnStop != null) __obj.updateDynamic("OnStop")(js.Any.fromFunction0(OnStop))
    __obj.asInstanceOf[IVaultCoreEvents]
  }
}

