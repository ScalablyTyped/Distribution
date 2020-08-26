package typings.pouchdbFind.PouchDB.Find

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CombinationOperators extends js.Object {
  /** Matches if all the selectors in the array match. */
  @JSName("$and")
  var $and: js.UndefOr[js.Array[Selector]] = js.native
  /** Matches if none of the selectors in the array match. */
  @JSName("$nor")
  var $nor: js.UndefOr[js.Array[Selector]] = js.native
  /** Matches if the given selector does not match. */
  @JSName("$not")
  var $not: js.UndefOr[Selector] = js.native
  /** Matches if any of the selectors in the array match. All selectors must use the same index. */
  @JSName("$or")
  var $or: js.UndefOr[js.Array[Selector]] = js.native
}

object CombinationOperators {
  @scala.inline
  def apply(): CombinationOperators = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CombinationOperators]
  }
  @scala.inline
  implicit class CombinationOperatorsOps[Self <: CombinationOperators] (val x: Self) extends AnyVal {
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
    def set$andVarargs(value: Selector*): Self = this.set("$and", js.Array(value :_*))
    @scala.inline
    def set$and(value: js.Array[Selector]): Self = this.set("$and", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$and: Self = this.set("$and", js.undefined)
    @scala.inline
    def set$norVarargs(value: Selector*): Self = this.set("$nor", js.Array(value :_*))
    @scala.inline
    def set$nor(value: js.Array[Selector]): Self = this.set("$nor", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$nor: Self = this.set("$nor", js.undefined)
    @scala.inline
    def set$not(value: Selector): Self = this.set("$not", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$not: Self = this.set("$not", js.undefined)
    @scala.inline
    def set$orVarargs(value: Selector*): Self = this.set("$or", js.Array(value :_*))
    @scala.inline
    def set$or(value: js.Array[Selector]): Self = this.set("$or", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$or: Self = this.set("$or", js.undefined)
  }
  
}

