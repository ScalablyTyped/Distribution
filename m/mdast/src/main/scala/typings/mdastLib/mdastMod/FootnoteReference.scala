package typings
package mdastLib.mdastMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FootnoteReference
  extends StaticPhrasingContent
     with unistLib.unistMod.Node
     with Association {
  @JSName("type")
  var type_FootnoteReference: mdastLib.mdastLibStrings.footnoteReference
}

object FootnoteReference {
  @scala.inline
  def apply(
    identifier: java.lang.String,
    `type`: mdastLib.mdastLibStrings.footnoteReference,
    data: unistLib.unistMod.Data = null,
    label: java.lang.String = null,
    position: unistLib.unistMod.Position = null
  ): FootnoteReference = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("identifier")(identifier)
    if (data != null) __obj.updateDynamic("data")(data)
    if (label != null) __obj.updateDynamic("label")(label)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[FootnoteReference]
  }
}

