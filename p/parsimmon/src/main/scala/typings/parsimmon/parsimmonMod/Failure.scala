package typings.parsimmon.parsimmonMod

import typings.parsimmon.parsimmonNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Failure
  extends Result[js.Any] {
  var expected: js.Array[String]
  var index: Index
  var status: `false`
}

object Failure {
  @scala.inline
  def apply(expected: js.Array[String], index: Index, status: `false`): Failure = {
    val __obj = js.Dynamic.literal(expected = expected, index = index, status = status)
  
    __obj.asInstanceOf[Failure]
  }
}

