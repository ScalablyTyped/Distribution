package typings.mobxDashTask.libTaskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskOptions[A /* <: js.Array[_] */, R] extends js.Object {
  var args: js.UndefOr[A] = js.undefined
  var error: js.UndefOr[js.Any] = js.undefined
  var result: js.UndefOr[WithoutPromise[R]] = js.undefined
  var state: js.UndefOr[TaskStatus] = js.undefined
  var swallow: js.UndefOr[Boolean] = js.undefined
}

object TaskOptions {
  @scala.inline
  def apply[A /* <: js.Array[_] */, R](
    args: A = null,
    error: js.Any = null,
    result: WithoutPromise[R] = null,
    state: TaskStatus = null,
    swallow: js.UndefOr[Boolean] = js.undefined
  ): TaskOptions[A, R] = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error)
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state)
    if (!js.isUndefined(swallow)) __obj.updateDynamic("swallow")(swallow)
    __obj.asInstanceOf[TaskOptions[A, R]]
  }
}

