package typings.naverDashWhale.whale.sidebarAction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("whale.sidebarAction.dock")
@js.native
object dock extends js.Object {
  def apply(popupWindowId: Double, callback: js.Function1[/* windowId */ Double, Unit]): Unit = js.native
  def apply(
    popupWindowId: Double,
    details: SidebarDockDetail,
    callback: js.Function1[/* windowId */ Double, Unit]
  ): Unit = js.native
}

