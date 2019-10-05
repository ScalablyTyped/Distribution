package typings.naverDashWhale.whale.extension

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.extension.sendRequest")
@js.native
object sendRequest extends js.Object {
  def apply(extensionId: String, request: js.Any): Unit = js.native
  def apply(extensionId: String, request: js.Any, responseCallback: js.Function1[/* response */ js.Any, Unit]): Unit = js.native
  def apply(request: js.Any): Unit = js.native
  def apply(request: js.Any, responseCallback: js.Function1[/* response */ js.Any, Unit]): Unit = js.native
}

