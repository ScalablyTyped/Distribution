package typings.pgPromise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIgnoreErrors extends js.Object {
  var ignoreErrors: js.UndefOr[Boolean] = js.undefined
  var recursive: js.UndefOr[Boolean] = js.undefined
}

object AnonIgnoreErrors {
  @scala.inline
  def apply(ignoreErrors: js.UndefOr[Boolean] = js.undefined, recursive: js.UndefOr[Boolean] = js.undefined): AnonIgnoreErrors = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreErrors)) __obj.updateDynamic("ignoreErrors")(ignoreErrors.asInstanceOf[js.Any])
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIgnoreErrors]
  }
}

