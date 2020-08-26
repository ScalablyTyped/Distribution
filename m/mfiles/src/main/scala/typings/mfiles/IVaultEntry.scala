package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultEntry extends js.Object {
  val Events: IVaultEntryEvents = js.native
  val Vault: IVault = js.native
  val VaultCore: IVaultCore = js.native
  val VaultUI: IVaultUI = js.native
  def NotifyVaultEntry(ID: String, data1: js.Any, data2: js.Any): js.Any = js.native
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
  @scala.inline
  implicit class IVaultEntryOps[Self <: IVaultEntry] (val x: Self) extends AnyVal {
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
    def setEvents(value: IVaultEntryEvents): Self = this.set("Events", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotifyVaultEntry(value: (String, js.Any, js.Any) => js.Any): Self = this.set("NotifyVaultEntry", js.Any.fromFunction3(value))
    @scala.inline
    def setVault(value: IVault): Self = this.set("Vault", value.asInstanceOf[js.Any])
    @scala.inline
    def setVaultCore(value: IVaultCore): Self = this.set("VaultCore", value.asInstanceOf[js.Any])
    @scala.inline
    def setVaultUI(value: IVaultUI): Self = this.set("VaultUI", value.asInstanceOf[js.Any])
  }
  
}

