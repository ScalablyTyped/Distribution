package typings.pgDashPromise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IgnoreErrors extends js.Object {
  var ignoreErrors: js.UndefOr[Boolean] = js.undefined
  var recursive: js.UndefOr[Boolean] = js.undefined
}

object Anon_IgnoreErrors {
  @scala.inline
  def apply(ignoreErrors: js.UndefOr[Boolean] = js.undefined, recursive: js.UndefOr[Boolean] = js.undefined): Anon_IgnoreErrors = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreErrors)) __obj.updateDynamic("ignoreErrors")(ignoreErrors.asInstanceOf[js.Any])
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IgnoreErrors]
  }
}

