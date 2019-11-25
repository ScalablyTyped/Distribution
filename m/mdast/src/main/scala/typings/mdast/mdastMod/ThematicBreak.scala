package typings.mdast.mdastMod

import typings.mdast.mdastStrings.thematicBreak
import typings.unist.unistMod.Data
import typings.unist.unistMod.Node
import typings.unist.unistMod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThematicBreak
  extends BlockContent
     with Node {
  @JSName("type")
  var type_ThematicBreak: thematicBreak
}

object ThematicBreak {
  @scala.inline
  def apply(`type`: thematicBreak, data: Data = null, position: Position = null): ThematicBreak = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThematicBreak]
  }
}

