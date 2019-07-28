package typings.parsimmon.parsimmonMod

import typings.parsimmon.parsimmonNumbers.`-1`
import typings.parsimmon.parsimmonNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FailureReply
  extends Reply[js.Any] {
  var expected: js.Array[String]
  var furthest: Double
  var index: `-1`
  var status: `false`
  var value: Null
}

object FailureReply {
  @scala.inline
  def apply(expected: js.Array[String], furthest: Double, index: `-1`, status: `false`, value: Null): FailureReply = {
    val __obj = js.Dynamic.literal(expected = expected, furthest = furthest, index = index, status = status, value = value)
  
    __obj.asInstanceOf[FailureReply]
  }
}

