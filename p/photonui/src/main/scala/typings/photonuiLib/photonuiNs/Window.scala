package typings
package photonuiLib.photonuiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("photonui.Window")
@js.native
class Window () extends BaseWindow {
  var closeButtonVisible: scala.Boolean = js.native
  var modal: scala.Boolean = js.native
  var movable: scala.Boolean = js.native
  var title: java.lang.String = js.native
  def moveToBack(): scala.Unit = js.native
  def moveToFront(): scala.Unit = js.native
}

