package typings.mjmlReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Condition extends js.Object {
  var children: String
  var condition: String
}

object Condition {
  @scala.inline
  def apply(children: String, condition: String): Condition = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Condition]
  }
}

