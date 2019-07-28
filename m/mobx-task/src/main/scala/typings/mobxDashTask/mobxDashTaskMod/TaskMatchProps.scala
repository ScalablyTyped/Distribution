package typings.mobxDashTask.mobxDashTaskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskMatchProps[T1, T2, T3, Args /* <: js.Array[_] */, Result] extends js.Object {
  def pending(
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Args is not an array type */ args: Args
  ): T1
  def rejected(error: TaskError): T2
  def resolved(result: Result): T3
}

object TaskMatchProps {
  @scala.inline
  def apply[T1, T2, T3, Args /* <: js.Array[_] */, Result](pending: Args => T1, rejected: TaskError => T2, resolved: Result => T3): TaskMatchProps[T1, T2, T3, Args, Result] = {
    val __obj = js.Dynamic.literal(pending = js.Any.fromFunction1(pending), rejected = js.Any.fromFunction1(rejected), resolved = js.Any.fromFunction1(resolved))
  
    __obj.asInstanceOf[TaskMatchProps[T1, T2, T3, Args, Result]]
  }
}

