package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IShellUI extends js.Object {
  val Events: IShellUIEvents = js.native
  val ServerVault: IVault = js.native
  val Vault: IVault = js.native
  val Window: IWindow = js.native
  def CreatePersistentBrowserContent(url: java.lang.String, parameters: js.Any): scala.Double = js.native
  def DestroyPersistentContent(sessionHandle: scala.Double): scala.Unit = js.native
  def GetObjectTypeIconURL(objtype: scala.Double): java.lang.String = js.native
  def NotifyVaultEntry(ID: java.lang.String, data1: js.Any, data2: js.Any): js.Any = js.native
  def SetPersistentBrowserContent(url: java.lang.String, sessionHandle: scala.Double): scala.Unit = js.native
  def ShowMessage(message: java.lang.String): scala.Double = js.native
  def ShowMessage(message: IMessage): scala.Double = js.native
  def ShowPopupDashboard(dashboardID: java.lang.String, waitUntilClosed: scala.Boolean, data: js.Any): scala.Unit = js.native
}

