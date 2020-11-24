package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVaultCore extends js.Object {
  
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
  implicit class IVaultCoreOps[Self <: IVaultCore] (val x: Self) extends AnyVal {
    
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
    def setEvents(value: IVaultCoreEvents): Self = this.set("Events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerVault(value: IVault): Self = this.set("ServerVault", value.asInstanceOf[js.Any])
  }
}
