package typings.nwGui.mod

import typings.nwGui.AnonDatatype
import typings.std.HTMLIFrameElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nw.gui", "Window")
@js.native
class Window () extends EventEmitter {
  var height: Double = js.native
  var isFullScreen: Boolean = js.native
  var isKioskMode: Boolean = js.native
  var menu: Menu = js.native
  var title: String = js.native
  var width: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  var zoomLevel: Double = js.native
  def blur(): Unit = js.native
  def capturePage(callback: js.Function): Unit = js.native
  def capturePage(callback: js.Function, config_object: AnonDatatype): Unit = js.native
  def capturePage(callback: js.Function, imageformat: String): Unit = js.native
  def close(): Unit = js.native
  def close(force: Boolean): Unit = js.native
  def closeDevTools(): Unit = js.native
  def enterFullscreen(): Unit = js.native
  def enterKioskMode(): Unit = js.native
  def eval(frame: HTMLIFrameElement, script: String): Unit = js.native
  def focus(): Unit = js.native
  def hide(): Unit = js.native
  def isDevToolsOpen(): Boolean = js.native
  def leaveFullscreen(): Unit = js.native
  def leaveKioskMode(): Unit = js.native
  def maximize(): Unit = js.native
  def minimize(): Unit = js.native
  def moveBy(x: Double, y: Double): Unit = js.native
  def moveTo(x: Double, y: Double): Unit = js.native
  def reload(): Unit = js.native
  def reloadIgnoringCache(): Unit = js.native
  def requestAttention(attention: Boolean): Unit = js.native
  def requestAttention(attention: Double): Unit = js.native
  def resizeBy(width: Double, height: Double): Unit = js.native
  def resizeTo(width: Double, height: Double): Unit = js.native
  def restore(): Unit = js.native
  def setAlwaysOnTop(top: Boolean): Unit = js.native
  def setBadgeLabel(label: String): Unit = js.native
  def setMaximumSize(width: Double, height: Double): Unit = js.native
  def setMinimumSize(width: Double, height: Double): Unit = js.native
  def setPosition(position: String): Unit = js.native
  def setProgressBar(progress: Double): Unit = js.native
  def setResizable(resizable: Boolean): Unit = js.native
  def setShowInTaskbar(show: Boolean): Unit = js.native
  def show(): Unit = js.native
  def showDevTools(): Unit = js.native
  def showDevTools(id: String): Unit = js.native
  def showDevTools(id: String, headless: Boolean): Unit = js.native
  def showDevTools(id: HTMLIFrameElement): Unit = js.native
  def showDevTools(id: HTMLIFrameElement, headless: Boolean): Unit = js.native
  def toggleFullscreen(): Unit = js.native
  def toggleKioskMode(): Unit = js.native
  def unmaximize(): Unit = js.native
}

/* static members */
@JSImport("nw.gui", "Window")
@js.native
object Window extends js.Object {
  def get(): Window = js.native
  def get(windowObject: js.Any): Window = js.native
  def open(url: String): Window = js.native
  def open(url: String, options: WindowManifestOptions): Window = js.native
}

