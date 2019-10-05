package typings.naverDashWhale.whale.management

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.management.generateAppForLink")
@js.native
object generateAppForLink extends js.Object {
  def apply(url: String, title: String): Unit = js.native
  def apply(
    url: String,
    title: String,
    callback: js.Function1[/* result */ typings.chrome.chrome.management.ExtensionInfo, Unit]
  ): Unit = js.native
}

