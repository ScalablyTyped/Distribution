package typings
package parsimmonLib.parsimmonMod.ParsimmonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Success[T] extends Result[T] {
  var status: parsimmonLib.parsimmonLibNumbers.`true`
  var value: T
}

object Success {
  @scala.inline
  def apply[T](status: parsimmonLib.parsimmonLibNumbers.`true`, value: T): Success[T] = {
    val __obj = js.Dynamic.literal(status = status, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Success[T]]
  }
}

