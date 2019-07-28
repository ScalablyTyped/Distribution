package typings.photonui.photonuiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("photonui.Dialog")
@js.native
class Dialog () extends Window {
  var buttonNames: js.Array[String] = js.native
  var buttons: js.Array[Widget] = js.native
  def addButton(widget: Widget, layoutOptions: js.Any): Unit = js.native
  def removeButton(widget: Widget): Unit = js.native
}

