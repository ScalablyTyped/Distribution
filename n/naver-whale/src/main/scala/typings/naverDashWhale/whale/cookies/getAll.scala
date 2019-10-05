package typings.naverDashWhale.whale.cookies

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cookies.getAll")
@js.native
object getAll extends js.Object {
  def apply(
    details: typings.chrome.chrome.cookies.GetAllDetails,
    callback: js.Function1[/* cookies */ js.Array[typings.chrome.chrome.cookies.Cookie], Unit]
  ): Unit = js.native
}

