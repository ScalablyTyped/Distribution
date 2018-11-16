package typings
package photonuiLib.photonuiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("photonui.Dialog")
@js.native
class Dialog () extends Window {
  var buttonNames: js.Array[java.lang.String] = js.native
  var buttons: js.Array[Widget] = js.native
  def addButton(widget: Widget, layoutOptions: js.Any): scala.Unit = js.native
  def removeButton(widget: Widget): scala.Unit = js.native
}

