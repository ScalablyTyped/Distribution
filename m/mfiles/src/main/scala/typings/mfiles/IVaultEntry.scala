package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultEntry extends js.Object {
  val Events: IVaultEntryEvents
  val Vault: IVault
  val VaultCore: IVaultCore
  val VaultUI: IVaultUI
  def NotifyVaultEntry(ID: String, data1: js.Any, data2: js.Any): js.Any
}

object IVaultEntry {
  @scala.inline
  def apply(
    Events: IVaultEntryEvents,
    NotifyVaultEntry: (String, js.Any, js.Any) => js.Any,
    Vault: IVault,
    VaultCore: IVaultCore,
    VaultUI: IVaultUI
  ): IVaultEntry = {
    val __obj = js.Dynamic.literal(Events = Events.asInstanceOf[js.Any], NotifyVaultEntry = js.Any.fromFunction3(NotifyVaultEntry), Vault = Vault.asInstanceOf[js.Any], VaultCore = VaultCore.asInstanceOf[js.Any], VaultUI = VaultUI.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVaultEntry]
  }
}

