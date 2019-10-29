package typings.mobxDashTask.libTaskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskMatchProps[T1, T2, T3, A /* <: js.Array[_] */, R] extends js.Object {
  var pending: js.UndefOr[js.Function1[/* args */ A, T1]] = js.undefined
  var rejected: js.UndefOr[js.Function1[/* error */ js.Any, T2]] = js.undefined
  var resolved: js.UndefOr[js.Function1[/* result */ WithoutPromise[R], T3]] = js.undefined
}

object TaskMatchProps {
  @scala.inline
  def apply[T1, T2, T3, A /* <: js.Array[_] */, R](
    pending: /* args */ A => T1 = null,
    rejected: /* error */ js.Any => T2 = null,
    resolved: /* result */ WithoutPromise[R] => T3 = null
  ): TaskMatchProps[T1, T2, T3, A, R] = {
    val __obj = js.Dynamic.literal()
    if (pending != null) __obj.updateDynamic("pending")(js.Any.fromFunction1(pending))
    if (rejected != null) __obj.updateDynamic("rejected")(js.Any.fromFunction1(rejected))
    if (resolved != null) __obj.updateDynamic("resolved")(js.Any.fromFunction1(resolved))
    __obj.asInstanceOf[TaskMatchProps[T1, T2, T3, A, R]]
  }
}

