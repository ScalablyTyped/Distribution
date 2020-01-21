package typings.naverWhale.whale.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.runtime.sendMessage")
@js.native
object sendMessage extends js.Object {
  def apply(extensionId: String, message: js.Any): Unit = js.native
  def apply(extensionId: String, message: js.Any, options: typings.chrome.chrome.runtime.MessageOptions): Unit = js.native
  def apply(
    extensionId: String,
    message: js.Any,
    options: typings.chrome.chrome.runtime.MessageOptions,
    responseCallback: js.Function1[/* response */ js.Any, Unit]
  ): Unit = js.native
  def apply(extensionId: String, message: js.Any, responseCallback: js.Function1[/* response */ js.Any, Unit]): Unit = js.native
  def apply(message: js.Any): Unit = js.native
  def apply(message: js.Any, options: typings.chrome.chrome.runtime.MessageOptions): Unit = js.native
  def apply(
    message: js.Any,
    options: typings.chrome.chrome.runtime.MessageOptions,
    responseCallback: js.Function1[/* response */ js.Any, Unit]
  ): Unit = js.native
  def apply(message: js.Any, responseCallback: js.Function1[/* response */ js.Any, Unit]): Unit = js.native
}

