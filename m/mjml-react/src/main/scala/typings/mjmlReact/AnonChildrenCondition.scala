package typings.mjmlReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildrenCondition extends js.Object {
  var children: String
  var condition: String
}

object AnonChildrenCondition {
  @scala.inline
  def apply(children: String, condition: String): AnonChildrenCondition = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonChildrenCondition]
  }
}

