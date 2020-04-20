package typings.parsimmon.mod

import typings.parsimmon.parsimmonBooleans.`true`
import typings.parsimmon.parsimmonNumbers.`-1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuccessReply[T] extends Reply[T] {
  var expected: js.Array[String]
  var furthest: `-1`
  var index: Double
  var status: `true`
  var value: T
}

object SuccessReply {
  @scala.inline
  def apply[T](expected: js.Array[String], furthest: `-1`, index: Double, status: `true`, value: T): SuccessReply[T] = {
    val __obj = js.Dynamic.literal(expected = expected.asInstanceOf[js.Any], furthest = furthest.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuccessReply[T]]
  }
}

