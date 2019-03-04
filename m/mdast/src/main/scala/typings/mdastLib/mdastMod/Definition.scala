package typings
package mdastLib.mdastMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Definition
  extends DefinitionContent
     with unistLib.unistMod.Node
     with Association
     with Resource {
  @JSName("type")
  var type_Definition: mdastLib.mdastLibStrings.definition
}

object Definition {
  @scala.inline
  def apply(
    identifier: java.lang.String,
    `type`: mdastLib.mdastLibStrings.definition,
    url: java.lang.String,
    data: unistLib.unistMod.Data = null,
    label: java.lang.String = null,
    position: unistLib.unistMod.Position = null,
    title: java.lang.String = null
  ): Definition = {
    val __obj = js.Dynamic.literal(identifier = identifier, url = url)
    __obj.updateDynamic("type")(`type`)
    if (data != null) __obj.updateDynamic("data")(data)
    if (label != null) __obj.updateDynamic("label")(label)
    if (position != null) __obj.updateDynamic("position")(position)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Definition]
  }
}

