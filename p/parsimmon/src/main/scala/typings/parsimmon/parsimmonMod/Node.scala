package typings.parsimmon.parsimmonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node[Name /* <: String */, T] extends Mark[T] {
  var name: Name
}

object Node {
  @scala.inline
  def apply[Name /* <: String */, T](end: Index, name: Name, start: Index, value: T): Node[Name, T] = {
    val __obj = js.Dynamic.literal(end = end, name = name.asInstanceOf[js.Any], start = start, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Node[Name, T]]
  }
}

