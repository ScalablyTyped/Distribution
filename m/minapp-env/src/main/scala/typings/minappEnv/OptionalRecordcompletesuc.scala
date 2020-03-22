package typings.minappEnv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined minapp-env.Optional<minapp-env.Record<'complete' | 'success' | 'fail', (args : ...any): any>> */
trait OptionalRecordcompletesuc extends js.Object {
  var complete: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var fail: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var success: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
}

object OptionalRecordcompletesuc {
  @scala.inline
  def apply(
    complete: /* repeated */ js.Any => _ = null,
    fail: /* repeated */ js.Any => _ = null,
    success: /* repeated */ js.Any => _ = null
  ): OptionalRecordcompletesuc = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[OptionalRecordcompletesuc]
  }
}

