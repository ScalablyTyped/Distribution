package typings
package oauth2orizeLib.oauth2orizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorHandlerOptions extends js.Object {
  var mode: js.UndefOr[java.lang.String] = js.undefined
}

object ErrorHandlerOptions {
  @scala.inline
  def apply(mode: java.lang.String = null): ErrorHandlerOptions = {
    val __obj = js.Dynamic.literal()
    if (mode != null) __obj.updateDynamic("mode")(mode)
    __obj.asInstanceOf[ErrorHandlerOptions]
  }
}

