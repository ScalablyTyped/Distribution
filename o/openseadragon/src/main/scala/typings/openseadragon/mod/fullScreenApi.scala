package typings.openseadragon.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openseadragon", "fullScreenApi")
@js.native
object fullScreenApi extends js.Object {
  var fullScreenErrorEventName: String = js.native
  var fullScreenEventName: String = js.native
  var supportsFullScreen: Boolean = js.native
  def cancelFullScreen(): Unit = js.native
  def exitFullScreen(): Unit = js.native
  def getFullScreenElement(): HTMLElement = js.native
  def isFullScreen(): Boolean = js.native
  def requestFullScreen(): Unit = js.native
}

