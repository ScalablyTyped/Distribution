package typings.parsimmon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node[Name /* <: String */, T] extends Mark[T] {
  var name: Name
}

object Node {
  @scala.inline
  def apply[Name, T](end: Index_, name: Name, start: Index_, value: T): Node[Name, T] = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node[Name, T]]
  }
}

