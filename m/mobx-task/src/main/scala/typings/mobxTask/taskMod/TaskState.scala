package typings.mobxTask.taskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskState[A /* <: js.Array[_] */, R] extends js.Object {
  /**
    * The last arguments passed to the task.
    */
  val args: A
  /**
    * The error of the last failed invocation.
    */
  val error: js.UndefOr[js.Any] = js.undefined
  /**
    * Convenience getter for `state === 'pending'`.
    */
  val pending: Boolean
  /**
    * Convenience getter for `state === 'rejected'`.
    */
  val rejected: Boolean
  /**
    * Convenience getter for `state === 'resolved'`.
    */
  val resolved: Boolean
  /**
    * The result of the last invocation.
    */
  val result: js.UndefOr[WithoutPromise[R]] = js.undefined
  /**
    * The status (resolved, rejected, pending)
    */
  val state: TaskStatus
}

object TaskState {
  @scala.inline
  def apply[A, R](
    args: A,
    pending: Boolean,
    rejected: Boolean,
    resolved: Boolean,
    state: TaskStatus,
    error: js.Any = null,
    result: WithoutPromise[R] = null
  ): TaskState[A, R] = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], rejected = rejected.asInstanceOf[js.Any], resolved = resolved.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskState[A, R]]
  }
}

