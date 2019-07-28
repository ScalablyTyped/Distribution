package typings.mdast.mdastMod

import typings.mdast.mdastStrings.yaml
import typings.unist.unistMod.Data
import typings.unist.unistMod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YAML extends Literal {
  @JSName("type")
  var type_YAML: yaml
}

object YAML {
  @scala.inline
  def apply(`type`: yaml, value: String, data: Data = null, position: Position = null): YAML = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    if (data != null) __obj.updateDynamic("data")(data)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[YAML]
  }
}

