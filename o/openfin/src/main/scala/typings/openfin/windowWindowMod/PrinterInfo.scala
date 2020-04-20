package typings.openfin.windowWindowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrinterInfo extends js.Object {
  var description: String
  var isDefault: Boolean
  var name: String
  var status: Double
}

object PrinterInfo {
  @scala.inline
  def apply(description: String, isDefault: Boolean, name: String, status: Double): PrinterInfo = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], isDefault = isDefault.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrinterInfo]
  }
}

