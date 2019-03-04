package typings
package mdastLib.mdastMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Heading
  extends Parent
     with BlockContent {
  @JSName("children")
  var children_Heading: js.Array[PhrasingContent]
  var depth: mdastLib.mdastLibNumbers.`1` | mdastLib.mdastLibNumbers.`2` | mdastLib.mdastLibNumbers.`3` | mdastLib.mdastLibNumbers.`4` | mdastLib.mdastLibNumbers.`5` | mdastLib.mdastLibNumbers.`6`
  @JSName("type")
  var type_Heading: mdastLib.mdastLibStrings.heading
}

object Heading {
  @scala.inline
  def apply(
    children: js.Array[PhrasingContent],
    depth: mdastLib.mdastLibNumbers.`1` | mdastLib.mdastLibNumbers.`2` | mdastLib.mdastLibNumbers.`3` | mdastLib.mdastLibNumbers.`4` | mdastLib.mdastLibNumbers.`5` | mdastLib.mdastLibNumbers.`6`,
    `type`: mdastLib.mdastLibStrings.heading,
    data: unistLib.unistMod.Data = null,
    position: unistLib.unistMod.Position = null
  ): Heading = {
    val __obj = js.Dynamic.literal(children = children, depth = depth.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (data != null) __obj.updateDynamic("data")(data)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[Heading]
  }
}

