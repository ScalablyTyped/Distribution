package typings
package mdastLib.mdastMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkReference
  extends Parent
     with Reference
     with PhrasingContent {
  @JSName("children")
  var children_LinkReference: js.Array[StaticPhrasingContent]
  @JSName("type")
  var type_LinkReference: mdastLib.mdastLibStrings.linkReference
}

object LinkReference {
  @scala.inline
  def apply(
    children: js.Array[StaticPhrasingContent],
    referenceType: ReferenceType,
    `type`: mdastLib.mdastLibStrings.linkReference,
    data: unistLib.unistMod.Data = null,
    position: unistLib.unistMod.Position = null
  ): LinkReference = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("children")(children)
    __obj.updateDynamic("referenceType")(referenceType)
    if (data != null) __obj.updateDynamic("data")(data)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[LinkReference]
  }
}

