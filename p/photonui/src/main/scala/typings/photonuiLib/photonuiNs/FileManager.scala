package typings
package photonuiLib.photonuiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//Widgets
@JSGlobal("photonui.FileManager")
@js.native
class FileManager () extends Base {
  var acceptedExts: js.Array[java.lang.String] = js.native
  var acceptedMimes: js.Array[java.lang.String] = js.native
  var dropZone: stdLib.HTMLElement = js.native
  var multiselect: scala.Boolean = js.native
  def open(): scala.Unit = js.native
}

