package typings.mobxDashTask.mobxDashTaskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskOptions[Result] extends js.Object {
  var error: js.UndefOr[TaskError] = js.undefined
  var result: js.UndefOr[Result] = js.undefined
  var state: js.UndefOr[TaskState] = js.undefined
  var swallow: js.UndefOr[Boolean] = js.undefined
}

object TaskOptions {
  @scala.inline
  def apply[Result](
    error: TaskError = null,
    result: Result = null,
    state: TaskState = null,
    swallow: js.UndefOr[Boolean] = js.undefined
  ): TaskOptions[Result] = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state)
    if (!js.isUndefined(swallow)) __obj.updateDynamic("swallow")(swallow)
    __obj.asInstanceOf[TaskOptions[Result]]
  }
}

