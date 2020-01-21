package typings.naverWhale.whale.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.runtime.sendNativeMessage")
@js.native
object sendNativeMessage extends js.Object {
  def apply(application: String, message: js.Object): Unit = js.native
  def apply(
    application: String,
    message: js.Object,
    responseCallback: js.Function1[/* response */ js.Any, Unit]
  ): Unit = js.native
}

