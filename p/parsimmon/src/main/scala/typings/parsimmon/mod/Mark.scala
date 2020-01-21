package typings.parsimmon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mark[T] extends js.Object {
  var end: Index_
  var start: Index_
  var value: T
}

object Mark {
  @scala.inline
  def apply[T](end: Index_, start: Index_, value: T): Mark[T] = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Mark[T]]
  }
}

