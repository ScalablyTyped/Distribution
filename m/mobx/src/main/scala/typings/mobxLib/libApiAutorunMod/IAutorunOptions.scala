package typings
package mobxLib.libApiAutorunMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAutorunOptions extends js.Object {
  var delay: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ js.Any, scala.Unit]] = js.undefined
  var scheduler: js.UndefOr[js.Function1[/* callback */ js.Function0[scala.Unit], _]] = js.undefined
}

object IAutorunOptions {
  @scala.inline
  def apply(
    delay: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    onError: js.Function1[/* error */ js.Any, scala.Unit] = null,
    scheduler: js.Function1[/* callback */ js.Function0[scala.Unit], _] = null
  ): IAutorunOptions = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (onError != null) __obj.updateDynamic("onError")(onError)
    if (scheduler != null) __obj.updateDynamic("scheduler")(scheduler)
    __obj.asInstanceOf[IAutorunOptions]
  }
}

