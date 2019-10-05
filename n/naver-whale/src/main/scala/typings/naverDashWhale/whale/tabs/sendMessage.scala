package typings.naverDashWhale.whale.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.tabs.sendMessage")
@js.native
object sendMessage extends js.Object {
  def apply(tabId: Double, message: js.Any): Unit = js.native
  def apply(tabId: Double, message: js.Any, options: typings.chrome.chrome.tabs.MessageSendOptions): Unit = js.native
  def apply(
    tabId: Double,
    message: js.Any,
    options: typings.chrome.chrome.tabs.MessageSendOptions,
    responseCallback: js.Function1[/* response */ js.Any, Unit]
  ): Unit = js.native
  def apply(tabId: Double, message: js.Any, responseCallback: js.Function1[/* response */ js.Any, Unit]): Unit = js.native
}

