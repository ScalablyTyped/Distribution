package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVaultCore extends StObject {
  
  val Events: IVaultCoreEvents = js.native
  
  val ServerVault: IVault = js.native
}
object IVaultCore {
  
  @scala.inline
  def apply(Events: IVaultCoreEvents, ServerVault: IVault): IVaultCore = {
    val __obj = js.Dynamic.literal(Events = Events.asInstanceOf[js.Any], ServerVault = ServerVault.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVaultCore]
  }
  
  @scala.inline
  implicit class IVaultCoreMutableBuilder[Self <: IVaultCore] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvents(value: IVaultCoreEvents): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerVault(value: IVault): Self = StObject.set(x, "ServerVault", value.asInstanceOf[js.Any])
  }
}
