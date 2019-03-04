package typings
package mdastLib.mdastMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageReference
  extends StaticPhrasingContent
     with unistLib.unistMod.Node
     with Reference
     with Alternative {
  @JSName("type")
  var type_ImageReference: mdastLib.mdastLibStrings.imageReference
}

object ImageReference {
  @scala.inline
  def apply(
    referenceType: ReferenceType,
    `type`: mdastLib.mdastLibStrings.imageReference,
    alt: java.lang.String = null,
    data: unistLib.unistMod.Data = null,
    position: unistLib.unistMod.Position = null
  ): ImageReference = {
    val __obj = js.Dynamic.literal(referenceType = referenceType)
    __obj.updateDynamic("type")(`type`)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (data != null) __obj.updateDynamic("data")(data)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[ImageReference]
  }
}

