package typings.menubar.mod

import typings.electron.mod.Tray
import typings.menubar.getWindowPositionMod.TaskbarLocation_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("menubar", "taskbarLocation")
@js.native
object taskbarLocation extends js.Object {
  def apply(tray: Tray): TaskbarLocation_ = js.native
}

