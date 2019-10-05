package typings.naverDashWhale.whale.browserAction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.browserAction.getBadgeBackgroundColor")
@js.native
object getBadgeBackgroundColor extends js.Object {
  def apply(
    details: typings.chrome.chrome.browserAction.TabDetails,
    callback: js.Function1[/* result */ typings.chrome.chrome.browserAction.ColorArray, Unit]
  ): Unit = js.native
}

