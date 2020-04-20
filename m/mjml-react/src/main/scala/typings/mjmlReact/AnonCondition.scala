package typings.mjmlReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCondition extends js.Object {
  var children: String
  var condition: String
}

object AnonCondition {
  @scala.inline
  def apply(children: String, condition: String): AnonCondition = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCondition]
  }
}

