package typings.mdast.mdastMod

import typings.mdast.mdastStrings.blockquote
import typings.unist.unistMod.Data
import typings.unist.unistMod.Position
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
    val __obj = js.Dynamic.literal(children = children)
    __obj.updateDynamic("type")(`type`)
    if (data != null) __obj.updateDynamic("data")(data)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[Blockquote]
  }
}

