package typings.naverDashWhale.whale.cookies

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cookies.remove")
@js.native
object remove extends js.Object {
  def apply(details: typings.chrome.chrome.cookies.Details): Unit = js.native
  def apply(
    details: typings.chrome.chrome.cookies.Details,
    callback: js.Function1[/* details */ typings.chrome.chrome.cookies.Details, Unit]
  ): Unit = js.native
}

