package typings.oauth2orize.oauth2orizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorHandlerOptions extends js.Object {
  var mode: js.UndefOr[String] = js.undefined
}

object ErrorHandlerOptions {
  @scala.inline
  def apply(mode: String = null): ErrorHandlerOptions = {
    val __obj = js.Dynamic.literal()
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorHandlerOptions]
  }
}

