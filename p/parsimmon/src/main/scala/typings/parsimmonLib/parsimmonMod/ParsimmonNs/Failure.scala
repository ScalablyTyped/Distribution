package typings
package parsimmonLib.parsimmonMod.ParsimmonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Failure
  extends Result[js.Any] {
  var expected: js.Array[java.lang.String]
  var index: Index
  var status: parsimmonLib.parsimmonLibNumbers.`false`
}

object Failure {
  @scala.inline
  def apply(
    expected: js.Array[java.lang.String],
    index: Index,
    status: parsimmonLib.parsimmonLibNumbers.`false`
  ): Failure = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("expected")(expected)
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[Failure]
  }
}

