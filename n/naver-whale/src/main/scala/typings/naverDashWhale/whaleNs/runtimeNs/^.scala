package typings.naverDashWhale.whaleNs.runtimeNs

import typings.filesystem.DirectoryEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.runtime")
@js.native
object ^ extends js.Object {
  var id: String = js.native
  var lastError: js.UndefOr[typings.chrome.chromeNs.runtimeNs.LastError] = js.native
  var onBrowserUpdateAvailable: typings.chrome.chromeNs.runtimeNs.RuntimeEvent = js.native
  var onConnect: typings.chrome.chromeNs.runtimeNs.ExtensionConnectEvent = js.native
  var onConnectExternal: typings.chrome.chromeNs.runtimeNs.ExtensionConnectEvent = js.native
  var onInstalled: typings.chrome.chromeNs.runtimeNs.RuntimeInstalledEvent = js.native
  var onMessage: typings.chrome.chromeNs.runtimeNs.ExtensionMessageEvent = js.native
  var onMessageExternal: typings.chrome.chromeNs.runtimeNs.ExtensionMessageEvent = js.native
  var onRestartRequired: typings.chrome.chromeNs.runtimeNs.RuntimeRestartRequiredEvent = js.native
  var onStartup: typings.chrome.chromeNs.runtimeNs.RuntimeEvent = js.native
  var onSuspend: typings.chrome.chromeNs.runtimeNs.RuntimeEvent = js.native
  var onSuspendCanceled: typings.chrome.chromeNs.runtimeNs.RuntimeEvent = js.native
  var onUpdateAvailable: typings.chrome.chromeNs.runtimeNs.RuntimeUpdateAvailableEvent = js.native
  def connect(): typings.chrome.chromeNs.runtimeNs.Port = js.native
  def connect(connectInfo: typings.chrome.chromeNs.runtimeNs.ConnectInfo): typings.chrome.chromeNs.runtimeNs.Port = js.native
  def connect(extensionId: String): typings.chrome.chromeNs.runtimeNs.Port = js.native
  def connect(extensionId: String, connectInfo: typings.chrome.chromeNs.runtimeNs.ConnectInfo): typings.chrome.chromeNs.runtimeNs.Port = js.native
  def connectNative(application: String): typings.chrome.chromeNs.runtimeNs.Port = js.native
  def getBackgroundPage(callback: js.Function1[/* backgroundPage */ js.UndefOr[typings.chrome.Window], Unit]): Unit = js.native
  def getManifest(): typings.chrome.chromeNs.runtimeNs.Manifest = js.native
  def getPackageDirectoryEntry(callback: js.Function1[/* directoryEntry */ DirectoryEntry, Unit]): Unit = js.native
  def getPlatformInfo(callback: js.Function1[/* platformInfo */ typings.chrome.chromeNs.runtimeNs.PlatformInfo, Unit]): Unit = js.native
  def getURL(path: String): String = js.native
  def openOptionsPage(): Unit = js.native
  def openOptionsPage(callback: js.Function0[Unit]): Unit = js.native
  def reload(): Unit = js.native
  def requestUpdateCheck(
    callback: js.Function2[
      /* status */ typings.chrome.chromeNs.runtimeNs.RequestUpdateCheckStatus, 
      /* details */ js.UndefOr[typings.chrome.chromeNs.runtimeNs.UpdateCheckDetails], 
      Unit
    ]
  ): Unit = js.native
  def restart(): Unit = js.native
  def sendMessage(extensionId: String, message: js.Any): Unit = js.native
  def sendMessage(extensionId: String, message: js.Any, options: typings.chrome.chromeNs.runtimeNs.MessageOptions): Unit = js.native
  def sendMessage(
    extensionId: String,
    message: js.Any,
    options: typings.chrome.chromeNs.runtimeNs.MessageOptions,
    responseCallback: js.Function1[/* response */ js.Any, Unit]
  ): Unit = js.native
  def sendMessage(extensionId: String, message: js.Any, responseCallback: js.Function1[/* response */ js.Any, Unit]): Unit = js.native
  def sendMessage(message: js.Any): Unit = js.native
  def sendMessage(message: js.Any, options: typings.chrome.chromeNs.runtimeNs.MessageOptions): Unit = js.native
  def sendMessage(
    message: js.Any,
    options: typings.chrome.chromeNs.runtimeNs.MessageOptions,
    responseCallback: js.Function1[/* response */ js.Any, Unit]
  ): Unit = js.native
  def sendMessage(message: js.Any, responseCallback: js.Function1[/* response */ js.Any, Unit]): Unit = js.native
  def sendNativeMessage(application: String, message: js.Object): Unit = js.native
  def sendNativeMessage(
    application: String,
    message: js.Object,
    responseCallback: js.Function1[/* response */ js.Any, Unit]
  ): Unit = js.native
  def setUninstallURL(url: String): Unit = js.native
  def setUninstallURL(url: String, callback: js.Function0[Unit]): Unit = js.native
}

