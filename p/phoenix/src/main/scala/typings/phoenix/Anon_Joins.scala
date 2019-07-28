package typings.phoenix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Joins extends js.Object {
  var joins: js.Object
  var leaves: js.Object
}

object Anon_Joins {
  @scala.inline
  def apply(joins: js.Object, leaves: js.Object): Anon_Joins = {
    val __obj = js.Dynamic.literal(joins = joins, leaves = leaves)
  
    __obj.asInstanceOf[Anon_Joins]
  }
}

