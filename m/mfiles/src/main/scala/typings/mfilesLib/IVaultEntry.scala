package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultEntry extends js.Object {
  val Events: IVaultEntryEvents
  val Vault: IVault
  val VaultCore: IVaultCore
  val VaultUI: IVaultUI
  def NotifyVaultEntry(ID: java.lang.String, data1: js.Any, data2: js.Any): js.Any
}

object IVaultEntry {
  @scala.inline
  def apply(
    Events: IVaultEntryEvents,
    NotifyVaultEntry: js.Function3[java.lang.String, js.Any, js.Any, js.Any],
    Vault: IVault,
    VaultCore: IVaultCore,
    VaultUI: IVaultUI
  ): IVaultEntry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Events")(Events)
    __obj.updateDynamic("NotifyVaultEntry")(NotifyVaultEntry)
    __obj.updateDynamic("Vault")(Vault)
    __obj.updateDynamic("VaultCore")(VaultCore)
    __obj.updateDynamic("VaultUI")(VaultUI)
    __obj.asInstanceOf[IVaultEntry]
  }
}

