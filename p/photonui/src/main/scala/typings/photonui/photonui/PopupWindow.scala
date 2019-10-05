package typings.photonui.photonui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("photonui.PopupWindow")
@js.native
class PopupWindow () extends BaseWindow {
  def popupWidget(widget: Widget): Unit = js.native
  def popupXY(x: Double, y: Double): Unit = js.native
}

