package typings.node.querystringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringifyOptions extends js.Object {
  var encodeURIComponent: js.UndefOr[js.Function1[/* str */ String, String]] = js.undefined
}

object StringifyOptions {
  @scala.inline
  def apply(encodeURIComponent: /* str */ String => String = null): StringifyOptions = {
    val __obj = js.Dynamic.literal()
    if (encodeURIComponent != null) __obj.updateDynamic("encodeURIComponent")(js.Any.fromFunction1(encodeURIComponent))
    __obj.asInstanceOf[StringifyOptions]
  }
}

