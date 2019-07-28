package typings.mdast.mdastMod

import typings.mdast.mdastStrings.tableCell
import typings.unist.unistMod.Data
import typings.unist.unistMod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableCell extends Parent {
  @JSName("children")
  var children_TableCell: js.Array[PhrasingContent]
  @JSName("type")
  var type_TableCell: tableCell
}

object TableCell {
  @scala.inline
  def apply(
    children: js.Array[PhrasingContent],
    `type`: tableCell,
    data: Data = null,
    position: Position = null
  ): TableCell = {
    val __obj = js.Dynamic.literal(children = children)
    __obj.updateDynamic("type")(`type`)
    if (data != null) __obj.updateDynamic("data")(data)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[TableCell]
  }
}

