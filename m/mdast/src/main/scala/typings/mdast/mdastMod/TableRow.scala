package typings.mdast.mdastMod

import typings.mdast.mdastStrings.tableRow
import typings.unist.unistMod.Data
import typings.unist.unistMod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableRow extends Parent {
  @JSName("children")
  var children_TableRow: js.Array[RowContent]
  @JSName("type")
  var type_TableRow: tableRow
}

object TableRow {
  @scala.inline
  def apply(children: js.Array[RowContent], `type`: tableRow, data: Data = null, position: Position = null): TableRow = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableRow]
  }
}

