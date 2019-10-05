package typings.photonui.photonui

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("photonui.Canvas")
@js.native
class Canvas () extends Widget {
  var canvas: HTMLElement = js.native
  var height: Double = js.native
  var interactiveMode: HTMLElement = js.native
  var width: Double = js.native
  def getContext(contextId: String): js.Any = js.native
  def setContext(contextId: String): Unit = js.native
  def supportsContext(contextId: String): Boolean = js.native
  def toBlod(imageFormat: String): js.Any = js.native
   // returns Blob
  def toBlodHD(imageFormat: String): js.Any = js.native
   // returns Blob
  def toDataUrl(imageFormat: String): String = js.native
  def toDataUrlHD(imageFormat: String): String = js.native
  def transferControlToProxy(): Unit = js.native
}

