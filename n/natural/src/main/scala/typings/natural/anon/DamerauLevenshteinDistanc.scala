package typings.natural.anon

import typings.natural.naturalBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined natural.natural.DamerauLevenshteinDistanceOptions & {  search  :true} */
trait DamerauLevenshteinDistanc extends js.Object {
  /** @default 1 */
  var deletion_cost: js.UndefOr[Double] = js.undefined
  /** @default 1 */
  var insertion_cost: js.UndefOr[Double] = js.undefined
  /** @default false */
  var restricted: js.UndefOr[Boolean] = js.undefined
  /** @default false */
  var search: js.UndefOr[Boolean with `true`] = js.undefined
  /** @default 1 */
  var substitution_cost: js.UndefOr[Double] = js.undefined
  /** @default 1 */
  var transposition_cost: js.UndefOr[Double] = js.undefined
}

object DamerauLevenshteinDistanc {
  @scala.inline
  def apply(
    deletion_cost: js.UndefOr[Double] = js.undefined,
    insertion_cost: js.UndefOr[Double] = js.undefined,
    restricted: js.UndefOr[Boolean] = js.undefined,
    search: js.UndefOr[Boolean with `true`] = js.undefined,
    substitution_cost: js.UndefOr[Double] = js.undefined,
    transposition_cost: js.UndefOr[Double] = js.undefined
  ): DamerauLevenshteinDistanc = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deletion_cost)) __obj.updateDynamic("deletion_cost")(deletion_cost.get.asInstanceOf[js.Any])
    if (!js.isUndefined(insertion_cost)) __obj.updateDynamic("insertion_cost")(insertion_cost.get.asInstanceOf[js.Any])
    if (!js.isUndefined(restricted)) __obj.updateDynamic("restricted")(restricted.get.asInstanceOf[js.Any])
    if (!js.isUndefined(search)) __obj.updateDynamic("search")(search.get.asInstanceOf[js.Any])
    if (!js.isUndefined(substitution_cost)) __obj.updateDynamic("substitution_cost")(substitution_cost.get.asInstanceOf[js.Any])
    if (!js.isUndefined(transposition_cost)) __obj.updateDynamic("transposition_cost")(transposition_cost.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DamerauLevenshteinDistanc]
  }
}

