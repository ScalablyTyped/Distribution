package typings
package mdastLib.mdastMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait List
  extends Parent
     with BlockContent {
  @JSName("children")
  var children_List: js.Array[ListContent]
  var ordered: js.UndefOr[scala.Boolean] = js.undefined
  var spread: js.UndefOr[scala.Boolean] = js.undefined
  var start: js.UndefOr[scala.Double] = js.undefined
  @JSName("type")
  var type_List: mdastLib.mdastLibStrings.list
}

object List {
  @scala.inline
  def apply(
    children: js.Array[ListContent],
    `type`: mdastLib.mdastLibStrings.list,
    data: unistLib.unistMod.Data = null,
    ordered: js.UndefOr[scala.Boolean] = js.undefined,
    position: unistLib.unistMod.Position = null,
    spread: js.UndefOr[scala.Boolean] = js.undefined,
    start: scala.Int | scala.Double = null
  ): List = {
    val __obj = js.Dynamic.literal(children = children)
    __obj.updateDynamic("type")(`type`)
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(ordered)) __obj.updateDynamic("ordered")(ordered)
    if (position != null) __obj.updateDynamic("position")(position)
    if (!js.isUndefined(spread)) __obj.updateDynamic("spread")(spread)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[List]
  }
}

