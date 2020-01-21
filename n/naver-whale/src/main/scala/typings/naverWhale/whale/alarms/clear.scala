package typings.naverWhale.whale.alarms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.alarms.clear")
@js.native
object clear extends js.Object {
  def apply(): Unit = js.native
  def apply(callback: js.Function1[/* wasCleared */ Boolean, Unit]): Unit = js.native
  def apply(name: String): Unit = js.native
  def apply(name: String, callback: js.Function1[/* wasCleared */ Boolean, Unit]): Unit = js.native
}

