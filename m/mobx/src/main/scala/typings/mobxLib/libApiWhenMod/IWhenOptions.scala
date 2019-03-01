package typings
package mobxLib.libApiWhenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWhenOptions extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ js.Any, scala.Unit]] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object IWhenOptions {
  @scala.inline
  def apply(
    name: java.lang.String = null,
    onError: js.Function1[/* error */ js.Any, scala.Unit] = null,
    timeout: scala.Int | scala.Double = null
  ): IWhenOptions = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (onError != null) __obj.updateDynamic("onError")(onError)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWhenOptions]
  }
}

