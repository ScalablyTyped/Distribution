package typings.natural

import typings.natural.naturalBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined natural.natural.DamerauLevenshteinDistanceOptions & {  search ? :false} */
trait DamerauLevenshteinDistancDeletioncost extends js.Object {
  /** @default 1 */
  var deletion_cost: js.UndefOr[Double] = js.undefined
  /** @default 1 */
  var insertion_cost: js.UndefOr[Double] = js.undefined
  /** @default false */
  var restricted: js.UndefOr[Boolean] = js.undefined
  /** @default false */
  var search: js.UndefOr[Boolean with `false`] = js.undefined
  /** @default 1 */
  var substitution_cost: js.UndefOr[Double] = js.undefined
  /** @default 1 */
  var transposition_cost: js.UndefOr[Double] = js.undefined
}

object DamerauLevenshteinDistancDeletioncost {
  @scala.inline
  def apply(
    deletion_cost: Int | Double = null,
    insertion_cost: Int | Double = null,
    restricted: js.UndefOr[Boolean] = js.undefined,
    search: js.UndefOr[Boolean with `false`] = js.undefined,
    substitution_cost: Int | Double = null,
    transposition_cost: Int | Double = null
  ): DamerauLevenshteinDistancDeletioncost = {
    val __obj = js.Dynamic.literal()
    if (deletion_cost != null) __obj.updateDynamic("deletion_cost")(deletion_cost.asInstanceOf[js.Any])
    if (insertion_cost != null) __obj.updateDynamic("insertion_cost")(insertion_cost.asInstanceOf[js.Any])
    if (!js.isUndefined(restricted)) __obj.updateDynamic("restricted")(restricted.asInstanceOf[js.Any])
    if (!js.isUndefined(search)) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    if (substitution_cost != null) __obj.updateDynamic("substitution_cost")(substitution_cost.asInstanceOf[js.Any])
    if (transposition_cost != null) __obj.updateDynamic("transposition_cost")(transposition_cost.asInstanceOf[js.Any])
    __obj.asInstanceOf[DamerauLevenshteinDistancDeletioncost]
  }
}

