package typings.naverDashWhale.whale.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.runtime")
@js.native
object ^ extends js.Object {
  var id: String = js.native
  var lastError: js.UndefOr[typings.chrome.chrome.runtime.LastError] = js.native
  var onBrowserUpdateAvailable: typings.chrome.chrome.runtime.RuntimeEvent = js.native
  var onConnect: typings.chrome.chrome.runtime.ExtensionConnectEvent = js.native
  var onConnectExternal: typings.chrome.chrome.runtime.ExtensionConnectEvent = js.native
  var onInstalled: typings.chrome.chrome.runtime.RuntimeInstalledEvent = js.native
  var onMessage: typings.chrome.chrome.runtime.ExtensionMessageEvent = js.native
  var onMessageExternal: typings.chrome.chrome.runtime.ExtensionMessageEvent = js.native
  var onRestartRequired: typings.chrome.chrome.runtime.RuntimeRestartRequiredEvent = js.native
  var onStartup: typings.chrome.chrome.runtime.RuntimeEvent = js.native
  var onSuspend: typings.chrome.chrome.runtime.RuntimeEvent = js.native
  var onSuspendCanceled: typings.chrome.chrome.runtime.RuntimeEvent = js.native
  var onUpdateAvailable: typings.chrome.chrome.runtime.RuntimeUpdateAvailableEvent = js.native
}

