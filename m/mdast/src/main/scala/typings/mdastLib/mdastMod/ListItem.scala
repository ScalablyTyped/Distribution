package typings
package mdastLib.mdastMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItem extends Parent {
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("children")
  var children_ListItem: js.Array[BlockContent]
  var spread: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("type")
  var type_ListItem: mdastLib.mdastLibStrings.listItem
}

object ListItem {
  @scala.inline
  def apply(
    children: js.Array[BlockContent],
    `type`: mdastLib.mdastLibStrings.listItem,
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    data: unistLib.unistMod.Data = null,
    position: unistLib.unistMod.Position = null,
    spread: js.UndefOr[scala.Boolean] = js.undefined
  ): ListItem = {
    val __obj = js.Dynamic.literal(children = children)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (data != null) __obj.updateDynamic("data")(data)
    if (position != null) __obj.updateDynamic("position")(position)
    if (!js.isUndefined(spread)) __obj.updateDynamic("spread")(spread)
    __obj.asInstanceOf[ListItem]
  }
}

