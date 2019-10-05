package typings.pouchdbDashFind.PouchDB.Find

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Selector
  extends CombinationOperators
     with /* field */ StringDictionary[Selector | js.Array[Selector] | ConditionOperators | js.Any] {
  var _id: js.UndefOr[ConditionOperators] = js.undefined
}

object Selector {
  @scala.inline
  def apply(
    $and: js.Array[Selector] = null,
    $nor: js.Array[Selector] = null,
    $not: Selector = null,
    $or: js.Array[Selector] = null,
    StringDictionary: /* field */ StringDictionary[Selector | js.Array[Selector] | ConditionOperators | js.Any] = null,
    _id: ConditionOperators = null
  ): Selector = {
    val __obj = js.Dynamic.literal()
    if ($and != null) __obj.updateDynamic("$and")($and)
    if ($nor != null) __obj.updateDynamic("$nor")($nor)
    if ($not != null) __obj.updateDynamic("$not")($not)
    if ($or != null) __obj.updateDynamic("$or")($or)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    __obj.asInstanceOf[Selector]
  }
}

