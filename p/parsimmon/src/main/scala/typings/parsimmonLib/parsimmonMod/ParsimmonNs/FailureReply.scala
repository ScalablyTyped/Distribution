package typings
package parsimmonLib.parsimmonMod.ParsimmonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FailureReply
  extends Reply[js.Any] {
  var expected: js.Array[java.lang.String]
  var furthest: scala.Double
  var index: parsimmonLib.parsimmonLibNumbers.`-1`
  var status: parsimmonLib.parsimmonLibNumbers.`false`
  var value: scala.Null
}

object FailureReply {
  @scala.inline
  def apply(
    expected: js.Array[java.lang.String],
    furthest: scala.Double,
    index: parsimmonLib.parsimmonLibNumbers.`-1`,
    status: parsimmonLib.parsimmonLibNumbers.`false`,
    value: scala.Null
  ): FailureReply = {
    val __obj = js.Dynamic.literal(expected = expected, furthest = furthest, index = index, status = status, value = value)
  
    __obj.asInstanceOf[FailureReply]
  }
}

