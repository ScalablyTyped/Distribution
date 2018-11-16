package typings
package photonuiLib.photonuiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("photonui.Canvas")
@js.native
class Canvas () extends Widget {
  var canvas: stdLib.HTMLElement = js.native
  var height: scala.Double = js.native
  var interactiveMode: stdLib.HTMLElement = js.native
  var width: scala.Double = js.native
  def getContext(contextId: java.lang.String): js.Any = js.native
  def setContext(contextId: java.lang.String): scala.Unit = js.native
  def supportsContext(contextId: java.lang.String): scala.Boolean = js.native
  def toBlod(imageFormat: java.lang.String): js.Any = js.native
   // returns Blob
  def toBlodHD(imageFormat: java.lang.String): js.Any = js.native
   // returns Blob
  def toDataUrl(imageFormat: java.lang.String): java.lang.String = js.native
  def toDataUrlHD(imageFormat: java.lang.String): java.lang.String = js.native
  def transferControlToProxy(): scala.Unit = js.native
}

