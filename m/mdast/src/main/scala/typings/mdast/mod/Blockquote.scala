package typings.mdast.mod

import typings.mdast.mdastStrings.blockquote
import typings.unist.mod.Data
import typings.unist.mod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Blockquote
  extends Parent
     with BlockContent {
  @JSName("children")
  var children_Blockquote: js.Array[BlockContent]
  @JSName("type")
  var type_Blockquote: blockquote
}

object Blockquote {
  @scala.inline
  def apply(children: js.Array[BlockContent], `type`: blockquote, data: Data = null, position: Position = null): Blockquote = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Blockquote]
  }
}

