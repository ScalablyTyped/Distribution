package typings
package parsimmonLib.parsimmonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuccessReply[T] extends Reply[T] {
  var expected: js.Array[java.lang.String]
  var furthest: parsimmonLib.parsimmonLibNumbers.`-1`
  var index: scala.Double
  var status: parsimmonLib.parsimmonLibNumbers.`true`
  var value: T
}

object SuccessReply {
  @scala.inline
  def apply[T](
    expected: js.Array[java.lang.String],
    furthest: parsimmonLib.parsimmonLibNumbers.`-1`,
    index: scala.Double,
    status: parsimmonLib.parsimmonLibNumbers.`true`,
    value: T
  ): SuccessReply[T] = {
    val __obj = js.Dynamic.literal(expected = expected, furthest = furthest, index = index, status = status, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SuccessReply[T]]
  }
}

