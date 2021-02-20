package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVaultEntry extends StObject {
  
  val Events: IVaultEntryEvents = js.native
  
  def NotifyVaultEntry(ID: String, data1: js.Any, data2: js.Any): js.Any = js.native
  
  val Vault: IVault = js.native
  
  val VaultCore: IVaultCore = js.native
  
  val VaultUI: IVaultUI = js.native
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
  implicit class IVaultEntryMutableBuilder[Self <: IVaultEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvents(value: IVaultEntryEvents): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotifyVaultEntry(value: (String, js.Any, js.Any) => js.Any): Self = StObject.set(x, "NotifyVaultEntry", js.Any.fromFunction3(value))
    
    @scala.inline
    def setVault(value: IVault): Self = StObject.set(x, "Vault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVaultCore(value: IVaultCore): Self = StObject.set(x, "VaultCore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVaultUI(value: IVaultUI): Self = StObject.set(x, "VaultUI", value.asInstanceOf[js.Any])
  }
}
