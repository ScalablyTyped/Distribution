package typings.menubar

import typings.electron.Electron.App
import typings.electron.mod.Tray
import typings.menubar.anon.PartialOptions
import typings.menubar.getWindowPositionMod.TaskbarLocation_
import typings.menubar.getWindowPositionMod.WindowPosition
import typings.menubar.menubarMod.Menubar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("menubar", "Menubar")
  @js.native
  class Menubar_ protected () extends Menubar {
    def this(app: App) = this()
    def this(app: App, options: PartialOptions) = this()
  }
  
  @JSImport("menubar", "getWindowPosition")
  @js.native
  def getWindowPosition(tray: Tray): WindowPosition = js.native
  
  @JSImport("menubar", "menubar")
  @js.native
  def menubar(): Menubar = js.native
  @JSImport("menubar", "menubar")
  @js.native
  def menubar(options: PartialOptions): Menubar = js.native
  
  @JSImport("menubar", "taskbarLocation")
  @js.native
  def taskbarLocation(tray: Tray): TaskbarLocation_ = js.native
}
