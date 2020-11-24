package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDashboard[T] extends js.Object {
  
  var AutoStopWithParent: Boolean = js.native
  
  val CustomData: T = js.native
  
  val Events: IDashboardEvents = js.native
  
  val IsPopupDashboard: Boolean = js.native
  
  val Parent: IShellPaneContainer | IShellFrame | IVaultUI | IShellUI = js.native
  
  def ShowMessage(message: String): Double = js.native
  def ShowMessage(message: IMessage): Double = js.native
  
  def ShowPopupDashboard(dashboardID: String, waitUntilClosed: Boolean, data: js.Any): Unit = js.native
  
  val UseRightToLeftLayout: Boolean = js.native
  
  val Vault: IVault = js.native
  
  val Window: IWindow = js.native
}
