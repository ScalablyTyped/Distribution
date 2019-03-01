package typings
package naturalDashSortLib.naturalDashSortMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** Set to true to make the sort case-sensitive. */
  var caseSensitive: js.UndefOr[scala.Boolean] = js.undefined
  /** Set to 'desc' to sort in reverse. */
  var direction: js.UndefOr[naturalDashSortLib.naturalDashSortLibStrings.desc] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    caseSensitive: js.UndefOr[scala.Boolean] = js.undefined,
    direction: naturalDashSortLib.naturalDashSortLibStrings.desc = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    __obj.asInstanceOf[Options]
  }
}

