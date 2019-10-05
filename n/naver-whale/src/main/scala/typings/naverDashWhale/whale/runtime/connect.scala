package typings.naverDashWhale.whale.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.runtime.connect")
@js.native
object connect extends js.Object {
  def apply(): typings.chrome.chrome.runtime.Port = js.native
  def apply(connectInfo: typings.chrome.chrome.runtime.ConnectInfo): typings.chrome.chrome.runtime.Port = js.native
  def apply(extensionId: String): typings.chrome.chrome.runtime.Port = js.native
  def apply(extensionId: String, connectInfo: typings.chrome.chrome.runtime.ConnectInfo): typings.chrome.chrome.runtime.Port = js.native
}

