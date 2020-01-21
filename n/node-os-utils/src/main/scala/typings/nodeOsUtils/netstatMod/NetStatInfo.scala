package typings.nodeOsUtils.netstatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetStatInfo extends js.Object {
  var inputBytes: String
  var interface: String
  var outputBytes: String
}

object NetStatInfo {
  @scala.inline
  def apply(inputBytes: String, interface: String, outputBytes: String): NetStatInfo = {
    val __obj = js.Dynamic.literal(inputBytes = inputBytes.asInstanceOf[js.Any], interface = interface.asInstanceOf[js.Any], outputBytes = outputBytes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NetStatInfo]
  }
}

