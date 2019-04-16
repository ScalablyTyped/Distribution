package typings
package mobxDashTaskLib.mobxDashTaskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskStatusAware[Result, Args /* <: js.Array[_] */]
  extends TaskFunc[js.Promise[Result], Args] {
  val args: Args = js.native
  val error: js.UndefOr[TaskError] = js.native
  val pending: scala.Boolean = js.native
  val rejected: scala.Boolean = js.native
  val resolved: scala.Boolean = js.native
  val result: js.UndefOr[Result] = js.native
  val state: TaskState = js.native
  def `match`[TaskMatchResult](props: TaskMatchProps[Args, TaskMatchResult, Result]): TaskMatchResult = js.native
  def reset(): scala.Unit = js.native
  def setState(props: TaskOptions[Result]): scala.Unit = js.native
  def wrap[R, A /* <: js.Array[_] */](
    func: js.Function1[
      /* inner */ TaskStatusAware[Result, Args], 
      js.Function1[/* args */ A, js.Promise[R]]
    ]
  ): TaskStatusAware[R, A] = js.native
}

