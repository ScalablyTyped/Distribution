package typings.photonui.photonui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("photonui.Window")
@js.native
class Window () extends BaseWindow {
  var closeButtonVisible: Boolean = js.native
  var modal: Boolean = js.native
  var movable: Boolean = js.native
  var title: String = js.native
  def moveToBack(): Unit = js.native
  def moveToFront(): Unit = js.native
}

