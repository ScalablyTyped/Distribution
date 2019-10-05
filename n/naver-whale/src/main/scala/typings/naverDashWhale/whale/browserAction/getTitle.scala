package typings.naverDashWhale.whale.browserAction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.browserAction.getTitle")
@js.native
object getTitle extends js.Object {
  def apply(
    details: typings.chrome.chrome.browserAction.TabDetails,
    callback: js.Function1[/* result */ String, Unit]
  ): Unit = js.native
}

