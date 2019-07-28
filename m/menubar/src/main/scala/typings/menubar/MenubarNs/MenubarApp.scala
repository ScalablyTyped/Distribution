package typings.menubar.MenubarNs

import typings.electron.ElectronNs.App
import typings.electron.ElectronNs.BrowserWindow
import typings.electron.ElectronNs.Tray
import typings.node.NodeJSNs.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Menubar.MenubarApp")
@js.native
class MenubarApp () extends EventEmitter {
  var app: App = js.native
  var positioner: ElectronPositioner = js.native
  var tray: Tray = js.native
  var window: BrowserWindow = js.native
  def getOption(opt: String): js.Any = js.native
  def hideWindow(): Unit = js.native
  def setOption(opt: String, value: js.Any): Unit = js.native
  def showWindow(): Unit = js.native
}

