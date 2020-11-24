package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IShellUI extends js.Object {
  
  def CreatePersistentBrowserContent(url: String, parameters: js.Any): Double = js.native
  
  def DestroyPersistentContent(sessionHandle: Double): Unit = js.native
  
  val Events: IShellUIEvents = js.native
  
  def GetObjectTypeIconURL(objtype: Double): String = js.native
  
  def NotifyVaultEntry(ID: String, data1: js.Any, data2: js.Any): js.Any = js.native
  
  val ServerVault: IVault = js.native
  
  def SetPersistentBrowserContent(url: String, sessionHandle: Double): Unit = js.native
  
  def ShowMessage(message: String): Double = js.native
  def ShowMessage(message: IMessage): Double = js.native
  
  def ShowPopupDashboard(dashboardID: String, waitUntilClosed: Boolean, data: js.Any): Unit = js.native
  
  val Vault: IVault = js.native
  
  val Window: IWindow = js.native
}
