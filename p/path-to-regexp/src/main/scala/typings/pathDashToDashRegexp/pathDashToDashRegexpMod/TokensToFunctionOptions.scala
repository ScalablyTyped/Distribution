package typings.pathDashToDashRegexp.pathDashToDashRegexpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokensToFunctionOptions extends js.Object {
  /**
    * When `true` the regexp will be case sensitive. (default: `false`)
    */
  var sensitive: js.UndefOr[Boolean] = js.undefined
}

object TokensToFunctionOptions {
  @scala.inline
  def apply(sensitive: js.UndefOr[Boolean] = js.undefined): TokensToFunctionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokensToFunctionOptions]
  }
}

