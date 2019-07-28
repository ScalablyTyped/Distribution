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
    referenceType: ReferenceType,
    `type`: imageReference,
    alt: String = null,
    data: Data = null,
    position: Position = null
  ): ImageReference = {
    val __obj = js.Dynamic.literal(referenceType = referenceType)
    __obj.updateDynamic("type")(`type`)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (data != null) __obj.updateDynamic("data")(data)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[ImageReference]
  }
}

