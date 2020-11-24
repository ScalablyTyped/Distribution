package typings.menubar.getWindowPositionMod

import typings.electron.mod.Tray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("menubar/lib/util/getWindowPosition", "taskbarLocation")
@js.native
object taskbarLocation extends js.Object {
  
  def apply(tray: Tray): TaskbarLocation_ = js.native
}
