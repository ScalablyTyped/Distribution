package typings
package menubarLib.MenubarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Menubar.MenubarApp")
@js.native
class MenubarApp ()
  extends nodeLib.NodeJSNs.EventEmitter {
  var app: electronLib.ElectronNs.App = js.native
  var positioner: ElectronPositioner = js.native
  var tray: electronLib.ElectronNs.Tray = js.native
  var window: electronLib.ElectronNs.BrowserWindow = js.native
  def getOption(opt: java.lang.String): js.Any = js.native
  def hideWindow(): scala.Unit = js.native
  def setOption(opt: java.lang.String, value: js.Any): scala.Unit = js.native
  def showWindow(): scala.Unit = js.native
}

