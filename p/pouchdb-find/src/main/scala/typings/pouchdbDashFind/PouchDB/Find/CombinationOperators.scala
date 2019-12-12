package typings.pouchdbDashFind.PouchDB.Find

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

