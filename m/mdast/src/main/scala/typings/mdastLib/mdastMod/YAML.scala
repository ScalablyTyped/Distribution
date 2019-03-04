package typings
package mdastLib.mdastMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YAML extends Literal {
  @JSName("type")
  var type_YAML: mdastLib.mdastLibStrings.yaml
}

object YAML {
  @scala.inline
  def apply(
    `type`: mdastLib.mdastLibStrings.yaml,
    value: java.lang.String,
    data: unistLib.unistMod.Data = null,
    position: unistLib.unistMod.Position = null
  ): YAML = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    if (data != null) __obj.updateDynamic("data")(data)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[YAML]
  }
}

