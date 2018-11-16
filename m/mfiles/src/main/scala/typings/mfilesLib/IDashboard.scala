package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDashboard[T] extends js.Object {
  var AutoStopWithParent: scala.Boolean = js.native
  val CustomData: T = js.native
  val Events: IDashboardEvents = js.native
  val IsPopupDashboard: scala.Boolean = js.native
  val Parent: IShellPaneContainer | IShellFrame | IVaultUI | IShellUI = js.native
  val UseRightToLeftLayout: scala.Boolean = js.native
  val Vault: IVault = js.native
  val Window: IWindow = js.native
  def ShowMessage(message: java.lang.String): scala.Double = js.native
  def ShowMessage(message: IMessage): scala.Double = js.native
  def ShowPopupDashboard(dashboardID: java.lang.String, waitUntilClosed: scala.Boolean, data: js.Any): scala.Unit = js.native
}

