package typings
package mobxDashTaskLib.mobxDashTaskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskMatchProps[Args /* <: js.Array[_] */, TaskMatchResult, Result] extends js.Object {
  def pending(
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Args is not an array type */ args: Args
  ): TaskMatchResult
  def rejected(error: TaskError): TaskMatchResult
  def resolved(result: Result): TaskMatchResult
}

object TaskMatchProps {
  @scala.inline
  def apply[Args /* <: js.Array[_] */, TaskMatchResult, Result](
    pending: Args => TaskMatchResult,
    rejected: TaskError => TaskMatchResult,
    resolved: Result => TaskMatchResult
  ): TaskMatchProps[Args, TaskMatchResult, Result] = {
    val __obj = js.Dynamic.literal(pending = js.Any.fromFunction1(pending), rejected = js.Any.fromFunction1(rejected), resolved = js.Any.fromFunction1(resolved))
  
    __obj.asInstanceOf[TaskMatchProps[Args, TaskMatchResult, Result]]
  }
}

