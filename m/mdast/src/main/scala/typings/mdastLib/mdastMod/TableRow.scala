package typings
package mdastLib.mdastMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableRow extends Parent {
  @JSName("children")
  var children_TableRow: js.Array[RowContent]
  @JSName("type")
  var type_TableRow: mdastLib.mdastLibStrings.tableRow
}

object TableRow {
  @scala.inline
  def apply(
    children: js.Array[RowContent],
    `type`: mdastLib.mdastLibStrings.tableRow,
    data: unistLib.unistMod.Data = null,
    position: unistLib.unistMod.Position = null
  ): TableRow = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("children")(children)
    if (data != null) __obj.updateDynamic("data")(data)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[TableRow]
  }
}

