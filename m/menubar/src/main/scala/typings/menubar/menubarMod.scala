package typings.menubar

import typings.electron.Electron.App
import typings.electron.electronMod.Tray
import typings.menubar.libTypesMod.Options
import typings.menubar.libUtilGetWindowPositionMod.TaskbarLocation
import typings.menubar.libUtilGetWindowPositionMod.WindowPosition
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("menubar", JSImport.Namespace)
@js.native
object menubarMod extends js.Object {
  @js.native
  class Menubar protected ()
    extends typings.menubar.libMenubarMod.Menubar {
    def this(app: App) = this()
    def this(app: App, options: Partial[Options]) = this()
  }
  
  def getWindowPosition(tray: Tray): WindowPosition = js.native
  def menubar(): typings.menubar.libMenubarMod.Menubar = js.native
  def menubar(options: Partial[Options]): typings.menubar.libMenubarMod.Menubar = js.native
  def taskbarLocation(tray: Tray): TaskbarLocation = js.native
}

