package typings.mobxDashTask.mobxDashTaskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskStatusAware[Result, Args /* <: js.Array[_] */]
  extends TaskFunc[js.Promise[Result], Args] {
  val args: Args = js.native
  val error: js.UndefOr[TaskError] = js.native
  val pending: Boolean = js.native
  val rejected: Boolean = js.native
  val resolved: Boolean = js.native
  val result: js.UndefOr[Result] = js.native
  val state: TaskState = js.native
  def `match`[PendingType, RejectedType, ResolvedType](props: TaskMatchProps[PendingType, RejectedType, ResolvedType, Args, Result]): PendingType | RejectedType | ResolvedType = js.native
  def reset(): Unit = js.native
  def setState(props: TaskOptions[Result]): Unit = js.native
  def wrap[R, A /* <: js.Array[_] */](
    func: js.Function1[
      /* inner */ TaskStatusAware[Result, Args], 
      js.Function1[/* args */ A, js.Promise[R]]
    ]
  ): TaskStatusAware[R, A] = js.native
}

