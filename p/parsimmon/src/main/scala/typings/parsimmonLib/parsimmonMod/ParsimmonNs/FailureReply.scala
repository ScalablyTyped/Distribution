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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("expected")(expected)
    __obj.updateDynamic("furthest")(furthest)
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[FailureReply]
  }
}

