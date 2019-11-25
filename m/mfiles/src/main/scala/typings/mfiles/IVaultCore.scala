package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultCore extends js.Object {
  val Events: IVaultCoreEvents
  val ServerVault: IVault
}

object IVaultCore {
  @scala.inline
  def apply(Events: IVaultCoreEvents, ServerVault: IVault): IVaultCore = {
    val __obj = js.Dynamic.literal(Events = Events.asInstanceOf[js.Any], ServerVault = ServerVault.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IVaultCore]
  }
}

