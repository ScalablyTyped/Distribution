package typings
package mdastLib.mdastMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Root extends Parent {
  @JSName("type")
  var type_Root: mdastLib.mdastLibStrings.root
}

object Root {
  @scala.inline
  def apply(
    children: js.Array[Content],
    `type`: mdastLib.mdastLibStrings.root,
    data: unistLib.unistMod.Data = null,
    position: unistLib.unistMod.Position = null
  ): Root = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("children")(children)
    if (data != null) __obj.updateDynamic("data")(data)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[Root]
  }
}

