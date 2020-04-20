package typings.parsimmon.mod

import typings.parsimmon.parsimmonBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Success[T] extends Result[T] {
  var status: `true`
  var value: T
}

object Success {
  @scala.inline
  def apply[T](status: `true`, value: T): Success[T] = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Success[T]]
  }
}

