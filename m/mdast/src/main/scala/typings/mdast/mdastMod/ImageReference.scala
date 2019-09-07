package typings.mdast.mdastMod

import typings.mdast.mdastStrings.imageReference
import typings.unist.unistMod.Data
import typings.unist.unistMod.Node
import typings.unist.unistMod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageReference
  extends StaticPhrasingContent
     with Node
     with Reference
     with Alternative {
  @JSName("type")
  var type_ImageReference: imageReference
}

object ImageReference {
  @scala.inline
  def apply(
    identifier: String,
    referenceType: ReferenceType,
    `type`: imageReference,
    alt: String = null,
    data: Data = null,
    label: String = null,
    position: Position = null
  ): ImageReference = {
    val __obj = js.Dynamic.literal(identifier = identifier, referenceType = referenceType)
    __obj.updateDynamic("type")(`type`)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (data != null) __obj.updateDynamic("data")(data)
    if (label != null) __obj.updateDynamic("label")(label)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[ImageReference]
  }
}

