package typings.mongodb.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayOperator[Type] extends js.Object {
  @JSName("$each")
  var $each: Type
  @JSName("$position")
  var $position: js.UndefOr[scala.Double] = js.undefined
  @JSName("$slice")
  var $slice: js.UndefOr[scala.Double] = js.undefined
  @JSName("$sort")
  var $sort: js.UndefOr[SortValues | (Record[String, SortValues])] = js.undefined
}

object ArrayOperator {
  @scala.inline
  def apply[Type](
    $each: Type,
    $position: js.UndefOr[scala.Double] = js.undefined,
    $slice: js.UndefOr[scala.Double] = js.undefined,
    $sort: SortValues | (Record[String, SortValues]) = null
  ): ArrayOperator[Type] = {
    val __obj = js.Dynamic.literal($each = $each.asInstanceOf[js.Any])
    if (!js.isUndefined($position)) __obj.updateDynamic("$position")($position.get.asInstanceOf[js.Any])
    if (!js.isUndefined($slice)) __obj.updateDynamic("$slice")($slice.get.asInstanceOf[js.Any])
    if ($sort != null) __obj.updateDynamic("$sort")($sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayOperator[Type]]
  }
}

