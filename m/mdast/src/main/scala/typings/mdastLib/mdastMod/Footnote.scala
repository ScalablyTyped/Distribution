package typings
package mdastLib.mdastMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Footnote
  extends Parent
     with StaticPhrasingContent {
  @JSName("children")
  var children_Footnote: js.Array[PhrasingContent]
  @JSName("type")
  var type_Footnote: mdastLib.mdastLibStrings.footnote
}

object Footnote {
  @scala.inline
  def apply(
    children: js.Array[PhrasingContent],
    `type`: mdastLib.mdastLibStrings.footnote,
    data: unistLib.unistMod.Data = null,
    position: unistLib.unistMod.Position = null
  ): Footnote = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("children")(children)
    if (data != null) __obj.updateDynamic("data")(data)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[Footnote]
  }
}

