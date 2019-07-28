package typings.mdast.mdastMod

import typings.mdast.mdastStrings.paragraph
import typings.unist.unistMod.Data
import typings.unist.unistMod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Paragraph
  extends Parent
     with BlockContent {
  @JSName("children")
  var children_Paragraph: js.Array[PhrasingContent]
  @JSName("type")
  var type_Paragraph: paragraph
}

object Paragraph {
  @scala.inline
  def apply(
    children: js.Array[PhrasingContent],
    `type`: paragraph,
    data: Data = null,
    position: Position = null
  ): Paragraph = {
    val __obj = js.Dynamic.literal(children = children)
    __obj.updateDynamic("type")(`type`)
    if (data != null) __obj.updateDynamic("data")(data)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[Paragraph]
  }
}

