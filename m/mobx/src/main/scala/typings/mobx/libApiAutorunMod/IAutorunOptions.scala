package typings.mobx.libApiAutorunMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAutorunOptions extends js.Object {
  var delay: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ js.Any, Unit]] = js.undefined
  var scheduler: js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], _]] = js.undefined
}

object IAutorunOptions {
  @scala.inline
  def apply(
    delay: Int | Double = null,
    name: String = null,
    onError: /* error */ js.Any => Unit = null,
    scheduler: /* callback */ js.Function0[Unit] => _ = null
  ): IAutorunOptions = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (scheduler != null) __obj.updateDynamic("scheduler")(js.Any.fromFunction1(scheduler))
    __obj.asInstanceOf[IAutorunOptions]
  }
}

