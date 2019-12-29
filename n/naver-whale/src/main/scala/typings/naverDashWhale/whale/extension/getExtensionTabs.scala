package typings.naverDashWhale.whale.extension

import typings.chrome.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.extension.getExtensionTabs")
@js.native
object getExtensionTabs extends js.Object {
  def apply(): js.Array[Window] = js.native
  def apply(windowId: Double): js.Array[Window] = js.native
}

