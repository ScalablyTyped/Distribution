package typings.phoenix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonJoins extends js.Object {
  var joins: js.Object
  var leaves: js.Object
}

object AnonJoins {
  @scala.inline
  def apply(joins: js.Object, leaves: js.Object): AnonJoins = {
    val __obj = js.Dynamic.literal(joins = joins.asInstanceOf[js.Any], leaves = leaves.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonJoins]
  }
}

