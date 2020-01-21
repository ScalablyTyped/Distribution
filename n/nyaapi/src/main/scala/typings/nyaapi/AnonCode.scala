package typings.nyaapi

import typings.nyaapi.mod.si.Category
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCode extends js.Object {
  var code: Category
  var label: String
}

object AnonCode {
  @scala.inline
  def apply(code: Category, label: String): AnonCode = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCode]
  }
}

