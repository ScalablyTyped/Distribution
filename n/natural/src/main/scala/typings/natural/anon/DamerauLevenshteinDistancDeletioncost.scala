package typings.natural.anon

import typings.natural.naturalBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined natural.natural.DamerauLevenshteinDistanceOptions & {  search :false | undefined} */
@js.native
trait DamerauLevenshteinDistancDeletioncost extends js.Object {
  /** @default 1 */
  var deletion_cost: js.UndefOr[Double] = js.native
  /** @default 1 */
  var insertion_cost: js.UndefOr[Double] = js.native
  /** @default false */
  var restricted: js.UndefOr[Boolean] = js.native
  /** @default false */
  var search: js.UndefOr[Boolean] with js.UndefOr[`false`] = js.native
  /** @default 1 */
  var substitution_cost: js.UndefOr[Double] = js.native
  /** @default 1 */
  var transposition_cost: js.UndefOr[Double] = js.native
}

object DamerauLevenshteinDistancDeletioncost {
  @scala.inline
  def apply(search: js.UndefOr[Boolean] with js.UndefOr[`false`]): DamerauLevenshteinDistancDeletioncost = {
    val __obj = js.Dynamic.literal(search = search.asInstanceOf[js.Any])
    __obj.asInstanceOf[DamerauLevenshteinDistancDeletioncost]
  }
  @scala.inline
  implicit class DamerauLevenshteinDistancDeletioncostOps[Self <: DamerauLevenshteinDistancDeletioncost] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSearch(value: js.UndefOr[Boolean] with js.UndefOr[`false`]): Self = this.set("search", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeletion_cost(value: Double): Self = this.set("deletion_cost", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeletion_cost: Self = this.set("deletion_cost", js.undefined)
    @scala.inline
    def setInsertion_cost(value: Double): Self = this.set("insertion_cost", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsertion_cost: Self = this.set("insertion_cost", js.undefined)
    @scala.inline
    def setRestricted(value: Boolean): Self = this.set("restricted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestricted: Self = this.set("restricted", js.undefined)
    @scala.inline
    def setSubstitution_cost(value: Double): Self = this.set("substitution_cost", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubstitution_cost: Self = this.set("substitution_cost", js.undefined)
    @scala.inline
    def setTransposition_cost(value: Double): Self = this.set("transposition_cost", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransposition_cost: Self = this.set("transposition_cost", js.undefined)
  }
  
}

