package typings.mobx.libApiWhenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWhenOptions extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ js.Any, Unit]] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object IWhenOptions {
  @scala.inline
  def apply(name: String = null, onError: /* error */ js.Any => Unit = null, timeout: Int | Double = null): IWhenOptions = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWhenOptions]
  }
}

