package typings
package parsimmonLib.parsimmonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node[Name /* <: java.lang.String */, T] extends Mark[T] {
  var name: Name
}

object Node {
  @scala.inline
  def apply[Name /* <: java.lang.String */, T](end: Index, name: Name, start: Index, value: T): Node[Name, T] = {
    val __obj = js.Dynamic.literal(end = end, name = name.asInstanceOf[js.Any], start = start, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Node[Name, T]]
  }
}

