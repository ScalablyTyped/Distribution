package typings.menubar

import typings.electron.Electron.App
import typings.electron.mod.Tray
import typings.menubar.anon.PartialOptions
import typings.menubar.getWindowPositionMod.TaskbarLocation_
import typings.menubar.getWindowPositionMod.WindowPosition
import typings.menubar.menubarMod.Menubar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("menubar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("menubar", "Menubar")
  @js.native
  class Menubar_ protected () extends Menubar {
    def this(app: App) = this()
    def this(app: App, options: PartialOptions) = this()
  }
  
  @scala.inline
  def getWindowPosition(tray: Tray): WindowPosition = ^.asInstanceOf[js.Dynamic].applyDynamic("getWindowPosition")(tray.asInstanceOf[js.Any]).asInstanceOf[WindowPosition]
  
  @scala.inline
  def menubar(): Menubar = ^.asInstanceOf[js.Dynamic].applyDynamic("menubar")().asInstanceOf[Menubar]
  @scala.inline
  def menubar(options: PartialOptions): Menubar = ^.asInstanceOf[js.Dynamic].applyDynamic("menubar")(options.asInstanceOf[js.Any]).asInstanceOf[Menubar]
  
  @scala.inline
  def taskbarLocation(tray: Tray): TaskbarLocation_ = ^.asInstanceOf[js.Dynamic].applyDynamic("taskbarLocation")(tray.asInstanceOf[js.Any]).asInstanceOf[TaskbarLocation_]
}
