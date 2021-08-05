package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IVaultCore extends StObject {
  
  val Events: IVaultCoreEvents
  
  val ServerVault: IVault
}
object IVaultCore {
  
  inline def apply(Events: IVaultCoreEvents, ServerVault: IVault): IVaultCore = {
    val __obj = js.Dynamic.literal(Events = Events.asInstanceOf[js.Any], ServerVault = ServerVault.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVaultCore]
  }
  
  extension [Self <: IVaultCore](x: Self) {
    
    inline def setEvents(value: IVaultCoreEvents): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    inline def setServerVault(value: IVault): Self = StObject.set(x, "ServerVault", value.asInstanceOf[js.Any])
  }
}
