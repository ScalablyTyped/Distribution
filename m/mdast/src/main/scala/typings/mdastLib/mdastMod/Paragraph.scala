package typings
package mdastLib.mdastMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Paragraph
  extends Parent
     with BlockContent {
  @JSName("children")
  var children_Paragraph: js.Array[PhrasingContent]
  @JSName("type")
  var type_Paragraph: mdastLib.mdastLibStrings.paragraph
}

object Paragraph {
  @scala.inline
  def apply(
    children: js.Array[PhrasingContent],
    `type`: mdastLib.mdastLibStrings.paragraph,
    data: unistLib.unistMod.Data = null,
    position: unistLib.unistMod.Position = null
  ): Paragraph = {
    val __obj = js.Dynamic.literal(children = children)
    __obj.updateDynamic("type")(`type`)
    if (data != null) __obj.updateDynamic("data")(data)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[Paragraph]
  }
}

