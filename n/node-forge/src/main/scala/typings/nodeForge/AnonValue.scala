package typings.nodeForge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValue extends js.Object {
  var value: js.Array[_]
}

object AnonValue {
  @scala.inline
  def apply(value: js.Array[_]): AnonValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonValue]
  }
}

