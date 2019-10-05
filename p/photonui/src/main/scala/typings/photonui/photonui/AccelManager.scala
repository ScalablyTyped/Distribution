package typings.photonui.photonui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("photonui.AccelManager")
@js.native
class AccelManager () extends Base {
  def addAccel(id: String, keys: String, callback: js.Function): Unit = js.native
  def addAccel(id: String, keys: String, callback: js.Function, safe: Boolean): Unit = js.native
  def removeAccel(id: String): Unit = js.native
}

