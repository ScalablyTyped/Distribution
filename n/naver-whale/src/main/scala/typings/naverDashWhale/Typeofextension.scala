package typings.naverDashWhale

import typings.chrome.chromeNs.extensionNs.FetchProperties
import typings.chrome.chromeNs.extensionNs.LastError
import typings.chrome.chromeNs.extensionNs.OnRequestEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofextension extends js.Object {
  var inIncognitoContext: Boolean = js.native
  var lastError: LastError = js.native
  var onRequest: OnRequestEvent = js.native
  var onRequestExternal: OnRequestEvent = js.native
  def getBackgroundPage(): typings.chrome.Window | Null = js.native
  def getExtensionTabs(): js.Array[typings.chrome.Window] = js.native
  def getExtensionTabs(windowId: Double): js.Array[typings.chrome.Window] = js.native
  def getURL(path: String): String = js.native
  def getViews(): js.Array[typings.chrome.Window] = js.native
  def getViews(fetchProperties: FetchProperties): js.Array[typings.chrome.Window] = js.native
  def isAllowedFileSchemeAccess(callback: js.Function1[/* isAllowedAccess */ Boolean, Unit]): Unit = js.native
  def isAllowedIncognitoAccess(callback: js.Function1[/* isAllowedAccess */ Boolean, Unit]): Unit = js.native
  def sendRequest(extensionId: String, request: js.Any): Unit = js.native
  def sendRequest(extensionId: String, request: js.Any, responseCallback: js.Function1[/* response */ js.Any, Unit]): Unit = js.native
  def sendRequest(request: js.Any): Unit = js.native
  def sendRequest(request: js.Any, responseCallback: js.Function1[/* response */ js.Any, Unit]): Unit = js.native
  def setUpdateUrlData(data: String): Unit = js.native
}

