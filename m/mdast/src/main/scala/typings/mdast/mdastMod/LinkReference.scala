package typings.mdast.mdastMod

import typings.mdast.mdastStrings.linkReference
import typings.unist.unistMod.Data
import typings.unist.unistMod.Position
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
  var type_LinkReference: linkReference
}

object LinkReference {
  @scala.inline
  def apply(
    children: js.Array[StaticPhrasingContent],
    identifier: String,
    referenceType: ReferenceType,
    `type`: linkReference,
    data: Data = null,
    label: String = null,
    position: Position = null
  ): LinkReference = {
    val __obj = js.Dynamic.literal(children = children, identifier = identifier, referenceType = referenceType)
    __obj.updateDynamic("type")(`type`)
    if (data != null) __obj.updateDynamic("data")(data)
    if (label != null) __obj.updateDynamic("label")(label)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[LinkReference]
  }
}

