package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultCoreEvents extends IEvents {
  var OnNewVaultEntry: js.UndefOr[js.Function1[/* vaultEntry */ IVaultEntry, scala.Unit | IVaultEntryEvents]] = js.undefined
  var OnStarted: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var OnStop: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object IVaultCoreEvents {
  @scala.inline
  def apply(
    Register: js.Function2[mfilesLib.MFilesNs.Event, js.Function, scala.Double],
    Unregister: js.Function1[scala.Double, scala.Unit],
    OnNewVaultEntry: js.Function1[/* vaultEntry */ IVaultEntry, scala.Unit | IVaultEntryEvents] = null,
    OnStarted: js.Function0[scala.Unit] = null,
    OnStop: js.Function0[scala.Unit] = null
  ): IVaultCoreEvents = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Register")(Register)
    __obj.updateDynamic("Unregister")(Unregister)
    if (OnNewVaultEntry != null) __obj.updateDynamic("OnNewVaultEntry")(OnNewVaultEntry)
    if (OnStarted != null) __obj.updateDynamic("OnStarted")(OnStarted)
    if (OnStop != null) __obj.updateDynamic("OnStop")(OnStop)
    __obj.asInstanceOf[IVaultCoreEvents]
  }
}

