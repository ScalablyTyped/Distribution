package typings
package nwDotGuiLib.nwDotGuiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nw.gui", "Window")
@js.native
class Window () extends EventEmitter {
  var height: scala.Double = js.native
  var isFullScreen: scala.Boolean = js.native
  var isKioskMode: scala.Boolean = js.native
  var menu: Menu = js.native
  var title: java.lang.String = js.native
  var width: scala.Double = js.native
  var x: scala.Double = js.native
  var y: scala.Double = js.native
  var zoomLevel: scala.Double = js.native
  def blur(): scala.Unit = js.native
  def capturePage(callback: js.Function): scala.Unit = js.native
  def capturePage(callback: js.Function, config_object: nwDotGuiLib.Anon_Datatype): scala.Unit = js.native
  def capturePage(callback: js.Function, imageformat: java.lang.String): scala.Unit = js.native
  def close(): scala.Unit = js.native
  def close(force: scala.Boolean): scala.Unit = js.native
  def closeDevTools(): scala.Unit = js.native
  def enterFullscreen(): scala.Unit = js.native
  def enterKioskMode(): scala.Unit = js.native
  def eval(frame: stdLib.HTMLIFrameElement, script: java.lang.String): scala.Unit = js.native
  def focus(): scala.Unit = js.native
  def hide(): scala.Unit = js.native
  def isDevToolsOpen(): scala.Boolean = js.native
  def leaveFullscreen(): scala.Unit = js.native
  def leaveKioskMode(): scala.Unit = js.native
  def maximize(): scala.Unit = js.native
  def minimize(): scala.Unit = js.native
  def moveBy(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def moveTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def reload(): scala.Unit = js.native
  def reloadIgnoringCache(): scala.Unit = js.native
  def requestAttention(attention: scala.Boolean): scala.Unit = js.native
  def requestAttention(attention: scala.Double): scala.Unit = js.native
  def resizeBy(width: scala.Double, height: scala.Double): scala.Unit = js.native
  def resizeTo(width: scala.Double, height: scala.Double): scala.Unit = js.native
  def restore(): scala.Unit = js.native
  def setAlwaysOnTop(top: scala.Boolean): scala.Unit = js.native
  def setBadgeLabel(label: java.lang.String): scala.Unit = js.native
  def setMaximumSize(width: scala.Double, height: scala.Double): scala.Unit = js.native
  def setMinimumSize(width: scala.Double, height: scala.Double): scala.Unit = js.native
  def setPosition(position: java.lang.String): scala.Unit = js.native
  def setProgressBar(progress: scala.Double): scala.Unit = js.native
  def setResizable(resizable: scala.Boolean): scala.Unit = js.native
  def setShowInTaskbar(show: scala.Boolean): scala.Unit = js.native
  def show(): scala.Unit = js.native
  def showDevTools(): scala.Unit = js.native
  def showDevTools(id: java.lang.String): scala.Unit = js.native
  def showDevTools(id: java.lang.String, headless: scala.Boolean): scala.Unit = js.native
  def showDevTools(id: stdLib.HTMLIFrameElement): scala.Unit = js.native
  def showDevTools(id: stdLib.HTMLIFrameElement, headless: scala.Boolean): scala.Unit = js.native
  def toggleFullscreen(): scala.Unit = js.native
  def toggleKioskMode(): scala.Unit = js.native
  def unmaximize(): scala.Unit = js.native
}

@JSImport("nw.gui", "Window")
@js.native
object Window extends js.Object {
  def get(): nwDotGuiLib.nwDotGuiMod.Window = js.native
  def get(windowObject: js.Any): nwDotGuiLib.nwDotGuiMod.Window = js.native
  def open(url: java.lang.String): nwDotGuiLib.nwDotGuiMod.Window = js.native
  def open(url: java.lang.String, options: nwDotGuiLib.nwDotGuiMod.WindowManifestOptions): nwDotGuiLib.nwDotGuiMod.Window = js.native
}

