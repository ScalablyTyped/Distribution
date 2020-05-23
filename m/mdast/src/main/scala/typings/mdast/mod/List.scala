package typings.mdast.mod

import typings.mdast.mdastStrings.list
import typings.unist.mod.Data
import typings.unist.mod.Position
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
    start: js.UndefOr[Double] = js.undefined
  ): List = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(ordered)) __obj.updateDynamic("ordered")(ordered.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(spread)) __obj.updateDynamic("spread")(spread.get.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[List]
  }
}

