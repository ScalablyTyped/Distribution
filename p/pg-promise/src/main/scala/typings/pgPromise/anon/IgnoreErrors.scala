package typings.pgPromise.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgnoreErrors extends js.Object {
  var ignoreErrors: js.UndefOr[Boolean] = js.undefined
  var recursive: js.UndefOr[Boolean] = js.undefined
}

object IgnoreErrors {
  @scala.inline
  def apply(ignoreErrors: js.UndefOr[Boolean] = js.undefined, recursive: js.UndefOr[Boolean] = js.undefined): IgnoreErrors = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreErrors)) __obj.updateDynamic("ignoreErrors")(ignoreErrors.get.asInstanceOf[js.Any])
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgnoreErrors]
  }
}

