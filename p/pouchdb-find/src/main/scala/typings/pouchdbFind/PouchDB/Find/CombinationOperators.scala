package typings.pouchdbFind.PouchDB.Find

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CombinationOperators extends js.Object {
  /** Matches if all the selectors in the array match. */
  @JSName("$and")
  var $and: js.UndefOr[js.Array[Selector]] = js.undefined
  /** Matches if none of the selectors in the array match. */
  @JSName("$nor")
  var $nor: js.UndefOr[js.Array[Selector]] = js.undefined
  /** Matches if the given selector does not match. */
  @JSName("$not")
  var $not: js.UndefOr[Selector] = js.undefined
  /** Matches if any of the selectors in the array match. All selectors must use the same index. */
  @JSName("$or")
  var $or: js.UndefOr[js.Array[Selector]] = js.undefined
}

object CombinationOperators {
  @scala.inline
  def apply(
    $and: js.Array[Selector] = null,
    $nor: js.Array[Selector] = null,
    $not: Selector = null,
    $or: js.Array[Selector] = null
  ): CombinationOperators = {
    val __obj = js.Dynamic.literal()
    if ($and != null) __obj.updateDynamic("$and")($and.asInstanceOf[js.Any])
    if ($nor != null) __obj.updateDynamic("$nor")($nor.asInstanceOf[js.Any])
    if ($not != null) __obj.updateDynamic("$not")($not.asInstanceOf[js.Any])
    if ($or != null) __obj.updateDynamic("$or")($or.asInstanceOf[js.Any])
    __obj.asInstanceOf[CombinationOperators]
  }
}

