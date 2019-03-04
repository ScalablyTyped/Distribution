package typings
package parsimmonLib.parsimmonMod.ParsimmonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mark[T] extends js.Object {
  var end: Index
  var start: Index
  var value: T
}

object Mark {
  @scala.inline
  def apply[T](end: Index, start: Index, value: T): Mark[T] = {
    val __obj = js.Dynamic.literal(end = end, start = start, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Mark[T]]
  }
}

