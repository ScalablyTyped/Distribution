package typings
package pouchdbDashFindLib.PouchDBNs.FindNs

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

