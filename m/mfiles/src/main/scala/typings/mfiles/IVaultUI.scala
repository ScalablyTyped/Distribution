package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVaultUI extends js.Object {
  
  val Events: IVaultUIEvents = js.native
  
  def ShowMessage(message: String): Double = js.native
  def ShowMessage(message: IMessage): Double = js.native
  
  def ShowPopupDashboard(dashboardID: String, waitUntilClosed: Boolean, data: js.Any): Unit = js.native
  
  val Vault: IVault = js.native
  
  val VaultEntry: IVaultEntry = js.native
}
