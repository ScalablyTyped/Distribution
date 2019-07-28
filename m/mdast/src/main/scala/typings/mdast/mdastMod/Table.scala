package typings.mdast.mdastMod

import typings.mdast.mdastStrings.table
import typings.unist.unistMod.Data
import typings.unist.unistMod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Table
  extends Parent
     with BlockContent {
  var align: js.UndefOr[js.Array[AlignType]] = js.undefined
  @JSName("children")
  var children_Table: js.Array[TableContent]
  @JSName("type")
  var type_Table: table
}

object Table {
  @scala.inline
  def apply(
    children: js.Array[TableContent],
    `type`: table,
    align: js.Array[AlignType] = null,
    data: Data = null,
    position: Position = null
  ): Table = {
    val __obj = js.Dynamic.literal(children = children)
    __obj.updateDynamic("type")(`type`)
    if (align != null) __obj.updateDynamic("align")(align)
    if (data != null) __obj.updateDynamic("data")(data)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[Table]
  }
}

