package typings.menubar.mod

import typings.electron.mod.Tray
import typings.menubar.getWindowPositionMod.WindowPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("menubar", "getWindowPosition")
@js.native
object getWindowPosition extends js.Object {
  def apply(tray: Tray): WindowPosition = js.native
}

