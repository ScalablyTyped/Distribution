package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultUI extends js.Object {
  val Events: IVaultUIEvents = js.native
  val Vault: IVault = js.native
  val VaultEntry: IVaultEntry = js.native
  def ShowMessage(message: java.lang.String): scala.Double = js.native
  def ShowMessage(message: IMessage): scala.Double = js.native
  def ShowPopupDashboard(dashboardID: java.lang.String, waitUntilClosed: scala.Boolean, data: js.Any): scala.Unit = js.native
}

