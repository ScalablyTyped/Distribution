package typings.openfin.logMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogInfo extends js.Object {
  var date: String
  var name: String
  var size: Double
}

object LogInfo {
  @scala.inline
  def apply(date: String, name: String, size: Double): LogInfo = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LogInfo]
  }
}

