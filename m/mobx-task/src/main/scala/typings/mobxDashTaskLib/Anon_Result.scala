package typings
package mobxDashTaskLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Result[Result] extends js.Object {
  var result: Result
  var state: mobxDashTaskLib.mobxDashTaskMod.TaskState
}

object Anon_Result {
  @scala.inline
  def apply[Result](result: Result, state: mobxDashTaskLib.mobxDashTaskMod.TaskState): Anon_Result[Result] = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], state = state)
  
    __obj.asInstanceOf[Anon_Result[Result]]
  }
}

