package typings.ndjson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseOptions extends js.Object {
  var strict: js.UndefOr[Boolean] = js.undefined
}

object ParseOptions {
  @scala.inline
  def apply(strict: js.UndefOr[Boolean] = js.undefined): ParseOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseOptions]
  }
}

