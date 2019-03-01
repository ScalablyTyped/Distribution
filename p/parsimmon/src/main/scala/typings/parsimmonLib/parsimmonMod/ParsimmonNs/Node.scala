package typings
package parsimmonLib.parsimmonMod.ParsimmonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node[Name /* <: java.lang.String */, T] extends Mark[T] {
  var name: Name
}

object Node {
  @scala.inline
  def apply[Name /* <: java.lang.String */, T](end: Index, name: Name, start: Index, value: T): Node[Name, T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.updateDynamic("start")(start)
    __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node[Name, T]]
  }
}

