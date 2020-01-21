package typings.naturalSort.mod

import typings.naturalSort.naturalSortStrings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** Set to true to make the sort case-sensitive. */
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  /** Set to 'desc' to sort in reverse. */
  var direction: js.UndefOr[desc] = js.undefined
}

object Options {
  @scala.inline
  def apply(caseSensitive: js.UndefOr[Boolean] = js.undefined, direction: desc = null): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

