package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IVaultEntry extends StObject {
  
  val Events: IVaultEntryEvents
  
  def NotifyVaultEntry(ID: String, data1: js.Any, data2: js.Any): js.Any
  
  val Vault: IVault
  
  val VaultCore: IVaultCore
  
  val VaultUI: IVaultUI
}
object IVaultEntry {
  
  inline def apply(
    Events: IVaultEntryEvents,
    NotifyVaultEntry: (String, js.Any, js.Any) => js.Any,
    Vault: IVault,
    VaultCore: IVaultCore,
    VaultUI: IVaultUI
  ): IVaultEntry = {
    val __obj = js.Dynamic.literal(Events = Events.asInstanceOf[js.Any], NotifyVaultEntry = js.Any.fromFunction3(NotifyVaultEntry), Vault = Vault.asInstanceOf[js.Any], VaultCore = VaultCore.asInstanceOf[js.Any], VaultUI = VaultUI.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVaultEntry]
  }
  
  extension [Self <: IVaultEntry](x: Self) {
    
    inline def setEvents(value: IVaultEntryEvents): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    inline def setNotifyVaultEntry(value: (String, js.Any, js.Any) => js.Any): Self = StObject.set(x, "NotifyVaultEntry", js.Any.fromFunction3(value))
    
    inline def setVault(value: IVault): Self = StObject.set(x, "Vault", value.asInstanceOf[js.Any])
    
    inline def setVaultCore(value: IVaultCore): Self = StObject.set(x, "VaultCore", value.asInstanceOf[js.Any])
    
    inline def setVaultUI(value: IVaultUI): Self = StObject.set(x, "VaultUI", value.asInstanceOf[js.Any])
  }
}
