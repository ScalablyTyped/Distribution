package typings
package mdastLib.mdastMod

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
  var type_Table: mdastLib.mdastLibStrings.table
}

object Table {
  @scala.inline
  def apply(
    children: js.Array[TableContent],
    `type`: mdastLib.mdastLibStrings.table,
    align: js.Array[AlignType] = null,
    data: unistLib.unistMod.Data = null,
    position: unistLib.unistMod.Position = null
  ): Table = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("children")(children)
    if (align != null) __obj.updateDynamic("align")(align)
    if (data != null) __obj.updateDynamic("data")(data)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[Table]
  }
}

