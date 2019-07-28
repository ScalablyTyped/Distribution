package typings.naverDashWhale.whaleNs.extensionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.extension")
@js.native
object ^ extends js.Object {
  var inIncognitoContext: Boolean = js.native
  var lastError: typings.chrome.chromeNs.extensionNs.LastError = js.native
  var onRequest: typings.chrome.chromeNs.extensionNs.OnRequestEvent = js.native
  var onRequestExternal: typings.chrome.chromeNs.extensionNs.OnRequestEvent = js.native
  def getBackgroundPage(): typings.chrome.Window | Null = js.native
  def getExtensionTabs(): js.Array[typings.chrome.Window] = js.native
  def getExtensionTabs(windowId: Double): js.Array[typings.chrome.Window] = js.native
  def getURL(path: String): String = js.native
  def getViews(): js.Array[typings.chrome.Window] = js.native
  def getViews(fetchProperties: typings.chrome.chromeNs.extensionNs.FetchProperties): js.Array[typings.chrome.Window] = js.native
  def isAllowedFileSchemeAccess(callback: js.Function1[/* isAllowedAccess */ Boolean, Unit]): Unit = js.native
  def isAllowedIncognitoAccess(callback: js.Function1[/* isAllowedAccess */ Boolean, Unit]): Unit = js.native
  def sendRequest(extensionId: String, request: js.Any): Unit = js.native
  def sendRequest(extensionId: String, request: js.Any, responseCallback: js.Function1[/* response */ js.Any, Unit]): Unit = js.native
  def sendRequest(request: js.Any): Unit = js.native
  def sendRequest(request: js.Any, responseCallback: js.Function1[/* response */ js.Any, Unit]): Unit = js.native
  def setUpdateUrlData(data: String): Unit = js.native
}

