package typings.node.querystringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseOptions extends js.Object {
  var decodeURIComponent: js.UndefOr[js.Function1[/* str */ String, String]] = js.undefined
  var maxKeys: js.UndefOr[Double] = js.undefined
}

object ParseOptions {
  @scala.inline
  def apply(decodeURIComponent: /* str */ String => String = null, maxKeys: Int | Double = null): ParseOptions = {
    val __obj = js.Dynamic.literal()
    if (decodeURIComponent != null) __obj.updateDynamic("decodeURIComponent")(js.Any.fromFunction1(decodeURIComponent))
    if (maxKeys != null) __obj.updateDynamic("maxKeys")(maxKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseOptions]
  }
}

