package typings.openfin.systemWindowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowInfo extends js.Object {
  var childWindows: js.Array[WindowDetail]
  var mainWindow: WindowDetail
  var uuid: String
}

object WindowInfo {
  @scala.inline
  def apply(childWindows: js.Array[WindowDetail], mainWindow: WindowDetail, uuid: String): WindowInfo = {
    val __obj = js.Dynamic.literal(childWindows = childWindows.asInstanceOf[js.Any], mainWindow = mainWindow.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WindowInfo]
  }
}

