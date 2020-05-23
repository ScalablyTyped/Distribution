package typings.phoenix.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Joins extends js.Object {
  var joins: js.Object
  var leaves: js.Object
}

object Joins {
  @scala.inline
  def apply(joins: js.Object, leaves: js.Object): Joins = {
    val __obj = js.Dynamic.literal(joins = joins.asInstanceOf[js.Any], leaves = leaves.asInstanceOf[js.Any])
    __obj.asInstanceOf[Joins]
  }
}

