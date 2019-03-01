package typings
package mdastLib.mdastMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Emphasis
  extends Parent
     with StaticPhrasingContent {
  @JSName("children")
  var children_Emphasis: js.Array[PhrasingContent]
  @JSName("type")
  var type_Emphasis: mdastLib.mdastLibStrings.emphasis
}

object Emphasis {
  @scala.inline
  def apply(
    children: js.Array[PhrasingContent],
    `type`: mdastLib.mdastLibStrings.emphasis,
    data: unistLib.unistMod.Data = null,
    position: unistLib.unistMod.Position = null
  ): Emphasis = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("children")(children)
    if (data != null) __obj.updateDynamic("data")(data)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[Emphasis]
  }
}

