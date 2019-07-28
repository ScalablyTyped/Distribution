package typings.mdast.mdastMod

import typings.mdast.mdastStrings.list
import typings.unist.unistMod.Data
import typings.unist.unistMod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait List
  extends Parent
     with BlockContent {
  @JSName("children")
  var children_List: js.Array[ListContent]
  var ordered: js.UndefOr[Boolean] = js.undefined
  var spread: js.UndefOr[Boolean] = js.undefined
  var start: js.UndefOr[Double] = js.undefined
  @JSName("type")
  var type_List: list
}

object List {
  @scala.inline
  def apply(
    children: js.Array[ListContent],
    `type`: list,
    data: Data = null,
    ordered: js.UndefOr[Boolean] = js.undefined,
    position: Position = null,
    spread: js.UndefOr[Boolean] = js.undefined,
    start: Int | Double = null
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

