package typings.parse.parseMod._Global_.Parse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorOption extends js.Object {
  var error: js.UndefOr[js.Function] = js.undefined
}

object ErrorOption {
  @scala.inline
  def apply(error: js.Function = null): ErrorOption = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorOption]
  }
}

