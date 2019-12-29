package typings.parsimmon.parsimmonMod

import typings.parsimmon.parsimmonBooleans.`false`
import typings.parsimmon.parsimmonBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.parsimmon.parsimmonMod.Success[T]
  - typings.parsimmon.parsimmonMod.Failure
*/
trait Result[T] extends js.Object

object Result {
  @scala.inline
  def Success[T](status: `true`, value: T): Result[T] = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Result[T]]
  }
  @scala.inline
  def Failure[T](expected: js.Array[String], index: Index, status: `false`): Result[T] = {
    val __obj = js.Dynamic.literal(expected = expected.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Result[T]]
  }
}

