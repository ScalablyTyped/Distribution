package typings.mediumEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProp extends js.Object {
  var prop: String
  var value: String
}

object AnonProp {
  @scala.inline
  def apply(prop: String, value: String): AnonProp = {
    val __obj = js.Dynamic.literal(prop = prop.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProp]
  }
}

