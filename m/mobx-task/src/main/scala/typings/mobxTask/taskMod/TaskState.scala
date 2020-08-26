package typings.mobxTask.taskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskState[A /* <: js.Array[_] */, R] extends js.Object {
  /**
    * The last arguments passed to the task.
    */
  val args: A = js.native
  /**
    * The error of the last failed invocation.
    */
  val error: js.UndefOr[js.Any] = js.native
  /**
    * Convenience getter for `state === 'pending'`.
    */
  val pending: Boolean = js.native
  /**
    * Convenience getter for `state === 'rejected'`.
    */
  val rejected: Boolean = js.native
  /**
    * Convenience getter for `state === 'resolved'`.
    */
  val resolved: Boolean = js.native
  /**
    * The result of the last invocation.
    */
  val result: js.UndefOr[WithoutPromise[R]] = js.native
  /**
    * The status (resolved, rejected, pending)
    */
  val state: TaskStatus = js.native
}

object TaskState {
  @scala.inline
  def apply[/* <: js.Array[_] */ A, R](args: A, pending: Boolean, rejected: Boolean, resolved: Boolean, state: TaskStatus): TaskState[A, R] = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], rejected = rejected.asInstanceOf[js.Any], resolved = resolved.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskState[A, R]]
  }
  @scala.inline
  implicit class TaskStateOps[Self <: TaskState[_, _], /* <: js.Array[_] */ A, R] (val x: Self with (TaskState[A, R])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArgs(value: A): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def setPending(value: Boolean): Self = this.set("pending", value.asInstanceOf[js.Any])
    @scala.inline
    def setRejected(value: Boolean): Self = this.set("rejected", value.asInstanceOf[js.Any])
    @scala.inline
    def setResolved(value: Boolean): Self = this.set("resolved", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: TaskStatus): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: js.Any): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setResult(value: WithoutPromise[R]): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
  }
  
}

